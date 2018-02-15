package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.util.List;

/**
 * Extension for AmChart to create gauge charts.
 */

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
     * @param adjustSize Uses the whole space of the canvas to draw the gauge.
     * @return AmAngularGauge
     */
    public AmAngularGauge setAdjustSize(boolean adjustSize) {
        this.adjustSize = adjustSize;
        return this;
    }

    public Boolean getAdjustSize() {
        return adjustSize;
    }

    /**
     * @param arrows Array of arrows.
     * @return AmAngularGauge
     */
    public AmAngularGauge setArrows(List<GaugeArrow> arrows) {
        this.arrows = arrows;
        return this;
    }

    public List<GaugeArrow> getArrows() {
        return arrows;
    }

    /**
     * @param axes Array of axes.
     * @return AmAngularGauge
     */
    public AmAngularGauge setAxes(List<GaugeAxis> axes) {
        this.axes = axes;
        return this;
    }

    public List<GaugeAxis> getAxes() {
        return axes;
    }

    /**
     * @param clockWiseOnly In case you use gauge to create a clock, set this to true.
     * @return AmAngularGauge
     */
    public AmAngularGauge setClockWiseOnly(boolean clockWiseOnly) {
        this.clockWiseOnly = clockWiseOnly;
        return this;
    }

    public Boolean getClockWiseOnly() {
        return clockWiseOnly;
    }

    /**
     * @param faceAlpha Gauge face opacity.
     * @return AmAngularGauge
     */
    public AmAngularGauge setFaceAlpha(double faceAlpha) {
        this.faceAlpha = faceAlpha;
        return this;
    }

    public Double getFaceAlpha() {
        return faceAlpha;
    }

    /**
     * @param faceBorderAlpha Gauge face border opacity.
     * @return AmAngularGauge
     */
    public AmAngularGauge setFaceBorderAlpha(double faceBorderAlpha) {
        this.faceBorderAlpha = faceBorderAlpha;
        return this;
    }

    public Double getFaceBorderAlpha() {
        return faceBorderAlpha;
    }

    /**
     * @param faceBorderColor Gauge face border color.
     * @return AmAngularGauge
     */
    public AmAngularGauge setFaceBorderColor(Color faceBorderColor) {
        this.faceBorderColor = faceBorderColor;
        return this;
    }

    public Color getFaceBorderColor() {
        return faceBorderColor;
    }

    /**
     * @param faceBorderWidth Gauge face border width.
     * @return AmAngularGauge
     */
    public AmAngularGauge setFaceBorderWidth(double faceBorderWidth) {
        this.faceBorderWidth = faceBorderWidth;
        return this;
    }

    public Double getFaceBorderWidth() {
        return faceBorderWidth;
    }

    /**
     * @param faceColor Gauge face color, requires faceAlpha > 0
     * @return AmAngularGauge
     */
    public AmAngularGauge setFaceColor(Color faceColor) {
        this.faceColor = faceColor;
        return this;
    }

    public Color getFaceColor() {
        return faceColor;
    }

    /**
     * @param facePattern Gauge face image-pattern. Example: {"url":"../amcharts/patterns/black/pattern1.png",
     *                    "width":4, "height":4}
     * @return AmAngularGauge
     */
    public AmAngularGauge setFacePattern(Object facePattern) {
        this.facePattern = facePattern;
        return this;
    }

    public Object getFacePattern() {
        return facePattern;
    }

    /**
     * @param gaugeX Gauge's horizontal position in pixel, origin is the center. Centered by default.
     * @return AmAngularGauge
     */
    public AmAngularGauge setGaugeX(double gaugeX) {
        this.gaugeX = gaugeX;
        return this;
    }

    public Double getGaugeX() {
        return gaugeX;
    }

    /**
     * @param gaugeY Gauge's vertical position in pixel, origin is the center. Centered by default.
     * @return AmAngularGauge
     */
    public AmAngularGauge setGaugeY(double gaugeY) {
        this.gaugeY = gaugeY;
        return this;
    }

    public Double getGaugeY() {
        return gaugeY;
    }

    /**
     * @param marginBottom Bottom spacing between chart and container.
     * @return AmAngularGauge
     */
    public AmAngularGauge setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * @param marginLeft Left-hand spacing between chart and container.
     * @return AmAngularGauge
     */
    public AmAngularGauge setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * @param marginRight Right-hand spacing between chart and container.
     * @return AmAngularGauge
     */
    public AmAngularGauge setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * @param marginTop Top spacing between chart and container.
     * @return AmAngularGauge
     */
    public AmAngularGauge setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * @param minRadius Minimum radius of a gauge.
     * @return AmAngularGauge
     */
    public AmAngularGauge setMinRadius(double minRadius) {
        this.minRadius = minRadius;
        return this;
    }

    public Double getMinRadius() {
        return minRadius;
    }

    /**
     * @param startDuration Duration of arrow animation.
     * @return AmAngularGauge
     */
    public AmAngularGauge setStartDuration(double startDuration) {
        this.startDuration = startDuration;
        return this;
    }

    public Double getStartDuration() {
        return startDuration;
    }

    /**
     * @param startEffect Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic,
     *                    bounce.
     * @return AmAngularGauge
     */
    public AmAngularGauge setStartEffect(String startEffect) {
        this.startEffect = startEffect;
        return this;
    }

    public String getStartEffect() {
        return startEffect;
    }

}