package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.util.Date;

public class ValueAxis extends AxisBase {
    private Boolean autoWrap;
    private Double axisFrequency;
    private Double axisTitleOffset;
    private Object balloonTextFunction;
    private Double baseCoord;
    private Double baseValue;
    private String duration;
    private Object durationUnits;
    private String gridType;
    private String id;
    private Boolean includeAllValues;
    private Boolean includeGuidesInMinMax;
    private Boolean includeHidden;
    private Boolean integersOnly;
    private Boolean logarithmic;
    private Double max;
    private Double maximum;
    private Date maximumDate;
    private Double min;
    private Double minimum;
    private Date minimumDate;
    private Double minMaxMultiplier;
    private String minPeriod;
    private String pointPosition;
    private String position;
    private Double precision;
    private Boolean radarCategoriesEnabled;
    private Boolean recalculateToPercents;
    private Boolean reversed;
    private String stackType;
    private Double step;
    private Boolean strictMinMax;
    private Double synchronizationMultiplier;
    private ValueAxis synchronizeWith;
    private String totalText;
    private Color totalTextColor;
    private Double totalTextOffset;
    private Double treatZeroAs;
    private String type;
    private String unit;
    private String unitPosition;
    private Boolean usePrefixes;
    private Boolean useScientificNotation;
    private Double zeroGridAlpha;

    /**
     * If this is set to true and the label does not fit, it will be wrapped. Works only
     * on horizontal value axes.
     **/
    public ValueAxis setAutoWrap(boolean autoWrap) {
        this.autoWrap = autoWrap;
        return this;
    }

    public Boolean getAutoWrap() {
        return autoWrap;
    }

    /**
     * Works with Radar chart only. If you have a big number of axes, this property will
     * help you to show every x axis only.
     **/
    public ValueAxis setAxisFrequency(double axisFrequency) {
        this.axisFrequency = axisFrequency;
        return this;
    }

    public Double getAxisFrequency() {
        return axisFrequency;
    }

    /**
     * Radar chart only. Specifies distance from axis to the axis title (category)
     **/
    public ValueAxis setAxisTitleOffset(double axisTitleOffset) {
        this.axisTitleOffset = axisTitleOffset;
        return this;
    }

    public Double getAxisTitleOffset() {
        return axisTitleOffset;
    }

    /**
     * You can use this function to format balloon text of the axis. This function is called
     * and balloon text or date (if axis is date-based) is passed as an argument. It should
     * return string which will be displayed in the balloon.
     **/
    public ValueAxis setBalloonTextFunction(Object balloonTextFunction) {
        this.balloonTextFunction = balloonTextFunction;
        return this;
    }

    public Object getBalloonTextFunction() {
        return balloonTextFunction;
    }

    /**
     * Read-only. Coordinate of the base value.
     **/
    public ValueAxis setBaseCoord(double baseCoord) {
        this.baseCoord = baseCoord;
        return this;
    }

    public Double getBaseCoord() {
        return baseCoord;
    }

