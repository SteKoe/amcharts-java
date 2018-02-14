package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

public class AxisBase implements Serializable {
    private Boolean autoGridCount;
    private Double autoRotateAngle;
    private Double autoRotateCount;
    private Double axisAlpha;
    private Color axisColor;
    private Double axisThickness;
    private Double axisX;
    private Double axisY;
    private AmBalloon balloon;
    private Boolean boldLabels;
    private Boolean boldPeriodBeginning;
    private Boolean centerLabelOnFullPeriod;
    private Boolean centerLabels;
    private Boolean centerRotatedLabels;
    private Color color;
    private Double dashLength;
    private List<Object> dateFormats;
    private Double fillAlpha;
    private Color fillColor;
    private Double firstDayOfWeek;
    private Double fontSize;
    private Double gridAlpha;
    private Color gridColor;
    private Double gridCount;
    private Double gridThickness;
    private List<Guide> guides;
    private Boolean ignoreAxisWidth;
    private Boolean inside;
    private Double labelFrequency;
    private Double labelOffset;
    private Double labelRotation;
    private Boolean labelsEnabled;
    private List<Object> listeners;
    private Boolean markPeriodChange;
    private Double minHorizontalGap;
    private Double minorGridAlpha;
    private Boolean minorGridEnabled;
    private Double minorTickLength;
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
    private Double titleRotation;

    /**
     * Specifies whether number of gridCount is specified automatically, acoarding to the
     * axis size.
     **/
    public AxisBase setAutoGridCount(boolean autoGridCount) {
        this.autoGridCount = autoGridCount;
        return this;
    }

    public Boolean getAutoGridCount() {
        return autoGridCount;
    }

    /**
     * Angle of label rotation, if the number of series exceeds autoRotateCount. Works on
     * horizontal axis only. It is not recommended to use it with charts with zoom/scroll
     * features, as chart adjusts margin only based on initial render.
     **/
    public AxisBase setAutoRotateAngle(double autoRotateAngle) {
        this.autoRotateAngle = autoRotateAngle;
        return this;
    }

    public Double getAutoRotateAngle() {
        return autoRotateAngle;
    }

    /**
     * If the number of category axis items will exceed the autoRotateCount, the labels
     * will be rotated by autoRotateAngle degree. Works on horizontal axis only. Not recommended
     * with scrollable/zoomable charts.
     **/
    public AxisBase setAutoRotateCount(double autoRotateCount) {
        this.autoRotateCount = autoRotateCount;
        return this;
    }

    public Double getAutoRotateCount() {
        return autoRotateCount;
    }

    /**
     * Axis opacity. Value range is 0 - 1.
     **/
    public AxisBase setAxisAlpha(double axisAlpha) {
        this.axisAlpha = axisAlpha;
        return this;
    }

    public Double getAxisAlpha() {
        return axisAlpha;
    }

