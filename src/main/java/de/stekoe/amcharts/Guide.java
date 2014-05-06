package de.stekoe.amcharts;

import java.util.Date;
public class Guide {
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
    public void setAbove(boolean above) {
        this.above = above;
    }
    public boolean isAbove() {
        return above;
    }

    /**
     * Radar chart only. Specifies angle at which guide should start. Affects only fills,
     * not lines.
     **/
    public void setAngle(double angle) {
        this.angle = angle;
    }
    public Double getAngle() {
        return angle;
    }

    /**
     * Baloon fill color.
     **/
    public void setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
    }
    public Color getBalloonColor() {
        return balloonColor;
    }

    /**
     * The text which will be displayed if the user rolls-over the guide.
     **/
    public void setBalloonText(String balloonText) {
        this.balloonText = balloonText;
    }
    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Category of the guide (in case the guide is for category axis).
     **/
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

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
     * Date of the guide (in case the guide is for category axis and parseDates is set to
     * true).
     **/
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    /**
     * Fill opacity. Value range is 0 - 1.
     **/
    public void setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
    }
    public Double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * Fill color.
     **/
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
    public Color getFillColor() {
        return fillColor;
    }

    /**
     * Font size of guide label.
     **/
    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }
    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Unique id of a Guide. You don't need to set it, unless you want to.
     **/
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    /**
     * Specifies whether label should be placed inside or outside plot area.
     **/
    public void setInside(boolean inside) {
        this.inside = inside;
    }
    public boolean isInside() {
        return inside;
    }

    /**
     * The label which will be displayed near the guide.
     **/
    public void setLabel(String label) {
        this.label = label;
    }
    public String getLabel() {
        return label;
    }

    /**
     * Rotation angle of a guide label.
     **/
    public void setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
    }
    public Double getLabelRotation() {
        return labelRotation;
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
     * Position of guide label. Possible values are "left" or "right" for horizontal axis
     * and "top" or "bottom" for vertical axis.
     **/
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }

    /**
     * Tick length.
     **/
    public void setTickLength(double tickLength) {
        this.tickLength = tickLength;
    }
    public Double getTickLength() {
        return tickLength;
    }

    /**
     * Radar chart only. Specifies angle at which guide should end. Affects only fills,
     * not lines.
     **/
    public void setToAngle(double toAngle) {
        this.toAngle = toAngle;
    }
    public Double getToAngle() {
        return toAngle;
    }

    /**
     * "To" category of the guide (in case the guide is for category axis).
     **/
    public void setToCategory(String toCategory) {
        this.toCategory = toCategory;
    }
    public String getToCategory() {
        return toCategory;
    }

    /**
     * "To" date of the guide (in case the guide is for category axis and parseDates is
     * set to true) If you have both date and toDate, the space between these two dates
     * can be filled with color.
     **/
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    public Date getToDate() {
        return toDate;
    }

    /**
     * "To" value of the guide (in case the guide is for value axis).
     **/
    public void setToValue(double toValue) {
        this.toValue = toValue;
    }
    public Double getToValue() {
        return toValue;
    }

    /**
     * Value of the guide (in case the guide is for value axis).
     **/
    public void setValue(double value) {
        this.value = value;
    }
    public Double getValue() {
        return value;
    }

    /**
     * Value axis of a guide. As you can add guides directly to the chart, you might need
     * to specify which which value axis should be used.
     **/
    public void setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
    }
    public ValueAxis getValueAxis() {
        return valueAxis;
    }

}