package de.stekoe.amcharts;

import org.json.JSONObject;

import de.stekoe.amcharts.helper.Jsonifyable;
import de.stekoe.amcharts.helper.Jsonifyer;

public class SerialDataItem implements Jsonifyable {
    private Object axes;
    private String category;
    private Object dataContext;
    private Double time;
    private Double x;

    /**
     * You can access each GraphDataItem using this object. The data structure is: graphDataItem
     * = serialDataItem.axes[axisId].graphs[graphId].
     **/
    public Object getAxes() {
        return axes;
    }
    public SerialDataItem setAxes(Object axes) {
        this.axes = axes;
        return this;
    }

    /**
     * category value. String if parseDates is false, Date if true.
     **/
    public String getCategory() {
        return category;
    }
    public SerialDataItem setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Reference to original data object, from dataProvider.
     **/
    public Object getDataContext() {
        return dataContext;
    }
    public SerialDataItem setDataContext(Object dataContext) {
        this.dataContext = dataContext;
        return this;
    }

    /**
     * Time stamp of a series date. Avalable only if parseDates property of CategoryAxis
     * is set to true.
     **/
    public Double getTime() {
        return time;
    }
    public SerialDataItem setTime(double time) {
        this.time = time;
        return this;
    }

    /**
     *      *Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
     **/
    public Double getX() {
        return x;
    }
    public SerialDataItem setX(double x) {
        this.x = x;
        return this;
    }

    public JSONObject toJson() {
        return new Jsonifyer(this).toJson();
    }
}