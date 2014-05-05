package de.stekoe.amcharts;

public class ValueAxis extends AxisBase {
    private double axisTitleOffset = 10;
    private double baseCoord;
    private double baseValue = 0;
    private String duration;
    private String durationUnits = "{DD:'d. ', hh:':', mm:':',ss:''}";
    private GridType gridType = GridType.polygons;
    private String id;
    private boolean includeGuidesInMinMax = false;
    private boolean includeHidden = false;
    private boolean integersOnly = false;
    private boolean logarithmic = false;
    private double max;
    private double maximum;
    private double min;
    private double minimum;
    private double minMaxMultiplier = 1;
    private Position position = Position.left;
    private double precision;
    private boolean radarCategoriesEnabled = true;
    private boolean recalculateToPercents = false;
    private boolean reversed = false;
    private StackType stackType = StackType.none;
    private double step;
    private double synchronizationMultiplier;
    private ValueAxis synchronizeWith;
    private String totalText;
    private Color totalTextColor;
    private String unit;
    private Position unitPosition = Position.right;
    private boolean usePrefixes = false;
    private boolean useScientificNotation = false;

    public double getAxisTitleOffset() {
        return axisTitleOffset;
    }
    public void setAxisTitleOffset(double axisTitleOffset) {
        this.axisTitleOffset = axisTitleOffset;
    }
    public double getBaseCoord() {
        return baseCoord;
    }
    public void setBaseCoord(double baseCoord) {
        this.baseCoord = baseCoord;
    }
    public double getBaseValue() {
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
    public boolean isIncludeGuidesInMinMax() {
        return includeGuidesInMinMax;
    }
    public void setIncludeGuidesInMinMax(boolean includeGuidesInMinMax) {
        this.includeGuidesInMinMax = includeGuidesInMinMax;
    }
    public boolean isIncludeHidden() {
        return includeHidden;
    }
    public void setIncludeHidden(boolean includeHidden) {
        this.includeHidden = includeHidden;
    }
    public boolean isIntegersOnly() {
        return integersOnly;
    }
    public void setIntegersOnly(boolean integersOnly) {
        this.integersOnly = integersOnly;
    }
    public boolean isLogarithmic() {
        return logarithmic;
    }
    public void setLogarithmic(boolean logarithmic) {
        this.logarithmic = logarithmic;
    }
    public double getMax() {
        return max;
    }
    public void setMax(double max) {
        this.max = max;
    }
    public double getMaximum() {
        return maximum;
    }
    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }
    public double getMin() {
        return min;
    }
    public void setMin(double min) {
        this.min = min;
    }
    public double getMinimum() {
        return minimum;
    }
    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }
    public double getMinMaxMultiplier() {
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
    public double getPrecision() {
        return precision;
    }
    public void setPrecision(double precision) {
        this.precision = precision;
    }
    public boolean isRadarCategoriesEnabled() {
        return radarCategoriesEnabled;
    }
    public void setRadarCategoriesEnabled(boolean radarCategoriesEnabled) {
        this.radarCategoriesEnabled = radarCategoriesEnabled;
    }
    public boolean isRecalculateToPercents() {
        return recalculateToPercents;
    }
    public void setRecalculateToPercents(boolean recalculateToPercents) {
        this.recalculateToPercents = recalculateToPercents;
    }
    public boolean isReversed() {
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
    public double getStep() {
        return step;
    }
    public void setStep(double step) {
        this.step = step;
    }
    public double getSynchronizationMultiplier() {
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
    public boolean isUsePrefixes() {
        return usePrefixes;
    }
    public void setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
    }
    public boolean isUseScientificNotation() {
        return useScientificNotation;
    }
    public void setUseScientificNotation(boolean useScientificNotation) {
        this.useScientificNotation = useScientificNotation;
    }
}
