package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.Date;

/**
 * Creates a horizontal/vertical guideline-/area for AmSerialChart, AmXYChart and AmRadarChart
 * charts, automatically adapts it's settings from the axes if none has been specified.
 */

public class Guide implements Serializable {
    private Boolean above;
    private Double angle;
    private Color balloonColor;
    private String balloonText;
    private Boolean boldLabel;
    private String category;
    private Color color;
    private Double dashLength;
    private Date date;
    private Boolean expand;
    private Double fillAlpha;
    private Color fillColor;
    private Double fontSize;
    private String id;
    private Boolean inside;
    private String label;
    private Double labelRotation;
    private Double lineAlpha;
    private Color lineColor;
    private Double lineThickness;
    private String position;
    private Double tickLength;
    private Double toAngle;
    private String toCategory;
    private Date toDate;
    private Double toValue;
    private Double value;
    private ValueAxis valueAxis;

    /**
     * @param above If you set it to true, the guide will be displayed above the graphs.
     * @return Guide
     */
    public Guide setAbove(boolean above) {
        this.above = above;
        return this;
    }

    public Boolean getAbove() {
        return above;
    }

    /**
     * @param angle Radar chart only. Specifies angle at which guide should start. Affects only fills,
     *              not lines.
     * @return Guide
     */
    public Guide setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    public Double getAngle() {
        return angle;
    }

    /**
     * @param balloonColor Baloon fill color.
     * @return Guide
     */
    public Guide setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
        return this;
    }

    public Color getBalloonColor() {
        return balloonColor;
    }

    /**
     * @param balloonText The text which will be displayed if the user rolls-over the guide.
     * @return Guide
     */
    public Guide setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * @param boldLabel Specifies if label should be bold or not.
     * @return Guide
     */
    public Guide setBoldLabel(boolean boldLabel) {
        this.boldLabel = boldLabel;
        return this;
    }

    public Boolean getBoldLabel() {
        return boldLabel;
    }

    /**
     * @param category Category of the guide (in case the guide is for category axis).
     * @return Guide
     */
    public Guide setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getCategory() {
        return category;
    }

    /**
     * @param color Color of a guide label.
     * @return Guide
     */
    public Guide setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param dashLength Dash length.
     * @return Guide
     */
    public Guide setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    public Double getDashLength() {
        return dashLength;
    }

    /**
     * @param date Date of the guide (in case the guide is for category axis and parseDates is set to
     *             true).
     * @return Guide
     */
    public Guide setDate(Date date) {
        this.date = date;
        return this;
    }

    public Date getDate() {
        return date;
    }

    /**
     * @param expand Works if a guide is added to CategoryAxis and this axis is non-date-based. If you
     *               set it to true, the guide will start (or be placed, if it's not a fill) on the beginning
     *               of the category cell and will end at the end of toCategory cell.
     * @return Guide
     */
    public Guide setExpand(boolean expand) {
        this.expand = expand;
        return this;
    }

    public Boolean getExpand() {
        return expand;
    }

    /**
     * @param fillAlpha Fill opacity. Value range is 0 - 1.
     * @return Guide
     */
    public Guide setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
        return this;
    }

    public Double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * @param fillColor Fill color.
     * @return Guide
     */
    public Guide setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public Color getFillColor() {
        return fillColor;
    }

    /**
     * @param fontSize Font size of guide label.
     * @return Guide
     */
    public Guide setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * @param id Unique id of a Guide. You don't need to set it, unless you want to.
     * @return Guide
     */
    public Guide setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * @param inside Specifies whether label should be placed inside or outside plot area.
     * @return Guide
     */
    public Guide setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    public Boolean getInside() {
        return inside;
    }

    /**
     * @param label The label which will be displayed near the guide.
     * @return Guide
     */
    public Guide setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return label;
    }

    /**
     * @param labelRotation Rotation angle of a guide label.
     * @return Guide
     */
    public Guide setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
        return this;
    }

    public Double getLabelRotation() {
        return labelRotation;
    }

    /**
     * @param lineAlpha Line opacity.
     * @return Guide
     */
    public Guide setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
        return this;
    }

    public Double getLineAlpha() {
        return lineAlpha;
    }

    /**
     * @param lineColor Line color.
     * @return Guide
     */
    public Guide setLineColor(Color lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Color getLineColor() {
        return lineColor;
    }

    /**
     * @param lineThickness Line thickness.
     * @return Guide
     */
    public Guide setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
        return this;
    }

    public Double getLineThickness() {
        return lineThickness;
    }

    /**
     * @param position Position of guide label. Possible values are "left" or "right" for horizontal axis
     *                 and "top" or "bottom" for vertical axis.
     * @return Guide
     */
    public Guide setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getPosition() {
        return position;
    }

    /**
     * @param tickLength Tick length.
     * @return Guide
     */
    public Guide setTickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public Double getTickLength() {
        return tickLength;
    }

    /**
     * @param toAngle Radar chart only. Specifies angle at which guide should end. Affects only fills,
     *                not lines.
     * @return Guide
     */
    public Guide setToAngle(double toAngle) {
        this.toAngle = toAngle;
        return this;
    }

    public Double getToAngle() {
        return toAngle;
    }

    /**
     * @param toCategory "To" category of the guide (in case the guide is for category axis).
     * @return Guide
     */
    public Guide setToCategory(String toCategory) {
        this.toCategory = toCategory;
        return this;
    }

    public String getToCategory() {
        return toCategory;
    }

    /**
     * @param toDate "To" date of the guide (in case the guide is for category axis and parseDates is
     *               set to true) If you have both date and toDate, the space between these two dates
     *               can be filled with color.
     * @return Guide
     */
    public Guide setToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    public Date getToDate() {
        return toDate;
    }

    /**
     * @param toValue "To" value of the guide (in case the guide is for value axis).
     * @return Guide
     */
    public Guide setToValue(double toValue) {
        this.toValue = toValue;
        return this;
    }

    public Double getToValue() {
        return toValue;
    }

    /**
     * @param value Value of the guide (in case the guide is for value axis).
     * @return Guide
     */
    public Guide setValue(double value) {
        this.value = value;
        return this;
    }

    public Double getValue() {
        return value;
    }

    /**
     * @param valueAxis Value axis of a guide. As you can add guides directly to the chart, you might need
     *                  to specify which which value axis should be used.
     * @return Guide
     */
    public Guide setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    public ValueAxis getValueAxis() {
        return valueAxis;
    }

}