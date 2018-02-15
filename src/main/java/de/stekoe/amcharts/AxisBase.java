package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

/**
 * *Base class for ValueAxis and CategoryAxis. It can not be instantiated explicitly.
 */

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
     * @param autoGridCount Specifies whether number of gridCount is specified automatically, acoarding to the
     *                      axis size.
     * @return AxisBase
     */
    public AxisBase setAutoGridCount(boolean autoGridCount) {
        this.autoGridCount = autoGridCount;
        return this;
    }

    public Boolean getAutoGridCount() {
        return autoGridCount;
    }

    /**
     * @param autoRotateAngle Angle of label rotation, if the number of series exceeds autoRotateCount. Works on
     *                        horizontal axis only. It is not recommended to use it with charts with zoom/scroll
     *                        features, as chart adjusts margin only based on initial render.
     * @return AxisBase
     */
    public AxisBase setAutoRotateAngle(double autoRotateAngle) {
        this.autoRotateAngle = autoRotateAngle;
        return this;
    }

    public Double getAutoRotateAngle() {
        return autoRotateAngle;
    }

    /**
     * @param autoRotateCount If the number of category axis items will exceed the autoRotateCount, the labels
     *                        will be rotated by autoRotateAngle degree. Works on horizontal axis only. Not recommended
     *                        with scrollable/zoomable charts.
     * @return AxisBase
     */
    public AxisBase setAutoRotateCount(double autoRotateCount) {
        this.autoRotateCount = autoRotateCount;
        return this;
    }

    public Double getAutoRotateCount() {
        return autoRotateCount;
    }

    /**
     * @param axisAlpha Axis opacity. Value range is 0 - 1.
     * @return AxisBase
     */
    public AxisBase setAxisAlpha(double axisAlpha) {
        this.axisAlpha = axisAlpha;
        return this;
    }

    public Double getAxisAlpha() {
        return axisAlpha;
    }

    /**
     * @param axisColor Axis color.
     * @return AxisBase
     */
    public AxisBase setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
        return this;
    }

    public Color getAxisColor() {
        return axisColor;
    }

    /**
     * @param axisThickness Thickness of the axis.
     * @return AxisBase
     */
    public AxisBase setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
        return this;
    }

    public Double getAxisThickness() {
        return axisThickness;
    }

    /**
     * @param axisX Read-only. Returns x coordinate of the axis.
     * @return AxisBase
     */
    public AxisBase setAxisX(double axisX) {
        this.axisX = axisX;
        return this;
    }

    public Double getAxisX() {
        return axisX;
    }

    /**
     * @param axisY Read-only. Returns y coordinate of the axis.
     * @return AxisBase
     */
    public AxisBase setAxisY(double axisY) {
        this.axisY = axisY;
        return this;
    }

    public Double getAxisY() {
        return axisY;
    }

    /**
     * @param balloon Allows customizing axes balloons individually.
     * @return AxisBase
     */
    public AxisBase setBalloon(AmBalloon balloon) {
        this.balloon = balloon;
        return this;
    }

    public AmBalloon getBalloon() {
        return balloon;
    }

    /**
     * @param boldLabels Specifies if axis labels should be bold or not.
     * @return AxisBase
     */
    public AxisBase setBoldLabels(boolean boldLabels) {
        this.boldLabels = boldLabels;
        return this;
    }

    public Boolean getBoldLabels() {
        return boldLabels;
    }

    /**
     * @param boldPeriodBeginning When parse dates is on for the category axis, the chart will try to highlight the
     *                            beginning of the periods, like month, in bold. Set this to false to disable the functionality.
     * @return AxisBase
     */
    public AxisBase setBoldPeriodBeginning(boolean boldPeriodBeginning) {
        this.boldPeriodBeginning = boldPeriodBeginning;
        return this;
    }

    public Boolean getBoldPeriodBeginning() {
        return boldPeriodBeginning;
    }

    /**
     * @param centerLabelOnFullPeriod This setting works only when parseDates is set to true and equalSpacing is set to
     *                                false. In case you set it to false, labels will never be centered between grid lines.
     * @return AxisBase
     */
    public AxisBase setCenterLabelOnFullPeriod(boolean centerLabelOnFullPeriod) {
        this.centerLabelOnFullPeriod = centerLabelOnFullPeriod;
        return this;
    }

    public Boolean getCenterLabelOnFullPeriod() {
        return centerLabelOnFullPeriod;
    }

    /**
     * @param centerLabels Force-centers labels of date-based axis (in case it's category axis, equalSpacing
     *                     must be false)
     * @return AxisBase
     */
    public AxisBase setCenterLabels(boolean centerLabels) {
        this.centerLabels = centerLabels;
        return this;
    }

    public Boolean getCenterLabels() {
        return centerLabels;
    }

    /**
     * @param centerRotatedLabels In case you have rotated labels on horizontal axis, you can force-center them using
     *                            this property.
     * @return AxisBase
     */
    public AxisBase setCenterRotatedLabels(boolean centerRotatedLabels) {
        this.centerRotatedLabels = centerRotatedLabels;
        return this;
    }

    public Boolean getCenterRotatedLabels() {
        return centerRotatedLabels;
    }

    /**
     * @param color Color of axis value labels. Will use chart's color if not set.
     * @return AxisBase
     */
    public AxisBase setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param dashLength Length of a dash. 0 means line is not dashed.
     * @return AxisBase
     */
    public AxisBase setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    public Double getDashLength() {
        return dashLength;
    }

    /**
     * @param dateFormats Date formats of different periods. Possible period values: fff - milliseconds, ss
     *                    - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years.
     *                    Check this page for date formatting strings.
     * @return AxisBase
     */
    public AxisBase setDateFormats(List<Object> dateFormats) {
        this.dateFormats = dateFormats;
        return this;
    }

    public List<Object> getDateFormats() {
        return dateFormats;
    }

    /**
     * @param fillAlpha Fill opacity. Every second space between grid lines can be filled with color. Set
     *                  fillAlpha to a value greater than 0 to see the fills.
     * @return AxisBase
     */
    public AxisBase setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
        return this;
    }

    public Double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * @param fillColor Fill color. Every second space between grid lines can be filled with color. Set fillAlpha
     *                  to a value greater than 0 to see the fills.
     * @return AxisBase
     */
    public AxisBase setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public Color getFillColor() {
        return fillColor;
    }

    /**
     * @param firstDayOfWeek Sets first day of the week. 0 is Sunday, 1 is Monday, etc.
     * @return AxisBase
     */
    public AxisBase setFirstDayOfWeek(double firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
        return this;
    }

    public Double getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * @param fontSize Size of value labels text. Will use chart's fontSize if not set.
     * @return AxisBase
     */
    public AxisBase setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * @param gridAlpha Opacity of grid lines.
     * @return AxisBase
     */
    public AxisBase setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
        return this;
    }

    public Double getGridAlpha() {
        return gridAlpha;
    }

    /**
     * @param gridColor Color of grid lines.
     * @return AxisBase
     */
    public AxisBase setGridColor(Color gridColor) {
        this.gridColor = gridColor;
        return this;
    }

    public Color getGridColor() {
        return gridColor;
    }

    /**
     * @param gridCount Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
     *                  the number is approximate. The default value is 5. If you set autoGridCount to true,
     *                  this property is ignored.
     * @return AxisBase
     */
    public AxisBase setGridCount(double gridCount) {
        this.gridCount = gridCount;
        return this;
    }

    public Double getGridCount() {
        return gridCount;
    }

    /**
     * @param gridThickness Thickness of grid lines.
     * @return AxisBase
     */
    public AxisBase setGridThickness(double gridThickness) {
        this.gridThickness = gridThickness;
        return this;
    }

    public Double getGridThickness() {
        return gridThickness;
    }

    /**
     * @param guides The array of guides belonging to this axis.
     * @return AxisBase
     */
    public AxisBase setGuides(List<Guide> guides) {
        this.guides = guides;
        return this;
    }

    public List<Guide> getGuides() {
        return guides;
    }

    /**
     * @param ignoreAxisWidth If autoMargins of a chart is set to true, but you want this axis not to be measured
     *                        when calculating margin, set ignoreAxisWidth to true.
     * @return AxisBase
     */
    public AxisBase setIgnoreAxisWidth(boolean ignoreAxisWidth) {
        this.ignoreAxisWidth = ignoreAxisWidth;
        return this;
    }

    public Boolean getIgnoreAxisWidth() {
        return ignoreAxisWidth;
    }

    /**
     * @param inside Specifies whether values should be placed inside or outside plot area.
     * @return AxisBase
     */
    public AxisBase setInside(boolean inside) {
        this.inside = inside;
        return this;
    }

    public Boolean getInside() {
        return inside;
    }

    /**
     * @param labelFrequency Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates
     *                       is set to true.
     * @return AxisBase
     */
    public AxisBase setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
        return this;
    }

    public Double getLabelFrequency() {
        return labelFrequency;
    }

    /**
     * @param labelOffset You can use it to adjust position of axes labels. Works both with CategoryAxis and
     *                    ValueAxis.
     * @return AxisBase
     */
    public AxisBase setLabelOffset(double labelOffset) {
        this.labelOffset = labelOffset;
        return this;
    }

    public Double getLabelOffset() {
        return labelOffset;
    }

    /**
     * @param labelRotation Rotation angle of a label. Only horizontal axis' values can be rotated. If you set
     *                      this for vertical axis, the setting will be ignored. Possible values from -90 to
     *                      90.
     * @return AxisBase
     */
    public AxisBase setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
        return this;
    }

    public Double getLabelRotation() {
        return labelRotation;
    }

    /**
     * @param labelsEnabled Specifies whether axis displays category axis' labels and value axis' values.
     * @return AxisBase
     */
    public AxisBase setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
        return this;
    }

    public Boolean getLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * @param listeners You can add listeners of events using this property. Example: listeners = [{"event":"clickItem",
     *                  "method":handleEvent}];
     * @return AxisBase
     */
    public AxisBase setListeners(List<Object> listeners) {
        this.listeners = listeners;
        return this;
    }

    public List<Object> getListeners() {
        return listeners;
    }

    /**
     * @param markPeriodChange If you set it to false, the start of longer periods won't use a different date format
     *                         and won't be bold.
     * @return AxisBase
     */
    public AxisBase setMarkPeriodChange(boolean markPeriodChange) {
        this.markPeriodChange = markPeriodChange;
        return this;
    }

    public Boolean getMarkPeriodChange() {
        return markPeriodChange;
    }

    /**
     * @param minHorizontalGap This property is used when calculating grid count (when autoGridCount is true). It
     *                         specifies minimum cell width required for one span between grid lines.
     * @return AxisBase
     */
    public AxisBase setMinHorizontalGap(double minHorizontalGap) {
        this.minHorizontalGap = minHorizontalGap;
        return this;
    }

    public Double getMinHorizontalGap() {
        return minHorizontalGap;
    }

    /**
     * @param minorGridAlpha Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled
     *                       to true.
     * @return AxisBase
     */
    public AxisBase setMinorGridAlpha(double minorGridAlpha) {
        this.minorGridAlpha = minorGridAlpha;
        return this;
    }

    public Double getMinorGridAlpha() {
        return minorGridAlpha;
    }

    /**
     * @param minorGridEnabled Specifies if minor grid should be displayed. NOTE: If equalSpacing is set to true,
     *                         this setting will be ignored.
     * @return AxisBase
     */
    public AxisBase setMinorGridEnabled(boolean minorGridEnabled) {
        this.minorGridEnabled = minorGridEnabled;
        return this;
    }

    public Boolean getMinorGridEnabled() {
        return minorGridEnabled;
    }

    /**
     * @param minorTickLength Length of minor grid tick.
     * @return AxisBase
     */
    public AxisBase setMinorTickLength(double minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    public Double getMinorTickLength() {
        return minorTickLength;
    }

    /**
     * @param minVerticalGap This property is used when calculating grid count (when autoGridCount is true). It
     *                       specifies minimum cell height required for one span between grid lines.
     * @return AxisBase
     */
    public AxisBase setMinVerticalGap(double minVerticalGap) {
        this.minVerticalGap = minVerticalGap;
        return this;
    }

    public Double getMinVerticalGap() {
        return minVerticalGap;
    }

    /**
     * @param offset The distance of the axis to the plot area, in pixels. Negative values can also be
     *               used.
     * @return AxisBase
     */
    public AxisBase setOffset(double offset) {
        this.offset = offset;
        return this;
    }

    public Double getOffset() {
        return offset;
    }

    /**
     * @param position Possible values are: "top", "bottom", "left", "right". If axis is vertical, default
     *                 position is "left". If axis is horizontal, default position is "bottom".
     * @return AxisBase
     */
    public AxisBase setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getPosition() {
        return position;
    }

    /**
     * @param showFirstLabel Whether to show first axis label or not. This works properly only on ValueAxis. With
     *                       CategoryAxis it wont work 100%, it depends on the period, zooming, etc. There is
     *                       no guaranteed way to force category axis to show or hide first label.
     * @return AxisBase
     */
    public AxisBase setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public Boolean getShowFirstLabel() {
        return showFirstLabel;
    }

    /**
     * @param showLastLabel Whether to show last axis label or not. This works properly only on ValueAxis. With
     *                      CategoryAxis it wont work 100%, it depends on the period, zooming, etc. There is
     *                      no guaranteed way to force category axis to show or hide last label.
     * @return AxisBase
     */
    public AxisBase setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    public Boolean getShowLastLabel() {
        return showLastLabel;
    }

    /**
     * @param tickLength Length of the tick marks.
     * @return AxisBase
     */
    public AxisBase setTickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public Double getTickLength() {
        return tickLength;
    }

    /**
     * @param title Title of the axis.
     * @return AxisBase
     */
    public AxisBase setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    /**
     * @param titleBold Specifies if title should be bold or not.
     * @return AxisBase
     */
    public AxisBase setTitleBold(boolean titleBold) {
        this.titleBold = titleBold;
        return this;
    }

    public Boolean getTitleBold() {
        return titleBold;
    }

    /**
     * @param titleColor Color of axis title. Will use text color of chart if not set any.
     * @return AxisBase
     */
    public AxisBase setTitleColor(Color titleColor) {
        this.titleColor = titleColor;
        return this;
    }

    public Color getTitleColor() {
        return titleColor;
    }

    /**
     * @param titleFontSize *Font size of axis title. Will use font size of chart plus two pixels if not set any.
     * @return AxisBase
     */
    public AxisBase setTitleFontSize(double titleFontSize) {
        this.titleFontSize = titleFontSize;
        return this;
    }

    public Double getTitleFontSize() {
        return titleFontSize;
    }

    /**
     * @param titleRotation Rotation of axis title. Useful if you want to make vertical axis title to be shown
     *                      from top to down.
     * @return AxisBase
     */
    public AxisBase setTitleRotation(double titleRotation) {
        this.titleRotation = titleRotation;
        return this;
    }

    public Double getTitleRotation() {
        return titleRotation;
    }

}