package de.stekoe.amcharts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import de.stekoe.amcharts.addition.Color;


public class ValueAxisTest {
    @Test
    public void valueAxisToJson() throws Exception {
        ValueAxis valueAxis = new ValueAxis();
        valueAxis.setGridColor(Color.WHITE);
        valueAxis.setGridAlpha(0.2);
        valueAxis.setDashLength(0);
        valueAxis.setAutoGridCount(true);
        valueAxis.setDuration("1337");

        assertThat(valueAxis.toJson().toString(), equalTo("{\"gridAlpha\":0.2,\"duration\":\"1337\",\"dashLength\":0,\"gridColor\":\"#FFFFFF\",\"autoGridCount\":true}"));
    }
}
