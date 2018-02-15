package de.stekoe.amcharts;

/**
 * Extension for AmCoordinateChart to create radar/polar charts.
 */

public class AmRadarChart extends AmCoordinateChart {
    private String categoryField;
    private Double marginBottom;
    private Double marginLeft;
    private Double marginRight;
    private Double marginTop;
    private String radius;

    /**
     * @param categoryField Field in your data provider containing categories.
     * @return AmRadarChart
     */
    public AmRadarChart setCategoryField(String categoryField) {
        this.categoryField = categoryField;
        return this;
    }

    public String getCategoryField() {
        return categoryField;
    }

    /**
     * @param marginBottom Bottom margin of the chart.
     * @return AmRadarChart
     */
    public AmRadarChart setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * @param marginLeft Left margin of the chart.
     * @return AmRadarChart
     */
    public AmRadarChart setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * @param marginRight Right margin of the chart.
     * @return AmRadarChart
     */
    public AmRadarChart setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * @param marginTop Top margin of the chart.
     * @return AmRadarChart
     */
    public AmRadarChart setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * @param radius Radius of a radar.
     * @return AmRadarChart
     */
    public AmRadarChart setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getRadius() {
        return radius;
    }

}