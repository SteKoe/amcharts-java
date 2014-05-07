package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

public class ValueAxis extends AxisBase {
    private Double axisTitleOffset;
    private Double baseCoord;
    private Double baseValue;
    private String duration;
    private Object durationUnits;
    private String gridType;
    private String id;
    private Boolean includeGuidesInMinMax;
    private Boolean includeHidden;
    private Boolean integersOnly;
    private Boolean logarithmic;
    private Double max;
    private Double maximum;
    private Double min;
    private Double minimum;
    private Double minMaxMultiplier;
    private String position;
    private Double precision;
    private Boolean radarCategoriesEnabled;
    private Boolean recalculateToPercents;
    private Boolean reversed;
    private String stackType;
    private Double step;
    private Double synchronizationMultiplier;
    private ValueAxis synchronizeWith;
    private String totalText;
    private Color totalTextColor;
    private String unit;
    private String unitPosition;
    private Boolean usePrefixes;
    private Boolean useScientificNotation;

    /**
     * Radar chart only. Specifies distance from axis to the axis title (category)
     **/
    public Double getAxisTitleOffset() {
        return axisTitleOffset;
    }
    public ValueAxis setAxisTitleOffset(double axisTitleOffset) {
        this.axisTitleOffset = axisTitleOffset;
        return this;
    }

    /**
     * Read-only. Coordinate of the base value.
     **/
    public Double getBaseCoord() {
        return baseCoord;
    }
    public ValueAxis setBaseCoord(double baseCoord) {
        this.baseCoord = baseCoord;
        return this;
    }

