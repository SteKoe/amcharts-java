package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

/**
 * Creates an arrow for AmAngularGauge charts, multiple can be assigned.
 */

public class GaugeArrow implements Serializable {
    private Double alpha;
    private GaugeAxis axis;
    private Double borderAlpha;
    private Boolean clockWiseOnly;
    private Color color;
    private String id;
    private String innerRadius;
    private Double nailAlpha;
    private Double nailBorderAlpha;
    private Double nailBorderThickness;
    private Double nailRadius;
    private String radius;
    private Double startWidth;
    private Double value;

    /**
     * @param alpha Opacity of an arrow.
     * @return GaugeArrow
     */
    public GaugeArrow setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * @param axis Axis of the arrow. You can use reference to the axis or id of the axis. If you don't
     *             set any axis, the first axis of a chart will be used.
     * @return GaugeArrow
     */
    public GaugeArrow setAxis(GaugeAxis axis) {
        this.axis = axis;
        return this;
    }

    public GaugeAxis getAxis() {
        return axis;
    }

    /**
     * @param borderAlpha Opacity of arrow border.
     * @return GaugeArrow
     */
    public GaugeArrow setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
        return this;
    }

    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * @param clockWiseOnly In case you need the arrow to rotate only clock-wise, set this property to true.
     * @return GaugeArrow
     */
    public GaugeArrow setClockWiseOnly(boolean clockWiseOnly) {
        this.clockWiseOnly = clockWiseOnly;
        return this;
    }

    public Boolean getClockWiseOnly() {
        return clockWiseOnly;
    }

    /**
     * @param color Color of an arrow.
     * @return GaugeArrow
     */
    public GaugeArrow setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param id Unique id of an arrow.
     * @return GaugeArrow
     */
    public GaugeArrow setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * @param innerRadius Inner radius of an arrow.
     * @return GaugeArrow
     */
    public GaugeArrow setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
        return this;
    }

    public String getInnerRadius() {
        return innerRadius;
    }

    /**
     * @param nailAlpha Opacity of a nail, holding the arrow.
     * @return GaugeArrow
     */
    public GaugeArrow setNailAlpha(double nailAlpha) {
        this.nailAlpha = nailAlpha;
        return this;
    }

    public Double getNailAlpha() {
        return nailAlpha;
    }

    /**
     * @param nailBorderAlpha Opacity of nail border.
     * @return GaugeArrow
     */
    public GaugeArrow setNailBorderAlpha(double nailBorderAlpha) {
        this.nailBorderAlpha = nailBorderAlpha;
        return this;
    }

    public Double getNailBorderAlpha() {
        return nailBorderAlpha;
    }

    /**
     * @param nailBorderThickness Thickness of nail border.
     * @return GaugeArrow
     */
    public GaugeArrow setNailBorderThickness(double nailBorderThickness) {
        this.nailBorderThickness = nailBorderThickness;
        return this;
    }

    public Double getNailBorderThickness() {
        return nailBorderThickness;
    }

    /**
     * @param nailRadius Radius of a nail, holding the arrow.
     * @return GaugeArrow
     */
    public GaugeArrow setNailRadius(double nailRadius) {
        this.nailRadius = nailRadius;
        return this;
    }

    public Double getNailRadius() {
        return nailRadius;
    }

    /**
     * @param radius Radius of an arrow.
     * @return GaugeArrow
     */
    public GaugeArrow setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getRadius() {
        return radius;
    }

    /**
     * @param startWidth Width of arrow root.
     * @return GaugeArrow
     */
    public GaugeArrow setStartWidth(double startWidth) {
        this.startWidth = startWidth;
        return this;
    }

    public Double getStartWidth() {
        return startWidth;
    }

    /**
     * @param value Value to which the arrow should point at.
     * @return GaugeArrow
     */
    public GaugeArrow setValue(double value) {
        this.value = value;
        return this;
    }

    public Double getValue() {
        return value;
    }

}