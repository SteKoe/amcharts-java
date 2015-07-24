package de.stekoe.amcharts;

import java.util.List;

public class CategoryAxis extends AxisBase {
    private Double autoRotateAngle;
    private Double autoRotateCount;
    private Boolean autoWrap;
    private Boolean boldPeriodBeginning;
    private Boolean centerLabelOnFullPeriod;
    private String classNameField;
    private List<Object> dateFormats;
    private Boolean equalSpacing;
    private Double firstDayOfWeek;
    private String forceShowField;
    private String gridPosition;
    private String labelColorField;
    private Boolean markPeriodChange;
    private String minPeriod;
    private Boolean parseDates;
    private String position;
    private Boolean startOnAxis;
    private String tickPosition;
    private Boolean twoLineMode;

    /**
     * Angle of label rotation, if the number of series exceeds autoRotateCount and parseDates
     * is set to false.
     */
    public CategoryAxis setAutoRotateAngle(double autoRotateAngle) {
        this.autoRotateAngle = autoRotateAngle;
        return this;
    }

    public Double getAutoRotateAngle() {
        return autoRotateAngle;
    }

    /**
     * If the number of category axis items will exceed the autoRotateCount, the labels
     * will be rotated by autoRotateAngle degree. Works only if parseDates is false.
     */
    public CategoryAxis setAutoRotateCount(double autoRotateCount) {
        this.autoRotateCount = autoRotateCount;
        return this;
    }

    public Double getAutoRotateCount() {
        return autoRotateCount;
    }

    /**
     * Specifies if axis labels (only when it is horizontal) should be wrapped if they don't
     * fit in the allocated space. If axis is vertical, you should set chart.autoGridCount
     * to false or axis.ignoreAxisWidth to true in order this feature to work.
     */
    public CategoryAxis setAutoWrap(boolean autoWrap) {
        this.autoWrap = autoWrap;
        return this;
    }

    public Boolean getAutoWrap() {
        return autoWrap;
    }

    /**
     * When parse dates is on for the category axis, the chart will try to highlight the
     * beginning of the periods, like month, in bold. Set this to false to disable the functionality.
     */
    public CategoryAxis setBoldPeriodBeginning(boolean boldPeriodBeginning) {
        this.boldPeriodBeginning = boldPeriodBeginning;
        return this;
    }

    public Boolean getBoldPeriodBeginning() {
        return boldPeriodBeginning;
    }

    /**
     * This setting works only when parseDates is set to true and equalSpacing is set to
     * false. In case you set it to false, labels will never be centered between grid lines.
     */
    public CategoryAxis setCenterLabelOnFullPeriod(boolean centerLabelOnFullPeriod) {
        this.centerLabelOnFullPeriod = centerLabelOnFullPeriod;
        return this;
    }

    public Boolean getCenterLabelOnFullPeriod() {
        return centerLabelOnFullPeriod;
    }

    /**
     * If this field is set and addClassNames is enabled, the category axis labels, ticks
     * and grid will have this class name set. NOTE: this will not work if the axis is date-based.
     */
    public CategoryAxis setClassNameField(String classNameField) {
        this.classNameField = classNameField;
        return this;
    }

    public String getClassNameField() {
        return classNameField;
    }

    /**
     * Date formats of different periods. Possible period values: fff - milliseconds, ss
     * - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years.
     * Check this page for date formatting strings.
     */
    public CategoryAxis setDateFormats(List<Object> dateFormats) {
        this.dateFormats = dateFormats;
        return this;
    }

    public List<Object> getDateFormats() {
        return dateFormats;
    }

    /**
     * In case your category axis values are Date objects and parseDates is set to true,
     * the chart will parse dates and will place your data points at irregular intervals.
     * However if you want dates to be parsed (displayed on the axis, baloons, etc), but
     * data points to be placed at equal intervals (omiting dates with no data), set equalSpacing
     * to true.
     */
    public CategoryAxis setEqualSpacing(boolean equalSpacing) {
        this.equalSpacing = equalSpacing;
        return this;
    }

