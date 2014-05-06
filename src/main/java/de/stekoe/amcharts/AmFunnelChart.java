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
    public void setBalloonText(String balloonText) {
        this.balloonText = balloonText;
    }
    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Width of a base (first slice) of a chart. "100%" means it will occupy all available
     * space.
     **/
    public void setBaseWidth(String baseWidth) {
        this.baseWidth = baseWidth;
    }
    public String getBaseWidth() {
        return baseWidth;
    }

    /**
     * Specifies where labels should be placed. Allowed values are left / center / right.
     * If you set left or right, you should increase left or right margin in order labels
     * to be visible.
     **/
    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }
    public String getLabelPosition() {
        return labelPosition;
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
     * Height of a funnel neck. If default value, zero is used, the funnel won't have neck
     * at all, which will make it look like pyramid.
     **/
    public void setNeckHeight(String neckHeight) {
        this.neckHeight = neckHeight;
    }
    public String getNeckHeight() {
        return neckHeight;
    }

    /**
     * Width of a funnel neck. If default value, zero is used, the funnel won't have neck
     * at all, which will make it look like pyramid.
     **/
    public void setNeckWidth(String neckWidth) {
        this.neckWidth = neckWidth;
    }
    public String getNeckWidth() {
        return neckWidth;
    }

    /**
     * Specifies the distance by which slice should be pulled when user clicks on it.
     **/
    public void setPullDistance(String pullDistance) {
        this.pullDistance = pullDistance;
    }
    public String getPullDistance() {
        return pullDistance;
    }

    /**
     * If rotate is set to true, the funnel will be rotated and will became a pyramid.
     **/
    public void setRotate(boolean rotate) {
        this.rotate = rotate;
    }
    public boolean isRotate() {
        return rotate;
    }

    /**
     * Initial x coordinate of slices. They will animate to the final x position from this
     * one.
     **/
    public void setStartX(double startX) {
        this.startX = startX;
    }
    public Double getStartX() {
        return startX;
    }

    /**
     * Initial y coordinate of slices. They will animate to the final y position from this
     * one.
     **/
    public void setStartY(double startY) {
        this.startY = startY;
    }
    public Double getStartY() {
        return startY;
    }

    /**
     * By default, the height of a slice represents it's value. However you might want the
     * area of a slice to represent value - set this property to "area" then.
     **/
    public void setValueRepresents(String valueRepresents) {
        this.valueRepresents = valueRepresents;
    }
    public String getValueRepresents() {
        return valueRepresents;
    }

}