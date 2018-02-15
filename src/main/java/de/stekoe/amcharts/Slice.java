package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

/**
 * Slice is an item of AmPieChart's chartData Array and holds all the information about
 * the slice. When working with a pie chart, you do not create slices or change it's
 * properties directly, instead you set array of data using dataProvider property. Consider
 * properties of a Slice read-only - change values in chart's data provider if you need
 * to.
 */

public class Slice implements Serializable {
    private Double alpha;
    private Color color;
    private Object dataContext;
    private String description;
    private Boolean hidden;
    private Double percents;
    private Boolean pulled;
    private String title;
    private String url;
    private Double value;
    private Boolean visibleInLegend;

    /**
     * @param alpha Opacity of a slice.
     * @return Slice
     */
    public Slice setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * @param color Color of a slice.
     * @return Slice
     */
    public Slice setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param dataContext Original object from data provider.
     * @return Slice
     */
    public Slice setDataContext(Object dataContext) {
        this.dataContext = dataContext;
        return this;
    }

    public Object getDataContext() {
        return dataContext;
    }

    /**
     * @param description Slice description.
     * @return Slice
     */
    public Slice setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    /**
     * @param hidden Specifies whether the slice is hidden
     * @return Slice
     */
    public Slice setHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public Boolean getHidden() {
        return hidden;
    }

    /**
     * @param percents Percent value of a slice.
     * @return Slice
     */
    public Slice setPercents(double percents) {
        this.percents = percents;
        return this;
    }

    public Double getPercents() {
        return percents;
    }

    /**
     * @param pulled Specifies whether the slice is pulled or not.
     * @return Slice
     */
    public Slice setPulled(boolean pulled) {
        this.pulled = pulled;
        return this;
    }

    public Boolean getPulled() {
        return pulled;
    }

    /**
     * @param title Slice title
     * @return Slice
     */
    public Slice setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    /**
     * @param url Url of a slice
     * @return Slice
     */
    public Slice setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    /**
     * @param value Value of a slice
     * @return Slice
     */
    public Slice setValue(double value) {
        this.value = value;
        return this;
    }

    public Double getValue() {
        return value;
    }

    /**
     * @param visibleInLegend specifies whether this slice has a legend entry
     * @return Slice
     */
    public Slice setVisibleInLegend(boolean visibleInLegend) {
        this.visibleInLegend = visibleInLegend;
        return this;
    }

    public Boolean getVisibleInLegend() {
        return visibleInLegend;
    }

}