package de.stekoe.amcharts;

import java.util.Date;
public class TrendLine {
    private Double dashLength;
    private String finalCategory;
    private Date finalDate;
    private Double finalValue;
    private Double finalXValue;
    private String id;
    private String initialCategory;
    private Date initialDate;
    private Double initialValue;
    private Double initialXValue;
    private Boolean isProtected;
    private Double lineAlpha;
    private Color lineColor;
    private Double lineThickness;
    private ValueAxis valueAxis;
    private ValueAxis valueAxisX;

    /**
     * Dash length.
     **/
    public void setDashLength(double dashLength) {
        this.dashLength = dashLength;
    }
    public Double getDashLength() {
        return dashLength;
    }

    /**
     * String, equal to category value to which trend line should be drawn. It should be
     * used if chart doesn't parse dates.
     **/
    public void setFinalCategory(String finalCategory) {
        this.finalCategory = finalCategory;
    }
    public String getFinalCategory() {
        return finalCategory;
    }

    /**
     * Date to which trend line should be drawn. It can be date string (using the same date
     * format as chart.dataDateFormat) or date object.
     **/
    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }
    public Date getFinalDate() {
        return finalDate;
    }

    /**
     * Value at which trend line should end.
     **/
    public void setFinalValue(double finalValue) {
        this.finalValue = finalValue;
    }
    public Double getFinalValue() {
        return finalValue;
    }

    /**
     * Used by XY chart only. X value at which trend line should end.
     **/
    public void setFinalXValue(double finalXValue) {
        this.finalXValue = finalXValue;
    }
    public Double getFinalXValue() {
        return finalXValue;
    }

    /**
     * Unique id of a Trend line. You don't need to set it, unless you want to.
     **/
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    /**
     * String, equal to category value from which trend line should start. It should be
     * used if chart doesn't parse dates.
     **/
    public void setInitialCategory(String initialCategory) {
        this.initialCategory = initialCategory;
    }
    public String getInitialCategory() {
        return initialCategory;
    }

    /**
     * Date from which trend line should start. It can be date string (using the same date
     * format as chart.dataDateFormat) or date object.
     **/
    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }
    public Date getInitialDate() {
        return initialDate;
    }

    /**
     * Value from which trend line should start.
     **/
    public void setInitialValue(double initialValue) {
        this.initialValue = initialValue;
    }
    public Double getInitialValue() {
        return initialValue;
    }

    /**
     * Used by XY chart only. X value from which trend line should start.
     **/
    public void setInitialXValue(double initialXValue) {
        this.initialXValue = initialXValue;
    }
    public Double getInitialXValue() {
        return initialXValue;
    }

    /**
     * Used by Stock chart. If this property is set to true, this trend line won't be removed
     * when clicked on eraser tool.
     **/
    public void setIsProtected(boolean isProtected) {
        this.isProtected = isProtected;
    }
    public boolean isIsProtected() {
        return isProtected;
    }

    /**
     * Line opacity.
     **/
    public void setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
    }
    public Double getLineAlpha() {
        return lineAlpha;
    }

    /**
     * Line color.
     **/
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    public Color getLineColor() {
        return lineColor;
    }

    /**
     * Line thickness.
     **/
    public void setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
    }
    public Double getLineThickness() {
        return lineThickness;
    }

    /**
     * Value axis of the trend line. Will use first value axis of the chart if not set any.
     * You can use a reference to the value axis object or id of value axis.
     **/
    public void setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
    }
    public ValueAxis getValueAxis() {
        return valueAxis;
    }

    /**
     * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if
     * not set any. You can use a reference to the value axis object or id of value axis.
     **/
    public void setValueAxisX(ValueAxis valueAxisX) {
        this.valueAxisX = valueAxisX;
    }
    public ValueAxis getValueAxisX() {
        return valueAxisX;
    }

}