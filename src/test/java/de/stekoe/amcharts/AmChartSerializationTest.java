package de.stekoe.amcharts;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.addition.ColorSerialiser;
import org.junit.Test;

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

        assertThat(gson.toJson(pieChart).toString(), equalTo("{\"borderColor\":{\"colorHexVal\":\"000000\"},\"fontSize\":23.0}"));
    }
}
