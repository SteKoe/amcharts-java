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
    public void setAngle(double angle) {
        this.angle = angle;
    }
    public Double getAngle() {
        return angle;
    }

    /**
     * Balloon text. The following tags can be used: [[value]], [[title]], [[percents]],
     * [[description]] or any other field name from your data provider. HTML tags can also
     * be used.
     **/
    public void setBalloonText(String balloonText) {
        this.balloonText = balloonText;
    }
    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Depth of the pie (for 3D effect).
     **/
    public void setDepth3D(double depth3D) {
        this.depth3D = depth3D;
    }
    public Double getDepth3D() {
        return depth3D;
    }

    /**
     * Inner radius of the pie, in pixels or percents.
     **/
    public void setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
    }
    public String getInnerRadius() {
        return innerRadius;
    }

    /**
     * The distance between the label and the slice, in pixels. You can use negative values
     * to put the label on the slice.
     **/
    public void setLabelRadius(double labelRadius) {
        this.labelRadius = labelRadius;
    }
    public Double getLabelRadius() {
        return labelRadius;
    }

    /**
     * Name of the field in dataProvider which specifies the length of a tick. Note, the
     * chart will not try to arrange labels automatically if this property is set.
     **/
    public void setLabelRadiusField(String labelRadiusField) {
        this.labelRadiusField = labelRadiusField;
    }
    public String getLabelRadiusField() {
        return labelRadiusField;
    }

    /**
     * Label text. The following tags can be used: [[value]], [[title]], [[percents]], [[description]]
     * or any other field name from your data provider.
     **/
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }
    public String getLabelText() {
        return labelText;
    }

    /**
     * Minimum radius of the pie, in pixels.
     **/
    public void setMinRadius(double minRadius) {
        this.minRadius = minRadius;
    }
    public Double getMinRadius() {
        return minRadius;
    }

    /**
     * Opacity of the slices. You can set the opacity of individual slice too.
     **/
    public void setPieAlpha(double pieAlpha) {
        this.pieAlpha = pieAlpha;
    }
    public Double getPieAlpha() {
        return pieAlpha;
    }

    /**
     * You can set fixed position of a pie center, in pixels or in percents.
     **/
    public void setPieX(String pieX) {
        this.pieX = pieX;
    }
    public String getPieX() {
        return pieX;
    }

    /**
     * You can set fixed position of a pie center, in pixels or in percents.
     **/
    public void setPieY(String pieY) {
        this.pieY = pieY;
    }
    public String getPieY() {
        return pieY;
    }

    /**
     * Pull out radius, in pixels or percents
     **/
    public void setPullOutRadius(String pullOutRadius) {
        this.pullOutRadius = pullOutRadius;
    }
    public String getPullOutRadius() {
        return pullOutRadius;
    }

    /**
     *      *Radius of a pie, in pixels or percents. By default, radius is calculated automatically.
     **/
    public void setRadius(String radius) {
        this.radius = radius;
    }
    public String getRadius() {
        return radius;
    }

    /**
     * Angle of the first slice, in degrees. This will work properly only if "depth3D" is
     * set to 0. If "depth3D" is greater than 0, then there can be two angles only: 90 and
     * 270. Value range is 0-360.
     **/
    public void setStartAngle(double startAngle) {
        this.startAngle = startAngle;
    }
    public Double getStartAngle() {
        return startAngle;
    }

    /**
     * Radius of the positions from which the slices will fly in.
     **/
    public void setStartRadius(String startRadius) {
        this.startRadius = startRadius;
    }
    public String getStartRadius() {
        return startRadius;
    }

}