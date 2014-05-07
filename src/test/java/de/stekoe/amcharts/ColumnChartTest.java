package de.stekoe.amcharts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import de.stekoe.amcharts.addition.Color;

public class ColumnChartTest {
    @Test
    public void testName() throws Exception {
        AmSerialChart chart = new AmSerialChart();
        chart.setType("serial");
        chart.setTheme("none");
        chart.setDataProvider(getDataProvider());
        chart.setValueAxes(getValueAxes());
        chart.setGridAboveGraphs(true);
        chart.setStartDuration(1);
        chart.setGraphs(getGraphs());
        chart.setChartCursor(getChartCursor());
        chart.setCategoryField("country");
        chart.setCategoryAxis(getCategoryAxis());
        chart.setExportConfig(getExportConfig());

        JSONObject actual = new JSONObject("{\"type\":\"serial\",\"theme\":\"none\",\"dataProvider\":[{\"country\":\"USA\",\"visits\":2025},{\"country\":\"China\",\"visits\":1882},{\"country\":\"Japan\",\"visits\":1809},{\"country\":\"Germany\",\"visits\":1322},{\"country\":\"UK\",\"visits\":1122}],\"valueAxes\":[{\"gridColor\":\"#FFFFFF\",\"gridAlpha\":0.2,\"dashLength\":0}],\"gridAboveGraphs\":true,\"startDuration\":1,\"graphs\":[{\"balloonText\":\"[[category]]: <b>[[value]]</b>\",\"fillAlphas\":0.8,\"lineAlpha\":0.2,\"type\":\"column\",\"valueField\":\"visits\"}],\"chartCursor\":{\"categoryBalloonEnabled\":false,\"cursorAlpha\":0,\"zoomable\":false},\"categoryField\":\"country\",\"categoryAxis\":{\"gridPosition\":\"start\",\"gridAlpha\":0},\"exportConfig\":{\"menuTop\":0,\"menuItems\":[{\"icon\":\"/lib/3/images/export.png\",\"format\":\"png\"}]}}");
        JSONAssert.assertEquals(chart.toJson(), actual, true);
    }

    private JSONObject getExportConfig() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("menuTop", 0);
        jsonObject.put("menuItems", Arrays.asList(new JSONObject().put("icon", "/lib/3/images/export.png").put("format", "png")));
        return null;
    }

    private CategoryAxis getCategoryAxis() {
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setGridPosition("start");
        categoryAxis.setGridAlpha(0);
        return categoryAxis;
    }

    private ChartCursor getChartCursor() {
        ChartCursor chartCursor = new ChartCursor();
        chartCursor.setCategoryBalloonEnabled(true);
        chartCursor.setCursorAlpha(0);
        chartCursor.setZoomable(false);
        return chartCursor;
    }

    private List<AmGraph> getGraphs() {
        List<AmGraph> list = new ArrayList<AmGraph>();

        AmGraph amGraph = new AmGraph();
        amGraph.setBalloonText("[[category]]: <b>[[value]]</b>");
        amGraph.setFillAlphas(0.8);
        amGraph.setLineAlpha(0.2);
        amGraph.setType("column");
        amGraph.setValueField("visits");

        return list;
    }

    private List<ValueAxis> getValueAxes() {
        List<ValueAxis> list = new ArrayList<ValueAxis>();

        ValueAxis valueAxis = new ValueAxis();
        valueAxis.setGridColor(Color.WHITE);
        valueAxis.setGridAlpha(0.2);
        valueAxis.setDashLength(0);

        return list;
    }

    private List<Object> getDataProvider() {
        List<Object> list = new ArrayList<Object>();

        JSONObject dataProvider = new JSONObject();
        dataProvider.put("country", "USA");
        dataProvider.put("visits", 2025);
        list.add(dataProvider);

        dataProvider = new JSONObject();
        dataProvider.put("country", "China");
        dataProvider.put("visits", 1882);
        list.add(dataProvider);

        dataProvider = new JSONObject();
        dataProvider.put("country", "Japan");
        dataProvider.put("visits", 1809);
        list.add(dataProvider);

        dataProvider = new JSONObject();
        dataProvider.put("country", "Germany");
        dataProvider.put("visits", 1322);
        list.add(dataProvider);

        dataProvider = new JSONObject();
        dataProvider.put("country", "UK");
        dataProvider.put("visits", 1122);
        list.add(dataProvider);

        return list;
    }
}
