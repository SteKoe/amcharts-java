package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.Date;

/**
 * Creates a trendline for AmSerialChart and AmXYChart charts which indicates the trend
 * of your data or covers some different purposes. Multiple can be assigned.
 */

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
     * @param balloonText When set, enables displaying a roll-over balloon.
     * @return TrendLine
     */
    public TrendLine setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * @param dashLength Dash length.
     * @return TrendLine
     */
    public TrendLine setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    public Double getDashLength() {
        return dashLength;
    }

    /**
     * @param finalCategory String, equal to category value to which trend line should be drawn. It should be
     *                      used if chart doesn't parse dates.
     * @return TrendLine
     */
    public TrendLine setFinalCategory(String finalCategory) {
        this.finalCategory = finalCategory;
        return this;
    }

    public String getFinalCategory() {
        return finalCategory;
    }

    /**
     * @param finalDate Date to which trend line should be drawn. It can be date string (using the same date
     *                  format as chart.dataDateFormat) or date object.
     * @return TrendLine
     */
    public TrendLine setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
        return this;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    /**
     * @param finalImage Allows to add an image to the end of a trend line.
     * @return TrendLine
     */
    public TrendLine setFinalImage(Image finalImage) {
        this.finalImage = finalImage;
        return this;
    }

    public Image getFinalImage() {
        return finalImage;
    }

    /**
     * @param finalValue Value at which trend line should end.
     * @return TrendLine
     */
    public TrendLine setFinalValue(double finalValue) {
        this.finalValue = finalValue;
        return this;
    }

    public Double getFinalValue() {
        return finalValue;
    }

    /**
     * @param finalXValue Used by XY chart only. X value at which trend line should end.
     * @return TrendLine
     */
    public TrendLine setFinalXValue(double finalXValue) {
        this.finalXValue = finalXValue;
        return this;
    }

    public Double getFinalXValue() {
        return finalXValue;
    }

    /**
     * @param id Unique id of a Trend line. You don't need to set it, unless you want to.
     * @return TrendLine
     */
    public TrendLine setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * @param initialCategory String, equal to category value from which trend line should start. It should be
     *                        used if chart doesn't parse dates.
     * @return TrendLine
     */
    public TrendLine setInitialCategory(String initialCategory) {
        this.initialCategory = initialCategory;
        return this;
    }

    public String getInitialCategory() {
        return initialCategory;
    }

    /**
     * @param initialDate Date from which trend line should start. It can be date string (using the same date
     *                    format as chart.dataDateFormat) or date object.
     * @return TrendLine
     */
    public TrendLine setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
        return this;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    /**
     * @param initialImage Allows to add an image to the beginning of a trend line.
     * @return TrendLine
     */
    public TrendLine setInitialImage(Image initialImage) {
        this.initialImage = initialImage;
        return this;
    }

    public Image getInitialImage() {
        return initialImage;
    }

    /**
     * @param initialValue Value from which trend line should start.
     * @return TrendLine
     */
    public TrendLine setInitialValue(double initialValue) {
        this.initialValue = initialValue;
        return this;
    }

    public Double getInitialValue() {
        return initialValue;
    }

    /**
     * @param initialXValue Used by XY chart only. X value from which trend line should start.
     * @return TrendLine
     */
    public TrendLine setInitialXValue(double initialXValue) {
        this.initialXValue = initialXValue;
        return this;
    }

    public Double getInitialXValue() {
        return initialXValue;
    }

    /**
     * @param isProtected Used by Stock chart. If this property is set to true, this trend line won't be removed
     *                    when clicked on eraser tool.
     * @return TrendLine
     */
    public TrendLine setIsProtected(boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    public Boolean getIsProtected() {
        return isProtected;
    }

    /**
     * @param lineAlpha Line opacity.
     * @return TrendLine
     */
    public TrendLine setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
        return this;
    }

    public Double getLineAlpha() {
        return lineAlpha;
    }

    /**
     * @param lineColor Line color.
     * @return TrendLine
     */
    public TrendLine setLineColor(Color lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Color getLineColor() {
        return lineColor;
    }

    /**
     * @param lineThickness Line thickness.
     * @return TrendLine
     */
    public TrendLine setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
        return this;
    }

    public Double getLineThickness() {
        return lineThickness;
    }

    /**
     * @param valueAxis Value axis of the trend line. Will use first value axis of the chart if not set any.
     *                  You can use a reference to the value axis object or id of value axis.
     * @return TrendLine
     */
    public TrendLine setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    public ValueAxis getValueAxis() {
        return valueAxis;
    }

    /**
     * @param valueAxisX Used by XY chart only. X axis of trend line. Will use first X axis of the chart if
     *                   not set any. You can use a reference to the value axis object or id of value axis.
     * @return TrendLine
     */
    public TrendLine setValueAxisX(ValueAxis valueAxisX) {
        this.valueAxisX = valueAxisX;
        return this;
    }

    public ValueAxis getValueAxisX() {
        return valueAxisX;
    }

}