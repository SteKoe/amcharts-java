package de.stekoe.amcharts;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.addition.ColorSerialiser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static com.jayway.jsonpath.matchers.JsonPathMatchers.hasJsonPath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AmChartSerializationTest {
    @Test
    public void jsonSerialization() throws Exception {
        AmChart pieChart = new AmPieChart();
        pieChart.setBorderColor(Color.BLACK);
        pieChart.setFontSize(23.0);

        Gson gson = new Gson();
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Color.class, new ColorSerialiser());


        String json = gson.toJson(pieChart);
        Assert.assertThat(json, hasJsonPath("$.borderColor.colorHexVal", equalTo("000000")));
        Assert.assertThat(json, hasJsonPath("$.fontSize", equalTo(23.0)));
    }
}
