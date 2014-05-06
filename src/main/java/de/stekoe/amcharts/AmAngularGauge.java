package de.stekoe.amcharts;

import java.util.List;
public class AmAngularGauge extends AmChart {
    private Boolean adjustSize;
    private List<GaugeArrow> arrows;
    private List<GaugeAxis> axes;
    private Boolean clockWiseOnly;
    private Double faceAlpha;
    private Double faceBorderAlpha;
    private Color faceBorderColor;
    private Double faceBorderWidth;
    private Color faceColor;
    private Object facePattern;
    private String gaugeX;
    private String gaugeY;
    private Double marginBottom;
    private Double marginLeft;
    private Double marginRight;
    private Double marginTop;
    private Double minRadius;
    private Double startDuration;
    private String startEffect;

    /**
     * If you set this to true, the gauge will try to occupy all available space.
     **/
    public void setAdjustSize(boolean adjustSize) {
        this.adjustSize = adjustSize;
    }
    public boolean isAdjustSize() {
        return adjustSize;
    }

    /**
     * Array of arrows.
     **/
    public void setArrows(List<GaugeArrow> arrows) {
        this.arrows = arrows;
    }
    public List<GaugeArrow> getArrows() {
        return arrows;
    }

    /**
     * Array of axes.
     **/
    public void setAxes(List<GaugeAxis> axes) {
        this.axes = axes;
    }
    public List<GaugeAxis> getAxes() {
        return axes;
    }

    /**
     * In case you use gauge to create a clock, set this to true.
     **/
    public void setClockWiseOnly(boolean clockWiseOnly) {
        this.clockWiseOnly = clockWiseOnly;
    }
    public boolean isClockWiseOnly() {
        return clockWiseOnly;
    }

    /**
     * Opacity of gauge face.
     **/
    public void setFaceAlpha(double faceAlpha) {
        this.faceAlpha = faceAlpha;
    }
    public Double getFaceAlpha() {
        return faceAlpha;
    }

    /**
     * Opacity of face border.
     **/
    public void setFaceBorderAlpha(double faceBorderAlpha) {
        this.faceBorderAlpha = faceBorderAlpha;
    }
    public Double getFaceBorderAlpha() {
        return faceBorderAlpha;
    }

    /**
     * Color of face border.
     **/
    public void setFaceBorderColor(Color faceBorderColor) {
        this.faceBorderColor = faceBorderColor;
    }
    public Color getFaceBorderColor() {
        return faceBorderColor;
    }

    /**
     * Width of face border.
     **/
    public void setFaceBorderWidth(double faceBorderWidth) {
        this.faceBorderWidth = faceBorderWidth;
    }
    public Double getFaceBorderWidth() {
        return faceBorderWidth;
    }

    /**
     * Color of a gauge face. You should set faceAlpha to > 0 if you want to see it.
     **/
    public void setFaceColor(Color faceColor) {
        this.faceColor = faceColor;
    }
    public Color getFaceColor() {
        return faceColor;
    }

    /**
     * Pattern object for gauge face. Pattern object example: {"url":"../amcharts/patterns/black/pattern1.png",
     * "width":4, "height":4}
     **/
    public void setFacePattern(Object facePattern) {
        this.facePattern = facePattern;
    }
    public Object getFacePattern() {
        return facePattern;
    }

    /**
     * X coordinate of a gauge. Will be placed in the center, if not set any.
     **/
    public void setGaugeX(String gaugeX) {
        this.gaugeX = gaugeX;
    }
    public String getGaugeX() {
        return gaugeX;
    }

    /**
     * Y coordinate of a gauge. Will be placed in the center, if not set any.
     **/
    public void setGaugeY(String gaugeY) {
        this.gaugeY = gaugeY;
    }
    public String getGaugeY() {
        return gaugeY;
    }

    /**
     * Distance bottom of a chart's container to the gauge.
     **/
    public void setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
    }
    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Distance from left side of a chart's container to the gauge.
     **/
    public void setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
    }
    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Distance from right side of a chart's container to the gauge.
     **/
    public void setMarginRight(double marginRight) {
        this.marginRight = marginRight;
    }
    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Distance from top of a chart's container to the gauge.
     **/
    public void setMarginTop(double marginTop) {
        this.marginTop = marginTop;
    }
    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * Minimum radius of a gauge.
     **/
    public void setMinRadius(double minRadius) {
        this.minRadius = minRadius;
    }
    public Double getMinRadius() {
        return minRadius;
    }

    /**
     * Duration of arrow animation.
     **/
    public void setStartDuration(double startDuration) {
        this.startDuration = startDuration;
    }
    public Double getStartDuration() {
        return startDuration;
    }

    /**
     * Possible values are: easeOutSine, easeInSine, elastic, bounce
     **/
    public void setStartEffect(String startEffect) {
        this.startEffect = startEffect;
    }
    public String getStartEffect() {
        return startEffect;
    }

}