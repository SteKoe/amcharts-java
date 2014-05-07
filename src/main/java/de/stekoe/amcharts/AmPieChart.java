package de.stekoe.amcharts;


public class AmPieChart extends AmSlicedChart {
    private Double angle;
    private String balloonText;
    private Double depth3D;
    private String innerRadius;
    private Double labelRadius;
    private String labelRadiusField;
    private String labelText;
    private Double minRadius;
    private Double pieAlpha;
    private String pieX;
    private String pieY;
    private String pullOutRadius;
    private String radius;
    private Double startAngle;
    private String startRadius;

    /**
     * Pie lean angle (for 3D effect). Valid range is 0 - 90.
     **/
    public Double getAngle() {
        return angle;
    }
    public AmPieChart setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    /**
     * Balloon text. The following tags can be used: [[value]], [[title]], [[percents]],
     * [[description]] or any other field name from your data provider. HTML tags can also
     * be used.
     **/
    public String getBalloonText() {
        return balloonText;
    }
    public AmPieChart setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    /**
     * Depth of the pie (for 3D effect).
     **/
    public Double getDepth3D() {
        return depth3D;
    }
    public AmPieChart setDepth3D(double depth3D) {
        this.depth3D = depth3D;
        return this;
    }

    /**
     * Inner radius of the pie, in pixels or percents.
     **/
    public String getInnerRadius() {
        return innerRadius;
    }
    public AmPieChart setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
        return this;
    }

    /**
     * The distance between the label and the slice, in pixels. You can use negative values
     * to put the label on the slice.
     **/
    public Double getLabelRadius() {
        return labelRadius;
    }
    public AmPieChart setLabelRadius(double labelRadius) {
        this.labelRadius = labelRadius;
        return this;
    }

    /**
     * Name of the field in dataProvider which specifies the length of a tick. Note, the
     * chart will not try to arrange labels automatically if this property is set.
     **/
    public String getLabelRadiusField() {
        return labelRadiusField;
    }
    public AmPieChart setLabelRadiusField(String labelRadiusField) {
        this.labelRadiusField = labelRadiusField;
        return this;
    }

    /**
     * Label text. The following tags can be used: [[value]], [[title]], [[percents]], [[description]]
     * or any other field name from your data provider.
     **/
    public String getLabelText() {
        return labelText;
    }
    public AmPieChart setLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    /**
     * Minimum radius of the pie, in pixels.
     **/
    public Double getMinRadius() {
        return minRadius;
    }
    public AmPieChart setMinRadius(double minRadius) {
        this.minRadius = minRadius;
        return this;
    }

    /**
     * Opacity of the slices. You can set the opacity of individual slice too.
     **/
    public Double getPieAlpha() {
        return pieAlpha;
    }
    public AmPieChart setPieAlpha(double pieAlpha) {
        this.pieAlpha = pieAlpha;
        return this;
    }

    /**
     * You can set fixed position of a pie center, in pixels or in percents.
     **/
    public String getPieX() {
        return pieX;
    }
    public AmPieChart setPieX(String pieX) {
        this.pieX = pieX;
        return this;
    }

    /**
     * You can set fixed position of a pie center, in pixels or in percents.
     **/
    public String getPieY() {
        return pieY;
    }
    public AmPieChart setPieY(String pieY) {
        this.pieY = pieY;
        return this;
    }

    /**
     * Pull out radius, in pixels or percents
     **/
    public String getPullOutRadius() {
        return pullOutRadius;
    }
    public AmPieChart setPullOutRadius(String pullOutRadius) {
        this.pullOutRadius = pullOutRadius;
        return this;
    }

    /**
     *      *Radius of a pie, in pixels or percents. By default, radius is calculated automatically.
     **/
    public String getRadius() {
        return radius;
    }
    public AmPieChart setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    /**
     * Angle of the first slice, in degrees. This will work properly only if "depth3D" is
     * set to 0. If "depth3D" is greater than 0, then there can be two angles only: 90 and
     * 270. Value range is 0-360.
     **/
    public Double getStartAngle() {
        return startAngle;
    }
    public AmPieChart setStartAngle(double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    /**
     * Radius of the positions from which the slices will fly in.
     **/
    public String getStartRadius() {
        return startRadius;
    }
    public AmPieChart setStartRadius(String startRadius) {
        this.startRadius = startRadius;
        return this;
    }

}