package de.stekoe.amcharts;

public class AmXYChart extends AmRectangularChart {
    private Boolean hideXScrollbar;
    private Boolean hideYScrollbar;
    private Double maxZoomFactor;

    /**
     * Specifies if Scrollbar of X axis (horizontal) should be hidden.
     **/
    public void setHideXScrollbar(boolean hideXScrollbar) {
        this.hideXScrollbar = hideXScrollbar;
    }
    public boolean isHideXScrollbar() {
        return hideXScrollbar;
    }

    /**
     * Specifies if Scrollbar of Y axis (vertical) should be hidden.
     **/
    public void setHideYScrollbar(boolean hideYScrollbar) {
        this.hideYScrollbar = hideYScrollbar;
    }
    public boolean isHideYScrollbar() {
        return hideYScrollbar;
    }

    /**
     * Maximum zoom factor of the chart.
     **/
    public void setMaxZoomFactor(double maxZoomFactor) {
        this.maxZoomFactor = maxZoomFactor;
    }
    public Double getMaxZoomFactor() {
        return maxZoomFactor;
    }

}