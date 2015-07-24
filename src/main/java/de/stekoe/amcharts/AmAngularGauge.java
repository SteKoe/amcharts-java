package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

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
    private Double gaugeX;
    private Double gaugeY;
    private Double marginBottom;
    private Double marginLeft;
    private Double marginRight;
    private Double marginTop;
    private Double minRadius;
    private Double startDuration;
    private String startEffect;

    /**
     * Uses the whole space of the canvas to draw the gauge.
     */
    public AmAngularGauge setAdjustSize(boolean adjustSize) {
        this.adjustSize = adjustSize;
        return this;
    }

    public Boolean getAdjustSize() {
        return adjustSize;
    }

    /**
     * Array of arrows.
     */
    public AmAngularGauge setArrows(List<GaugeArrow> arrows) {
        this.arrows = arrows;
        return this;
    }

    public List<GaugeArrow> getArrows() {
        return arrows;
    }

    /**
     * Array of axes.
     */
    public AmAngularGauge setAxes(List<GaugeAxis> axes) {
        this.axes = axes;
        return this;
    }

    public List<GaugeAxis> getAxes() {
        return axes;
    }

    /**
     * In case you use gauge to create a clock, set this to true.
     */
    public AmAngularGauge setClockWiseOnly(boolean clockWiseOnly) {
        this.clockWiseOnly = clockWiseOnly;
        return this;
    }

    public Boolean getClockWiseOnly() {
        return clockWiseOnly;
    }

    /**
     * Gauge face opacity.
     */
    public AmAngularGauge setFaceAlpha(double faceAlpha) {
        this.faceAlpha = faceAlpha;
        return this;
    }

    public Double getFaceAlpha() {
        return faceAlpha;
    }

    /**
     * Gauge face border opacity.
     */
    public AmAngularGauge setFaceBorderAlpha(double faceBorderAlpha) {
        this.faceBorderAlpha = faceBorderAlpha;
        return this;
    }

    public Double getFaceBorderAlpha() {
        return faceBorderAlpha;
    }

    /**
     * Gauge face border color.
     */
    public AmAngularGauge setFaceBorderColor(Color faceBorderColor) {
        this.faceBorderColor = faceBorderColor;
        return this;
    }

    public Color getFaceBorderColor() {
        return faceBorderColor;
    }

    /**
     * Gauge face border width.
     */
    public AmAngularGauge setFaceBorderWidth(double faceBorderWidth) {
        this.faceBorderWidth = faceBorderWidth;
        return this;
    }

    public Double getFaceBorderWidth() {
        return faceBorderWidth;
    }

    /**
     * Gauge face color, requires faceAlpha > 0
     */
    public AmAngularGauge setFaceColor(Color faceColor) {
        this.faceColor = faceColor;
        return this;
    }

    public Color getFaceColor() {
        return faceColor;
    }

    /**
     * Gauge face image-pattern. Example: {"url":"../amcharts/patterns/black/pattern1.png",
     * "width":4, "height":4}
     */
    public AmAngularGauge setFacePattern(Object facePattern) {
        this.facePattern = facePattern;
        return this;
    }

    public Object getFacePattern() {
        return facePattern;
    }

    /**
     * Gauge's horizontal position in pixel, origin is the center. Centered by default.
     */
    public AmAngularGauge setGaugeX(double gaugeX) {
        this.gaugeX = gaugeX;
        return this;
    }

    public Double getGaugeX() {
        return gaugeX;
    }

    /**
     * Gauge's vertical position in pixel, origin is the center. Centered by default.
     */
    public AmAngularGauge setGaugeY(double gaugeY) {
        this.gaugeY = gaugeY;
        return this;
    }

    public Double getGaugeY() {
        return gaugeY;
    }

    /**
     * Bottom spacing between chart and container.
     */
    public AmAngularGauge setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Left-hand spacing between chart and container.
     */
    public AmAngularGauge setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Right-hand spacing between chart and container.
     */
    public AmAngularGauge setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Top spacing between chart and container.
     */
    public AmAngularGauge setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * Minimum radius of a gauge.
     */
    public AmAngularGauge setMinRadius(double minRadius) {
        this.minRadius = minRadius;
        return this;
    }

    public Double getMinRadius() {
        return minRadius;
    }

    /**
     * Duration of arrow animation.
     */
    public AmAngularGauge setStartDuration(double startDuration) {
        this.startDuration = startDuration;
        return this;
    }

    public Double getStartDuration() {
        return startDuration;
    }

    /**
     * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic,
     * bounce.
     */
    public AmAngularGauge setStartEffect(String startEffect) {
        this.startEffect = startEffect;
        return this;
    }

    public String getStartEffect() {
        return startEffect;
    }

}