package de.stekoe.amcharts;

/**
 * Extension for AmRectangularChart to create XY/bubble/scatter charts. The charts support
 * multiple axes with simple or logarithmic scales.
 */

public class AmXYChart extends AmRectangularChart {
    private String dataDateFormat;
    private Boolean hideXScrollbar;
    private Boolean hideYScrollbar;
    private Double maxValue;
    private Double maxZoomFactor;
    private Double minValue;

    /**
     * @param dataDateFormat In case you have date-based value axis in your XY chart, you can specify your corresponding
     *                       values as strings. In that case you will need to set this setting to whatever format
     *                       your are using for date/time. Check this page for available formats. Please note
     *                       that two-digit years (YY) as well as literal month names (MMM) are NOT supported
     *                       in this setting.
     * @return AmXYChart
     */
    public AmXYChart setDataDateFormat(String dataDateFormat) {
        this.dataDateFormat = dataDateFormat;
        return this;
    }

    public String getDataDateFormat() {
        return dataDateFormat;
    }

    /**
     * @param hideXScrollbar Specifies if Scrollbar of X axis (horizontal) should be hidden.
     * @return AmXYChart
     */
    public AmXYChart setHideXScrollbar(boolean hideXScrollbar) {
        this.hideXScrollbar = hideXScrollbar;
        return this;
    }

    public Boolean getHideXScrollbar() {
        return hideXScrollbar;
    }

    /**
     * @param hideYScrollbar Specifies if Scrollbar of Y axis (vertical) should be hidden.
     * @return AmXYChart
     */
    public AmXYChart setHideYScrollbar(boolean hideYScrollbar) {
        this.hideYScrollbar = hideYScrollbar;
        return this;
    }

    public Boolean getHideYScrollbar() {
        return hideYScrollbar;
    }

    /**
     * @param maxValue These can be used to adjust size/scale of bubbles. If these properties are not set,
     *                 the bubble with smallest value will be of minBulletSize and bubble with biggest value
     *                 will be of maxBulletSize. However, you might want bubble size to change relative
     *                 to 0 or some other value. In this case you can use minValue and maxValue properties.
     *                 Note, if you use these two settings, you might also want to set minBulletSize to
     *                 0.
     * @return AmXYChart
     */
    public AmXYChart setMaxValue(double maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * @param maxZoomFactor Maximum zoom factor of the chart.
     * @return AmXYChart
     */
    public AmXYChart setMaxZoomFactor(double maxZoomFactor) {
        this.maxZoomFactor = maxZoomFactor;
        return this;
    }

    public Double getMaxZoomFactor() {
        return maxZoomFactor;
    }

    /**
     * @param minValue These can be used to adjust size/scale of bubbles. If these properties are not set,
     *                 the bubble with smallest value will be of minBulletSize and bubble with biggest value
     *                 will be of maxBulletSize. However, you might want bubble size to change relative
     *                 to 0 or some other value. In this case you can use minValue and maxValue properties.
     *                 Note, if you use these two settings, you might also want to set minBulletSize to
     *                 0.
     * @return AmXYChart
     */
    public AmXYChart setMinValue(double minValue) {
        this.minValue = minValue;
        return this;
    }

    public Double getMinValue() {
        return minValue;
    }

}