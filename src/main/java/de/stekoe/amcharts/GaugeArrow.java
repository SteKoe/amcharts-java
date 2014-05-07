package de.stekoe.amcharts;

import org.json.JSONObject;

import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.helper.Jsonifyable;
import de.stekoe.amcharts.helper.Jsonifyer;

public class GaugeArrow implements Jsonifyable {
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
    public Double getAlpha() {
        return alpha;
    }
    public GaugeArrow setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    /**
     * Axis of the arrow. You can use reference to the axis or id of the axis. If you don't
     * set any axis, the first axis of a chart will be used.
     **/
    public GaugeAxis getAxis() {
        return axis;
    }
    public GaugeArrow setAxis(GaugeAxis axis) {
        this.axis = axis;
        return this;
    }

    /**
     * Opacity of arrow border.
     **/
    public Double getBorderAlpha() {
        return borderAlpha;
    }
    public GaugeArrow setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
        return this;
    }

    /**
     * In case you need the arrow to rotate only clock-wise, set this property to true.
     **/
    public Boolean getClockWiseOnly() {
        return clockWiseOnly;
    }
    public GaugeArrow setClockWiseOnly(boolean clockWiseOnly) {
        this.clockWiseOnly = clockWiseOnly;
        return this;
    }

    /**
     * Color of an arrow.
     **/
    public Color getColor() {
        return color;
    }
    public GaugeArrow setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Unique id of an arrow.
     **/
    public String getId() {
        return id;
    }
    public GaugeArrow setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Inner radius of an arrow.
     **/
    public String getInnerRadius() {
        return innerRadius;
    }
    public GaugeArrow setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
        return this;
    }

    /**
     * Opacity of a nail, holding the arrow.
     **/
    public Double getNailAlpha() {
        return nailAlpha;
    }
    public GaugeArrow setNailAlpha(double nailAlpha) {
        this.nailAlpha = nailAlpha;
        return this;
    }

    /**
     * Opacity of nail border.
     **/
    public Double getNailBorderAlpha() {
        return nailBorderAlpha;
    }
    public GaugeArrow setNailBorderAlpha(double nailBorderAlpha) {
        this.nailBorderAlpha = nailBorderAlpha;
        return this;
    }

    /**
     * Thickness of nail border.
     **/
    public Double getNailBorderThickness() {
        return nailBorderThickness;
    }
    public GaugeArrow setNailBorderThickness(double nailBorderThickness) {
        this.nailBorderThickness = nailBorderThickness;
        return this;
    }

    /**
     * Radius of a nail, holding the arrow.
     **/
    public Double getNailRadius() {
        return nailRadius;
    }
    public GaugeArrow setNailRadius(double nailRadius) {
        this.nailRadius = nailRadius;
        return this;
    }

    /**
     * Radius of an arrow.
     **/
    public String getRadius() {
        return radius;
    }
    public GaugeArrow setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    /**
     * Width of arrow root.
     **/
    public Double getStartWidth() {
        return startWidth;
    }
    public GaugeArrow setStartWidth(double startWidth) {
        this.startWidth = startWidth;
        return this;
    }

    /**
     * Value to which the arrow should point at.
     **/
    public Double getValue() {
        return value;
    }
    public GaugeArrow setValue(double value) {
        this.value = value;
        return this;
    }

    public JSONObject toJson() {
        return new Jsonifyer(this).toJson();
    }
}