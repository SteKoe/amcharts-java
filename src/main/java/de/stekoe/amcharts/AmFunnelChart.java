package de.stekoe.amcharts;

public class AmFunnelChart extends AmSlicedChart {
    private Double angle;
    private String balloonText;
    private String baseWidth;
    private Double depth3D;
    private String labelPosition;
    private String labelText;
    private String neckHeight;
    private String neckWidth;
    private String pullDistance;
    private Boolean rotate;
    private Double startX;
    private Double startY;
    private String valueRepresents;

    /**
     * The angle of the 3D part of the chart. This creates a 3D effect (if the "depth3D"
     * is > 0).
     **/
    public AmFunnelChart setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    public Double getAngle() {
        return angle;
    }

    /**
     * Balloon text. The following tags can be used: [[value]], [[title]], [[percents]],
     * [[description]] or any other field name from your data provider. HTML tags can also
     * be used.
     **/
    public AmFunnelChart setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Width of a base (first slice) of a chart. "100%" means it will occupy all available
     * space.
     **/
    public AmFunnelChart setBaseWidth(String baseWidth) {
        this.baseWidth = baseWidth;
        return this;
    }

    public String getBaseWidth() {
        return baseWidth;
    }

    /**
     * The depth of funnel/pyramid. Set angle to >0 value in order this to work. Note, neckHeight/neckWidth
     * will become 0 if you set these properties to bigger than 0 values.
     **/
    public AmFunnelChart setDepth3D(double depth3D) {
        this.depth3D = depth3D;
        return this;
    }

    public Double getDepth3D() {
        return depth3D;
    }

    /**
     * Specifies where labels should be placed. Allowed values are left / center / right.
     * If you set left or right, you should increase left or right margin in order labels
     * to be visible.
     **/
    public AmFunnelChart setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
        return this;
    }

    public String getLabelPosition() {
        return labelPosition;
    }

    /**
     * Label text. The following tags can be used: [[value]], [[title]], [[percents]], [[description]]
     * or any other field name from your data provider.
     **/
    public AmFunnelChart setLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    public String getLabelText() {
        return labelText;
    }

    /**
     * Height of a funnel neck. If default value, zero is used, the funnel won't have neck
     * at all, which will make it look like pyramid.
     **/
    public AmFunnelChart setNeckHeight(String neckHeight) {
        this.neckHeight = neckHeight;
        return this;
    }

    public String getNeckHeight() {
        return neckHeight;
    }

    /**
     * Width of a funnel neck. If default value, zero is used, the funnel won't have neck
     * at all, which will make it look like pyramid.
     **/
    public AmFunnelChart setNeckWidth(String neckWidth) {
        this.neckWidth = neckWidth;
        return this;
    }

    public String getNeckWidth() {
        return neckWidth;
    }

    /**
     * Specifies the distance by which slice should be pulled when user clicks on it.
     **/
    public AmFunnelChart setPullDistance(String pullDistance) {
        this.pullDistance = pullDistance;
        return this;
    }

    public String getPullDistance() {
        return pullDistance;
    }

    /**
     * If rotate is set to true, the funnel will be rotated and will became a pyramid.
     **/
    public AmFunnelChart setRotate(boolean rotate) {
        this.rotate = rotate;
        return this;
    }

    public Boolean getRotate() {
        return rotate;
    }

    /**
     * Initial x coordinate of slices. They will animate to the final x position from this
     * one.
     **/
    public AmFunnelChart setStartX(double startX) {
        this.startX = startX;
        return this;
    }

    public Double getStartX() {
        return startX;
    }

    /**
     * Initial y coordinate of slices. They will animate to the final y position from this
     * one.
     **/
    public AmFunnelChart setStartY(double startY) {
        this.startY = startY;
        return this;
    }

    public Double getStartY() {
        return startY;
    }

    /**
     * By default, the height of a slice represents it's value. However you might want the
     * area of a slice to represent value - set this property to "area" then.
     **/
    public AmFunnelChart setValueRepresents(String valueRepresents) {
        this.valueRepresents = valueRepresents;
        return this;
    }

    public String getValueRepresents() {
        return valueRepresents;
    }

}