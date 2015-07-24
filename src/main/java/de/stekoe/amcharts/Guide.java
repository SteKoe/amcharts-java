package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.Date;

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
     * If you set it to true, the guide will be displayed above the graphs.
     */
    public Guide setAbove(boolean above) {
        this.above = above;
        return this;
    }

    public Boolean getAbove() {
        return above;
    }

    /**
     * Radar chart only. Specifies angle at which guide should start. Affects only fills,
     * not lines.
     */
    public Guide setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    public Double getAngle() {
        return angle;
    }

    /**
     * Baloon fill color.
     */
    public Guide setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
        return this;
    }

    public Color getBalloonColor() {
        return balloonColor;
    }

    /**
     * The text which will be displayed if the user rolls-over the guide.
     */
    public Guide setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Specifies if label should be bold or not.
     */
    public Guide setBoldLabel(boolean boldLabel) {
        this.boldLabel = boldLabel;
        return this;
    }

    public Boolean getBoldLabel() {
        return boldLabel;
    }

    /**
     * Category of the guide (in case the guide is for category axis).
     */
    public Guide setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getCategory() {
        return category;
    }

    /**
     * Color of a guide label.
     */
    public Guide setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Dash length.
     */
    public Guide setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    public Double getDashLength() {
        return dashLength;
    }

    /**
     * Date of the guide (in case the guide is for category axis and parseDates is set to
     * true).
     */
    public Guide setDate(Date date) {
        this.date = date;
        return this;
    }

    public Date getDate() {
        return date;
    }

    /**
     * Works if a guide is added to CategoryAxis and this axis is non-date-based. If you
     * set it to true, the guide will start (or be placed, if it's not a fill) on the beginning
     * of the category cell and will end at the end of toCategory cell.
     */
    public Guide setExpand(boolean expand) {
        this.expand = expand;
        return this;
    }

    public Boolean getExpand() {
        return expand;
    }

    /**
     * Fill opacity. Value range is 0 - 1.
     */
    public Guide setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
        return this;
    }

    public Double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * Fill color.
     */
    public Guide setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public Color getFillColor() {
        return fillColor;
    }

    /**
     * Font size of guide label.
     */
    public Guide setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Unique id of a Guide. You don't need to set it, unless you want to.
     */
    public Guide setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * Specifies whether label should be placed inside or outside plot area.
     */
    public Guide setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    public Boolean getInside() {
        return inside;
    }

    /**
     * The label which will be displayed near the guide.
     */
    public Guide setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return label;
    }

    /**
     * Rotation angle of a guide label.
     */
    public Guide setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
        return this;
    }

    public Double getLabelRotation() {
        return labelRotation;
    }

    /**
     * Line opacity.
     */
    public Guide setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
        return this;
    }

    public Double getLineAlpha() {
        return lineAlpha;
    }

    /**
     * Line color.
     */
    public Guide setLineColor(Color lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Color getLineColor() {
        return lineColor;
    }

    /**
     * Line thickness.
     */
    public Guide setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
        return this;
    }

    public Double getLineThickness() {
        return lineThickness;
    }

    /**
     * Position of guide label. Possible values are "left" or "right" for horizontal axis
     * and "top" or "bottom" for vertical axis.
     */
    public Guide setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getPosition() {
        return position;
    }

    /**
     * Tick length.
     */
    public Guide setTickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public Double getTickLength() {
        return tickLength;
    }

    /**
     * Radar chart only. Specifies angle at which guide should end. Affects only fills,
     * not lines.
     */
    public Guide setToAngle(double toAngle) {
        this.toAngle = toAngle;
        return this;
    }

    public Double getToAngle() {
        return toAngle;
    }

    /**
     * "To" category of the guide (in case the guide is for category axis).
     */
    public Guide setToCategory(String toCategory) {
        this.toCategory = toCategory;
        return this;
    }

    public String getToCategory() {
        return toCategory;
    }

    /**
     * "To" date of the guide (in case the guide is for category axis and parseDates is
     * set to true) If you have both date and toDate, the space between these two dates
     * can be filled with color.
     */
    public Guide setToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    public Date getToDate() {
        return toDate;
    }

    /**
     * "To" value of the guide (in case the guide is for value axis).
     */
    public Guide setToValue(double toValue) {
        this.toValue = toValue;
        return this;
    }

    public Double getToValue() {
        return toValue;
    }

    /**
     * Value of the guide (in case the guide is for value axis).
     */
    public Guide setValue(double value) {
        this.value = value;
        return this;
    }

    public Double getValue() {
        return value;
    }

    /**
     * Value axis of a guide. As you can add guides directly to the chart, you might need
     * to specify which which value axis should be used.
     */
    public Guide setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    public ValueAxis getValueAxis() {
        return valueAxis;
    }

}