    /**
     * Specifies base value of the axis.
     **/
    public ValueAxis setBaseValue(double baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    public Double getBaseValue() {
        return baseValue;
    }

    /**
     * If your values represents time units, and you want value axis labels to be formatted
     * as duration, you have to set the duration unit. Possible values are: "ss", "mm",
     * "hh" and "DD".
     **/
    public ValueAxis setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    public String getDuration() {
        return duration;
    }

    /**
     * If duration property is set, you can specify what string should be displayed next
     * to day, hour, minute and second.
     **/
    public ValueAxis setDurationUnits(Object durationUnits) {
        this.durationUnits = durationUnits;
        return this;
    }

    public Object getDurationUnits() {
        return durationUnits;
    }

    /**
     * Radar chart only. Possible values are: "polygons" and "circles". Set "circles" for
     * polar charts.
     **/
    public ValueAxis setGridType(String gridType) {
        this.gridType = gridType;
        return this;
    }

    public String getGridType() {
        return gridType;
    }

    /**
     * Unique id of value axis. It is not required to set it, unless you need to tell the
     * graph which exact value axis it should use.
     **/
    public ValueAxis setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * *If you set it to true, minimum and maximum of value axis will not change while zooming/scrolling.
     **/
    public ValueAxis setIncludeAllValues(boolean includeAllValues) {
        this.includeAllValues = includeAllValues;
        return this;
    }

    public Boolean getIncludeAllValues() {
        return includeAllValues;
    }

    /**
     * Specifies whether guide values should be included when calculating min and max of
     * the axis.
     **/
    public ValueAxis setIncludeGuidesInMinMax(boolean includeGuidesInMinMax) {
        this.includeGuidesInMinMax = includeGuidesInMinMax;
        return this;
    }

    public Boolean getIncludeGuidesInMinMax() {
        return includeGuidesInMinMax;
    }

    /**
     * *If true, the axis will include hidden graphs when calculating min and max values.
     **/
    public ValueAxis setIncludeHidden(boolean includeHidden) {
        this.includeHidden = includeHidden;
        return this;
    }

    public Boolean getIncludeHidden() {
        return includeHidden;
    }

    /**
     * *Specifies whether values on axis can only be integers or both integers and doubles.
     **/
    public ValueAxis setIntegersOnly(boolean integersOnly) {
        this.integersOnly = integersOnly;
        return this;
    }

    public Boolean getIntegersOnly() {
        return integersOnly;
    }

    /**
     * Specifies if this value axis' scale should be logarithmic.
     **/
    public ValueAxis setLogarithmic(boolean logarithmic) {
        this.logarithmic = logarithmic;
        return this;
    }

    public Boolean getLogarithmic() {
        return logarithmic;
    }

    /**
     * Read-only. Maximum value of the axis.
     **/
    public ValueAxis setMax(double max) {
        this.max = max;
        return this;
    }

    public Double getMax() {
        return max;
    }

    /**
     * If you don't want max value to be calculated by the chart, set it using this property.
     * This value might still be adjusted so that it would be possible to draw grid at rounded
     * intervals.
     **/
    public ValueAxis setMaximum(double maximum) {
        this.maximum = maximum;
        return this;
    }

    public Double getMaximum() {
        return maximum;
    }

    /**
     * If your value axis is date-based, you can specify maximum date of the axis. Can be
     * set as date object, timestamp number or string if dataDateFormat is set.
     **/
    public ValueAxis setMaximumDate(Date maximumDate) {
        this.maximumDate = maximumDate;
        return this;
    }

    public Date getMaximumDate() {
        return maximumDate;
    }

    /**
     * Read-only. Minimum value of the axis.
     **/
    public ValueAxis setMin(double min) {
        this.min = min;
        return this;
    }

    public Double getMin() {
        return min;
    }

    /**
     * If you don't want min value to be calculated by the chart, set it using this property.
     * This value might still be adjusted so that it would be possible to draw grid at rounded
     * intervals.
     **/
    public ValueAxis setMinimum(double minimum) {
        this.minimum = minimum;
        return this;
    }

    public Double getMinimum() {
        return minimum;
    }

    /**
     * If your value axis is date-based, you can specify minimum date of the axis. Can be
     * set as date object, timestamp number or string if dataDateFormat is set.
     **/
    public ValueAxis setMinimumDate(Date minimumDate) {
        this.minimumDate = minimumDate;
        return this;
    }

    public Date getMinimumDate() {
        return minimumDate;
    }

    /**
     * If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set
     * to 1.2 the scope of values will increase by 20%.
     **/
    public ValueAxis setMinMaxMultiplier(double minMaxMultiplier) {
        this.minMaxMultiplier = minMaxMultiplier;
        return this;
    }

    public Double getMinMaxMultiplier() {
        return minMaxMultiplier;
    }

    /**
     * Specifies the shortest period of your data. This will work only if you set the `type`
     * of your value axis to `"date"`. Possible period values: fff - milliseconds, ss -
     * seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also
     * possible to supply a number for increments, i.e. "15mm" which will instruct the chart
     * that your data is supplied in 15 minute increments.
     **/
    public ValueAxis setMinPeriod(String minPeriod) {
        this.minPeriod = minPeriod;
        return this;
    }

    public String getMinPeriod() {
        return minPeriod;
    }

    /**
     * Works with radar charts only. If you set it to “middle”, labels and data points will
     * be placed in the middle between axes.
     **/
    public ValueAxis setPointPosition(String pointPosition) {
        this.pointPosition = pointPosition;
        return this;
    }

    public String getPointPosition() {
        return pointPosition;
    }

    /**
     * Possible values are: "top", "bottom", "left", "right". If axis is vertical, default
     * position is "left". If axis is horizontal, default position is "bottom".
     **/
    public ValueAxis setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getPosition() {
        return position;
    }

    /**
     * Precision (number of decimals) of values.
     **/
    public ValueAxis setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    public Double getPrecision() {
        return precision;
    }

    /**
     * Radar chart only. Specifies if categories (axes' titles) should be displayed near
     * axes)
     **/
    public ValueAxis setRadarCategoriesEnabled(boolean radarCategoriesEnabled) {
        this.radarCategoriesEnabled = radarCategoriesEnabled;
        return this;
    }

    public Boolean getRadarCategoriesEnabled() {
        return radarCategoriesEnabled;
    }

    /**
     * Specifies if graphs's values should be recalculated to percents. Note, that this
     * setting will work only on Serial chart (and Stock), not on any other charts that
     * are using ValueAxis, like XY chart.
     **/
    public ValueAxis setRecalculateToPercents(boolean recalculateToPercents) {
        this.recalculateToPercents = recalculateToPercents;
        return this;
    }

    public Boolean getRecalculateToPercents() {
        return recalculateToPercents;
    }

    /**
     * Specifies if value axis should be reversed (smaller values on top).
     **/
    public ValueAxis setReversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public Boolean getReversed() {
        return reversed;
    }

    /**
     * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
     * Note, only graphs of one type will be stacked.
     **/
    public ValueAxis setStackType(String stackType) {
        this.stackType = stackType;
        return this;
    }

    public String getStackType() {
        return stackType;
    }

    /**
     * Read-only. Value difference between two grid lines.
     **/
    public ValueAxis setStep(double step) {
        this.step = step;
        return this;
    }

    public Double getStep() {
        return step;
    }

    /**
     * If you set minimum and maximum for your axis, chart adjusts them so that grid would
     * start and end on the beginning and end of plot area and grid would be at equal intervals.
     * If you set strictMinMax to true, the chart will not adjust minimum and maximum of
     * value axis.
     **/
    public ValueAxis setStrictMinMax(boolean strictMinMax) {
        this.strictMinMax = strictMinMax;
        return this;
    }

    public Boolean getStrictMinMax() {
        return strictMinMax;
    }

    /**
     * In case you synchronize one value axis with another, you need to set the synchronization
     * multiplier. Use synchronizeWithAxis method to set with which axis it should be synced.
     **/
    public ValueAxis setSynchronizationMultiplier(double synchronizationMultiplier) {
        this.synchronizationMultiplier = synchronizationMultiplier;
        return this;
    }

    public Double getSynchronizationMultiplier() {
        return synchronizationMultiplier;
    }

    /**
     * One value axis can be synchronized with another value axis. You can use both reference
     * to your axis or id of the axis here. You should set synchronizationMultiplyer in
     * order for this to work.
     **/
    public ValueAxis setSynchronizeWith(ValueAxis synchronizeWith) {
        this.synchronizeWith = synchronizeWith;
        return this;
    }

    public ValueAxis getSynchronizeWith() {
        return synchronizeWith;
    }

    /**
     * If this value axis is stacked and has columns, setting valueAxis.totalText = "[[total]]"
     * will make it to display total value above the most-top column.
     **/
    public ValueAxis setTotalText(String totalText) {
        this.totalText = totalText;
        return this;
    }

    public String getTotalText() {
        return totalText;
    }

    /**
     * Color of total text.
     **/
    public ValueAxis setTotalTextColor(Color totalTextColor) {
        this.totalTextColor = totalTextColor;
        return this;
    }

    public Color getTotalTextColor() {
        return totalTextColor;
    }

    /**
     * Distance from data point to total text.
     **/
    public ValueAxis setTotalTextOffset(double totalTextOffset) {
        this.totalTextOffset = totalTextOffset;
        return this;
    }

    public Double getTotalTextOffset() {
        return totalTextOffset;
    }

    /**
     * This allows you to have logarithmic value axis and have zero values in the data.
     * You must set it to >0 value in order to work.
     **/
    public ValueAxis setTreatZeroAs(double treatZeroAs) {
        this.treatZeroAs = treatZeroAs;
        return this;
    }

    public Double getTreatZeroAs() {
        return treatZeroAs;
    }

    /**
     * Type of value axis. If your values in data provider are dates and you want this axis
     * to show dates instead of numbers, set it to "date".
     **/
    public ValueAxis setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    /**
     * Unit which will be added to the value label.
     **/
    public ValueAxis setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    /**
     * Position of the unit. Possible values are "left" and "right".
     **/
    public ValueAxis setUnitPosition(String unitPosition) {
        this.unitPosition = unitPosition;
        return this;
    }

    public String getUnitPosition() {
        return unitPosition;
    }

    /**
     * If true, prefixes will be used for big and small numbers. You can set arrays of prefixes
     * directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers.
     **/
    public ValueAxis setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
        return this;
    }

    public Boolean getUsePrefixes() {
        return usePrefixes;
    }

    /**
     * If true, values will always be formatted using scientific notation (5e+8, 5e-8...)
     * Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in
     * scientific notation.
     **/
    public ValueAxis setUseScientificNotation(boolean useScientificNotation) {
        this.useScientificNotation = useScientificNotation;
        return this;
    }

    public Boolean getUseScientificNotation() {
        return useScientificNotation;
    }

    /**
     * Opacity of a zero grid line. By default it is equal to 2 x gridAlpha.
     **/
    public ValueAxis setZeroGridAlpha(double zeroGridAlpha) {
        this.zeroGridAlpha = zeroGridAlpha;
        return this;
    }

    public Double getZeroGridAlpha() {
        return zeroGridAlpha;
    }

}