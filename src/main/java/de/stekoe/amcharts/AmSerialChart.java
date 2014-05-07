package de.stekoe.amcharts;

import java.util.Date;

public class AmSerialChart extends AmRectangularChart {
    private String balloonDateFormat;
    private CategoryAxis categoryAxis;
    private String categoryField;
    private Double columnSpacing;
    private Double columnSpacing3D;
    private Double columnWidth;
    private String dataDateFormat;
    private Date endDate;
    private Double endIndex;
    private Double maxSelectedSeries;
    private Double maxSelectedTime;
    private Double minSelectedTime;
    private Boolean mouseWheelScrollEnabled;
    private Boolean rotate;
    private Date startDate;
    private Double startIndex;
    private Boolean zoomOutOnDataUpdate;

    /**
     *      *Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
     **/
    public String getBalloonDateFormat() {
        return balloonDateFormat;
    }
    public AmSerialChart setBalloonDateFormat(String balloonDateFormat) {
        this.balloonDateFormat = balloonDateFormat;
        return this;
    }

    /**
     * Read-only. Chart creates category axis itself. If you want to change some properties,
     * you should get this axis from the chart and set properties to this object.
     **/
    public CategoryAxis getCategoryAxis() {
        return categoryAxis;
    }
    public AmSerialChart setCategoryAxis(CategoryAxis categoryAxis) {
        this.categoryAxis = categoryAxis;
        return this;
    }

    /**
     * Category field name tells the chart the name of the field in your dataProvider object
     * which will be used for category axis values.
     **/
    public String getCategoryField() {
        return categoryField;
    }
    public AmSerialChart setCategoryField(String categoryField) {
        this.categoryField = categoryField;
        return this;
    }

    /**
     * The gap in pixels between two columns of the same category.
     **/
    public Double getColumnSpacing() {
        return columnSpacing;
    }
    public AmSerialChart setColumnSpacing(double columnSpacing) {
        this.columnSpacing = columnSpacing;
        return this;
    }

    /**
     * Space between 3D stacked columns.
     **/
    public Double getColumnSpacing3D() {
        return columnSpacing3D;
    }
    public AmSerialChart setColumnSpacing3D(double columnSpacing3D) {
        this.columnSpacing3D = columnSpacing3D;
        return this;
    }

    /**
     * Relative width of columns. Value range is 0 - 1.
     **/
    public Double getColumnWidth() {
        return columnWidth;
    }
    public AmSerialChart setColumnWidth(double columnWidth) {
        this.columnWidth = columnWidth;
        return this;
    }

    /**
     * Even if your chart parses dates, you can pass them as strings in your data – all
     * you need to do is to set data date format and the chart will parse dates to date
     * objects. Check this page for available formats.
     **/
    public String getDataDateFormat() {
        return dataDateFormat;
    }
    public AmSerialChart setDataDateFormat(String dataDateFormat) {
        this.dataDateFormat = dataDateFormat;
        return this;
    }

    /**
     * Read-only. If category axis parses dates endDate indicates date to which the chart
     * is currently displayed.
     **/
    public Date getEndDate() {
        return endDate;
    }
    public AmSerialChart setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Read-only. Category index to which the chart is currently displayed.
     **/
    public Double getEndIndex() {
        return endIndex;
    }
    public AmSerialChart setEndIndex(double endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    /**
     * Maximum number of series allowed to select.
     **/
    public Double getMaxSelectedSeries() {
        return maxSelectedSeries;
    }
    public AmSerialChart setMaxSelectedSeries(double maxSelectedSeries) {
        this.maxSelectedSeries = maxSelectedSeries;
        return this;
    }

    /**
     * The longest time span allowed to select (in milliseconds) for example, 259200000
     * will limit selection to 3 days.
     **/
    public Double getMaxSelectedTime() {
        return maxSelectedTime;
    }
    public AmSerialChart setMaxSelectedTime(double maxSelectedTime) {
        this.maxSelectedTime = maxSelectedTime;
        return this;
    }

    /**
     * The shortest time span allowed to select (in milliseconds) for example, 1000 will
     * limit selection to 1 second.
     **/
    public Double getMinSelectedTime() {
        return minSelectedTime;
    }
    public AmSerialChart setMinSelectedTime(double minSelectedTime) {
        this.minSelectedTime = minSelectedTime;
        return this;
    }

    /**
     * Specifies if scrolling of a chart with mouse wheel is enabled.
     **/
    public Boolean getMouseWheelScrollEnabled() {
        return mouseWheelScrollEnabled;
    }
    public AmSerialChart setMouseWheelScrollEnabled(boolean mouseWheelScrollEnabled) {
        this.mouseWheelScrollEnabled = mouseWheelScrollEnabled;
        return this;
    }

    /**
     * If you set this to true, the chart will be rotated by 90 degrees (the columns will
     * become bars).
     **/
    public Boolean getRotate() {
        return rotate;
    }
    public AmSerialChart setRotate(boolean rotate) {
        this.rotate = rotate;
        return this;
    }

    /**
     * Read-only. If category axis parses dates startDate indicates date from which the
     * chart is currently displayed.
     **/
    public Date getStartDate() {
        return startDate;
    }
    public AmSerialChart setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Read-only. Category index from which the chart is currently displayed.
     **/
    public Double getStartIndex() {
        return startIndex;
    }
    public AmSerialChart setStartIndex(double startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * Specifies if chart should zoom-out when data is updated.
     **/
    public Boolean getZoomOutOnDataUpdate() {
        return zoomOutOnDataUpdate;
    }
    public AmSerialChart setZoomOutOnDataUpdate(boolean zoomOutOnDataUpdate) {
        this.zoomOutOnDataUpdate = zoomOutOnDataUpdate;
        return this;
    }

}