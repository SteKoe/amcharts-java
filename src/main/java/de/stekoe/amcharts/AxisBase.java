package de.stekoe.amcharts;

import java.util.List;
public class AxisBase {
    private Boolean autoGridCount;
    private Double axisAlpha;
    private Color axisColor;
    private Double axisThickness;
    private Color color;
    private Double dashLength;
    private Double fillAlpha;
    private Color fillColor;
    private Double fontSize;
    private Double gridAlpha;
    private Color gridColor;
    private Double gridCount;
    private Double gridThickness;
    private List<Guide> guides;
    private Boolean ignoreAxisWidth;
    private Boolean inside;
    private Double labelFrequency;
    private Double labelRotation;
    private Boolean labelsEnabled;
    private Double minHorizontalGap;
    private Double minorGridAlpha;
    private Boolean minorGridEnabled;
    private Double minVerticalGap;
    private Double offset;
    private String position;
    private Boolean showFirstLabel;
    private Boolean showLastLabel;
    private Double tickLength;
    private String title;
    private Boolean titleBold;
    private Color titleColor;
    private Double titleFontSize;

    /**
     * Specifies whether number of gridCount is specified automatically, acoarding to the
     * axis size.
     **/
    public void setAutoGridCount(boolean autoGridCount) {
        this.autoGridCount = autoGridCount;
    }
    public boolean isAutoGridCount() {
        return autoGridCount;
    }

    /**
     * Axis opacity. Value range is 0 - 1.
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
     * Thickness of the axis.
     **/
    public void setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
    }
    public Double getAxisThickness() {
        return axisThickness;
    }

    /**
     * Color of axis value labels. Will use chart's color if not set.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Length of a dash. 0 means line is not dashed.
     **/
    public void setDashLength(double dashLength) {
        this.dashLength = dashLength;
    }
    public Double getDashLength() {
        return dashLength;
    }

    /**
     * Fill opacity. Every second space between grid lines can be filled with color. Set
     * fillAlpha to a value greater than 0 to see the fills.
     **/
    public void setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
    }
    public Double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha
     * to a value greater than 0 to see the fills.
     **/
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
    public Color getFillColor() {
        return fillColor;
    }

    /**
     * Size of value labels text. Will use chart's fontSize if not set.
     **/
    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }
    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Opacity of grid lines.
     **/
    public void setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
    }
    public Double getGridAlpha() {
        return gridAlpha;
    }

    /**
     * Color of grid lines.
     **/
    public void setGridColor(Color gridColor) {
        this.gridColor = gridColor;
    }
    public Color getGridColor() {
        return gridColor;
    }

    /**
     * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
     * the number is approximate. The default value is 5. If you set autoGridCount to true,
     * this property is ignored.
     **/
    public void setGridCount(double gridCount) {
        this.gridCount = gridCount;
    }
    public Double getGridCount() {
        return gridCount;
    }

    /**
     * Thickness of grid lines.
     **/
    public void setGridThickness(double gridThickness) {
        this.gridThickness = gridThickness;
    }
    public Double getGridThickness() {
        return gridThickness;
    }

    /**
     * The array of guides belonging to this axis.
     **/
    public void setGuides(List<Guide> guides) {
        this.guides = guides;
    }
    public List<Guide> getGuides() {
        return guides;
    }

    /**
     * If autoMargins of a chart is set to true, but you want this axis not to be measured
     * when calculating margin, set ignoreAxisWidth to true.
     **/
    public void setIgnoreAxisWidth(boolean ignoreAxisWidth) {
        this.ignoreAxisWidth = ignoreAxisWidth;
    }
    public boolean isIgnoreAxisWidth() {
        return ignoreAxisWidth;
    }

    /**
     * Specifies whether values should be placed inside or outside plot area.
     **/
    public void setInside(boolean inside) {
        this.inside = inside;
    }
    public boolean isInside() {
        return inside;
    }

    /**
     * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates
     * is set to true.
     **/
    public void setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
    }
    public Double getLabelFrequency() {
        return labelFrequency;
    }

    /**
     * Rotation angle of a label. Only horizontal axis' values can be rotated. If you set
     * this for vertical axis, the setting will be ignored. Possible values from -90 to
     * 90.
     **/
    public void setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
    }
    public Double getLabelRotation() {
        return labelRotation;
    }

    /**
     * Specifies whether axis displays category axis' labels and value axis' values.
     **/
    public void setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
    }
    public boolean isLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * This property is used when calculating grid count (when autoGridCount is true). It
     * specifies minimum cell width required for one span between grid lines.
     **/
    public void setMinHorizontalGap(double minHorizontalGap) {
        this.minHorizontalGap = minHorizontalGap;
    }
    public Double getMinHorizontalGap() {
        return minHorizontalGap;
    }

    /**
     * Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled
     * to true.
     **/
    public void setMinorGridAlpha(double minorGridAlpha) {
        this.minorGridAlpha = minorGridAlpha;
    }
    public Double getMinorGridAlpha() {
        return minorGridAlpha;
    }

    /**
     * Specifies if minor grid should be displayed.
     **/
    public void setMinorGridEnabled(boolean minorGridEnabled) {
        this.minorGridEnabled = minorGridEnabled;
    }
    public boolean isMinorGridEnabled() {
        return minorGridEnabled;
    }

    /**
     * This property is used when calculating grid count (when autoGridCount is true). It
     * specifies minimum cell height required for one span between grid lines.
     **/
    public void setMinVerticalGap(double minVerticalGap) {
        this.minVerticalGap = minVerticalGap;
    }
    public Double getMinVerticalGap() {
        return minVerticalGap;
    }

    /**
     * The distance of the axis to the plot area, in pixels. Negative values can also be
     * used.
     **/
    public void setOffset(double offset) {
        this.offset = offset;
    }
    public Double getOffset() {
        return offset;
    }

    /**
     * Possible values are: "top", "bottom", "left", "right". If axis is vertical, default
     * position is "left". If axis is horizontal, default position is "bottom".
     **/
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }

    /**
     * Whether to show first axis label or not. This works properly only on ValueAxis. With
     * CategoryAxis it wont work 100%, it depends on the period, zooming, etc. There is
     * no guaranteed way to force category axis to show or hide first label.
     **/
    public void setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
    }
    public boolean isShowFirstLabel() {
        return showFirstLabel;
    }

    /**
     * Whether to show last axis label or not. This works properly only on ValueAxis. With
     * CategoryAxis it wont work 100%, it depends on the period, zooming, etc. There is
     * no guaranteed way to force category axis to show or hide last label.
     **/
    public void setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
    }
    public boolean isShowLastLabel() {
        return showLastLabel;
    }

    /**
     * Length of the tick marks.
     **/
    public void setTickLength(double tickLength) {
        this.tickLength = tickLength;
    }
    public Double getTickLength() {
        return tickLength;
    }

    /**
     * Title of the axis.
     **/
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    /**
     * Specifies if title should be bold or not.
     **/
    public void setTitleBold(boolean titleBold) {
        this.titleBold = titleBold;
    }
    public boolean isTitleBold() {
        return titleBold;
    }

    /**
     * Color of axis title. Will use text color of chart if not set any.
     **/
    public void setTitleColor(Color titleColor) {
        this.titleColor = titleColor;
    }
    public Color getTitleColor() {
        return titleColor;
    }

    /**
     *      *Font size of axis title. Will use font size of chart plus two pixels if not set any.
     **/
    public void setTitleFontSize(double titleFontSize) {
        this.titleFontSize = titleFontSize;
    }
    public Double getTitleFontSize() {
        return titleFontSize;
    }

}