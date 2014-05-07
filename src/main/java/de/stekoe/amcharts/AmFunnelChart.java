package de.stekoe.amcharts;


public class AmFunnelChart extends AmSlicedChart {
    private String balloonText;
    private String baseWidth;
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
     * Balloon text. The following tags can be used: [[value]], [[title]], [[percents]],
     * [[description]] or any other field name from your data provider. HTML tags can also
     * be used.
     **/
    public String getBalloonText() {
        return balloonText;
    }
    public AmFunnelChart setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    /**
     * Width of a base (first slice) of a chart. "100%" means it will occupy all available
     * space.
     **/
    public String getBaseWidth() {
        return baseWidth;
    }
    public AmFunnelChart setBaseWidth(String baseWidth) {
        this.baseWidth = baseWidth;
        return this;
    }

    /**
     * Specifies where labels should be placed. Allowed values are left / center / right.
     * If you set left or right, you should increase left or right margin in order labels
     * to be visible.
     **/
    public String getLabelPosition() {
        return labelPosition;
    }
    public AmFunnelChart setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
        return this;
    }

    /**
     * Label text. The following tags can be used: [[value]], [[title]], [[percents]], [[description]]
     * or any other field name from your data provider.
     **/
    public String getLabelText() {
        return labelText;
    }
    public AmFunnelChart setLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    /**
     * Height of a funnel neck. If default value, zero is used, the funnel won't have neck
     * at all, which will make it look like pyramid.
     **/
    public String getNeckHeight() {
        return neckHeight;
    }
    public AmFunnelChart setNeckHeight(String neckHeight) {
        this.neckHeight = neckHeight;
        return this;
    }

    /**
     * Width of a funnel neck. If default value, zero is used, the funnel won't have neck
     * at all, which will make it look like pyramid.
     **/
    public String getNeckWidth() {
        return neckWidth;
    }
    public AmFunnelChart setNeckWidth(String neckWidth) {
        this.neckWidth = neckWidth;
        return this;
    }

    /**
     * Specifies the distance by which slice should be pulled when user clicks on it.
     **/
    public String getPullDistance() {
        return pullDistance;
    }
    public AmFunnelChart setPullDistance(String pullDistance) {
        this.pullDistance = pullDistance;
        return this;
    }

    /**
     * If rotate is set to true, the funnel will be rotated and will became a pyramid.
     **/
    public Boolean getRotate() {
        return rotate;
    }
    public AmFunnelChart setRotate(boolean rotate) {
        this.rotate = rotate;
        return this;
    }

    /**
     * Initial x coordinate of slices. They will animate to the final x position from this
     * one.
     **/
    public Double getStartX() {
        return startX;
    }
    public AmFunnelChart setStartX(double startX) {
        this.startX = startX;
        return this;
    }

    /**
     * Initial y coordinate of slices. They will animate to the final y position from this
     * one.
     **/
    public Double getStartY() {
        return startY;
    }
    public AmFunnelChart setStartY(double startY) {
        this.startY = startY;
        return this;
    }

    /**
     * By default, the height of a slice represents it's value. However you might want the
     * area of a slice to represent value - set this property to "area" then.
     **/
    public String getValueRepresents() {
        return valueRepresents;
    }
    public AmFunnelChart setValueRepresents(String valueRepresents) {
        this.valueRepresents = valueRepresents;
        return this;
    }

}