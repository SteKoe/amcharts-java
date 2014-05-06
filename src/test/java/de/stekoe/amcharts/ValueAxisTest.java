package de.stekoe.amcharts;

import org.junit.Test;


public class ValueAxisTest {
    @Test
    public void valueAxisToJson() throws Exception {
        ValueAxis valueAxis = new ValueAxis();
        valueAxis.setGridColor(Color.WHITE);
        valueAxis.setGridAlpha(0.2);
        valueAxis.setDashLength(0);
    }
}
