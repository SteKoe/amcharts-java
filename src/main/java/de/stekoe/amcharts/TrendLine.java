package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.Date;

public class TrendLine implements Serializable {
    private String balloonText;
    private Double dashLength;
    private String finalCategory;
    private Date finalDate;
    private Image finalImage;
    private Double finalValue;
    private Double finalXValue;
    private String id;
    private String initialCategory;
    private Date initialDate;
    private Image initialImage;
    private Double initialValue;
    private Double initialXValue;
    private Boolean isProtected;
    private Double lineAlpha;
    private Color lineColor;
    private Double lineThickness;
    private ValueAxis valueAxis;
    private ValueAxis valueAxisX;

    /**
     * When set, enables displaying a roll-over balloon.
     **/
    public TrendLine setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Dash length.
     **/
    public TrendLine setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    public Double getDashLength() {
        return dashLength;
    }

    /**
     * String, equal to category value to which trend line should be drawn. It should be
     * used if chart doesn't parse dates.
     **/
    public TrendLine setFinalCategory(String finalCategory) {
        this.finalCategory = finalCategory;
        return this;
    }

    public String getFinalCategory() {
        return finalCategory;
    }

    /**
     * Date to which trend line should be drawn. It can be date string (using the same date
     * format as chart.dataDateFormat) or date object.
     **/
    public TrendLine setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
        return this;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    /**
     * Allows to add an image to the end of a trend line.
     **/
    public TrendLine setFinalImage(Image finalImage) {
        this.finalImage = finalImage;
        return this;
    }

    public Image getFinalImage() {
        return finalImage;
    }

    /**
     * Value at which trend line should end.
     **/
    public TrendLine setFinalValue(double finalValue) {
        this.finalValue = finalValue;
        return this;
    }

    public Double getFinalValue() {
        return finalValue;
    }

    /**
     * Used by XY chart only. X value at which trend line should end.
     **/
    public TrendLine setFinalXValue(double finalXValue) {
        this.finalXValue = finalXValue;
        return this;
    }

    public Double getFinalXValue() {
        return finalXValue;
    }

    /**
     * Unique id of a Trend line. You don't need to set it, unless you want to.
     **/
    public TrendLine setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * String, equal to category value from which trend line should start. It should be
     * used if chart doesn't parse dates.
     **/
    public TrendLine setInitialCategory(String initialCategory) {
        this.initialCategory = initialCategory;
        return this;
    }

    public String getInitialCategory() {
        return initialCategory;
    }

    /**
     * Date from which trend line should start. It can be date string (using the same date
     * format as chart.dataDateFormat) or date object.
     **/
    public TrendLine setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
        return this;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    /**
     * Allows to add an image to the beginning of a trend line.
     **/
    public TrendLine setInitialImage(Image initialImage) {
        this.initialImage = initialImage;
        return this;
    }

    public Image getInitialImage() {
        return initialImage;
    }

    /**
     * Value from which trend line should start.
     **/
    public TrendLine setInitialValue(double initialValue) {
        this.initialValue = initialValue;
        return this;
    }

    public Double getInitialValue() {
        return initialValue;
    }

    /**
     * Used by XY chart only. X value from which trend line should start.
     **/
    public TrendLine setInitialXValue(double initialXValue) {
        this.initialXValue = initialXValue;
        return this;
    }

    public Double getInitialXValue() {
        return initialXValue;
    }

    /**
     * Used by Stock chart. If this property is set to true, this trend line won't be removed
     * when clicked on eraser tool.
     **/
    public TrendLine setIsProtected(boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    public Boolean getIsProtected() {
        return isProtected;
    }

    /**
     * Line opacity.
     **/
    public TrendLine setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
        return this;
    }

    public Double getLineAlpha() {
        return lineAlpha;
    }

    /**
     * Line color.
     **/
    public TrendLine setLineColor(Color lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Color getLineColor() {
        return lineColor;
    }

    /**
     * Line thickness.
     **/
    public TrendLine setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
        return this;
    }

    public Double getLineThickness() {
        return lineThickness;
    }

    /**
     * Value axis of the trend line. Will use first value axis of the chart if not set any.
     * You can use a reference to the value axis object or id of value axis.
     **/
    public TrendLine setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    public ValueAxis getValueAxis() {
        return valueAxis;
    }

    /**
     * Used by XY chart only. X axis of trend line. Will use first X axis of the chart if
     * not set any. You can use a reference to the value axis object or id of value axis.
     **/
    public TrendLine setValueAxisX(ValueAxis valueAxisX) {
        this.valueAxisX = valueAxisX;
        return this;
    }

    public ValueAxis getValueAxisX() {
        return valueAxisX;
    }

}