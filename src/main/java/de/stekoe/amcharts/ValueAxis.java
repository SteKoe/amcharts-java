package de.stekoe.amcharts;

public class ValueAxis extends AxisBase {
    private Double axisTitleOffset;
    private Double baseValue;
    private String duration;
    private Object durationUnits;
    private String gridType;
    private String id;
    private Boolean includeGuidesInMinMax;
    private Boolean includeHidden;
    private Boolean integersOnly;
    private Boolean logarithmic;
    private Double maximum;
    private Double minimum;
    private Double minMaxMultiplier;
    private String position;
    private Double precision;
    private Boolean radarCategoriesEnabled;
    private Boolean recalculateToPercents;
    private Boolean reversed;
    private String stackType;
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
    public void setAxisTitleOffset(double axisTitleOffset) {
        this.axisTitleOffset = axisTitleOffset;
    }
    public Double getAxisTitleOffset() {
        return axisTitleOffset;
    }

    /**
     * Specifies base value of the axis.
     **/
    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }
    public Double getBaseValue() {
        return baseValue;
    }

    /**
     * If your values represents time units, and you want value axis labels to be formatted
     * as duration, you have to set the duration unit. Possible values are: "ss", "mm",
     * "hh" and "DD".
     **/
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return duration;
    }

    /**
     * If duration property is set, you can specify what string should be displayed next
     * to day, hour, minute and second.
     **/
    public void setDurationUnits(Object durationUnits) {
        this.durationUnits = durationUnits;
    }
    public Object getDurationUnits() {
        return durationUnits;
    }

    /**
     * Radar chart only. Possible values are: "polygons" and "circles". Set "circles" for
     * polar charts.
     **/
    public void setGridType(String gridType) {
        this.gridType = gridType;
    }
    public String getGridType() {
        return gridType;
    }

    /**
     * Unique id of value axis. It is not required to set it, unless you need to tell the
     * graph which exact value axis it should use.
     **/
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    /**
     * Specifies whether guide values should be included when calculating min and max of
     * the axis.
     **/
    public void setIncludeGuidesInMinMax(boolean includeGuidesInMinMax) {
        this.includeGuidesInMinMax = includeGuidesInMinMax;
    }
    public boolean isIncludeGuidesInMinMax() {
        return includeGuidesInMinMax;
    }

    /**
     *      *If true, the axis will include hidden graphs when calculating min and max values.
     **/
    public void setIncludeHidden(boolean includeHidden) {
        this.includeHidden = includeHidden;
    }
    public boolean isIncludeHidden() {
        return includeHidden;
    }

    /**
     *      *Specifies whether values on axis can only be integers or both integers and doubles.
     **/
    public void setIntegersOnly(boolean integersOnly) {
        this.integersOnly = integersOnly;
    }
    public boolean isIntegersOnly() {
        return integersOnly;
    }

    /**
     * Specifies if this value axis' scale should be logarithmic.
     **/
    public void setLogarithmic(boolean logarithmic) {
        this.logarithmic = logarithmic;
    }
    public boolean isLogarithmic() {
        return logarithmic;
    }

    /**
     * If you don't want max value to be calculated by the chart, set it using this property.
     * This value might still be adjusted so that it would be possible to draw grid at rounded
     * intervals.
     **/
    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }
    public Double getMaximum() {
        return maximum;
    }

    /**
     * If you don't want min value to be calculated by the chart, set it using this property.
     * This value might still be adjusted so that it would be possible to draw grid at rounded
     * intervals.
     **/
    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }
    public Double getMinimum() {
        return minimum;
    }

    /**
     * If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set
     * to 1.2 the scope of values will increase by 20%.
     **/
    public void setMinMaxMultiplier(double minMaxMultiplier) {
        this.minMaxMultiplier = minMaxMultiplier;
    }
    public Double getMinMaxMultiplier() {
        return minMaxMultiplier;
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
     * Precision (number of decimals) of values.
     **/
    public void setPrecision(double precision) {
        this.precision = precision;
    }
    public Double getPrecision() {
        return precision;
    }

    /**
     * Radar chart only. Specifies if categories (axes' titles) should be displayed near
     * axes)
     **/
    public void setRadarCategoriesEnabled(boolean radarCategoriesEnabled) {
        this.radarCategoriesEnabled = radarCategoriesEnabled;
    }
    public boolean isRadarCategoriesEnabled() {
        return radarCategoriesEnabled;
    }

    /**
     * Specifies if graphs's values should be recalculated to percents.
     **/
    public void setRecalculateToPercents(boolean recalculateToPercents) {
        this.recalculateToPercents = recalculateToPercents;
    }
    public boolean isRecalculateToPercents() {
        return recalculateToPercents;
    }

    /**
     * Specifies if value axis should be reversed (smaller values on top).
     **/
    public void setReversed(boolean reversed) {
        this.reversed = reversed;
    }
    public boolean isReversed() {
        return reversed;
    }

    /**
     * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
     * Note, only graphs of one type will be stacked.
     **/
    public void setStackType(String stackType) {
        this.stackType = stackType;
    }
    public String getStackType() {
        return stackType;
    }

    /**
     * In case you synchronize one value axis with another, you need to set the synchronization
     * multiplier. Use synchronizeWithAxis method to set with which axis it should be synced.
     **/
    public void setSynchronizationMultiplier(double synchronizationMultiplier) {
        this.synchronizationMultiplier = synchronizationMultiplier;
    }
    public Double getSynchronizationMultiplier() {
        return synchronizationMultiplier;
    }

    /**
     * One value axis can be synchronized with another value axis. You can use both reference
     * to your axis or id of the axis here. You should set synchronizationMultiplyer in
     * order for this to work.
     **/
    public void setSynchronizeWith(ValueAxis synchronizeWith) {
        this.synchronizeWith = synchronizeWith;
    }
    public ValueAxis getSynchronizeWith() {
        return synchronizeWith;
    }

    /**
     * If this value axis is stacked and has columns, setting valueAxis.totalText = "[[total]]"
     * will make it to display total value above the most-top column.
     **/
    public void setTotalText(String totalText) {
        this.totalText = totalText;
    }
    public String getTotalText() {
        return totalText;
    }

    /**
     * Color of total text.
     **/
    public void setTotalTextColor(Color totalTextColor) {
        this.totalTextColor = totalTextColor;
    }
    public Color getTotalTextColor() {
        return totalTextColor;
    }

    /**
     * Unit which will be added to the value label.
     **/
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getUnit() {
        return unit;
    }

    /**
     * Position of the unit. Possible values are "left" and "right".
     **/
    public void setUnitPosition(String unitPosition) {
        this.unitPosition = unitPosition;
    }
    public String getUnitPosition() {
        return unitPosition;
    }

    /**
     * If true, prefixes will be used for big and small numbers. You can set arrays of prefixes
     * directly to the chart object via prefixesOfSmallNumbers and prefixesOfBigNumbers.
     **/
    public void setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
    }
    public boolean isUsePrefixes() {
        return usePrefixes;
    }

    /**
     * If true, values will always be formatted using scientific notation (5e+8, 5e-8...)
     * Otherwise only values bigger then 1e+21 and smaller then 1e-7 will be displayed in
     * scientific notation.
     **/
    public void setUseScientificNotation(boolean useScientificNotation) {
        this.useScientificNotation = useScientificNotation;
    }
    public boolean isUseScientificNotation() {
        return useScientificNotation;
    }

}