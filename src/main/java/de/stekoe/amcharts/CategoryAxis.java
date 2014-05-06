package de.stekoe.amcharts;

import java.util.List;
public class CategoryAxis extends AxisBase {
    private Double autoRotateAngle;
    private Double autoRotateCount;
    private Boolean autoWrap;
    private Boolean boldPeriodBeginning;
    private Boolean centerLabelOnFullPeriod;
    private List<Object> dateFormats;
    private Boolean equalSpacing;
    private Double firstDayOfWeek;
    private String forceShowField;
    private String gridPosition;
    private Boolean markPeriodChange;
    private String minPeriod;
    private Boolean parseDates;
    private String position;
    private Boolean startOnAxis;
    private Boolean twoLineMode;

    /**
     * Angle of label rotation, if the number of series exceeds autoRotateCount and parseDates
     * is set to false.
     **/
    public void setAutoRotateAngle(double autoRotateAngle) {
        this.autoRotateAngle = autoRotateAngle;
    }
    public Double getAutoRotateAngle() {
        return autoRotateAngle;
    }

    /**
     * If the number of category axis items will exceed the autoRotateCount, the labels
     * will be rotated by autoRotateAngle degree. Works only if parseDates is false.
     **/
    public void setAutoRotateCount(double autoRotateCount) {
        this.autoRotateCount = autoRotateCount;
    }
    public Double getAutoRotateCount() {
        return autoRotateCount;
    }

    /**
     * Specifies if axis labels (only when it is horizontal) should be wrapped if they don't
     * fit in the allocated space. Wrapping won't work for rotated axis labels.
     **/
    public void setAutoWrap(boolean autoWrap) {
        this.autoWrap = autoWrap;
    }
    public boolean isAutoWrap() {
        return autoWrap;
    }

    /**
     * When parse dates is on for the category axis, the chart will try to highlight the
     * beginning of the periods, like month, in bold. Set this to false to disable the functionality.
     **/
    public void setBoldPeriodBeginning(boolean boldPeriodBeginning) {
        this.boldPeriodBeginning = boldPeriodBeginning;
    }
    public boolean isBoldPeriodBeginning() {
        return boldPeriodBeginning;
    }

    /**
     * This setting works only when parseDates is set to true and equalSpacing is set to
     * false. In case you set it to false, labels will never be centered between grid lines.
     **/
    public void setCenterLabelOnFullPeriod(boolean centerLabelOnFullPeriod) {
        this.centerLabelOnFullPeriod = centerLabelOnFullPeriod;
    }
    public boolean isCenterLabelOnFullPeriod() {
        return centerLabelOnFullPeriod;
    }

    /**
     * Date formats of different periods. Possible period values: fff - milliseconds, ss
     * - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years.
     * Check this page for date formatting strings.
     **/
    public void setDateFormats(List<Object> dateFormats) {
        this.dateFormats = dateFormats;
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
     **/
    public void setEqualSpacing(boolean equalSpacing) {
        this.equalSpacing = equalSpacing;
    }
    public boolean isEqualSpacing() {
        return equalSpacing;
    }

    /**
     * Sets first day of the week. 0 is Sunday, 1 is Monday, etc.
     **/
    public void setFirstDayOfWeek(double firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
    }
    public Double getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * Field in data provider which specifies if the category value should always be shown.
     * For example: categoryAxis.forceShowField = "forceShow"; And in data: {category:"one",
     * forceShow:true, value:100} Note, this works only when parseDates is set to false.
     **/
    public void setForceShowField(String forceShowField) {
        this.forceShowField = forceShowField;
    }
    public String getForceShowField() {
        return forceShowField;
    }

    /**
     * Specifies if a grid line is placed on the center of a cell or on the beginning of
     * a cell. Possible values are: "start" and "middle" This setting doesn't work if parseDates
     * is set to true.
     **/
    public void setGridPosition(String gridPosition) {
        this.gridPosition = gridPosition;
    }
    public String getGridPosition() {
        return gridPosition;
    }

    /**
     * If you set it to false, the start of longer periods won't use a different date format
     * and won't be bold.
     **/
    public void setMarkPeriodChange(boolean markPeriodChange) {
        this.markPeriodChange = markPeriodChange;
    }
    public boolean isMarkPeriodChange() {
        return markPeriodChange;
    }

    /**
     * Specifies the shortest period of your data. This should be set only if parseDates
     * is set to "true". Possible period values: fff - milliseconds, ss - seconds, mm -
     * minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also possible to
     * supply a number for increments, i.e. "15mm" which will instruct the chart that your
     * data is supplied in 15 minute increments.
     **/
    public void setMinPeriod(String minPeriod) {
        this.minPeriod = minPeriod;
    }
    public String getMinPeriod() {
        return minPeriod;
    }

    /**
     * In case your category axis values are Date objects, set this to true. In this case
     * the chart will parse dates and will place your data points at irregular intervals.
     * If you want dates to be parsed, but data points to be placed at equal intervals,
     * set both parseDates and equalSpacing to true.
     **/
    public void setParseDates(boolean parseDates) {
        this.parseDates = parseDates;
    }
    public boolean isParseDates() {
        return parseDates;
    }

    /**
     * Possible values are: "top", "bottom", "left", "right". If axis is vertical, default
     * position is "left". If axis is horizontal, default position is "bottom".
     **/
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }

    /**
     * Specifies whether the graph should start on axis or not. In case you display columns,
     * it is recommended to set this to false. If parseDates is set to true, startOnAxis
     * will allways be false, unless equalSpacing is set to true.
     **/
    public void setStartOnAxis(boolean startOnAxis) {
        this.startOnAxis = startOnAxis;
    }
    public boolean isStartOnAxis() {
        return startOnAxis;
    }

    /**
     * Works only when parseDates is set to true and equalSpacing is false. If you set it
     * to true, at the position where bigger period changes, category axis will display
     * date strings of bot small and big period, in two rows.
     **/
    public void setTwoLineMode(boolean twoLineMode) {
        this.twoLineMode = twoLineMode;
    }
    public boolean isTwoLineMode() {
        return twoLineMode;
    }

}