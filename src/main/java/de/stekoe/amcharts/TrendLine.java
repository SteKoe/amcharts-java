package de.stekoe.amcharts;

import java.io.Serializable;
import java.util.Date;

import de.stekoe.amcharts.addition.Color;

public class TrendLine implements Serializable {
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
    public Double getDashLength() {
        return dashLength;
    }
    public TrendLine setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    /**
     * String, equal to category value to which trend line should be drawn. It should be
     * used if chart doesn't parse dates.
     **/
    public String getFinalCategory() {
        return finalCategory;
    }
    public TrendLine setFinalCategory(String finalCategory) {
        this.finalCategory = finalCategory;
        return this;
    }

    /**
     * Date to which trend line should be drawn. It can be date string (using the same date
     * format as chart.dataDateFormat) or date object.
     **/
    public Date getFinalDate() {
        return finalDate;
    }
    public TrendLine setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
        return this;
    }

    /**
     * Value at which trend line should end.
     **/
    public Double getFinalValue() {
        return finalValue;
    }
    public TrendLine setFinalValue(double finalValue) {
        this.finalValue = finalValue;
        return this;
    }

    /**
     * Used by XY chart only. X value at which trend line should end.
     **/
    public Double getFinalXValue() {
        return finalXValue;
    }
    public TrendLine setFinalXValue(double finalXValue) {
        this.finalXValue = finalXValue;
        return this;
    }

    /**
     * Unique id of a Trend line. You don't need to set it, unless you want to.
     **/
    public String getId() {
        return id;
    }
    public TrendLine setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * String, equal to category value from which trend line should start. It should be
     * used if chart doesn't parse dates.
     **/
    public String getInitialCategory() {
        return initialCategory;
    }
    public TrendLine setInitialCategory(String initialCategory) {
        this.initialCategory = initialCategory;
        return this;
    }

    /**
     * Date from which trend line should start. It can be date string (using the same date
     * format as chart.dataDateFormat) or date object.
     **/
    public Date getInitialDate() {
        return initialDate;
    }
    public TrendLine setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
        return this;
    }

    /**
     * Value from which trend line should start.
     **/
    public Double getInitialValue() {
        return initialValue;
    }
    public TrendLine setInitialValue(double initialValue) {
        this.initialValue = initialValue;
        return this;
    }

    /**
     * Used by XY chart only. X value from which trend line should start.
     **/
    public Double getInitialXValue() {
        return initialXValue;
    }
    public TrendLine setInitialXValue(double initialXValue) {
        this.initialXValue = initialXValue;
        return this;
    }

    /**
     * Used by Stock chart. If this property is set to true, this trend line won't be removed
     * when clicked on eraser tool.
     **/
    public Boolean getIsProtected() {
        return isProtected;
    }
    public TrendLine setIsProtected(boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    /**
     * Line opacity.
     **/
    public Double getLineAlpha() {
        return lineAlpha;
    }
    public TrendLine setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
        return this;
    }

    /**
     * Line color.
     **/
    public Color getLineColor() {
        return lineColor;
    }
    public TrendLine setLineColor(Color lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    /**
     * Line thickness.
     **/
    public Double getLineThickness() {
        return lineThickness;
    }
    public TrendLine setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
        return this;
    }

    /**
     * Value axis of the trend line. Will use first value axis of the chart if not set any.
     * You can use a reference to the value axis object or id of value axis.
     **/
    public ValueAxis getValueAxis() {
        return valueAxis;
    }
    public TrendLine setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    /**
     * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if
     * not set any. You can use a reference to the value axis object or id of value axis.
     **/
    public ValueAxis getValueAxisX() {
        return valueAxisX;
    }
    public TrendLine setValueAxisX(ValueAxis valueAxisX) {
        this.valueAxisX = valueAxisX;
        return this;
    }


}