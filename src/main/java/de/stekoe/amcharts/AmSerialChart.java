package de.stekoe.amcharts;

import java.util.Date;

/**
 * Extension for AmRectangularChart to create line, area, column, bar, step line, smoothed
 * line, candlestick and OHLC charts. The charts support multiple axes with simple or
 * logarithmic scales, the data points can be displayed at equal / irregular intervals
 * or on timeline basis.
 */

public class AmSerialChart extends AmRectangularChart {
    private String balloonDateFormat;
    private Double bezierX;
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
    private Boolean mouseWheelZoomEnabled;
    private Boolean rotate;
    private Date startDate;
    private Double startIndex;
    private ChartScrollbar valueScrollbar;
    private Boolean zoomOutOnDataUpdate;

    /**
     * @param balloonDateFormat *Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
     * @return AmSerialChart
     */
    public AmSerialChart setBalloonDateFormat(String balloonDateFormat) {
        this.balloonDateFormat = balloonDateFormat;
        return this;
    }

    public String getBalloonDateFormat() {
        return balloonDateFormat;
    }

    /**
     * @param bezierX Horizontal tension of bezier (used by smoothed line). If not defined, chart adjust
     *                tension by itself, taking in to account if chart is rotated or not. Allowed values
     *                1 - Infinity
     * @return AmSerialChart
     */
    public AmSerialChart setBezierX(double bezierX) {
        this.bezierX = bezierX;
        return this;
    }

    public Double getBezierX() {
        return bezierX;
    }

    /**
     * @param categoryAxis Read-only. Chart creates category axis itself. If you want to change some properties,
     *                     you should get this axis from the chart and set properties to this object.
     * @return AmSerialChart
     */
    public AmSerialChart setCategoryAxis(CategoryAxis categoryAxis) {
        this.categoryAxis = categoryAxis;
        return this;
    }

    public CategoryAxis getCategoryAxis() {
        return categoryAxis;
    }

    /**
     * @param categoryField Category field name tells the chart the name of the field in your dataProvider object
     *                      which will be used for category axis values.
     * @return AmSerialChart
     */
    public AmSerialChart setCategoryField(String categoryField) {
        this.categoryField = categoryField;
        return this;
    }

    public String getCategoryField() {
        return categoryField;
    }

    /**
     * @param columnSpacing The gap in pixels between two columns of the same category.
     * @return AmSerialChart
     */
    public AmSerialChart setColumnSpacing(double columnSpacing) {
        this.columnSpacing = columnSpacing;
        return this;
    }

    public Double getColumnSpacing() {
        return columnSpacing;
    }

    /**
     * @param columnSpacing3D Space between 3D stacked columns.
     * @return AmSerialChart
     */
    public AmSerialChart setColumnSpacing3D(double columnSpacing3D) {
        this.columnSpacing3D = columnSpacing3D;
        return this;
    }

    public Double getColumnSpacing3D() {
        return columnSpacing3D;
    }

    /**
     * @param columnWidth Relative width of columns. Value range is 0 - 1.
     * @return AmSerialChart
     */
    public AmSerialChart setColumnWidth(double columnWidth) {
        this.columnWidth = columnWidth;
        return this;
    }

    public Double getColumnWidth() {
        return columnWidth;
    }

    /**
     * @param dataDateFormat Even if your chart parses dates, you can pass them as strings in your data – all
     *                       you need to do is to set data date format and the chart will parse dates to date
     *                       objects. Check this page for available formats. Please note that two-digit years
     *                       (YY) as well as literal month names (MMM) are NOT supported in this setting.
     * @return AmSerialChart
     */
    public AmSerialChart setDataDateFormat(String dataDateFormat) {
        this.dataDateFormat = dataDateFormat;
        return this;
    }

    public String getDataDateFormat() {
        return dataDateFormat;
    }

