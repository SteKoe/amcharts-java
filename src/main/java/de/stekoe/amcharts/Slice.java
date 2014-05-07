package de.stekoe.amcharts;

import org.json.JSONObject;

import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.helper.Jsonifyable;
import de.stekoe.amcharts.helper.Jsonifyer;

public class Slice implements Jsonifyable {
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
    public Double getAlpha() {
        return alpha;
    }
    public Slice setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    /**
     * Color of a slice.
     **/
    public Color getColor() {
        return color;
    }
    public Slice setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Original object from data provider.
     **/
    public Object getDataContext() {
        return dataContext;
    }
    public Slice setDataContext(Object dataContext) {
        this.dataContext = dataContext;
        return this;
    }

    /**
     * Slice description.
     **/
    public String getDescription() {
        return description;
    }
    public Slice setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Specifies whether the slice is hidden
     **/
    public Boolean getHidden() {
        return hidden;
    }
    public Slice setHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /**
     * Percent value of a slice.
     **/
    public Double getPercents() {
        return percents;
    }
    public Slice setPercents(double percents) {
        this.percents = percents;
        return this;
    }

    /**
     * Specifies whether the slice is pulled or not.
     **/
    public Boolean getPulled() {
        return pulled;
    }
    public Slice setPulled(boolean pulled) {
        this.pulled = pulled;
        return this;
    }

    /**
     * Slice title
     **/
    public String getTitle() {
        return title;
    }
    public Slice setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Url of a slice
     **/
    public String getUrl() {
        return url;
    }
    public Slice setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Value of a slice
     **/
    public Double getValue() {
        return value;
    }
    public Slice setValue(double value) {
        this.value = value;
        return this;
    }

    /**
     * specifies whether this slice has a legend entry
     **/
    public Boolean getVisibleInLegend() {
        return visibleInLegend;
    }
    public Slice setVisibleInLegend(boolean visibleInLegend) {
        this.visibleInLegend = visibleInLegend;
        return this;
    }

    public JSONObject toJson() {
        return new Jsonifyer(this).toJson();
    }
}