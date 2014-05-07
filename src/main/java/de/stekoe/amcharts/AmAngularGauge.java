package de.stekoe.amcharts;

import java.util.List;

import de.stekoe.amcharts.addition.Color;

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
    public Boolean getAdjustSize() {
        return adjustSize;
    }
    public AmAngularGauge setAdjustSize(boolean adjustSize) {
        this.adjustSize = adjustSize;
        return this;
    }

    /**
     * Array of arrows.
     **/
    public List<GaugeArrow> getArrows() {
        return arrows;
    }
    public AmAngularGauge setArrows(List<GaugeArrow> arrows) {
        this.arrows = arrows;
        return this;
    }

    /**
     * Array of axes.
     **/
    public List<GaugeAxis> getAxes() {
        return axes;
    }
    public AmAngularGauge setAxes(List<GaugeAxis> axes) {
        this.axes = axes;
        return this;
    }

    /**
     * In case you use gauge to create a clock, set this to true.
     **/
    public Boolean getClockWiseOnly() {
        return clockWiseOnly;
    }
    public AmAngularGauge setClockWiseOnly(boolean clockWiseOnly) {
        this.clockWiseOnly = clockWiseOnly;
        return this;
    }

    /**
     * Opacity of gauge face.
     **/
    public Double getFaceAlpha() {
        return faceAlpha;
    }
    public AmAngularGauge setFaceAlpha(double faceAlpha) {
        this.faceAlpha = faceAlpha;
        return this;
    }

    /**
     * Opacity of face border.
     **/
    public Double getFaceBorderAlpha() {
        return faceBorderAlpha;
    }
    public AmAngularGauge setFaceBorderAlpha(double faceBorderAlpha) {
        this.faceBorderAlpha = faceBorderAlpha;
        return this;
    }

    /**
     * Color of face border.
     **/
    public Color getFaceBorderColor() {
        return faceBorderColor;
    }
    public AmAngularGauge setFaceBorderColor(Color faceBorderColor) {
        this.faceBorderColor = faceBorderColor;
        return this;
    }

    /**
     * Width of face border.
     **/
    public Double getFaceBorderWidth() {
        return faceBorderWidth;
    }
    public AmAngularGauge setFaceBorderWidth(double faceBorderWidth) {
        this.faceBorderWidth = faceBorderWidth;
        return this;
    }

    /**
     * Color of a gauge face. You should set faceAlpha to > 0 if you want to see it.
     **/
    public Color getFaceColor() {
        return faceColor;
    }
    public AmAngularGauge setFaceColor(Color faceColor) {
        this.faceColor = faceColor;
        return this;
    }

    /**
     * Pattern object for gauge face. Pattern object example: {"url":"../amcharts/patterns/black/pattern1.png",
     * "width":4, "height":4}
     **/
    public Object getFacePattern() {
        return facePattern;
    }
    public AmAngularGauge setFacePattern(Object facePattern) {
        this.facePattern = facePattern;
        return this;
    }

    /**
     * X coordinate of a gauge. Will be placed in the center, if not set any.
     **/
    public String getGaugeX() {
        return gaugeX;
    }
    public AmAngularGauge setGaugeX(String gaugeX) {
        this.gaugeX = gaugeX;
        return this;
    }

    /**
     * Y coordinate of a gauge. Will be placed in the center, if not set any.
     **/
    public String getGaugeY() {
        return gaugeY;
    }
    public AmAngularGauge setGaugeY(String gaugeY) {
        this.gaugeY = gaugeY;
        return this;
    }

    /**
     * Distance bottom of a chart's container to the gauge.
     **/
    public Double getMarginBottom() {
        return marginBottom;
    }
    public AmAngularGauge setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    /**
     * Distance from left side of a chart's container to the gauge.
     **/
    public Double getMarginLeft() {
        return marginLeft;
    }
    public AmAngularGauge setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    /**
     * Distance from right side of a chart's container to the gauge.
     **/
    public Double getMarginRight() {
        return marginRight;
    }
    public AmAngularGauge setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    /**
     * Distance from top of a chart's container to the gauge.
     **/
    public Double getMarginTop() {
        return marginTop;
    }
    public AmAngularGauge setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    /**
     * Minimum radius of a gauge.
     **/
    public Double getMinRadius() {
        return minRadius;
    }
    public AmAngularGauge setMinRadius(double minRadius) {
        this.minRadius = minRadius;
        return this;
    }

    /**
     * Duration of arrow animation.
     **/
    public Double getStartDuration() {
        return startDuration;
    }
    public AmAngularGauge setStartDuration(double startDuration) {
        this.startDuration = startDuration;
        return this;
    }

    /**
     * Possible values are: easeOutSine, easeInSine, elastic, bounce
     **/
    public String getStartEffect() {
        return startEffect;
    }
    public AmAngularGauge setStartEffect(String startEffect) {
        this.startEffect = startEffect;
        return this;
    }

}