    /**
     * Specifies base value of the axis.
     **/
    public Double getBaseValue() {
        return baseValue;
    }
    public ValueAxis setBaseValue(double baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    /**
     * If your values represents time units, and you want value axis labels to be formatted
     * as duration, you have to set the duration unit. Possible values are: "ss", "mm",
     * "hh" and "DD".
     **/
    public String getDuration() {
        return duration;
    }
    public ValueAxis setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * If duration property is set, you can specify what string should be displayed next
     * to day, hour, minute and second.
     **/
    public Object getDurationUnits() {
        return durationUnits;
    }
    public ValueAxis setDurationUnits(Object durationUnits) {
        this.durationUnits = durationUnits;
        return this;
    }

    /**
     * Radar chart only. Possible values are: "polygons" and "circles". Set "circles" for
     * polar charts.
     **/
    public String getGridType() {
        return gridType;
    }
    public ValueAxis setGridType(String gridType) {
        this.gridType = gridType;
        return this;
    }

    /**
     * Unique id of value axis. It is not required to set it, unless you need to tell the
     * graph which exact value axis it should use.
     **/
    public String getId() {
        return id;
    }
    public ValueAxis setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Specifies whether guide values should be included when calculating min and max of
     * the axis.
     **/
    public Boolean getIncludeGuidesInMinMax() {
        return includeGuidesInMinMax;
    }
    public ValueAxis setIncludeGuidesInMinMax(boolean includeGuidesInMinMax) {
        this.includeGuidesInMinMax = includeGuidesInMinMax;
        return this;
    }

    /**
     *      *If true, the axis will include hidden graphs when calculating min and max values.
     **/
    public Boolean getIncludeHidden() {
        return includeHidden;
    }
    public ValueAxis setIncludeHidden(boolean includeHidden) {
        this.includeHidden = includeHidden;
        return this;
    }

    /**
     *      *Specifies whether values on axis can only be integers or both integers and doubles.
     **/
    public Boolean getIntegersOnly() {
        return integersOnly;
    }
    public ValueAxis setIntegersOnly(boolean integersOnly) {
        this.integersOnly = integersOnly;
        return this;
    }

    /**
     * Specifies if this value axis' scale should be logarithmic.
     **/
    public Boolean getLogarithmic() {
        return logarithmic;
    }
    public ValueAxis setLogarithmic(boolean logarithmic) {
        this.logarithmic = logarithmic;
        return this;
    }

    /**
     * Read-only. Maximum value of the axis.
     **/
    public Double getMax() {
        return max;
    }
    public ValueAxis setMax(double max) {
        this.max = max;
        return this;
    }

    /**
     * If you don't want max value to be calculated by the chart, set it using this property.
     * This value might still be adjusted so that it would be possible to draw grid at rounded
     * intervals.
     **/
    public Double getMaximum() {
        return maximum;
    }
    public ValueAxis setMaximum(double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Read-only. Minimum value of the axis.
     **/
    public Double getMin() {
        return min;
    }
    public ValueAxis setMin(double min) {
        this.min = min;
        return this;
    }

    /**
     * If you don't want min value to be calculated by the chart, set it using this property.
     * This value might still be adjusted so that it would be possible to draw grid at rounded
     * intervals.
     **/
    public Double getMinimum() {
        return minimum;
    }
    public ValueAxis setMinimum(double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set
     * to 1.2 the scope of values will increase by 20%.
     **/
    public Double getMinMaxMultiplier() {
        return minMaxMultiplier;
    }
    public ValueAxis setMinMaxMultiplier(double minMaxMultiplier) {
        this.minMaxMultiplier = minMaxMultiplier;
        return this;
    }

    /**
     * Possible values are: "top", "bottom", "left", "right". If axis is vertical, default
     * position is "left". If axis is horizontal, default position is "bottom".
     **/
    public String getPosition() {
        return position;
    }
    public ValueAxis setPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * Precision (number of decimals) of values.
     **/
    public Double getPrecision() {
        return precision;
    }
    public ValueAxis setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    /**
     * Radar chart only. Specifies if categories (axes' titles) should be displayed near
     * axes)
     **/
    public Boolean getRadarCategoriesEnabled() {
        return radarCategoriesEnabled;
    }
    public ValueAxis setRadarCategoriesEnabled(boolean radarCategoriesEnabled) {
        this.radarCategoriesEnabled = radarCategoriesEnabled;
        return this;
    }

    /**
     * Specifies if graphs's values should be recalculated to percents.
     **/
    public Boolean getRecalculateToPercents() {
        return recalculateToPercents;
    }
    public ValueAxis setRecalculateToPercents(boolean recalculateToPercents) {
        this.recalculateToPercents = recalculateToPercents;
        return this;
    }

    /**
     * Specifies if value axis should be reversed (smaller values on top).
     **/
    public Boolean getReversed() {
        return reversed;
    }
    public ValueAxis setReversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    /**
     * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
     * Note, only graphs of one type will be stacked.
     **/
    public String getStackType() {
        return stackType;
    }
    public ValueAxis setStackType(String stackType) {
        this.stackType = stackType;
        return this;
    }

    /**
     * Read-only. Value difference between two grid lines.
     **/
    public Double getStep() {
        return step;
    }
    public ValueAxis setStep(double step) {
        this.step = step;
        return this;
    }

    /**
     * In case you synchronize one value axis with another, you need to set the synchronization
     * multiplier. Use synchronizeWithAxis method to set with which axis it should be synced.
     **/
    public Double getSynchronizationMultiplier() {
        return synchronizationMultiplier;
    }
    public ValueAxis setSynchronizationMultiplier(double synchronizationMultiplier) {
        this.synchronizationMultiplier = synchronizationMultiplier;
        return this;
    }

    /**
     * One value axis can be synchronized with another value axis. You can use both reference
     * to your axis or id of the axis here. You should set synchronizationMultiplyer in
     * order for this to work.
     **/
    public ValueAxis getSynchronizeWith() {
        return synchronizeWith;
    }
    public ValueAxis setSynchronizeWith(ValueAxis synchronizeWith) {
        this.synchronizeWith = synchronizeWith;
        return this;
    }

    /**
     * If this value axis is stacked and has columns, setting valueAxis.totalText = "[[total]]"
     * will make it to display total value above the most-top column.
     **/
    public String getTotalText() {
        return totalText;
    }
    public ValueAxis setTotalText(String totalText) {
        this.totalText = totalText;
        return this;
    }

    /**
     * Color of total text.
     **/
    public Color getTotalTextColor() {
        return totalTextColor;
    }
    public ValueAxis setTotalTextColor(Color totalTextColor) {
        this.totalTextColor = totalTextColor;
        return this;
    }

    /**
     * Unit which will be added to the value label.
     **/
    public String getUnit() {
        return unit;
    }
    public ValueAxis setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Position of the unit. Possible values are "left" and "right".
     **/
    public String getUnitPosition() {
        return unitPosition;
    }
    public ValueAxis setUnitPosition(String unitPosition) {
        this.unitPosition = unitPosition;
        return this;
    }

    /**
     * If true, prefixes will be used for big and small numbers. You can set arrays of prefixes
     * directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers.
     **/
    public Boolean getUsePrefixes() {
        return usePrefixes;
    }
    public ValueAxis setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
        return this;
    }

    /**
     * If true, values will always be formatted using scientific notation (5e+8, 5e-8...)
     * Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in
     * scientific notation.
     **/
    public Boolean getUseScientificNotation() {
        return useScientificNotation;
    }
    public ValueAxis setUseScientificNotation(boolean useScientificNotation) {
        this.useScientificNotation = useScientificNotation;
        return this;
    }

}