    /**
     * @param endDate Read-only. If category axis parses dates endDate indicates date to which the chart
     *                is currently displayed.
     * @return AmSerialChart
     */
    public AmSerialChart setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endIndex Read-only. Category index to which the chart is currently displayed.
     * @return AmSerialChart
     */
    public AmSerialChart setEndIndex(double endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    public Double getEndIndex() {
        return endIndex;
    }

    /**
     * @param maxSelectedSeries Maximum number of series allowed to select.
     * @return AmSerialChart
     */
    public AmSerialChart setMaxSelectedSeries(double maxSelectedSeries) {
        this.maxSelectedSeries = maxSelectedSeries;
        return this;
    }

    public Double getMaxSelectedSeries() {
        return maxSelectedSeries;
    }

    /**
     * @param maxSelectedTime The longest time span allowed to select (in milliseconds) for example, 259200000
     *                        will limit selection to 3 days. Works if equalSpacing is set to false (default).
     * @return AmSerialChart
     */
    public AmSerialChart setMaxSelectedTime(double maxSelectedTime) {
        this.maxSelectedTime = maxSelectedTime;
        return this;
    }

    public Double getMaxSelectedTime() {
        return maxSelectedTime;
    }

    /**
     * @param minSelectedTime The shortest time span allowed to select (in milliseconds) for example, 1000 will
     *                        limit selection to 1 second. Works if equalSpacing is set to false (default).
     * @return AmSerialChart
     */
    public AmSerialChart setMinSelectedTime(double minSelectedTime) {
        this.minSelectedTime = minSelectedTime;
        return this;
    }

    public Double getMinSelectedTime() {
        return minSelectedTime;
    }

    /**
     * @param mouseWheelScrollEnabled Specifies if scrolling of a chart with mouse wheel is enabled. If you press shift
     *                                while rotating mouse wheel, the chart will zoom-in/out.
     * @return AmSerialChart
     */
    public AmSerialChart setMouseWheelScrollEnabled(boolean mouseWheelScrollEnabled) {
        this.mouseWheelScrollEnabled = mouseWheelScrollEnabled;
        return this;
    }

    public Boolean getMouseWheelScrollEnabled() {
        return mouseWheelScrollEnabled;
    }

    /**
     * @param mouseWheelZoomEnabled Specifies if zooming of a chart with mouse wheel is enabled. If you press shift while
     *                              rotating mouse wheel, the chart will scroll.
     * @return AmSerialChart
     */
    public AmSerialChart setMouseWheelZoomEnabled(boolean mouseWheelZoomEnabled) {
        this.mouseWheelZoomEnabled = mouseWheelZoomEnabled;
        return this;
    }

    public Boolean getMouseWheelZoomEnabled() {
        return mouseWheelZoomEnabled;
    }

    /**
     * @param rotate If you set this to true, the chart will be rotated by 90 degrees (the columns will
     *               become bars).
     * @return AmSerialChart
     */
    public AmSerialChart setRotate(boolean rotate) {
        this.rotate = rotate;
        return this;
    }

    public Boolean getRotate() {
        return rotate;
    }

    /**
     * @param startDate Read-only. If category axis parses dates startDate indicates date from which the
     *                  chart is currently displayed.
     * @return AmSerialChart
     */
    public AmSerialChart setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startIndex Read-only. Category index from which the chart is currently displayed.
     * @return AmSerialChart
     */
    public AmSerialChart setStartIndex(double startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public Double getStartIndex() {
        return startIndex;
    }

    /**
     * @param valueScrollbar Value scrollbar, enables scrolling value axes.
     * @return AmSerialChart
     */
    public AmSerialChart setValueScrollbar(ChartScrollbar valueScrollbar) {
        this.valueScrollbar = valueScrollbar;
        return this;
    }

    public ChartScrollbar getValueScrollbar() {
        return valueScrollbar;
    }

    /**
     * @param zoomOutOnDataUpdate Specifies if chart should zoom-out when data is updated.
     * @return AmSerialChart
     */
    public AmSerialChart setZoomOutOnDataUpdate(boolean zoomOutOnDataUpdate) {
        this.zoomOutOnDataUpdate = zoomOutOnDataUpdate;
        return this;
    }

    public Boolean getZoomOutOnDataUpdate() {
        return zoomOutOnDataUpdate;
    }

}