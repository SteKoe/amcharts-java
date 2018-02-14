package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

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
     * Opacity of a slice.
     **/
    public Slice setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * Color of a slice.
     **/
    public Slice setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Original object from data provider.
     **/
    public Slice setDataContext(Object dataContext) {
        this.dataContext = dataContext;
        return this;
    }

    public Object getDataContext() {
        return dataContext;
    }

    /**
     * Slice description.
     **/
    public Slice setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Specifies whether the slice is hidden
     **/
    public Slice setHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public Boolean getHidden() {
        return hidden;
    }

    /**
     * Percent value of a slice.
     **/
    public Slice setPercents(double percents) {
        this.percents = percents;
        return this;
    }

    public Double getPercents() {
        return percents;
    }

    /**
     * Specifies whether the slice is pulled or not.
     **/
    public Slice setPulled(boolean pulled) {
        this.pulled = pulled;
        return this;
    }

    public Boolean getPulled() {
        return pulled;
    }

    /**
     * Slice title
     **/
    public Slice setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    /**
     * Url of a slice
     **/
    public Slice setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    /**
     * Value of a slice
     **/
    public Slice setValue(double value) {
        this.value = value;
        return this;
    }

    public Double getValue() {
        return value;
    }

    /**
     * specifies whether this slice has a legend entry
     **/
    public Slice setVisibleInLegend(boolean visibleInLegend) {
        this.visibleInLegend = visibleInLegend;
        return this;
    }

    public Boolean getVisibleInLegend() {
        return visibleInLegend;
    }

}