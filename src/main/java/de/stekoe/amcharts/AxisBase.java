package de.stekoe.amcharts;

import java.util.List;

import org.json.JSONObject;

import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.helper.Jsonifyable;
import de.stekoe.amcharts.helper.Jsonifyer;

public class AxisBase implements Jsonifyable {
    private Boolean autoGridCount;
    private Double axisAlpha;
    private Color axisColor;
    private Double axisThickness;
    private Double axisX;
    private Double axisY;
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
    public Boolean getAutoGridCount() {
        return autoGridCount;
    }
    public AxisBase setAutoGridCount(boolean autoGridCount) {
        this.autoGridCount = autoGridCount;
        return this;
    }

    /**
     * Axis opacity. Value range is 0 - 1.
     **/
    public Double getAxisAlpha() {
        return axisAlpha;
    }
    public AxisBase setAxisAlpha(double axisAlpha) {
        this.axisAlpha = axisAlpha;
        return this;
    }

    /**
     * Axis color.
     **/
    public Color getAxisColor() {
        return axisColor;
    }
    public AxisBase setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
        return this;
    }

    /**
     * Thickness of the axis.
     **/
    public Double getAxisThickness() {
        return axisThickness;
    }
    public AxisBase setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
        return this;
    }

    /**
     * Read-only. Returns x coordinate of the axis.
     **/
    public Double getAxisX() {
        return axisX;
    }
    public AxisBase setAxisX(double axisX) {
        this.axisX = axisX;
        return this;
    }

    /**
     * Read-only. Returns y coordinate of the axis.
     **/
    public Double getAxisY() {
        return axisY;
    }
    public AxisBase setAxisY(double axisY) {
        this.axisY = axisY;
        return this;
    }

    /**
     * Color of axis value labels. Will use chart's color if not set.
     **/
    public Color getColor() {
        return color;
    }
    public AxisBase setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Length of a dash. 0 means line is not dashed.
     **/
    public Double getDashLength() {
        return dashLength;
    }
    public AxisBase setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    /**
     * Fill opacity. Every second space between grid lines can be filled with color. Set
     * fillAlpha to a value greater than 0 to see the fills.
     **/
    public Double getFillAlpha() {
        return fillAlpha;
    }
    public AxisBase setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
        return this;
    }

    /**
     * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha
     * to a value greater than 0 to see the fills.
     **/
    public Color getFillColor() {
        return fillColor;
    }
    public AxisBase setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    /**
     * Size of value labels text. Will use chart's fontSize if not set.
     **/
    public Double getFontSize() {
        return fontSize;
    }
    public AxisBase setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * Opacity of grid lines.
     **/
    public Double getGridAlpha() {
        return gridAlpha;
    }
    public AxisBase setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
        return this;
    }

    /**
     * Color of grid lines.
     **/
    public Color getGridColor() {
        return gridColor;
    }
    public AxisBase setGridColor(Color gridColor) {
        this.gridColor = gridColor;
        return this;
    }

    /**
     * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
     * the number is approximate. The default value is 5. If you set autoGridCount to true,
     * this property is ignored.
     **/
    public Double getGridCount() {
        return gridCount;
    }
    public AxisBase setGridCount(double gridCount) {
        this.gridCount = gridCount;
        return this;
    }

    /**
     * Thickness of grid lines.
     **/
    public Double getGridThickness() {
        return gridThickness;
    }
    public AxisBase setGridThickness(double gridThickness) {
        this.gridThickness = gridThickness;
        return this;
    }

    /**
     * The array of guides belonging to this axis.
     **/
    public List<Guide> getGuides() {
        return guides;
    }
    public AxisBase setGuides(List<Guide> guides) {
        this.guides = guides;
        return this;
    }

    /**
     * If autoMargins of a chart is set to true, but you want this axis not to be measured
     * when calculating margin, set ignoreAxisWidth to true.
     **/
    public Boolean getIgnoreAxisWidth() {
        return ignoreAxisWidth;
    }
    public AxisBase setIgnoreAxisWidth(boolean ignoreAxisWidth) {
        this.ignoreAxisWidth = ignoreAxisWidth;
        return this;
    }

    /**
     * Specifies whether values should be placed inside or outside plot area.
     **/
    public Boolean getInside() {
        return inside;
    }
    public AxisBase setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    /**
     * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates
     * is set to true.
     **/
    public Double getLabelFrequency() {
        return labelFrequency;
    }
    public AxisBase setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
        return this;
    }

    /**
     * Rotation angle of a label. Only horizontal axis' values can be rotated. If you set
     * this for vertical axis, the setting will be ignored. Possible values from -90 to
     * 90.
     **/
    public Double getLabelRotation() {
        return labelRotation;
    }
    public AxisBase setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
        return this;
    }

    /**
     * Specifies whether axis displays category axis' labels and value axis' values.
     **/
    public Boolean getLabelsEnabled() {
        return labelsEnabled;
    }
    public AxisBase setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
        return this;
    }

    /**
     * This property is used when calculating grid count (when autoGridCount is true). It
     * specifies minimum cell width required for one span between grid lines.
     **/
    public Double getMinHorizontalGap() {
        return minHorizontalGap;
    }
    public AxisBase setMinHorizontalGap(double minHorizontalGap) {
        this.minHorizontalGap = minHorizontalGap;
        return this;
    }

    /**
     * Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled
     * to true.
     **/
    public Double getMinorGridAlpha() {
        return minorGridAlpha;
    }
    public AxisBase setMinorGridAlpha(double minorGridAlpha) {
        this.minorGridAlpha = minorGridAlpha;
        return this;
    }

    /**
     * Specifies if minor grid should be displayed.
     **/
    public Boolean getMinorGridEnabled() {
        return minorGridEnabled;
    }
    public AxisBase setMinorGridEnabled(boolean minorGridEnabled) {
        this.minorGridEnabled = minorGridEnabled;
        return this;
    }

    /**
     * This property is used when calculating grid count (when autoGridCount is true). It
     * specifies minimum cell height required for one span between grid lines.
     **/
    public Double getMinVerticalGap() {
        return minVerticalGap;
    }
    public AxisBase setMinVerticalGap(double minVerticalGap) {
        this.minVerticalGap = minVerticalGap;
        return this;
    }

    /**
     * The distance of the axis to the plot area, in pixels. Negative values can also be
     * used.
     **/
    public Double getOffset() {
        return offset;
    }
    public AxisBase setOffset(double offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Possible values are: "top", "bottom", "left", "right". If axis is vertical, default
     * position is "left". If axis is horizontal, default position is "bottom".
     **/
    public String getPosition() {
        return position;
    }
    public AxisBase setPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * Whether to show first axis label or not. This works properly only on ValueAxis. With
     * CategoryAxis it wont work 100%, it depends on the period, zooming, etc. There is
     * no guaranteed way to force category axis to show or hide first label.
     **/
    public Boolean getShowFirstLabel() {
        return showFirstLabel;
    }
    public AxisBase setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    /**
     * Whether to show last axis label or not. This works properly only on ValueAxis. With
     * CategoryAxis it wont work 100%, it depends on the period, zooming, etc. There is
     * no guaranteed way to force category axis to show or hide last label.
     **/
    public Boolean getShowLastLabel() {
        return showLastLabel;
    }
    public AxisBase setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    /**
     * Length of the tick marks.
     **/
    public Double getTickLength() {
        return tickLength;
    }
    public AxisBase setTickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    /**
     * Title of the axis.
     **/
    public String getTitle() {
        return title;
    }
    public AxisBase setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Specifies if title should be bold or not.
     **/
    public Boolean getTitleBold() {
        return titleBold;
    }
    public AxisBase setTitleBold(boolean titleBold) {
        this.titleBold = titleBold;
        return this;
    }

    /**
     * Color of axis title. Will use text color of chart if not set any.
     **/
    public Color getTitleColor() {
        return titleColor;
    }
    public AxisBase setTitleColor(Color titleColor) {
        this.titleColor = titleColor;
        return this;
    }

    /**
     *      *Font size of axis title. Will use font size of chart plus two pixels if not set any.
     **/
    public Double getTitleFontSize() {
        return titleFontSize;
    }
    public AxisBase setTitleFontSize(double titleFontSize) {
        this.titleFontSize = titleFontSize;
        return this;
    }

    public JSONObject toJson() {
        return new Jsonifyer(this).toJson();
    }
}