package de.stekoe.amcharts.cust;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.json.JSONException;
import org.json.JSONObject;

import de.stekoe.amcharts.ValueAxis;
import de.stekoe.amcharts.addition.Color;


public abstract class Graph implements Serializable {
    private List<GraphValue> graphValues = new ArrayList<GraphValue>();
    private String categoryField;
    private final String htmlId;
    private final String chartVar = getChartVar();
    private boolean rotate = false;

    public Graph(String htmlId) {
        this.htmlId = htmlId;
    }

    private String getChartVar() {
        String id = "";
        return "chart";
    }

    public List<GraphValue> getGraphValues() {
        return graphValues;
    }
    public void setGraphValues(List<GraphValue> graphValues) {
        this.graphValues = graphValues;
    }

    public String getCategoryField() {
        return categoryField;
    }
    public void setCategoryField(String categoryField) {
        this.categoryField = categoryField;
    }

    public abstract String getType();

    public String toJson() {
        try {
            JSONObject graph = new JSONObject();
            graph.put("type", getType());
            graph.put("theme", "light");
            graph.put("valueAxes", getValueAxes());
            graph.put("categoryAxis", getCategoryAxes());
            graph.put("gridAboveGraphs", true);
            graph.put("startDuration", 1);
            graph.put("graphs", getGraphs());
            graph.put("chartCursor", getChartCursor());
            graph.put("categoryField", getCategoryField());
            graph.put("exportConfig", getExportConfig());
            graph.put("rotate", isRotate());

            List<JSONObject> dataProvider = new ArrayList<JSONObject>();
            for(GraphValue gv : getGraphValues()) {
                JSONObject graphValue = new JSONObject();
                for(Entry<String, Object> entry : gv.getValues().entrySet()) {
                    graphValue.put(entry.getKey(), entry.getValue());
                }
                dataProvider.add(graphValue);
            }
            graph.put("dataProvider", dataProvider);

            return String.format("var %s = AmCharts.makeChart(\"%s\", %s);", getChartVar(), getHtmlId(), graph.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "error";
    }

    private JSONObject getExportConfig() throws JSONException {
        List<JSONObject> list = new ArrayList<JSONObject>();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("icon", "http://localhost:8080/idss-webui/vendors/amcharts/amcharts/images/export.png");
        jsonObject.put("format", "png");
        list.add(jsonObject);

        JSONObject exportConfig = new JSONObject();
        exportConfig.put("menuTop", 0);
        exportConfig.put("menuRight", 0);
        exportConfig.put("menuItems", list);

        return exportConfig;
    }

    private JSONObject getCategoryAxes() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("gridPosition", true);
        jsonObject.put("gridAlpha", 0.5);
        return jsonObject;
    }

    private JSONObject getChartCursor() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("categoryBalloonEnabled", true);
        jsonObject.put("cursorAlpha", 0.5);
        jsonObject.put("zoomable", true);
        return jsonObject;
    }

    private List<JSONObject> getGraphs() throws JSONException {
        List<JSONObject> list = new ArrayList<JSONObject>();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("balloonText", "[[" + getCategoryField() + "]]: <b>[[value]]</b>");
        jsonObject.put("type", "column");
        jsonObject.put("valueField", "count");
        jsonObject.put("labelText", "[[count]]");
        jsonObject.put("fillAlphas", 0.8);
        jsonObject.put("lineAlpha", 0.2);

        list.add(jsonObject);
        return list;
    }

    private List<JSONObject> getValueAxes() throws JSONException {
        List<JSONObject> list = new ArrayList<JSONObject>();

        ValueAxis valueAxis = new ValueAxis();
        valueAxis.setGridColor(Color.WHITE);
        valueAxis.setGridAlpha(0.2);
        valueAxis.setDashLength(0);
        valueAxis.setIntegersOnly(true);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("gridColor", "#FFFFFF");
        jsonObject.put("gridAlpha", 0.2);
        jsonObject.put("dashLength", 0);

        list.add(jsonObject);
        return list;
    }

    public String getHtmlId() {
        return htmlId;
    }

    public boolean isRotate() {
        return rotate;
    }

    public void setRotate(boolean rotate) {
        this.rotate = rotate;
    }
}
