package de.stekoe.amcharts;


public class AmXYChart extends AmRectangularChart {
    private Boolean hideXScrollbar;
    private Boolean hideYScrollbar;
    private Double maxZoomFactor;

    /**
     * Specifies if Scrollbar of X axis (horizontal) should be hidden.
     **/
    public Boolean getHideXScrollbar() {
        return hideXScrollbar;
    }
    public AmXYChart setHideXScrollbar(boolean hideXScrollbar) {
        this.hideXScrollbar = hideXScrollbar;
        return this;
    }

    /**
     * Specifies if Scrollbar of Y axis (vertical) should be hidden.
     **/
    public Boolean getHideYScrollbar() {
        return hideYScrollbar;
    }
    public AmXYChart setHideYScrollbar(boolean hideYScrollbar) {
        this.hideYScrollbar = hideYScrollbar;
        return this;
    }

    /**
     * Maximum zoom factor of the chart.
     **/
    public Double getMaxZoomFactor() {
        return maxZoomFactor;
    }
    public AmXYChart setMaxZoomFactor(double maxZoomFactor) {
        this.maxZoomFactor = maxZoomFactor;
        return this;
    }

}