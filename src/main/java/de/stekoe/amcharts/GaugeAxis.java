package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.addition.Listener;

import java.io.Serializable;
import java.util.List;

/**
 * Creates an axis for AmAngularGauge charts, multiple can be assigned.
 */

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
     * @param axisAlpha Axis opacity.
     * @return GaugeAxis
     */
    public GaugeAxis setAxisAlpha(double axisAlpha) {
        this.axisAlpha = axisAlpha;
        return this;
    }

    public Double getAxisAlpha() {
        return axisAlpha;
    }

    /**
     * @param axisColor Axis color.
     * @return GaugeAxis
     */
    public GaugeAxis setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
        return this;
    }

    public Color getAxisColor() {
        return axisColor;
    }

    /**
     * @param axisThickness Thickness of the axis outline.
     * @return GaugeAxis
     */
    public GaugeAxis setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
        return this;
    }

    public Double getAxisThickness() {
        return axisThickness;
    }

    /**
     * @param bandAlpha Opacity of band fills.
     * @return GaugeAxis
     */
    public GaugeAxis setBandAlpha(double bandAlpha) {
        this.bandAlpha = bandAlpha;
        return this;
    }

    public Double getBandAlpha() {
        return bandAlpha;
    }

    /**
     * @param bandGradientRatio Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients. Negative
     *                          value means the color will be darker than the original, and positive number means
     *                          the color will be lighter.
     * @return GaugeAxis
     */
    public GaugeAxis setBandGradientRatio(List<Number> bandGradientRatio) {
        this.bandGradientRatio = bandGradientRatio;
        return this;
    }

    public List<Number> getBandGradientRatio() {
        return bandGradientRatio;
    }

    /**
     * @param bandOutlineAlpha Opacity of band outlines.
     * @return GaugeAxis
     */
    public GaugeAxis setBandOutlineAlpha(double bandOutlineAlpha) {
        this.bandOutlineAlpha = bandOutlineAlpha;
        return this;
    }

    public Double getBandOutlineAlpha() {
        return bandOutlineAlpha;
    }

    /**
     * @param bandOutlineColor Color of band outlines.
     * @return GaugeAxis
     */
    public GaugeAxis setBandOutlineColor(Color bandOutlineColor) {
        this.bandOutlineColor = bandOutlineColor;
        return this;
    }

    public Color getBandOutlineColor() {
        return bandOutlineColor;
    }

    /**
     * @param bandOutlineThickness Thickness of band outlines.
     * @return GaugeAxis
     */
    public GaugeAxis setBandOutlineThickness(double bandOutlineThickness) {
        this.bandOutlineThickness = bandOutlineThickness;
        return this;
    }

    public Double getBandOutlineThickness() {
        return bandOutlineThickness;
    }

    /**
     * @param bands Array of bands - GaugeBand objects. Bands are used to draw color fills between specified
     *              values.
     * @return GaugeAxis
     */
    public GaugeAxis setBands(List<GaugeBand> bands) {
        this.bands = bands;
        return this;
    }

    public List<GaugeBand> getBands() {
        return bands;
    }

    /**
     * @param bottomText Text displayed below the axis center.
     * @return GaugeAxis
     */
    public GaugeAxis setBottomText(String bottomText) {
        this.bottomText = bottomText;
        return this;
    }

    public String getBottomText() {
        return bottomText;
    }

    /**
     * @param bottomTextBold Specifies if text should be bold.
     * @return GaugeAxis
     */
    public GaugeAxis setBottomTextBold(boolean bottomTextBold) {
        this.bottomTextBold = bottomTextBold;
        return this;
    }

    public Boolean getBottomTextBold() {
        return bottomTextBold;
    }

    /**
     * @param bottomTextColor Bottom text color.
     * @return GaugeAxis
     */
    public GaugeAxis setBottomTextColor(Color bottomTextColor) {
        this.bottomTextColor = bottomTextColor;
        return this;
    }

    public Color getBottomTextColor() {
        return bottomTextColor;
    }

    /**
     * @param bottomTextFontSize Font size of bottom text.
     * @return GaugeAxis
     */
    public GaugeAxis setBottomTextFontSize(double bottomTextFontSize) {
        this.bottomTextFontSize = bottomTextFontSize;
        return this;
    }

    public Double getBottomTextFontSize() {
        return bottomTextFontSize;
    }

    /**
     * @param bottomTextYOffset Y offset of bottom text.
     * @return GaugeAxis
     */
    public GaugeAxis setBottomTextYOffset(double bottomTextYOffset) {
        this.bottomTextYOffset = bottomTextYOffset;
        return this;
    }

    public Double getBottomTextYOffset() {
        return bottomTextYOffset;
    }

    /**
     * @param centerX X position of the axis, relative to the center of the gauge.
     * @return GaugeAxis
     */
    public GaugeAxis setCenterX(String centerX) {
        this.centerX = centerX;
        return this;
    }

    public String getCenterX() {
        return centerX;
    }

    /**
     * @param centerY Y position of the axis, relative to the center of the gauge.
     * @return GaugeAxis
     */
    public GaugeAxis setCenterY(String centerY) {
        this.centerY = centerY;
        return this;
    }

    public String getCenterY() {
        return centerY;
    }

    /**
     * @param color Specifies labels color of the axis.
     * @return GaugeAxis
     */
    public GaugeAxis setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param endAngle Axis end angle. Valid values are from - 180 to 180.
     * @return GaugeAxis
     */
    public GaugeAxis setEndAngle(double endAngle) {
        this.endAngle = endAngle;
        return this;
    }

    public Double getEndAngle() {
        return endAngle;
    }

    /**
     * @param endValue Axis end (max) value
     * @return GaugeAxis
     */
    public GaugeAxis setEndValue(double endValue) {
        this.endValue = endValue;
        return this;
    }

    public Double getEndValue() {
        return endValue;
    }

    /**
     * @param fontSize Font size for axis labels.
     * @return GaugeAxis
     */
    public GaugeAxis setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * @param gridCount Number of grid lines. Note, GaugeAxis doesn't adjust gridCount, so you should check
     *                  your values and choose a proper gridCount which would result grids at round numbers.
     * @return GaugeAxis
     */
    public GaugeAxis setGridCount(double gridCount) {
        this.gridCount = gridCount;
        return this;
    }

    public Double getGridCount() {
        return gridCount;
    }

    /**
     * @param gridInside Specifies if grid should be drawn inside or outside the axis.
     * @return GaugeAxis
     */
    public GaugeAxis setGridInside(boolean gridInside) {
        this.gridInside = gridInside;
        return this;
    }

    public Boolean getGridInside() {
        return gridInside;
    }

    /**
     * @param id Unique id of an axis.
     * @return GaugeAxis
     */
    public GaugeAxis setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * @param inside Specifies if labels should be placed inside or outside the axis.
     * @return GaugeAxis
     */
    public GaugeAxis setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    public Boolean getInside() {
        return inside;
    }

    /**
     * @param labelFrequency Frequency of labels.
     * @return GaugeAxis
     */
    public GaugeAxis setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
        return this;
    }

    public Double getLabelFrequency() {
        return labelFrequency;
    }

    /**
     * @param labelOffset Distance from axis to the labels.
     * @return GaugeAxis
     */
    public GaugeAxis setLabelOffset(double labelOffset) {
        this.labelOffset = labelOffset;
        return this;
    }

    public Double getLabelOffset() {
        return labelOffset;
    }

    /**
     * @param labelsEnabled Specifies if labels on the axis should be shown.
     * @return GaugeAxis
     */
    public GaugeAxis setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
        return this;
    }

    public Boolean getLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * @param listeners You can add listeners of events using this property. Example: listeners = [{"event":"clickBand",
     *                  "method":handleClick}];
     * @return GaugeAxis
     */
    public GaugeAxis setListeners(List<Listener> listeners) {
        this.listeners = listeners;
        return this;
    }

    public List<Listener> getListeners() {
        return listeners;
    }

    /**
     * @param minorTickInterval Interval, at which minor ticks should be placed.
     * @return GaugeAxis
     */
    public GaugeAxis setMinorTickInterval(double minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
        return this;
    }

    public Double getMinorTickInterval() {
        return minorTickInterval;
    }

    /**
     * @param minorTickLength Length of a minor tick.
     * @return GaugeAxis
     */
    public GaugeAxis setMinorTickLength(double minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    public Double getMinorTickLength() {
        return minorTickLength;
    }

    /**
     * @param radius Axis radius.
     * @return GaugeAxis
     */
    public GaugeAxis setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getRadius() {
        return radius;
    }

    /**
     * @param showFirstLabel Specifies if the first label should be shown.
     * @return GaugeAxis
     */
    public GaugeAxis setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public Boolean getShowFirstLabel() {
        return showFirstLabel;
    }

    /**
     * @param showLastLabel Specifies if the last label should be shown.
     * @return GaugeAxis
     */
    public GaugeAxis setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    public Boolean getShowLastLabel() {
        return showLastLabel;
    }

    /**
     * @param startAngle Axis start angle. Valid values are from - 180 to 180.
     * @return GaugeAxis
     */
    public GaugeAxis setStartAngle(double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public Double getStartAngle() {
        return startAngle;
    }

    /**
     * @param startValue Axis start (min) value.
     * @return GaugeAxis
     */
    public GaugeAxis setStartValue(double startValue) {
        this.startValue = startValue;
        return this;
    }

    public Double getStartValue() {
        return startValue;
    }

    /**
     * @param tickAlpha Opacity of axis ticks.
     * @return GaugeAxis
     */
    public GaugeAxis setTickAlpha(double tickAlpha) {
        this.tickAlpha = tickAlpha;
        return this;
    }

    public Double getTickAlpha() {
        return tickAlpha;
    }

    /**
     * @param tickColor Color of axis ticks.
     * @return GaugeAxis
     */
    public GaugeAxis setTickColor(Color tickColor) {
        this.tickColor = tickColor;
        return this;
    }

    public Color getTickColor() {
        return tickColor;
    }

    /**
     * @param tickLength Length of a major tick.
     * @return GaugeAxis
     */
    public GaugeAxis setTickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public Double getTickLength() {
        return tickLength;
    }

    /**
     * @param tickThickness Tick thickness.
     * @return GaugeAxis
     */
    public GaugeAxis setTickThickness(double tickThickness) {
        this.tickThickness = tickThickness;
        return this;
    }

    public Double getTickThickness() {
        return tickThickness;
    }

    /**
     * @param topText Text displayed above the axis center.
     * @return GaugeAxis
     */
    public GaugeAxis setTopText(String topText) {
        this.topText = topText;
        return this;
    }

    public String getTopText() {
        return topText;
    }

    /**
     * @param topTextBold Specifies if text should be bold.
     * @return GaugeAxis
     */
    public GaugeAxis setTopTextBold(boolean topTextBold) {
        this.topTextBold = topTextBold;
        return this;
    }

    public Boolean getTopTextBold() {
        return topTextBold;
    }

    /**
     * @param topTextColor Color of top text.
     * @return GaugeAxis
     */
    public GaugeAxis setTopTextColor(Color topTextColor) {
        this.topTextColor = topTextColor;
        return this;
    }

    public Color getTopTextColor() {
        return topTextColor;
    }

    /**
     * @param topTextFontSize Font size of top text.
     * @return GaugeAxis
     */
    public GaugeAxis setTopTextFontSize(double topTextFontSize) {
        this.topTextFontSize = topTextFontSize;
        return this;
    }

    public Double getTopTextFontSize() {
        return topTextFontSize;
    }

    /**
     * @param topTextYOffset Y offset of top text.
     * @return GaugeAxis
     */
    public GaugeAxis setTopTextYOffset(double topTextYOffset) {
        this.topTextYOffset = topTextYOffset;
        return this;
    }

    public Double getTopTextYOffset() {
        return topTextYOffset;
    }

    /**
     * @param unit A string which can be placed next to axis labels.
     * @return GaugeAxis
     */
    public GaugeAxis setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    /**
     * @param unitPosition Position of the unit.
     * @return GaugeAxis
     */
    public GaugeAxis setUnitPosition(String unitPosition) {
        this.unitPosition = unitPosition;
        return this;
    }

    public String getUnitPosition() {
        return unitPosition;
    }

    /**
     * @param usePrefixes *Specifies if small and big numbers should use prefixes to make them more readable.
     * @return GaugeAxis
     */
    public GaugeAxis setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
        return this;
    }

    public Boolean getUsePrefixes() {
        return usePrefixes;
    }

    /**
     * @param valueInterval Interval, at which ticks with values should be placed.
     * @return GaugeAxis
     */
    public GaugeAxis setValueInterval(double valueInterval) {
        this.valueInterval = valueInterval;
        return this;
    }

    public Double getValueInterval() {
        return valueInterval;
    }

}