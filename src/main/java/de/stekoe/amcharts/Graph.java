package de.stekoe.amcharts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.json.JSONException;
import org.json.JSONObject;


public abstract class Graph implements Serializable {
    private List<GraphValue> graphValues = new ArrayList<GraphValue>();
    private String categoryField;
    private final String htmlId;
    private final String chartVar = getChartVar();

    public Graph(String htmlId) {
        this.htmlId = htmlId;
    }

    private String getChartVar() {
        String id = "";
        return "chart" + id.substring(0, id.indexOf("-")-1);
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
        jsonObject.put("icon", "vendors/amcharts/amcharts/images/export.png");
        jsonObject.put("format", "png");
        list.add(jsonObject);

        JSONObject exportConfig = new JSONObject();
        exportConfig.put("menuTop", 0);
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
        jsonObject.put("balloonText", "[[category]]: <b>[[value]]</b>");
        jsonObject.put("type", "column");
        jsonObject.put("valueField", "visits");
        jsonObject.put("fillAlphas", 0.8);
        jsonObject.put("lineAlpha", 0.2);

        list.add(jsonObject);
        return list;
    }

    private List<JSONObject> getValueAxes() throws JSONException {
        List<JSONObject> list = new ArrayList<JSONObject>();

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
}
