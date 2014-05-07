package de.stekoe.amcharts;

import java.io.Serializable;
import java.util.List;

import de.stekoe.amcharts.addition.Color;

public class GaugeAxis implements Serializable {
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
    public Double getAxisAlpha() {
        return axisAlpha;
    }
    public GaugeAxis setAxisAlpha(double axisAlpha) {
        this.axisAlpha = axisAlpha;
        return this;
    }

    /**
     * Axis color.
     **/
    public Color getAxisColor() {
        return axisColor;
    }
    public GaugeAxis setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
        return this;
    }

    /**
     * Thickness of the axis outline.
     **/
    public Double getAxisThickness() {
        return axisThickness;
    }
    public GaugeAxis setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
        return this;
    }

    /**
     * Opacity of band fills.
     **/
    public Double getBandAlpha() {
        return bandAlpha;
    }
    public GaugeAxis setBandAlpha(double bandAlpha) {
        this.bandAlpha = bandAlpha;
        return this;
    }

    /**
     * Opacity of band outlines.
     **/
    public Double getBandOutlineAlpha() {
        return bandOutlineAlpha;
    }
    public GaugeAxis setBandOutlineAlpha(double bandOutlineAlpha) {
        this.bandOutlineAlpha = bandOutlineAlpha;
        return this;
    }

    /**
     * Color of band outlines.
     **/
    public Color getBandOutlineColor() {
        return bandOutlineColor;
    }
    public GaugeAxis setBandOutlineColor(Color bandOutlineColor) {
        this.bandOutlineColor = bandOutlineColor;
        return this;
    }

    /**
     * Thickness of band outlines.
     **/
    public Double getBandOutlineThickness() {
        return bandOutlineThickness;
    }
    public GaugeAxis setBandOutlineThickness(double bandOutlineThickness) {
        this.bandOutlineThickness = bandOutlineThickness;
        return this;
    }

    /**
     * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified
     * values.
     **/
    public List<GaugeBand> getBands() {
        return bands;
    }
    public GaugeAxis setBands(List<GaugeBand> bands) {
        this.bands = bands;
        return this;
    }

    /**
     * Text displayed below the axis center.
     **/
    public String getBottomText() {
        return bottomText;
    }
    public GaugeAxis setBottomText(String bottomText) {
        this.bottomText = bottomText;
        return this;
    }

    /**
     * Specifies if text should be bold.
     **/
    public Boolean getBottomTextBold() {
        return bottomTextBold;
    }
    public GaugeAxis setBottomTextBold(boolean bottomTextBold) {
        this.bottomTextBold = bottomTextBold;
        return this;
    }

    /**
     * Bottom text color.
     **/
    public Color getBottomTextColor() {
        return bottomTextColor;
    }
    public GaugeAxis setBottomTextColor(Color bottomTextColor) {
        this.bottomTextColor = bottomTextColor;
        return this;
    }

    /**
     * Font size of bottom text.
     **/
    public Double getBottomTextFontSize() {
        return bottomTextFontSize;
    }
    public GaugeAxis setBottomTextFontSize(double bottomTextFontSize) {
        this.bottomTextFontSize = bottomTextFontSize;
        return this;
    }

    /**
     * Y offset of bottom text.
     **/
    public Double getBottomTextYOffset() {
        return bottomTextYOffset;
    }
    public GaugeAxis setBottomTextYOffset(double bottomTextYOffset) {
        this.bottomTextYOffset = bottomTextYOffset;
        return this;
    }

    /**
     * X position of the axis, relative to the center of the gauge.
     **/
    public String getCenterX() {
        return centerX;
    }
    public GaugeAxis setCenterX(String centerX) {
        this.centerX = centerX;
        return this;
    }

    /**
     * Y position of the axis, relative to the center of the gauge.
     **/
    public String getCenterY() {
        return centerY;
    }
    public GaugeAxis setCenterY(String centerY) {
        this.centerY = centerY;
        return this;
    }

    /**
     * Axis end angle. Valid values are from - 180 to 180.
     **/
    public Double getEndAngle() {
        return endAngle;
    }
    public GaugeAxis setEndAngle(double endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    /**
     * Axis end (max) value
     **/
    public Double getEndValue() {
        return endValue;
    }
    public GaugeAxis setEndValue(double endValue) {
        this.endValue = endValue;
        return this;
    }

    /**
     * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check
     * your values and choose a proper gridCount which would result grids at round numbers.
     **/
    public Double getGridCount() {
        return gridCount;
    }
    public GaugeAxis setGridCount(double gridCount) {
        this.gridCount = gridCount;
        return this;
    }

    /**
     * Specifies if grid should be drawn inside or outside the axis.
     **/
    public Boolean getGridInside() {
        return gridInside;
    }
    public GaugeAxis setGridInside(boolean gridInside) {
        this.gridInside = gridInside;
        return this;
    }

    /**
     * Unique id of an axis.
     **/
    public String getId() {
        return id;
    }
    public GaugeAxis setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Specifies if labels should be placed inside or outside the axis.
     **/
    public Boolean getInside() {
        return inside;
    }
    public GaugeAxis setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    /**
     * Frequency of labels.
     **/
    public Double getLabelFrequency() {
        return labelFrequency;
    }
    public GaugeAxis setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
        return this;
    }

    /**
     * Distance from axis to the labels.
     **/
    public Double getLabelOffset() {
        return labelOffset;
    }
    public GaugeAxis setLabelOffset(double labelOffset) {
        this.labelOffset = labelOffset;
        return this;
    }

    /**
     * Interval, at which minor ticks should be placed.
     **/
    public Double getMinorTickInterval() {
        return minorTickInterval;
    }
    public GaugeAxis setMinorTickInterval(double minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
        return this;
    }

    /**
     * Length of a minor tick.
     **/
    public Double getMinorTickLength() {
        return minorTickLength;
    }
    public GaugeAxis setMinorTickLength(double minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    /**
     * Axis radius.
     **/
    public String getRadius() {
        return radius;
    }
    public GaugeAxis setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    /**
     * Specifies if the first label should be shown.
     **/
    public Boolean getShowFirstLabel() {
        return showFirstLabel;
    }
    public GaugeAxis setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    /**
     * Specifies if the last label should be shown.
     **/
    public Boolean getShowLastLabel() {
        return showLastLabel;
    }
    public GaugeAxis setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    /**
     * Axis start angle. Valid values are from - 180 to 180.
     **/
    public Double getStartAngle() {
        return startAngle;
    }
    public GaugeAxis setStartAngle(double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    /**
     * Axis start (min) value.
     **/
    public Double getStartValue() {
        return startValue;
    }
    public GaugeAxis setStartValue(double startValue) {
        this.startValue = startValue;
        return this;
    }

    /**
     * Opacity of axis ticks.
     **/
    public Double getTickAlpha() {
        return tickAlpha;
    }
    public GaugeAxis setTickAlpha(double tickAlpha) {
        this.tickAlpha = tickAlpha;
        return this;
    }

    /**
     * Color of axis ticks.
     **/
    public Color getTickColor() {
        return tickColor;
    }
    public GaugeAxis setTickColor(Color tickColor) {
        this.tickColor = tickColor;
        return this;
    }

    /**
     * Length of a major tick.
     **/
    public Double getTickLength() {
        return tickLength;
    }
    public GaugeAxis setTickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    /**
     * Tick thickness.
     **/
    public Double getTickThickness() {
        return tickThickness;
    }
    public GaugeAxis setTickThickness(double tickThickness) {
        this.tickThickness = tickThickness;
        return this;
    }

    /**
     * Text displayed above the axis center.
     **/
    public String getTopText() {
        return topText;
    }
    public GaugeAxis setTopText(String topText) {
        this.topText = topText;
        return this;
    }

    /**
     * Specifies if text should be bold.
     **/
    public Boolean getTopTextBold() {
        return topTextBold;
    }
    public GaugeAxis setTopTextBold(boolean topTextBold) {
        this.topTextBold = topTextBold;
        return this;
    }

    /**
     * Color of top text.
     **/
    public Color getTopTextColor() {
        return topTextColor;
    }
    public GaugeAxis setTopTextColor(Color topTextColor) {
        this.topTextColor = topTextColor;
        return this;
    }

    /**
     * Font size of top text.
     **/
    public Double getTopTextFontSize() {
        return topTextFontSize;
    }
    public GaugeAxis setTopTextFontSize(double topTextFontSize) {
        this.topTextFontSize = topTextFontSize;
        return this;
    }

    /**
     * Y offset of top text.
     **/
    public Double getTopTextYOffset() {
        return topTextYOffset;
    }
    public GaugeAxis setTopTextYOffset(double topTextYOffset) {
        this.topTextYOffset = topTextYOffset;
        return this;
    }

    /**
     * A string which can be placed next to axis labels.
     **/
    public String getUnit() {
        return unit;
    }
    public GaugeAxis setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Position of the unit.
     **/
    public String getUnitPosition() {
        return unitPosition;
    }
    public GaugeAxis setUnitPosition(String unitPosition) {
        this.unitPosition = unitPosition;
        return this;
    }

    /**
     * Interval, at which ticks with values should be placed.
     **/
    public Double getValueInterval() {
        return valueInterval;
    }
    public GaugeAxis setValueInterval(double valueInterval) {
        this.valueInterval = valueInterval;
        return this;
    }


}