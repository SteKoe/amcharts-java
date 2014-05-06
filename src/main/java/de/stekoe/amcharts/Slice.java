package de.stekoe.amcharts;

public class Slice {
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
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
    public Double getAlpha() {
        return alpha;
    }

    /**
     * Color of a slice.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Original object from data provider.
     **/
    public void setDataContext(Object dataContext) {
        this.dataContext = dataContext;
    }
    public Object getDataContext() {
        return dataContext;
    }

    /**
     * Slice description.
     **/
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    /**
     * Specifies whether the slice is hidden
     **/
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Percent value of a slice.
     **/
    public void setPercents(double percents) {
        this.percents = percents;
    }
    public Double getPercents() {
        return percents;
    }

    /**
     * Specifies whether the slice is pulled or not.
     **/
    public void setPulled(boolean pulled) {
        this.pulled = pulled;
    }
    public boolean isPulled() {
        return pulled;
    }

    /**
     * Slice title
     **/
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    /**
     * Url of a slice
     **/
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    /**
     * Value of a slice
     **/
    public void setValue(double value) {
        this.value = value;
    }
    public Double getValue() {
        return value;
    }

    /**
     * specifies whether this slice has a legend entry
     **/
    public void setVisibleInLegend(boolean visibleInLegend) {
        this.visibleInLegend = visibleInLegend;
    }
    public boolean isVisibleInLegend() {
        return visibleInLegend;
    }

}