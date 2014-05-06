package de.stekoe.amcharts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class ValueAxisTest {
    @Test
    public void valueAxisToJson() throws Exception {
        ValueAxis valueAxis = new ValueAxis();
        valueAxis.setGridColor(Color.WHITE);
        valueAxis.setGridAlpha(0.2);
        valueAxis.setDashLength(0);

        assertThat(valueAxis.toJson().toString(), equalTo("{\"gridAlpha\":0.2,\"dashLength\":0,\"gridColor\":\"#FFFFFF\"}"));
    }
}
