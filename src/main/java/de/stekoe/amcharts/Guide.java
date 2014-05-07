package de.stekoe.amcharts;

import java.io.Serializable;
import java.util.Date;

import de.stekoe.amcharts.addition.Color;

public class Guide implements Serializable {
    private Boolean above;
    private Double angle;
    private Color balloonColor;
    private String balloonText;
    private String category;
    private Double dashLength;
    private Date date;
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
     **/
    public Boolean getAbove() {
        return above;
    }
    public Guide setAbove(boolean above) {
        this.above = above;
        return this;
    }

    /**
     * Radar chart only. Specifies angle at which guide should start. Affects only fills,
     * not lines.
     **/
    public Double getAngle() {
        return angle;
    }
    public Guide setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    /**
     * Baloon fill color.
     **/
    public Color getBalloonColor() {
        return balloonColor;
    }
    public Guide setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
        return this;
    }

    /**
     * The text which will be displayed if the user rolls-over the guide.
     **/
    public String getBalloonText() {
        return balloonText;
    }
    public Guide setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    /**
     * Category of the guide (in case the guide is for category axis).
     **/
    public String getCategory() {
        return category;
    }
    public Guide setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Dash length.
     **/
    public Double getDashLength() {
        return dashLength;
    }
    public Guide setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    /**
     * Date of the guide (in case the guide is for category axis and parseDates is set to
     * true).
     **/
    public Date getDate() {
        return date;
    }
    public Guide setDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * Fill opacity. Value range is 0 - 1.
     **/
    public Double getFillAlpha() {
        return fillAlpha;
    }
    public Guide setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
        return this;
    }

    /**
     * Fill color.
     **/
    public Color getFillColor() {
        return fillColor;
    }
    public Guide setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    /**
     * Font size of guide label.
     **/
    public Double getFontSize() {
        return fontSize;
    }
    public Guide setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * Unique id of a Guide. You don't need to set it, unless you want to.
     **/
    public String getId() {
        return id;
    }
    public Guide setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Specifies whether label should be placed inside or outside plot area.
     **/
    public Boolean getInside() {
        return inside;
    }
    public Guide setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    /**
     * The label which will be displayed near the guide.
     **/
    public String getLabel() {
        return label;
    }
    public Guide setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Rotation angle of a guide label.
     **/
    public Double getLabelRotation() {
        return labelRotation;
    }
    public Guide setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
        return this;
    }

    /**
     * Line opacity.
     **/
    public Double getLineAlpha() {
        return lineAlpha;
    }
    public Guide setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
        return this;
    }

    /**
     * Line color.
     **/
    public Color getLineColor() {
        return lineColor;
    }
    public Guide setLineColor(Color lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    /**
     * Line thickness.
     **/
    public Double getLineThickness() {
        return lineThickness;
    }
    public Guide setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
        return this;
    }

    /**
     * Position of guide label. Possible values are "left" or "right" for horizontal axis
     * and "top" or "bottom" for vertical axis.
     **/
    public String getPosition() {
        return position;
    }
    public Guide setPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * Tick length.
     **/
    public Double getTickLength() {
        return tickLength;
    }
    public Guide setTickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    /**
     * Radar chart only. Specifies angle at which guide should end. Affects only fills,
     * not lines.
     **/
    public Double getToAngle() {
        return toAngle;
    }
    public Guide setToAngle(double toAngle) {
        this.toAngle = toAngle;
        return this;
    }

    /**
     * "To" category of the guide (in case the guide is for category axis).
     **/
    public String getToCategory() {
        return toCategory;
    }
    public Guide setToCategory(String toCategory) {
        this.toCategory = toCategory;
        return this;
    }

    /**
     * "To" date of the guide (in case the guide is for category axis and parseDates is
     * set to true) If you have both date and toDate, the space between these two dates
     * can be filled with color.
     **/
    public Date getToDate() {
        return toDate;
    }
    public Guide setToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * "To" value of the guide (in case the guide is for value axis).
     **/
    public Double getToValue() {
        return toValue;
    }
    public Guide setToValue(double toValue) {
        this.toValue = toValue;
        return this;
    }

    /**
     * Value of the guide (in case the guide is for value axis).
     **/
    public Double getValue() {
        return value;
    }
    public Guide setValue(double value) {
        this.value = value;
        return this;
    }

    /**
     * Value axis of a guide. As you can add guides directly to the chart, you might need
     * to specify which which value axis should be used.
     **/
    public ValueAxis getValueAxis() {
        return valueAxis;
    }
    public Guide setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }


}