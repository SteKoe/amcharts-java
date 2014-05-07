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
     **/
    public String getCategoryField() {
        return categoryField;
    }
    public AmRadarChart setCategoryField(String categoryField) {
        this.categoryField = categoryField;
        return this;
    }

    /**
     * Bottom margin of the chart.
     **/
    public Double getMarginBottom() {
        return marginBottom;
    }
    public AmRadarChart setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    /**
     * Left margin of the chart.
     **/
    public Double getMarginLeft() {
        return marginLeft;
    }
    public AmRadarChart setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    /**
     * Right margin of the chart.
     **/
    public Double getMarginRight() {
        return marginRight;
    }
    public AmRadarChart setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    /**
     * Top margin of the chart.
     **/
    public Double getMarginTop() {
        return marginTop;
    }
    public AmRadarChart setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    /**
     * Radius of a radar.
     **/
    public String getRadius() {
        return radius;
    }
    public AmRadarChart setRadius(String radius) {
        this.radius = radius;
        return this;
    }

}