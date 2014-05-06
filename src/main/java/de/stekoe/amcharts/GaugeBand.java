package de.stekoe.amcharts;

public class GaugeBand {
    private Double alpha;
    private Color color;
    private Double endValue;
    private String id;
    private String innerRadius;
    private String radius;
    private Double startValue;

    /**
     * Opacity of band fill. Will use axis.bandAlpha if not set any.
     **/
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
    public Double getAlpha() {
        return alpha;
    }

    /**
     * Color of a band.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * End value of a fill.
     **/
    public void setEndValue(double endValue) {
        this.endValue = endValue;
    }
    public Double getEndValue() {
        return endValue;
    }

    /**
     * Unique id of a band.
     **/
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    /**
     * Inner radius of a band. If not set any, the band will end with the end of minor ticks.
     * Set 0 if you want the band to be drawn to the axis center.
     **/
    public void setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
    }
    public String getInnerRadius() {
        return innerRadius;
    }

    /**
     * Band radius. If not set any, the band will start with the axis outline.
     **/
    public void setRadius(String radius) {
        this.radius = radius;
    }
    public String getRadius() {
        return radius;
    }

    /**
     * Start value of a fill.
     **/
    public void setStartValue(double startValue) {
        this.startValue = startValue;
    }
    public Double getStartValue() {
        return startValue;
    }

}