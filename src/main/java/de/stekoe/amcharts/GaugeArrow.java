package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

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
     * Opacity of an arrow.
     **/
    public GaugeArrow setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * Axis of the arrow. You can use reference to the axis or id of the axis. If you don't
     * set any axis, the first axis of a chart will be used.
     **/
    public GaugeArrow setAxis(GaugeAxis axis) {
        this.axis = axis;
        return this;
    }

    public GaugeAxis getAxis() {
        return axis;
    }

    /**
     * Opacity of arrow border.
     **/
    public GaugeArrow setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
        return this;
    }

    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * In case you need the arrow to rotate only clock-wise, set this property to true.
     **/
    public GaugeArrow setClockWiseOnly(boolean clockWiseOnly) {
        this.clockWiseOnly = clockWiseOnly;
        return this;
    }

    public Boolean getClockWiseOnly() {
        return clockWiseOnly;
    }

    /**
     * Color of an arrow.
     **/
    public GaugeArrow setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Unique id of an arrow.
     **/
    public GaugeArrow setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * Inner radius of an arrow.
     **/
    public GaugeArrow setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
        return this;
    }

    public String getInnerRadius() {
        return innerRadius;
    }

    /**
     * Opacity of a nail, holding the arrow.
     **/
    public GaugeArrow setNailAlpha(double nailAlpha) {
        this.nailAlpha = nailAlpha;
        return this;
    }

    public Double getNailAlpha() {
        return nailAlpha;
    }

    /**
     * Opacity of nail border.
     **/
    public GaugeArrow setNailBorderAlpha(double nailBorderAlpha) {
        this.nailBorderAlpha = nailBorderAlpha;
        return this;
    }

    public Double getNailBorderAlpha() {
        return nailBorderAlpha;
    }

    /**
     * Thickness of nail border.
     **/
    public GaugeArrow setNailBorderThickness(double nailBorderThickness) {
        this.nailBorderThickness = nailBorderThickness;
        return this;
    }

    public Double getNailBorderThickness() {
        return nailBorderThickness;
    }

    /**
     * Radius of a nail, holding the arrow.
     **/
    public GaugeArrow setNailRadius(double nailRadius) {
        this.nailRadius = nailRadius;
        return this;
    }

    public Double getNailRadius() {
        return nailRadius;
    }

    /**
     * Radius of an arrow.
     **/
    public GaugeArrow setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getRadius() {
        return radius;
    }

    /**
     * Width of arrow root.
     **/
    public GaugeArrow setStartWidth(double startWidth) {
        this.startWidth = startWidth;
        return this;
    }

    public Double getStartWidth() {
        return startWidth;
    }

    /**
     * Value to which the arrow should point at.
     **/
    public GaugeArrow setValue(double value) {
        this.value = value;
        return this;
    }

    public Double getValue() {
        return value;
    }

}