package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.util.Date;

/**
 * Extension for ValueAxis to create an axis for AmSerialChart, AmRadarChart, AmXYChart
 * charts, multiple can be assigned. Gets automatically populated, one for AmSerialChart
 * and two for AmXYChart charts, if none has been specified.
 */

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
     * @param autoWrap If this is set to true and the label does not fit, it will be wrapped. Works only
     *                 on horizontal value axes.
     * @return ValueAxis
     */
    public ValueAxis setAutoWrap(boolean autoWrap) {
        this.autoWrap = autoWrap;
        return this;
    }

    public Boolean getAutoWrap() {
        return autoWrap;
    }

    /**
     * @param axisFrequency Works with Radar chart only. If you have a big number of axes, this property will
     *                      help you to show every x axis only.
     * @return ValueAxis
     */
    public ValueAxis setAxisFrequency(double axisFrequency) {
        this.axisFrequency = axisFrequency;
        return this;
    }

    public Double getAxisFrequency() {
        return axisFrequency;
    }

    /**
     * @param axisTitleOffset Radar chart only. Specifies distance from axis to the axis title (category)
     * @return ValueAxis
     */
    public ValueAxis setAxisTitleOffset(double axisTitleOffset) {
        this.axisTitleOffset = axisTitleOffset;
        return this;
    }

    public Double getAxisTitleOffset() {
        return axisTitleOffset;
    }

    /**
     * @param balloonTextFunction You can use this function to format balloon text of the axis. This function is called
     *                            and balloon text or date (if axis is date-based) is passed as an argument. It should
     *                            return string which will be displayed in the balloon.
     * @return ValueAxis
     */
    public ValueAxis setBalloonTextFunction(Object balloonTextFunction) {
        this.balloonTextFunction = balloonTextFunction;
        return this;
    }

    public Object getBalloonTextFunction() {
        return balloonTextFunction;
    }

    /**
     * @param baseCoord Read-only. Coordinate of the base value.
     * @return ValueAxis
     */
    public ValueAxis setBaseCoord(double baseCoord) {
        this.baseCoord = baseCoord;
        return this;
    }

    public Double getBaseCoord() {
        return baseCoord;
    }

    /**
     * @param baseValue Specifies base value of the axis.
     * @return ValueAxis
     */
    public ValueAxis setBaseValue(double baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    public Double getBaseValue() {
        return baseValue;
    }

    /**
     * @param duration If your values represents time units, and you want value axis labels to be formatted
     *                 as duration, you have to set the duration unit. Possible values are: "ss", "mm",
     *                 "hh" and "DD".
     * @return ValueAxis
     */
    public ValueAxis setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    public String getDuration() {
        return duration;
    }

    /**
     * @param durationUnits If duration property is set, you can specify what string should be displayed next
     *                      to day, hour, minute and second.
     * @return ValueAxis
     */
    public ValueAxis setDurationUnits(Object durationUnits) {
        this.durationUnits = durationUnits;
        return this;
    }

    public Object getDurationUnits() {
        return durationUnits;
    }

    /**
     * @param gridType Radar chart only. Possible values are: "polygons" and "circles". Set "circles" for
     *                 polar charts.
     * @return ValueAxis
     */
    public ValueAxis setGridType(String gridType) {
        this.gridType = gridType;
        return this;
    }

    public String getGridType() {
        return gridType;
    }

    /**
     * @param id Unique id of value axis. It is not required to set it, unless you need to tell the
     *           graph which exact value axis it should use.
     * @return ValueAxis
     */
    public ValueAxis setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * @param includeAllValues *If you set it to true, minimum and maximum of value axis will not change while zooming/scrolling.
     * @return ValueAxis
     */
    public ValueAxis setIncludeAllValues(boolean includeAllValues) {
        this.includeAllValues = includeAllValues;
        return this;
    }

    public Boolean getIncludeAllValues() {
        return includeAllValues;
    }

    /**
     * @param includeGuidesInMinMax Specifies whether guide values should be included when calculating min and max of
     *                              the axis.
     * @return ValueAxis
     */
    public ValueAxis setIncludeGuidesInMinMax(boolean includeGuidesInMinMax) {
        this.includeGuidesInMinMax = includeGuidesInMinMax;
        return this;
    }

    public Boolean getIncludeGuidesInMinMax() {
        return includeGuidesInMinMax;
    }

    /**
     * @param includeHidden *If true, the axis will include hidden graphs when calculating min and max values.
     * @return ValueAxis
     */
    public ValueAxis setIncludeHidden(boolean includeHidden) {
        this.includeHidden = includeHidden;
        return this;
    }

    public Boolean getIncludeHidden() {
        return includeHidden;
    }

    /**
     * @param integersOnly *Specifies whether values on axis can only be integers or both integers and doubles.
     * @return ValueAxis
     */
    public ValueAxis setIntegersOnly(boolean integersOnly) {
        this.integersOnly = integersOnly;
        return this;
    }

    public Boolean getIntegersOnly() {
        return integersOnly;
    }

    /**
     * @param logarithmic Specifies if this value axis' scale should be logarithmic.
     * @return ValueAxis
     */
    public ValueAxis setLogarithmic(boolean logarithmic) {
        this.logarithmic = logarithmic;
        return this;
    }

    public Boolean getLogarithmic() {
        return logarithmic;
    }

    /**
     * @param max Read-only. Maximum value of the axis.
     * @return ValueAxis
     */
    public ValueAxis setMax(double max) {
        this.max = max;
        return this;
    }

    public Double getMax() {
        return max;
    }

    /**
     * @param maximum If you don't want max value to be calculated by the chart, set it using this property.
     *                This value might still be adjusted so that it would be possible to draw grid at rounded
     *                intervals.
     * @return ValueAxis
     */
    public ValueAxis setMaximum(double maximum) {
        this.maximum = maximum;
        return this;
    }

    public Double getMaximum() {
        return maximum;
    }

    /**
     * @param maximumDate If your value axis is date-based, you can specify maximum date of the axis. Can be
     *                    set as date object, timestamp number or string if dataDateFormat is set.
     * @return ValueAxis
     */
    public ValueAxis setMaximumDate(Date maximumDate) {
        this.maximumDate = maximumDate;
        return this;
    }

    public Date getMaximumDate() {
        return maximumDate;
    }

    /**
     * @param min Read-only. Minimum value of the axis.
     * @return ValueAxis
     */
    public ValueAxis setMin(double min) {
        this.min = min;
        return this;
    }

    public Double getMin() {
        return min;
    }

    /**
     * @param minimum If you don't want min value to be calculated by the chart, set it using this property.
     *                This value might still be adjusted so that it would be possible to draw grid at rounded
     *                intervals.
     * @return ValueAxis
     */
    public ValueAxis setMinimum(double minimum) {
        this.minimum = minimum;
        return this;
    }

    public Double getMinimum() {
        return minimum;
    }

    /**
     * @param minimumDate If your value axis is date-based, you can specify minimum date of the axis. Can be
     *                    set as date object, timestamp number or string if dataDateFormat is set.
     * @return ValueAxis
     */
    public ValueAxis setMinimumDate(Date minimumDate) {
        this.minimumDate = minimumDate;
        return this;
    }

    public Date getMinimumDate() {
        return minimumDate;
    }

    /**
     * @param minMaxMultiplier If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set
     *                         to 1.2 the scope of values will increase by 20%.
     * @return ValueAxis
     */
    public ValueAxis setMinMaxMultiplier(double minMaxMultiplier) {
        this.minMaxMultiplier = minMaxMultiplier;
        return this;
    }

    public Double getMinMaxMultiplier() {
        return minMaxMultiplier;
    }

    /**
     * @param minPeriod Specifies the shortest period of your data. This will work only if you set the `type`
     *                  of your value axis to `"date"`. Possible period values: fff - milliseconds, ss -
     *                  seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years. It's also
     *                  possible to supply a number for increments, i.e. "15mm" which will instruct the chart
     *                  that your data is supplied in 15 minute increments.
     * @return ValueAxis
     */
    public ValueAxis setMinPeriod(String minPeriod) {
        this.minPeriod = minPeriod;
        return this;
    }

    public String getMinPeriod() {
        return minPeriod;
    }

    /**
     * @param pointPosition Works with radar charts only. If you set it to “middle”, labels and data points will
     *                      be placed in the middle between axes.
     * @return ValueAxis
     */
    public ValueAxis setPointPosition(String pointPosition) {
        this.pointPosition = pointPosition;
        return this;
    }

    public String getPointPosition() {
        return pointPosition;
    }

    /**
     * @param position Possible values are: "top", "bottom", "left", "right". If axis is vertical, default
     *                 position is "left". If axis is horizontal, default position is "bottom".
     * @return ValueAxis
     */
    public ValueAxis setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getPosition() {
        return position;
    }

    /**
     * @param precision Precision (number of decimals) of values.
     * @return ValueAxis
     */
    public ValueAxis setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    public Double getPrecision() {
        return precision;
    }

    /**
     * @param radarCategoriesEnabled Radar chart only. Specifies if categories (axes' titles) should be displayed near
     *                               axes)
     * @return ValueAxis
     */
    public ValueAxis setRadarCategoriesEnabled(boolean radarCategoriesEnabled) {
        this.radarCategoriesEnabled = radarCategoriesEnabled;
        return this;
    }

    public Boolean getRadarCategoriesEnabled() {
        return radarCategoriesEnabled;
    }

    /**
     * @param recalculateToPercents Specifies if graphs's values should be recalculated to percents. Note, that this
     *                              setting will work only on Serial chart (and Stock), not on any other charts that
     *                              are using ValueAxis, like XY chart.
     * @return ValueAxis
     */
    public ValueAxis setRecalculateToPercents(boolean recalculateToPercents) {
        this.recalculateToPercents = recalculateToPercents;
        return this;
    }

    public Boolean getRecalculateToPercents() {
        return recalculateToPercents;
    }

    /**
     * @param reversed Specifies if value axis should be reversed (smaller values on top).
     * @return ValueAxis
     */
    public ValueAxis setReversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public Boolean getReversed() {
        return reversed;
    }

    /**
     * @param stackType Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
     *                  Note, only graphs of one type will be stacked.
     * @return ValueAxis
     */
    public ValueAxis setStackType(String stackType) {
        this.stackType = stackType;
        return this;
    }

    public String getStackType() {
        return stackType;
    }

    /**
     * @param step Read-only. Value difference between two grid lines.
     * @return ValueAxis
     */
    public ValueAxis setStep(double step) {
        this.step = step;
        return this;
    }

    public Double getStep() {
        return step;
    }

    /**
     * @param strictMinMax If you set minimum and maximum for your axis, chart adjusts them so that grid would
     *                     start and end on the beginning and end of plot area and grid would be at equal intervals.
     *                     If you set strictMinMax to true, the chart will not adjust minimum and maximum of
     *                     value axis.
     * @return ValueAxis
     */
    public ValueAxis setStrictMinMax(boolean strictMinMax) {
        this.strictMinMax = strictMinMax;
        return this;
    }

    public Boolean getStrictMinMax() {
        return strictMinMax;
    }

    /**
     * @param synchronizationMultiplier In case you synchronize one value axis with another, you need to set the synchronization
     *                                  multiplier. Use synchronizeWithAxis method to set with which axis it should be synced.
     * @return ValueAxis
     */
    public ValueAxis setSynchronizationMultiplier(double synchronizationMultiplier) {
        this.synchronizationMultiplier = synchronizationMultiplier;
        return this;
    }

    public Double getSynchronizationMultiplier() {
        return synchronizationMultiplier;
    }

    /**
     * @param synchronizeWith One value axis can be synchronized with another value axis. You can use both reference
     *                        to your axis or id of the axis here. You should set synchronizationMultiplyer in
     *                        order for this to work.
     * @return ValueAxis
     */
    public ValueAxis setSynchronizeWith(ValueAxis synchronizeWith) {
        this.synchronizeWith = synchronizeWith;
        return this;
    }

    public ValueAxis getSynchronizeWith() {
        return synchronizeWith;
    }

    /**
     * @param totalText If this value axis is stacked and has columns, setting valueAxis.totalText = "[[total]]"
     *                  will make it to display total value above the most-top column.
     * @return ValueAxis
     */
    public ValueAxis setTotalText(String totalText) {
        this.totalText = totalText;
        return this;
    }

    public String getTotalText() {
        return totalText;
    }

    /**
     * @param totalTextColor Color of total text.
     * @return ValueAxis
     */
    public ValueAxis setTotalTextColor(Color totalTextColor) {
        this.totalTextColor = totalTextColor;
        return this;
    }

    public Color getTotalTextColor() {
        return totalTextColor;
    }

    /**
     * @param totalTextOffset Distance from data point to total text.
     * @return ValueAxis
     */
    public ValueAxis setTotalTextOffset(double totalTextOffset) {
        this.totalTextOffset = totalTextOffset;
        return this;
    }

    public Double getTotalTextOffset() {
        return totalTextOffset;
    }

    /**
     * @param treatZeroAs This allows you to have logarithmic value axis and have zero values in the data.
     *                    You must set it to >0 value in order to work.
     * @return ValueAxis
     */
    public ValueAxis setTreatZeroAs(double treatZeroAs) {
        this.treatZeroAs = treatZeroAs;
        return this;
    }

    public Double getTreatZeroAs() {
        return treatZeroAs;
    }

    /**
     * @param type Type of value axis. If your values in data provider are dates and you want this axis
     *             to show dates instead of numbers, set it to "date".
     * @return ValueAxis
     */
    public ValueAxis setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    /**
     * @param unit Unit which will be added to the value label.
     * @return ValueAxis
     */
    public ValueAxis setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    /**
     * @param unitPosition Position of the unit. Possible values are "left" and "right".
     * @return ValueAxis
     */
    public ValueAxis setUnitPosition(String unitPosition) {
        this.unitPosition = unitPosition;
        return this;
    }

    public String getUnitPosition() {
        return unitPosition;
    }

    /**
     * @param usePrefixes If true, prefixes will be used for big and small numbers. You can set arrays of prefixes
     *                    directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers.
     * @return ValueAxis
     */
    public ValueAxis setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
        return this;
    }

    public Boolean getUsePrefixes() {
        return usePrefixes;
    }

    /**
     * @param useScientificNotation If true, values will always be formatted using scientific notation (5e+8, 5e-8...)
     *                              Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in
     *                              scientific notation.
     * @return ValueAxis
     */
    public ValueAxis setUseScientificNotation(boolean useScientificNotation) {
        this.useScientificNotation = useScientificNotation;
        return this;
    }

    public Boolean getUseScientificNotation() {
        return useScientificNotation;
    }

    /**
     * @param zeroGridAlpha Opacity of a zero grid line. By default it is equal to 2 x gridAlpha.
     * @return ValueAxis
     */
    public ValueAxis setZeroGridAlpha(double zeroGridAlpha) {
        this.zeroGridAlpha = zeroGridAlpha;
        return this;
    }

    public Double getZeroGridAlpha() {
        return zeroGridAlpha;
    }

}