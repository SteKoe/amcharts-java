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
    public void setCategoryField(String categoryField) {
        this.categoryField = categoryField;
    }
    public String getCategoryField() {
        return categoryField;
    }

    /**
     * Bottom margin of the chart.
     **/
    public void setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
    }
    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Left margin of the chart.
     **/
    public void setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
    }
    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Right margin of the chart.
     **/
    public void setMarginRight(double marginRight) {
        this.marginRight = marginRight;
    }
    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Top margin of the chart.
     **/
    public void setMarginTop(double marginTop) {
        this.marginTop = marginTop;
    }
    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * Radius of a radar.
     **/
    public void setRadius(String radius) {
        this.radius = radius;
    }
    public String getRadius() {
        return radius;
    }

}