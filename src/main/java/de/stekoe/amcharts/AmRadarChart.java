package de.stekoe.amcharts;

public class AmRadarChart extends AmCoordinateChart {
    private String categoryField;
    private Double marginBottom;
    private Double marginLeft;
    private Double marginRight;
    private Double marginTop;
    private String radius;

    /**
     * Field in your data provider containing categories.
     */
    public AmRadarChart setCategoryField(String categoryField) {
        this.categoryField = categoryField;
        return this;
    }

    public String getCategoryField() {
        return categoryField;
    }

    /**
     * Bottom margin of the chart.
     */
    public AmRadarChart setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Left margin of the chart.
     */
    public AmRadarChart setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Right margin of the chart.
     */
    public AmRadarChart setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Top margin of the chart.
     */
    public AmRadarChart setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * Radius of a radar.
     */
    public AmRadarChart setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getRadius() {
        return radius;
    }

}