package de.stekoe.amcharts;

public class AmSerialChart extends AmRectangularChart {
    private String balloonDateFormat;
    private String categoryField;
    private Double columnSpacing;
    private Double columnSpacing3D;
    private Double columnWidth;
    private String dataDateFormat;
    private Double maxSelectedSeries;
    private Double maxSelectedTime;
    private Double minSelectedTime;
    private Boolean mouseWheelScrollEnabled;
    private Boolean rotate;
    private Boolean zoomOutOnDataUpdate;

    /**
     *      *Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
     **/
    public void setBalloonDateFormat(String balloonDateFormat) {
        this.balloonDateFormat = balloonDateFormat;
    }
    public String getBalloonDateFormat() {
        return balloonDateFormat;
    }

    /**
     * Category field name tells the chart the name of the field in your dataProvider object
     * which will be used for category axis values.
     **/
    public void setCategoryField(String categoryField) {
        this.categoryField = categoryField;
    }
    public String getCategoryField() {
        return categoryField;
    }

    /**
     * The gap in pixels between two columns of the same category.
     **/
    public void setColumnSpacing(double columnSpacing) {
        this.columnSpacing = columnSpacing;
    }
    public Double getColumnSpacing() {
        return columnSpacing;
    }

    /**
     * Space between 3D stacked columns.
     **/
    public void setColumnSpacing3D(double columnSpacing3D) {
        this.columnSpacing3D = columnSpacing3D;
    }
    public Double getColumnSpacing3D() {
        return columnSpacing3D;
    }

    /**
     * Relative width of columns. Value range is 0 - 1.
     **/
    public void setColumnWidth(double columnWidth) {
        this.columnWidth = columnWidth;
    }
    public Double getColumnWidth() {
        return columnWidth;
    }

    /**
     * Even if your chart parses dates, you can pass them as strings in your data – all
     * you need to do is to set data date format and the chart will parse dates to date
     * objects. Check this page for available formats.
     **/
    public void setDataDateFormat(String dataDateFormat) {
        this.dataDateFormat = dataDateFormat;
    }
    public String getDataDateFormat() {
        return dataDateFormat;
    }

    /**
     * Maximum number of series allowed to select.
     **/
    public void setMaxSelectedSeries(double maxSelectedSeries) {
        this.maxSelectedSeries = maxSelectedSeries;
    }
    public Double getMaxSelectedSeries() {
        return maxSelectedSeries;
    }

    /**
     * The longest time span allowed to select (in milliseconds) for example, 259200000
     * will limit selection to 3 days.
     **/
    public void setMaxSelectedTime(double maxSelectedTime) {
        this.maxSelectedTime = maxSelectedTime;
    }
    public Double getMaxSelectedTime() {
        return maxSelectedTime;
    }

    /**
     * The shortest time span allowed to select (in milliseconds) for example, 1000 will
     * limit selection to 1 second.
     **/
    public void setMinSelectedTime(double minSelectedTime) {
        this.minSelectedTime = minSelectedTime;
    }
    public Double getMinSelectedTime() {
        return minSelectedTime;
    }

    /**
     * Specifies if scrolling of a chart with mouse wheel is enabled.
     **/
    public void setMouseWheelScrollEnabled(boolean mouseWheelScrollEnabled) {
        this.mouseWheelScrollEnabled = mouseWheelScrollEnabled;
    }
    public boolean isMouseWheelScrollEnabled() {
        return mouseWheelScrollEnabled;
    }

    /**
     * If you set this to true, the chart will be rotated by 90 degrees (the columns will
     * become bars).
     **/
    public void setRotate(boolean rotate) {
        this.rotate = rotate;
    }
    public boolean isRotate() {
        return rotate;
    }

    /**
     * Specifies if chart should zoom-out when data is updated.
     **/
    public void setZoomOutOnDataUpdate(boolean zoomOutOnDataUpdate) {
        this.zoomOutOnDataUpdate = zoomOutOnDataUpdate;
    }
    public boolean isZoomOutOnDataUpdate() {
        return zoomOutOnDataUpdate;
    }

}