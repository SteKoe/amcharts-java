package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

public class GaugeBand implements Serializable {
    private Double alpha;
    private String balloonText;
    private Color color;
    private Double endValue;
    private String id;
    private String innerRadius;
    private String radius;
    private Double startValue;
    private String url;

    /**
     * Opacity of band fill. Will use axis.bandAlpha if not set any.
     */
    public GaugeBand setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * *When rolled-over, band will display balloon if you set some text for this property.
     */
    public GaugeBand setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Color of a band.
     */
    public GaugeBand setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * End value of a fill.
     */
    public GaugeBand setEndValue(double endValue) {
        this.endValue = endValue;
        return this;
    }

    public Double getEndValue() {
        return endValue;
    }

    /**
     * Unique id of a band.
     */
    public GaugeBand setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * Inner radius of a band. If not set any, the band will end with the end of minor ticks.
     * Set 0 if you want the band to be drawn to the axis center.
     */
    public GaugeBand setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
        return this;
    }

    public String getInnerRadius() {
        return innerRadius;
    }

    /**
     * Band radius. If not set any, the band will start with the axis outline.
     */
    public GaugeBand setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getRadius() {
        return radius;
    }

    /**
     * Start value of a fill.
     */
    public GaugeBand setStartValue(double startValue) {
        this.startValue = startValue;
        return this;
    }

    public Double getStartValue() {
        return startValue;
    }

    /**
     * Gauge band can be clickable and can lead to some page.
     */
    public GaugeBand setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

}