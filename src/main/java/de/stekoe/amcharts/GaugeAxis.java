package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.addition.Listener;

import java.io.Serializable;
import java.util.List;

public class GaugeAxis implements Serializable {
    private Double axisAlpha;
    private Color axisColor;
    private Double axisThickness;
    private Double bandAlpha;
    private List<Number> bandGradientRatio;
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
    private Color color;
    private Double endAngle;
    private Double endValue;
    private Double fontSize;
    private Double gridCount;
    private Boolean gridInside;
    private String id;
    private Boolean inside;
    private Double labelFrequency;
    private Double labelOffset;
    private Boolean labelsEnabled;
    private List<Listener> listeners;
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
    private Boolean usePrefixes;
    private Double valueInterval;

    /**
     * Axis opacity.
     **/
    public GaugeAxis setAxisAlpha(double axisAlpha) {
        this.axisAlpha = axisAlpha;
        return this;
    }

    public Double getAxisAlpha() {
        return axisAlpha;
    }

    /**
     * Axis color.
     **/
    public GaugeAxis setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
        return this;
    }

    public Color getAxisColor() {
        return axisColor;
    }

    /**
     * Thickness of the axis outline.
     **/
    public GaugeAxis setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
        return this;
    }

    public Double getAxisThickness() {
        return axisThickness;
    }

    /**
     * Opacity of band fills.
     **/
    public GaugeAxis setBandAlpha(double bandAlpha) {
        this.bandAlpha = bandAlpha;
        return this;
    }

    public Double getBandAlpha() {
        return bandAlpha;
    }

    /**
     * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients. Negative
     * value means the color will be darker than the original, and positive number means
     * the color will be lighter.
     **/
    public GaugeAxis setBandGradientRatio(List<Number> bandGradientRatio) {
        this.bandGradientRatio = bandGradientRatio;
        return this;
    }

    public List<Number> getBandGradientRatio() {
        return bandGradientRatio;
    }

    /**
     * Opacity of band outlines.
     **/
    public GaugeAxis setBandOutlineAlpha(double bandOutlineAlpha) {
        this.bandOutlineAlpha = bandOutlineAlpha;
        return this;
    }

    public Double getBandOutlineAlpha() {
        return bandOutlineAlpha;
    }

    /**
     * Color of band outlines.
     **/
    public GaugeAxis setBandOutlineColor(Color bandOutlineColor) {
        this.bandOutlineColor = bandOutlineColor;
        return this;
    }

    public Color getBandOutlineColor() {
        return bandOutlineColor;
    }

    /**
     * Thickness of band outlines.
     **/
    public GaugeAxis setBandOutlineThickness(double bandOutlineThickness) {
        this.bandOutlineThickness = bandOutlineThickness;
        return this;
    }

    public Double getBandOutlineThickness() {
        return bandOutlineThickness;
    }

    /**
     * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified
     * values.
     **/
    public GaugeAxis setBands(List<GaugeBand> bands) {
        this.bands = bands;
        return this;
    }

    public List<GaugeBand> getBands() {
        return bands;
    }

    /**
     * Text displayed below the axis center.
     **/
    public GaugeAxis setBottomText(String bottomText) {
        this.bottomText = bottomText;
        return this;
    }

    public String getBottomText() {
        return bottomText;
    }

    /**
     * Specifies if text should be bold.
     **/
    public GaugeAxis setBottomTextBold(boolean bottomTextBold) {
        this.bottomTextBold = bottomTextBold;
        return this;
    }

    public Boolean getBottomTextBold() {
        return bottomTextBold;
    }

    /**
     * Bottom text color.
     **/
    public GaugeAxis setBottomTextColor(Color bottomTextColor) {
        this.bottomTextColor = bottomTextColor;
        return this;
    }

    public Color getBottomTextColor() {
        return bottomTextColor;
    }

    /**
     * Font size of bottom text.
     **/
    public GaugeAxis setBottomTextFontSize(double bottomTextFontSize) {
        this.bottomTextFontSize = bottomTextFontSize;
        return this;
    }

    public Double getBottomTextFontSize() {
        return bottomTextFontSize;
    }

    /**
     * Y offset of bottom text.
     **/
    public GaugeAxis setBottomTextYOffset(double bottomTextYOffset) {
        this.bottomTextYOffset = bottomTextYOffset;
        return this;
    }

    public Double getBottomTextYOffset() {
        return bottomTextYOffset;
    }

    /**
     * X position of the axis, relative to the center of the gauge.
     **/
    public GaugeAxis setCenterX(String centerX) {
        this.centerX = centerX;
        return this;
    }

    public String getCenterX() {
        return centerX;
    }

    /**
     * Y position of the axis, relative to the center of the gauge.
     **/
    public GaugeAxis setCenterY(String centerY) {
        this.centerY = centerY;
        return this;
    }

    public String getCenterY() {
        return centerY;
    }

    /**
     * Specifies labels color of the axis.
     **/
    public GaugeAxis setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Axis end angle. Valid values are from - 180 to 180.
     **/
    public GaugeAxis setEndAngle(double endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    /**
     * Axis end (max) value
     **/
    public GaugeAxis setEndValue(double endValue) {
        this.endValue = endValue;
        return this;
    }

    public Double getEndValue() {
        return endValue;
    }

    /**
     * Font size for axis labels.
     **/
    public GaugeAxis setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check
     * your values and choose a proper gridCount which would result grids at round numbers.
     **/
    public GaugeAxis setGridCount(double gridCount) {
        this.gridCount = gridCount;
        return this;
    }

    public Double getGridCount() {
        return gridCount;
    }

    /**
     * Specifies if grid should be drawn inside or outside the axis.
     **/
    public GaugeAxis setGridInside(boolean gridInside) {
        this.gridInside = gridInside;
        return this;
    }

    public Boolean getGridInside() {
        return gridInside;
    }

    /**
     * Unique id of an axis.
     **/
    public GaugeAxis setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * Specifies if labels should be placed inside or outside the axis.
     **/
    public GaugeAxis setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    public Boolean getInside() {
        return inside;
    }

    /**
     * Frequency of labels.
     **/
    public GaugeAxis setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
        return this;
    }

    public Double getLabelFrequency() {
        return labelFrequency;
    }

    /**
     * Distance from axis to the labels.
     **/
    public GaugeAxis setLabelOffset(double labelOffset) {
        this.labelOffset = labelOffset;
        return this;
    }

    public Double getLabelOffset() {
        return labelOffset;
    }

    /**
     * Specifies if labels on the axis should be shown.
     **/
    public GaugeAxis setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
        return this;
    }

    public Boolean getLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * You can add listeners of events using this property. Example: listeners = [{"event":"clickBand",
     * "method":handleClick}];
     **/
    public GaugeAxis setListeners(List<Listener> listeners) {
        this.listeners = listeners;
        return this;
    }

    public List<Listener> getListeners() {
        return listeners;
    }

    /**
     * Interval, at which minor ticks should be placed.
     **/
    public GaugeAxis setMinorTickInterval(double minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
        return this;
    }

    public Double getMinorTickInterval() {
        return minorTickInterval;
    }

    /**
     * Length of a minor tick.
     **/
    public GaugeAxis setMinorTickLength(double minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    public Double getMinorTickLength() {
        return minorTickLength;
    }

    /**
     * Axis radius.
     **/
    public GaugeAxis setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getRadius() {
        return radius;
    }

    /**
     * Specifies if the first label should be shown.
     **/
    public GaugeAxis setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public Boolean getShowFirstLabel() {
        return showFirstLabel;
    }

    /**
     * Specifies if the last label should be shown.
     **/
    public GaugeAxis setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    public Boolean getShowLastLabel() {
        return showLastLabel;
    }

    /**
     * Axis start angle. Valid values are from - 180 to 180.
     **/
    public GaugeAxis setStartAngle(double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    /**
     * Axis start (min) value.
     **/
    public GaugeAxis setStartValue(double startValue) {
        this.startValue = startValue;
        return this;
    }

    public Double getStartValue() {
        return startValue;
    }

    /**
     * Opacity of axis ticks.
     **/
    public GaugeAxis setTickAlpha(double tickAlpha) {
        this.tickAlpha = tickAlpha;
        return this;
    }

    public Double getTickAlpha() {
        return tickAlpha;
    }

    /**
     * Color of axis ticks.
     **/
    public GaugeAxis setTickColor(Color tickColor) {
        this.tickColor = tickColor;
        return this;
    }

    public Color getTickColor() {
        return tickColor;
    }

    /**
     * Length of a major tick.
     **/
    public GaugeAxis setTickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public Double getTickLength() {
        return tickLength;
    }

    /**
     * Tick thickness.
     **/
    public GaugeAxis setTickThickness(double tickThickness) {
        this.tickThickness = tickThickness;
        return this;
    }

    public Double getTickThickness() {
        return tickThickness;
    }

    /**
     * Text displayed above the axis center.
     **/
    public GaugeAxis setTopText(String topText) {
        this.topText = topText;
        return this;
    }

    public String getTopText() {
        return topText;
    }

    /**
     * Specifies if text should be bold.
     **/
    public GaugeAxis setTopTextBold(boolean topTextBold) {
        this.topTextBold = topTextBold;
        return this;
    }

    public Boolean getTopTextBold() {
        return topTextBold;
    }

    /**
     * Color of top text.
     **/
    public GaugeAxis setTopTextColor(Color topTextColor) {
        this.topTextColor = topTextColor;
        return this;
    }

    public Color getTopTextColor() {
        return topTextColor;
    }

    /**
     * Font size of top text.
     **/
    public GaugeAxis setTopTextFontSize(double topTextFontSize) {
        this.topTextFontSize = topTextFontSize;
        return this;
    }

    public Double getTopTextFontSize() {
        return topTextFontSize;
    }

    /**
     * Y offset of top text.
     **/
    public GaugeAxis setTopTextYOffset(double topTextYOffset) {
        this.topTextYOffset = topTextYOffset;
        return this;
    }

    public Double getTopTextYOffset() {
        return topTextYOffset;
    }

    /**
     * A string which can be placed next to axis labels.
     **/
    public GaugeAxis setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    /**
     * Position of the unit.
     **/
    public GaugeAxis setUnitPosition(String unitPosition) {
        this.unitPosition = unitPosition;
        return this;
    }

    public String getUnitPosition() {
        return unitPosition;
    }

    /**
     * *Specifies if small and big numbers should use prefixes to make them more readable.
     **/
    public GaugeAxis setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
        return this;
    }

    public Boolean getUsePrefixes() {
        return usePrefixes;
    }

    /**
     * Interval, at which ticks with values should be placed.
     **/
    public GaugeAxis setValueInterval(double valueInterval) {
        this.valueInterval = valueInterval;
        return this;
    }

    public Double getValueInterval() {
        return valueInterval;
    }

}