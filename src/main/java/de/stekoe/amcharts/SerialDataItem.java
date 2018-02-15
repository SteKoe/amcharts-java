package de.stekoe.amcharts;

import java.io.Serializable;

/**
 * SerialDataItem holds all the information about each series. When working with a chart,
 * you do not create SerialDataItem objects or change it's properties directly. Consider
 * properties of a SerialDataItem read-only - change values in chart's data provider
 * if you need to. When serial chart parses dataProvider, it generates "chartData" array.
 * Objects of this array are SerialDataItem objects.
 */

public class SerialDataItem implements Serializable {
    private Object axes;
    private String category;
    private Object dataContext;
    private Double time;
    private Double x;

    /**
     * @param axes You can access each GraphDataItem using this object. The data structure is: graphDataItem
     *             = serialDataItem.axes[axisId].graphs[graphId].
     * @return SerialDataItem
     */
    public SerialDataItem setAxes(Object axes) {
        this.axes = axes;
        return this;
    }

    public Object getAxes() {
        return axes;
    }

    /**
     * @param category category value. String if parseDates is false, Date if true.
     * @return SerialDataItem
     */
    public SerialDataItem setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getCategory() {
        return category;
    }

    /**
     * @param dataContext Reference to original data object, from dataProvider.
     * @return SerialDataItem
     */
    public SerialDataItem setDataContext(Object dataContext) {
        this.dataContext = dataContext;
        return this;
    }

    public Object getDataContext() {
        return dataContext;
    }

    /**
     * @param time Time stamp of a series date. Avalable only if parseDates property of CategoryAxis
     *             is set to true.
     * @return SerialDataItem
     */
    public SerialDataItem setTime(double time) {
        this.time = time;
        return this;
    }

    public Double getTime() {
        return time;
    }

    /**
     * @param x *Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
     * @return SerialDataItem
     */
    public SerialDataItem setX(double x) {
        this.x = x;
        return this;
    }

    public Double getX() {
        return x;
    }

}