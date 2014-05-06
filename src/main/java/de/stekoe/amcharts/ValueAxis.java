package de.stekoe.amcharts;

public class ValueAxis extends AxisBase {
    private Double axisTitleOffset;
    private Double baseCoord;
    private Double baseValue;
    private String duration;
    private String durationUnits;
    private GridType gridType;
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
    private Position position;
    private Double precision;
    private Boolean radarCategoriesEnabled;
    private Boolean recalculateToPercents;
    private Boolean reversed;
    private StackType stackType;
    private Double step;
    private Double synchronizationMultiplier;
    private ValueAxis synchronizeWith;
    private String totalText;
    private Color totalTextColor;
    private String unit;
    private Position unitPosition;
    private Boolean usePrefixes;
    private Boolean useScientificNotation;

    public Double getAxisTitleOffset() {
        return axisTitleOffset;
    }
    public void setAxisTitleOffset(double axisTitleOffset) {
        this.axisTitleOffset = axisTitleOffset;
    }
    public Double getBaseCoord() {
        return baseCoord;
    }
    public void setBaseCoord(double baseCoord) {
        this.baseCoord = baseCoord;
    }
    public Double getBaseValue() {
        return baseValue;
    }
    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDurationUnits() {
        return durationUnits;
    }
    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }
    public GridType getGridType() {
        return gridType;
    }
    public void setGridType(GridType gridType) {
        this.gridType = gridType;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Boolean isIncludeGuidesInMinMax() {
        return includeGuidesInMinMax;
    }
    public void setIncludeGuidesInMinMax(boolean includeGuidesInMinMax) {
        this.includeGuidesInMinMax = includeGuidesInMinMax;
    }
    public Boolean isIncludeHidden() {
        return includeHidden;
    }
    public void setIncludeHidden(boolean includeHidden) {
        this.includeHidden = includeHidden;
    }
    public Boolean isIntegersOnly() {
        return integersOnly;
    }
    public void setIntegersOnly(boolean integersOnly) {
        this.integersOnly = integersOnly;
    }
    public Boolean isLogarithmic() {
        return logarithmic;
    }
    public void setLogarithmic(boolean logarithmic) {
        this.logarithmic = logarithmic;
    }
    public Double getMax() {
        return max;
    }
    public void setMax(double max) {
        this.max = max;
    }
    public Double getMaximum() {
        return maximum;
    }
    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }
    public Double getMin() {
        return min;
    }
    public void setMin(double min) {
        this.min = min;
    }
    public Double getMinimum() {
        return minimum;
    }
    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }
    public Double getMinMaxMultiplier() {
        return minMaxMultiplier;
    }
    public void setMinMaxMultiplier(double minMaxMultiplier) {
        this.minMaxMultiplier = minMaxMultiplier;
    }
    @Override
    public Position getPosition() {
        return position;
    }
    @Override
    public void setPosition(Position position) {
        this.position = position;
    }
    public Double getPrecision() {
        return precision;
    }
    public void setPrecision(double precision) {
        this.precision = precision;
    }
    public Boolean isRadarCategoriesEnabled() {
        return radarCategoriesEnabled;
    }
    public void setRadarCategoriesEnabled(boolean radarCategoriesEnabled) {
        this.radarCategoriesEnabled = radarCategoriesEnabled;
    }
    public Boolean isRecalculateToPercents() {
        return recalculateToPercents;
    }
    public void setRecalculateToPercents(boolean recalculateToPercents) {
        this.recalculateToPercents = recalculateToPercents;
    }
    public Boolean isReversed() {
        return reversed;
    }
    public void setReversed(boolean reversed) {
        this.reversed = reversed;
    }
    public StackType getStackType() {
        return stackType;
    }
    public void setStackType(StackType stackType) {
        this.stackType = stackType;
    }
    public Double getStep() {
        return step;
    }
    public void setStep(double step) {
        this.step = step;
    }
    public Double getSynchronizationMultiplier() {
        return synchronizationMultiplier;
    }
    public void setSynchronizationMultiplier(double synchronizationMultiplier) {
        this.synchronizationMultiplier = synchronizationMultiplier;
    }
    public ValueAxis getSynchronizeWith() {
        return synchronizeWith;
    }
    public void setSynchronizeWith(ValueAxis synchronizeWith) {
        this.synchronizeWith = synchronizeWith;
    }
    public String getTotalText() {
        return totalText;
    }
    public void setTotalText(String totalText) {
        this.totalText = totalText;
    }
    public Color getTotalTextColor() {
        return totalTextColor;
    }
    public void setTotalTextColor(Color totalTextColor) {
        this.totalTextColor = totalTextColor;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public Position getUnitPosition() {
        return unitPosition;
    }
    public void setUnitPosition(Position unitPosition) {
        this.unitPosition = unitPosition;
    }
    public Boolean isUsePrefixes() {
        return usePrefixes;
    }
    public void setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
    }
    public Boolean isUseScientificNotation() {
        return useScientificNotation;
    }
    public void setUseScientificNotation(boolean useScientificNotation) {
        this.useScientificNotation = useScientificNotation;
    }
}
