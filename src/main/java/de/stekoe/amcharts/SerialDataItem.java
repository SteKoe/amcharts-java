package de.stekoe.amcharts;

import java.io.Serializable;

public class SerialDataItem implements Serializable {
    private Object axes;
    private String category;
    private Object dataContext;
    private Double time;
    private Double x;

    /**
     * You can access each GraphDataItem using this object. The data structure is: graphDataItem
     * = serialDataItem.axes[axisId].graphs[graphId].
     */
    public SerialDataItem setAxes(Object axes) {
        this.axes = axes;
        return this;
    }

    public Object getAxes() {
        return axes;
    }

    /**
     * category value. String if parseDates is false, Date if true.
     */
    public SerialDataItem setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getCategory() {
        return category;
    }

    /**
     * Reference to original data object, from dataProvider.
     */
    public SerialDataItem setDataContext(Object dataContext) {
        this.dataContext = dataContext;
        return this;
    }

    public Object getDataContext() {
        return dataContext;
    }

    /**
     * Time stamp of a series date. Avalable only if parseDates property of CategoryAxis
     * is set to true.
     */
    public SerialDataItem setTime(double time) {
        this.time = time;
        return this;
    }

    public Double getTime() {
        return time;
    }

    /**
     * *Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
     */
    public SerialDataItem setX(double x) {
        this.x = x;
        return this;
    }

    public Double getX() {
        return x;
    }

}