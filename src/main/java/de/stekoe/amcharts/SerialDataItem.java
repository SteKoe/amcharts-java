package de.stekoe.amcharts;

public class SerialDataItem {
    private Object axes;
    private String category;
    private Object dataContext;
    private Double time;
    private Double x;

    /**
     * You can access each GraphDataItem using this object. The data structure is: graphDataItem
     * = serialDataItem.axes[axisId].graphs[graphId].
     **/
    public void setAxes(Object axes) {
        this.axes = axes;
    }
    public Object getAxes() {
        return axes;
    }

    /**
     * category value. String if parseDates is false, Date if true.
     **/
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    /**
     * Reference to original data object, from dataProvider.
     **/
    public void setDataContext(Object dataContext) {
        this.dataContext = dataContext;
    }
    public Object getDataContext() {
        return dataContext;
    }

    /**
     * Time stamp of a series date. Avalable only if parseDates property of CategoryAxis
     * is set to true.
     **/
    public void setTime(double time) {
        this.time = time;
    }
    public Double getTime() {
        return time;
    }

    /**
     *      *Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
     **/
    public void setX(double x) {
        this.x = x;
    }
    public Double getX() {
        return x;
    }

}