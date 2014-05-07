package de.stekoe.amcharts;

import org.json.JSONObject;

import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.helper.Jsonifyable;
import de.stekoe.amcharts.helper.Jsonifyer;

public class GaugeBand implements Jsonifyable {
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
    public Double getAlpha() {
        return alpha;
    }
    public GaugeBand setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    /**
     * Color of a band.
     **/
    public Color getColor() {
        return color;
    }
    public GaugeBand setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * End value of a fill.
     **/
    public Double getEndValue() {
        return endValue;
    }
    public GaugeBand setEndValue(double endValue) {
        this.endValue = endValue;
        return this;
    }

    /**
     * Unique id of a band.
     **/
    public String getId() {
        return id;
    }
    public GaugeBand setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Inner radius of a band. If not set any, the band will end with the end of minor ticks.
     * Set 0 if you want the band to be drawn to the axis center.
     **/
    public String getInnerRadius() {
        return innerRadius;
    }
    public GaugeBand setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
        return this;
    }

    /**
     * Band radius. If not set any, the band will start with the axis outline.
     **/
    public String getRadius() {
        return radius;
    }
    public GaugeBand setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    /**
     * Start value of a fill.
     **/
    public Double getStartValue() {
        return startValue;
    }
    public GaugeBand setStartValue(double startValue) {
        this.startValue = startValue;
        return this;
    }

    public JSONObject toJson() {
        return new Jsonifyer(this).toJson();
    }
}