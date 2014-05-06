package de.stekoe.amcharts;

import java.util.List;
public class GaugeAxis {
    private Double axisAlpha;
    private Color axisColor;
    private Double axisThickness;
    private Double bandAlpha;
    private Double bandOutlineAlpha;
    private Color bandOutlineColor;
    private Double bandOutlineThickness;
    private List<GaugeBand> bands;
    private String bottomText;
    private Boolean bottomTextBold;
    private Color bottomTextColor;
    private Double bottomTextFontSize;
    private Double bottomTextYOffset;
    private String centerX;
    private String centerY;
    private Double endAngle;
    private Double endValue;
    private Double gridCount;
    private Boolean gridInside;
    private String id;
    private Boolean inside;
    private Double labelFrequency;
    private Double labelOffset;
    private Double minorTickInterval;
    private Double minorTickLength;
    private String radius;
    private Boolean showFirstLabel;
    private Boolean showLastLabel;
    private Double startAngle;
    private Double startValue;
    private Double tickAlpha;
    private Color tickColor;
    private Double tickLength;
    private Double tickThickness;
    private String topText;
    private Boolean topTextBold;
    private Color topTextColor;
    private Double topTextFontSize;
    private Double topTextYOffset;
    private String unit;
    private String unitPosition;
    private Double valueInterval;

    /**
     * Axis opacity.
     **/
    public void setAxisAlpha(double axisAlpha) {
        this.axisAlpha = axisAlpha;
    }
    public Double getAxisAlpha() {
        return axisAlpha;
    }

