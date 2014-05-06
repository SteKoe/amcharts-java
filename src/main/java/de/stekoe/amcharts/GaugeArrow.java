package de.stekoe.amcharts;

public class GaugeArrow {
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
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
    public Double getAlpha() {
        return alpha;
    }

    /**
     * Axis of the arrow. You can use reference to the axis or id of the axis. If you don't
     * set any axis, the first axis of a chart will be used.
     **/
    public void setAxis(GaugeAxis axis) {
        this.axis = axis;
    }
    public GaugeAxis getAxis() {
        return axis;
    }

    /**
     * Opacity of arrow border.
     **/
    public void setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
    }
    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * In case you need the arrow to rotate only clock-wise, set this property to true.
     **/
    public void setClockWiseOnly(boolean clockWiseOnly) {
        this.clockWiseOnly = clockWiseOnly;
    }
    public boolean isClockWiseOnly() {
        return clockWiseOnly;
    }

    /**
     * Color of an arrow.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Unique id of an arrow.
     **/
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    /**
     * Inner radius of an arrow.
     **/
    public void setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
    }
    public String getInnerRadius() {
        return innerRadius;
    }

    /**
     * Opacity of a nail, holding the arrow.
     **/
    public void setNailAlpha(double nailAlpha) {
        this.nailAlpha = nailAlpha;
    }
    public Double getNailAlpha() {
        return nailAlpha;
    }

    /**
     * Opacity of nail border.
     **/
    public void setNailBorderAlpha(double nailBorderAlpha) {
        this.nailBorderAlpha = nailBorderAlpha;
    }
    public Double getNailBorderAlpha() {
        return nailBorderAlpha;
    }

    /**
     * Thickness of nail border.
     **/
    public void setNailBorderThickness(double nailBorderThickness) {
        this.nailBorderThickness = nailBorderThickness;
    }
    public Double getNailBorderThickness() {
        return nailBorderThickness;
    }

    /**
     * Radius of a nail, holding the arrow.
     **/
    public void setNailRadius(double nailRadius) {
        this.nailRadius = nailRadius;
    }
    public Double getNailRadius() {
        return nailRadius;
    }

    /**
     * Radius of an arrow.
     **/
    public void setRadius(String radius) {
        this.radius = radius;
    }
    public String getRadius() {
        return radius;
    }

    /**
     * Width of arrow root.
     **/
    public void setStartWidth(double startWidth) {
        this.startWidth = startWidth;
    }
    public Double getStartWidth() {
        return startWidth;
    }

    /**
     * Value to which the arrow should point at.
     **/
    public void setValue(double value) {
        this.value = value;
    }
    public Double getValue() {
        return value;
    }

}