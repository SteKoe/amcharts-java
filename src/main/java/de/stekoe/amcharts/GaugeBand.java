package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

/**
 * Creates a band for a specified value range on the GaugeAxis. Multiple bands can be
 * assigned to a single GaugeAxis.
 */

public class GaugeBand implements Serializable {
    private Double alpha;
    private String balloonText;
    private Color color;
    private Double endValue;
    private List<Number> gradientRatio;
    private String id;
    private String innerRadius;
    private String radius;
    private Double startValue;
    private String url;

    /**
     * @param alpha Opacity of band fill. Will use axis.bandAlpha if not set any.
     * @return GaugeBand
     */
    public GaugeBand setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * @param balloonText *When rolled-over, band will display balloon if you set some text for this property.
     * @return GaugeBand
     */
    public GaugeBand setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * @param color Color of a band.
     * @return GaugeBand
     */
    public GaugeBand setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param endValue End value of a fill.
     * @return GaugeBand
     */
    public GaugeBand setEndValue(double endValue) {
        this.endValue = endValue;
        return this;
    }

    public Double getEndValue() {
        return endValue;
    }

    /**
     * @param gradientRatio Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients. Negative
     *                      value means the color will be darker than the original, and positive number means
     *                      the color will be lighter.
     * @return GaugeBand
     */
    public GaugeBand setGradientRatio(List<Number> gradientRatio) {
        this.gradientRatio = gradientRatio;
        return this;
    }

    public List<Number> getGradientRatio() {
        return gradientRatio;
    }

    /**
     * @param id Unique id of a band.
     * @return GaugeBand
     */
    public GaugeBand setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * @param innerRadius Inner radius of a band. If not set any, the band will end with the end of minor ticks.
     *                    Set 0 if you want the band to be drawn to the axis center.
     * @return GaugeBand
     */
    public GaugeBand setInnerRadius(String innerRadius) {
        this.innerRadius = innerRadius;
        return this;
    }

    public String getInnerRadius() {
        return innerRadius;
    }

    /**
     * @param radius Band radius. If not set any, the band will start with the axis outline.
     * @return GaugeBand
     */
    public GaugeBand setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getRadius() {
        return radius;
    }

    /**
     * @param startValue Start value of a fill.
     * @return GaugeBand
     */
    public GaugeBand setStartValue(double startValue) {
        this.startValue = startValue;
        return this;
    }

    public Double getStartValue() {
        return startValue;
    }

    /**
     * @param url Gauge band can be clickable and can lead to some page.
     * @return GaugeBand
     */
    public GaugeBand setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

}