    /**
     * Axis color.
     **/
    public void setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
    }
    public Color getAxisColor() {
        return axisColor;
    }

    /**
     * Thickness of the axis outline.
     **/
    public void setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
    }
    public Double getAxisThickness() {
        return axisThickness;
    }

    /**
     * Opacity of band fills.
     **/
    public void setBandAlpha(double bandAlpha) {
        this.bandAlpha = bandAlpha;
    }
    public Double getBandAlpha() {
        return bandAlpha;
    }

    /**
     * Opacity of band outlines.
     **/
    public void setBandOutlineAlpha(double bandOutlineAlpha) {
        this.bandOutlineAlpha = bandOutlineAlpha;
    }
    public Double getBandOutlineAlpha() {
        return bandOutlineAlpha;
    }

    /**
     * Color of band outlines.
     **/
    public void setBandOutlineColor(Color bandOutlineColor) {
        this.bandOutlineColor = bandOutlineColor;
    }
    public Color getBandOutlineColor() {
        return bandOutlineColor;
    }

    /**
     * Thickness of band outlines.
     **/
    public void setBandOutlineThickness(double bandOutlineThickness) {
        this.bandOutlineThickness = bandOutlineThickness;
    }
    public Double getBandOutlineThickness() {
        return bandOutlineThickness;
    }

    /**
     * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified
     * values.
     **/
    public void setBands(List<GaugeBand> bands) {
        this.bands = bands;
    }
    public List<GaugeBand> getBands() {
        return bands;
    }

    /**
     * Text displayed below the axis center.
     **/
    public void setBottomText(String bottomText) {
        this.bottomText = bottomText;
    }
    public String getBottomText() {
        return bottomText;
    }

    /**
     * Specifies if text should be bold.
     **/
    public void setBottomTextBold(boolean bottomTextBold) {
        this.bottomTextBold = bottomTextBold;
    }
    public boolean isBottomTextBold() {
        return bottomTextBold;
    }

    /**
     * Bottom text color.
     **/
    public void setBottomTextColor(Color bottomTextColor) {
        this.bottomTextColor = bottomTextColor;
    }
    public Color getBottomTextColor() {
        return bottomTextColor;
    }

    /**
     * Font size of bottom text.
     **/
    public void setBottomTextFontSize(double bottomTextFontSize) {
        this.bottomTextFontSize = bottomTextFontSize;
    }
    public Double getBottomTextFontSize() {
        return bottomTextFontSize;
    }

    /**
     * Y offset of bottom text.
     **/
    public void setBottomTextYOffset(double bottomTextYOffset) {
        this.bottomTextYOffset = bottomTextYOffset;
    }
    public Double getBottomTextYOffset() {
        return bottomTextYOffset;
    }

    /**
     * X position of the axis, relative to the center of the gauge.
     **/
    public void setCenterX(String centerX) {
        this.centerX = centerX;
    }
    public String getCenterX() {
        return centerX;
    }

    /**
     * Y position of the axis, relative to the center of the gauge.
     **/
    public void setCenterY(String centerY) {
        this.centerY = centerY;
    }
    public String getCenterY() {
        return centerY;
    }

    /**
     * Axis end angle. Valid values are from - 180 to 180.
     **/
    public void setEndAngle(double endAngle) {
        this.endAngle = endAngle;
    }
    public Double getEndAngle() {
        return endAngle;
    }

    /**
     * Axis end (max) value
     **/
    public void setEndValue(double endValue) {
        this.endValue = endValue;
    }
    public Double getEndValue() {
        return endValue;
    }

    /**
     * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check
     * your values and choose a proper gridCount which would result grids at round numbers.
     **/
    public void setGridCount(double gridCount) {
        this.gridCount = gridCount;
    }
    public Double getGridCount() {
        return gridCount;
    }

    /**
     * Specifies if grid should be drawn inside or outside the axis.
     **/
    public void setGridInside(boolean gridInside) {
        this.gridInside = gridInside;
    }
    public boolean isGridInside() {
        return gridInside;
    }

    /**
     * Unique id of an axis.
     **/
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    /**
     * Specifies if labels should be placed inside or outside the axis.
     **/
    public void setInside(boolean inside) {
        this.inside = inside;
    }
    public boolean isInside() {
        return inside;
    }

    /**
     * Frequency of labels.
     **/
    public void setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
    }
    public Double getLabelFrequency() {
        return labelFrequency;
    }

    /**
     * Distance from axis to the labels.
     **/
    public void setLabelOffset(double labelOffset) {
        this.labelOffset = labelOffset;
    }
    public Double getLabelOffset() {
        return labelOffset;
    }

    /**
     * Interval, at which minor ticks should be placed.
     **/
    public void setMinorTickInterval(double minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
    }
    public Double getMinorTickInterval() {
        return minorTickInterval;
    }

    /**
     * Length of a minor tick.
     **/
    public void setMinorTickLength(double minorTickLength) {
        this.minorTickLength = minorTickLength;
    }
    public Double getMinorTickLength() {
        return minorTickLength;
    }

    /**
     * Axis radius.
     **/
    public void setRadius(String radius) {
        this.radius = radius;
    }
    public String getRadius() {
        return radius;
    }

    /**
     * Specifies if the first label should be shown.
     **/
    public void setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
    }
    public boolean isShowFirstLabel() {
        return showFirstLabel;
    }

    /**
     * Specifies if the last label should be shown.
     **/
    public void setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
    }
    public boolean isShowLastLabel() {
        return showLastLabel;
    }

    /**
     * Axis start angle. Valid values are from - 180 to 180.
     **/
    public void setStartAngle(double startAngle) {
        this.startAngle = startAngle;
    }
    public Double getStartAngle() {
        return startAngle;
    }

    /**
     * Axis start (min) value.
     **/
    public void setStartValue(double startValue) {
        this.startValue = startValue;
    }
    public Double getStartValue() {
        return startValue;
    }

    /**
     * Opacity of axis ticks.
     **/
    public void setTickAlpha(double tickAlpha) {
        this.tickAlpha = tickAlpha;
    }
    public Double getTickAlpha() {
        return tickAlpha;
    }

    /**
     * Color of axis ticks.
     **/
    public void setTickColor(Color tickColor) {
        this.tickColor = tickColor;
    }
    public Color getTickColor() {
        return tickColor;
    }

    /**
     * Length of a major tick.
     **/
    public void setTickLength(double tickLength) {
        this.tickLength = tickLength;
    }
    public Double getTickLength() {
        return tickLength;
    }

    /**
     * Tick thickness.
     **/
    public void setTickThickness(double tickThickness) {
        this.tickThickness = tickThickness;
    }
    public Double getTickThickness() {
        return tickThickness;
    }

    /**
     * Text displayed above the axis center.
     **/
    public void setTopText(String topText) {
        this.topText = topText;
    }
    public String getTopText() {
        return topText;
    }

    /**
     * Specifies if text should be bold.
     **/
    public void setTopTextBold(boolean topTextBold) {
        this.topTextBold = topTextBold;
    }
    public boolean isTopTextBold() {
        return topTextBold;
    }

    /**
     * Color of top text.
     **/
    public void setTopTextColor(Color topTextColor) {
        this.topTextColor = topTextColor;
    }
    public Color getTopTextColor() {
        return topTextColor;
    }

    /**
     * Font size of top text.
     **/
    public void setTopTextFontSize(double topTextFontSize) {
        this.topTextFontSize = topTextFontSize;
    }
    public Double getTopTextFontSize() {
        return topTextFontSize;
    }

    /**
     * Y offset of top text.
     **/
    public void setTopTextYOffset(double topTextYOffset) {
        this.topTextYOffset = topTextYOffset;
    }
    public Double getTopTextYOffset() {
        return topTextYOffset;
    }

    /**
     * A string which can be placed next to axis labels.
     **/
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getUnit() {
        return unit;
    }

    /**
     * Position of the unit.
     **/
    public void setUnitPosition(String unitPosition) {
        this.unitPosition = unitPosition;
    }
    public String getUnitPosition() {
        return unitPosition;
    }

    /**
     * Interval, at which ticks with values should be placed.
     **/
    public void setValueInterval(double valueInterval) {
        this.valueInterval = valueInterval;
    }
    public Double getValueInterval() {
        return valueInterval;
    }

}