package de.stekoe.amcharts;

public class AmXYChart extends AmRectangularChart {
    private Boolean hideXScrollbar;
    private Boolean hideYScrollbar;
    private Double maxZoomFactor;

    /**
     * Specifies if Scrollbar of X axis (horizontal) should be hidden.
     */
    public AmXYChart setHideXScrollbar(boolean hideXScrollbar) {
        this.hideXScrollbar = hideXScrollbar;
        return this;
    }

    public Boolean getHideXScrollbar() {
        return hideXScrollbar;
    }

    /**
     * Specifies if Scrollbar of Y axis (vertical) should be hidden.
     */
    public AmXYChart setHideYScrollbar(boolean hideYScrollbar) {
        this.hideYScrollbar = hideYScrollbar;
        return this;
    }

    public Boolean getHideYScrollbar() {
        return hideYScrollbar;
    }

    /**
     * Maximum zoom factor of the chart.
     */
    public AmXYChart setMaxZoomFactor(double maxZoomFactor) {
        this.maxZoomFactor = maxZoomFactor;
        return this;
    }

    public Double getMaxZoomFactor() {
        return maxZoomFactor;
    }

}