    /**
     * Axis color.
     **/
    public AxisBase setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
        return this;
    }

    public Color getAxisColor() {
        return axisColor;
    }

    /**
     * Thickness of the axis.
     **/
    public AxisBase setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
        return this;
    }

    public Double getAxisThickness() {
        return axisThickness;
    }

    /**
     * Read-only. Returns x coordinate of the axis.
     **/
    public AxisBase setAxisX(double axisX) {
        this.axisX = axisX;
        return this;
    }

    public Double getAxisX() {
        return axisX;
    }

    /**
     * Read-only. Returns y coordinate of the axis.
     **/
    public AxisBase setAxisY(double axisY) {
        this.axisY = axisY;
        return this;
    }

    public Double getAxisY() {
        return axisY;
    }

    /**
     * Allows customizing axes balloons individually.
     **/
    public AxisBase setBalloon(AmBalloon balloon) {
        this.balloon = balloon;
        return this;
    }

    public AmBalloon getBalloon() {
        return balloon;
    }

    /**
     * Specifies if axis labels should be bold or not.
     **/
    public AxisBase setBoldLabels(boolean boldLabels) {
        this.boldLabels = boldLabels;
        return this;
    }

    public Boolean getBoldLabels() {
        return boldLabels;
    }

    /**
     * When parse dates is on for the category axis, the chart will try to highlight the
     * beginning of the periods, like month, in bold. Set this to false to disable the functionality.
     **/
    public AxisBase setBoldPeriodBeginning(boolean boldPeriodBeginning) {
        this.boldPeriodBeginning = boldPeriodBeginning;
        return this;
    }

    public Boolean getBoldPeriodBeginning() {
        return boldPeriodBeginning;
    }

    /**
     * This setting works only when parseDates is set to true and equalSpacing is set to
     * false. In case you set it to false, labels will never be centered between grid lines.
     **/
    public AxisBase setCenterLabelOnFullPeriod(boolean centerLabelOnFullPeriod) {
        this.centerLabelOnFullPeriod = centerLabelOnFullPeriod;
        return this;
    }

    public Boolean getCenterLabelOnFullPeriod() {
        return centerLabelOnFullPeriod;
    }

    /**
     * Force-centers labels of date-based axis (in case it's category axis, equalSpacing
     * must be false)
     **/
    public AxisBase setCenterLabels(boolean centerLabels) {
        this.centerLabels = centerLabels;
        return this;
    }

    public Boolean getCenterLabels() {
        return centerLabels;
    }

    /**
     * In case you have rotated labels on horizontal axis, you can force-center them using
     * this property.
     **/
    public AxisBase setCenterRotatedLabels(boolean centerRotatedLabels) {
        this.centerRotatedLabels = centerRotatedLabels;
        return this;
    }

    public Boolean getCenterRotatedLabels() {
        return centerRotatedLabels;
    }

    /**
     * Color of axis value labels. Will use chart's color if not set.
     **/
    public AxisBase setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Length of a dash. 0 means line is not dashed.
     **/
    public AxisBase setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    public Double getDashLength() {
        return dashLength;
    }

    /**
     * Date formats of different periods. Possible period values: fff - milliseconds, ss
     * - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years.
     * Check this page for date formatting strings.
     **/
    public AxisBase setDateFormats(List<Object> dateFormats) {
        this.dateFormats = dateFormats;
        return this;
    }

    public List<Object> getDateFormats() {
        return dateFormats;
    }

    /**
     * Fill opacity. Every second space between grid lines can be filled with color. Set
     * fillAlpha to a value greater than 0 to see the fills.
     **/
    public AxisBase setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
        return this;
    }

    public Double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha
     * to a value greater than 0 to see the fills.
     **/
    public AxisBase setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public Color getFillColor() {
        return fillColor;
    }

    /**
     * Sets first day of the week. 0 is Sunday, 1 is Monday, etc.
     **/
    public AxisBase setFirstDayOfWeek(double firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
        return this;
    }

    public Double getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * Size of value labels text. Will use chart's fontSize if not set.
     **/
    public AxisBase setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Opacity of grid lines.
     **/
    public AxisBase setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
        return this;
    }

    public Double getGridAlpha() {
        return gridAlpha;
    }

    /**
     * Color of grid lines.
     **/
    public AxisBase setGridColor(Color gridColor) {
        this.gridColor = gridColor;
        return this;
    }

    public Color getGridColor() {
        return gridColor;
    }

    /**
     * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
     * the number is approximate. The default value is 5. If you set autoGridCount to true,
     * this property is ignored.
     **/
    public AxisBase setGridCount(double gridCount) {
        this.gridCount = gridCount;
        return this;
    }

    public Double getGridCount() {
        return gridCount;
    }

    /**
     * Thickness of grid lines.
     **/
    public AxisBase setGridThickness(double gridThickness) {
        this.gridThickness = gridThickness;
        return this;
    }

    public Double getGridThickness() {
        return gridThickness;
    }

    /**
     * The array of guides belonging to this axis.
     **/
    public AxisBase setGuides(List<Guide> guides) {
        this.guides = guides;
        return this;
    }

    public List<Guide> getGuides() {
        return guides;
    }

    /**
     * If autoMargins of a chart is set to true, but you want this axis not to be measured
     * when calculating margin, set ignoreAxisWidth to true.
     **/
    public AxisBase setIgnoreAxisWidth(boolean ignoreAxisWidth) {
        this.ignoreAxisWidth = ignoreAxisWidth;
        return this;
    }

    public Boolean getIgnoreAxisWidth() {
        return ignoreAxisWidth;
    }

    /**
     * Specifies whether values should be placed inside or outside plot area.
     **/
    public AxisBase setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    public Boolean getInside() {
        return inside;
    }

    /**
     * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates
     * is set to true.
     **/
    public AxisBase setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
        return this;
    }

    public Double getLabelFrequency() {
        return labelFrequency;
    }

    /**
     * You can use it to adjust position of axes labels. Works both with CategoryAxis and
     * ValueAxis.
     **/
    public AxisBase setLabelOffset(double labelOffset) {
        this.labelOffset = labelOffset;
        return this;
    }

    public Double getLabelOffset() {
        return labelOffset;
    }

    /**
     * Rotation angle of a label. Only horizontal axis' values can be rotated. If you set
     * this for vertical axis, the setting will be ignored. Possible values from -90 to
     * 90.
     **/
    public AxisBase setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
        return this;
    }

    public Double getLabelRotation() {
        return labelRotation;
    }

    /**
     * Specifies whether axis displays category axis' labels and value axis' values.
     **/
    public AxisBase setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
        return this;
    }

    public Boolean getLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * You can add listeners of events using this property. Example: listeners = [{"event":"clickItem",
     * "method":handleEvent}];
     **/
    public AxisBase setListeners(List<Object> listeners) {
        this.listeners = listeners;
        return this;
    }

    public List<Object> getListeners() {
        return listeners;
    }

    /**
     * If you set it to false, the start of longer periods won't use a different date format
     * and won't be bold.
     **/
    public AxisBase setMarkPeriodChange(boolean markPeriodChange) {
        this.markPeriodChange = markPeriodChange;
        return this;
    }

    public Boolean getMarkPeriodChange() {
        return markPeriodChange;
    }

    /**
     * This property is used when calculating grid count (when autoGridCount is true). It
     * specifies minimum cell width required for one span between grid lines.
     **/
    public AxisBase setMinHorizontalGap(double minHorizontalGap) {
        this.minHorizontalGap = minHorizontalGap;
        return this;
    }

    public Double getMinHorizontalGap() {
        return minHorizontalGap;
    }

    /**
     * Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled
     * to true.
     **/
    public AxisBase setMinorGridAlpha(double minorGridAlpha) {
        this.minorGridAlpha = minorGridAlpha;
        return this;
    }

    public Double getMinorGridAlpha() {
        return minorGridAlpha;
    }

    /**
     * Specifies if minor grid should be displayed. NOTE: If equalSpacing is set to true,
     * this setting will be ignored.
     **/
    public AxisBase setMinorGridEnabled(boolean minorGridEnabled) {
        this.minorGridEnabled = minorGridEnabled;
        return this;
    }

    public Boolean getMinorGridEnabled() {
        return minorGridEnabled;
    }

    /**
     * Length of minor grid tick.
     **/
    public AxisBase setMinorTickLength(double minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    public Double getMinorTickLength() {
        return minorTickLength;
    }

    /**
     * This property is used when calculating grid count (when autoGridCount is true). It
     * specifies minimum cell height required for one span between grid lines.
     **/
    public AxisBase setMinVerticalGap(double minVerticalGap) {
        this.minVerticalGap = minVerticalGap;
        return this;
    }

    public Double getMinVerticalGap() {
        return minVerticalGap;
    }

    /**
     * The distance of the axis to the plot area, in pixels. Negative values can also be
     * used.
     **/
    public AxisBase setOffset(double offset) {
        this.offset = offset;
        return this;
    }

    public Double getOffset() {
        return offset;
    }

    /**
     * Possible values are: "top", "bottom", "left", "right". If axis is vertical, default
     * position is "left". If axis is horizontal, default position is "bottom".
     **/
    public AxisBase setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getPosition() {
        return position;
    }

    /**
     * Whether to show first axis label or not. This works properly only on ValueAxis. With
     * CategoryAxis it wont work 100%, it depends on the period, zooming, etc. There is
     * no guaranteed way to force category axis to show or hide first label.
     **/
    public AxisBase setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public Boolean getShowFirstLabel() {
        return showFirstLabel;
    }

    /**
     * Whether to show last axis label or not. This works properly only on ValueAxis. With
     * CategoryAxis it wont work 100%, it depends on the period, zooming, etc. There is
     * no guaranteed way to force category axis to show or hide last label.
     **/
    public AxisBase setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    public Boolean getShowLastLabel() {
        return showLastLabel;
    }

    /**
     * Length of the tick marks.
     **/
    public AxisBase setTickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public Double getTickLength() {
        return tickLength;
    }

    /**
     * Title of the axis.
     **/
    public AxisBase setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    /**
     * Specifies if title should be bold or not.
     **/
    public AxisBase setTitleBold(boolean titleBold) {
        this.titleBold = titleBold;
        return this;
    }

    public Boolean getTitleBold() {
        return titleBold;
    }

    /**
     * Color of axis title. Will use text color of chart if not set any.
     **/
    public AxisBase setTitleColor(Color titleColor) {
        this.titleColor = titleColor;
        return this;
    }

    public Color getTitleColor() {
        return titleColor;
    }

    /**
     * *Font size of axis title. Will use font size of chart plus two pixels if not set any.
     **/
    public AxisBase setTitleFontSize(double titleFontSize) {
        this.titleFontSize = titleFontSize;
        return this;
    }

    public Double getTitleFontSize() {
        return titleFontSize;
    }

    /**
     * Rotation of axis title. Useful if you want to make vertical axis title to be shown
     * from top to down.
     **/
    public AxisBase setTitleRotation(double titleRotation) {
        this.titleRotation = titleRotation;
        return this;
    }

    public Double getTitleRotation() {
        return titleRotation;
    }

}