package de.stekoe.amcharts;

/**
 * Extension for AmSlicedChart to create pie/donut charts.
 */

public class AmPieChart extends AmSlicedChart {
    private Boolean adjustPrecision;
    private Double angle;
    private String balloonText;
    private Double depth3D;
    private String gradientType;
    private String innerRadius;
    private Double labelRadius;
    private String labelRadiusField;
    private String labelText;
    private Double minRadius;
    private String pieX;
    private String pieY;
    private String pullOutRadius;
    private String radius;
    private Double startAngle;
    private String startRadius;

    /**
     * @param adjustPrecision Sometimes, because of a rounding, percent of a sum of all slices is not equal to
     *                        100%. If you set this to true, when this case happens, number of decimals will be
     *                        increased so that sum would become 100%.
     * @return AmPieChart
     */
    public AmPieChart setAdjustPrecision(boolean adjustPrecision) {
        this.adjustPrecision = adjustPrecision;
        return this;
    }

    public Boolean getAdjustPrecision() {
        return adjustPrecision;
    }

    /**
     * @param angle Pie lean angle (for 3D effect). Valid range is 0 - 90.
     * @return AmPieChart
     */
    public AmPieChart setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    public Double getAngle() {
        return angle;
    }

    /**
     * @param balloonText Balloon text. The following tags can be used: [[value]], [[title]], [[percents]],
     *                    [[description]] or any other field name from your data provider. HTML tags can also
     *                    be used.
     * @return AmPieChart
     */
    public AmPieChart setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * @param depth3D Depth of the pie (for 3D effect).
     * @return AmPieChart
     */
    public AmPieChart setDepth3D(double depth3D) {
        this.depth3D = depth3D;
        return this;
    }

    public Double getDepth3D() {
        return depth3D;
    }

    /**
     * @param gradientType Type of gradient. Use gradientRatio to create gradients.
     * @return AmPieChart
     */
    public AmPieChart setGradientType(String gradientType) {
        this.gradientType = gradientType;
        return this;
    }

    public String getGradientType() {
        return gradientType;
    }

    /**
     * @param innerRadius Inner radius of the pie, in pixels or percents.
     * @return AmPieChart
     */
    public AmPieChart setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
        return this;
    }

    public String getInnerRadius() {
        return innerRadius;
    }

    /**
     * @param labelRadius The distance between the label and the slice, in pixels. You can use negative values
     *                    to put the label on the slice.
     * @return AmPieChart
     */
    public AmPieChart setLabelRadius(double labelRadius) {
        this.labelRadius = labelRadius;
        return this;
    }

    public Double getLabelRadius() {
        return labelRadius;
    }

    /**
     * @param labelRadiusField Name of the field in dataProvider which specifies the length of a tick. Note, the
     *                         chart will not try to arrange labels automatically if this property is set.
     * @return AmPieChart
     */
    public AmPieChart setLabelRadiusField(String labelRadiusField) {
        this.labelRadiusField = labelRadiusField;
        return this;
    }

    public String getLabelRadiusField() {
        return labelRadiusField;
    }

    /**
     * @param labelText Label text. The following tags can be used: [[value]], [[title]], [[percents]], [[description]]
     *                  or any other field name from your data provider.
     * @return AmPieChart
     */
    public AmPieChart setLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    public String getLabelText() {
        return labelText;
    }

    /**
     * @param minRadius Minimum radius of the pie, in pixels.
     * @return AmPieChart
     */
    public AmPieChart setMinRadius(double minRadius) {
        this.minRadius = minRadius;
        return this;
    }

    public Double getMinRadius() {
        return minRadius;
    }

    /**
     * @param pieX You can set fixed position of a pie center, in pixels or in percents.
     * @return AmPieChart
     */
    public AmPieChart setPieX(String pieX) {
        this.pieX = pieX;
        return this;
    }

    public String getPieX() {
        return pieX;
    }

    /**
     * @param pieY You can set fixed position of a pie center, in pixels or in percents.
     * @return AmPieChart
     */
    public AmPieChart setPieY(String pieY) {
        this.pieY = pieY;
        return this;
    }

    public String getPieY() {
        return pieY;
    }

    /**
     * @param pullOutRadius Pull out radius, in pixels or percents
     * @return AmPieChart
     */
    public AmPieChart setPullOutRadius(String pullOutRadius) {
        this.pullOutRadius = pullOutRadius;
        return this;
    }

    public String getPullOutRadius() {
        return pullOutRadius;
    }

    /**
     * @param radius *Radius of a pie, in pixels or percents. By default, radius is calculated automatically.
     * @return AmPieChart
     */
    public AmPieChart setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getRadius() {
        return radius;
    }

    /**
     * @param startAngle Angle of the first slice, in degrees. This will work properly only if "depth3D" is
     *                   set to 0. If "depth3D" is greater than 0, then there can be two angles only: 90 and
     *                   270. Value range is 0-360.
     * @return AmPieChart
     */
    public AmPieChart setStartAngle(double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    /**
     * @param startRadius Radius of the positions from which the slices will fly in.
     * @return AmPieChart
     */
    public AmPieChart setStartRadius(String startRadius) {
        this.startRadius = startRadius;
        return this;
    }

    public String getStartRadius() {
        return startRadius;
    }

}