    public Boolean getEqualSpacing() {
        return equalSpacing;
    }

    /**
     * Sets first day of the week. 0 is Sunday, 1 is Monday, etc.
     */
    public CategoryAxis setFirstDayOfWeek(double firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
        return this;
    }

    public Double getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * Field in data provider which specifies if the category value should always be shown.
     * For example: categoryAxis.forceShowField = "forceShow"; And in data: {category:"one",
     * forceShow:true, value:100} Note, this works only when parseDates is set to false.
     */
    public CategoryAxis setForceShowField(String forceShowField) {
        this.forceShowField = forceShowField;
        return this;
    }

    public String getForceShowField() {
        return forceShowField;
    }

    /**
     * Specifies if a grid line is placed on the center of a cell or on the beginning of
     * a cell. Possible values are: "start" and "middle" This setting doesn't work if parseDates
     * is set to true.
     */
    public CategoryAxis setGridPosition(String gridPosition) {
        this.gridPosition = gridPosition;
        return this;
    }

    public String getGridPosition() {
        return gridPosition;
    }

    /**
     * *You can use it to set color of a axis label. Works only with non-date-based data.
     */
    public CategoryAxis setLabelColorField(String labelColorField) {
        this.labelColorField = labelColorField;
        return this;
    }

    public String getLabelColorField() {
        return labelColorField;
    }

    /**
     * If you set it to false, the start of longer periods won't use a different date format
     * and won't be bold.
     */
    public CategoryAxis setMarkPeriodChange(boolean markPeriodChange) {
        this.markPeriodChange = markPeriodChange;
        return this;
    }

    public Boolean getMarkPeriodChange() {
        return markPeriodChange;
    }

    /**
     * Specifies the shortest period of your data. This should be set only if parseDates
     * is set to "true". Possible period values: fff - milliseconds, ss - seconds, mm -
     * minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also possible to
     * supply a number for increments, i.e. "15mm" which will instruct the chart that your
     * data is supplied in 15 minute increments.
     */
    public CategoryAxis setMinPeriod(String minPeriod) {
        this.minPeriod = minPeriod;
        return this;
    }

    public String getMinPeriod() {
        return minPeriod;
    }

    /**
     * In case your category axis values are Date objects, set this to true. In this case
     * the chart will parse dates and will place your data points at irregular intervals.
     * If you want dates to be parsed, but data points to be placed at equal intervals,
     * set both parseDates and equalSpacing to true.
     */
    public CategoryAxis setParseDates(boolean parseDates) {
        this.parseDates = parseDates;
        return this;
    }

    public Boolean getParseDates() {
        return parseDates;
    }

    /**
     * Possible values are: "top", "bottom", "left", "right". If axis is vertical, default
     * position is "left". If axis is horizontal, default position is "bottom".
     */
    public CategoryAxis setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getPosition() {
        return position;
    }

    /**
     * Specifies whether the graph should start on axis or not. In case you display columns,
     * it is recommended to set this to false. If parseDates is set to true, startOnAxis
     * will allways be false, unless equalSpacing is set to true.
     */
    public CategoryAxis setStartOnAxis(boolean startOnAxis) {
        this.startOnAxis = startOnAxis;
        return this;
    }

    public Boolean getStartOnAxis() {
        return startOnAxis;
    }

    /**
     * Position of a axis tick. Works only with non-date-based data.
     */
    public CategoryAxis setTickPosition(String tickPosition) {
        this.tickPosition = tickPosition;
        return this;
    }

    public String getTickPosition() {
        return tickPosition;
    }

    /**
     * Works only when parseDates is set to true and equalSpacing is false. If you set it
     * to true, at the position where bigger period changes, category axis will display
     * date strings of bot small and big period, in two rows.
     */
    public CategoryAxis setTwoLineMode(boolean twoLineMode) {
        this.twoLineMode = twoLineMode;
        return this;
    }

    public Boolean getTwoLineMode() {
        return twoLineMode;
    }

}