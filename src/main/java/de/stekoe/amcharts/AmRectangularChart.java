package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.util.List;

/**
 * Extension for AmCoordinateChart and base class of AmSerialChart and AmXYChart. It
 * can not be instantiated explicitly.
 */

public class AmRectangularChart extends AmCoordinateChart {
    private Double angle;
    private Double autoMarginOffset;
    private Boolean autoMargins;
    private ChartCursor chartCursor;
    private ChartScrollbar chartScrollbar;
    private Double depth3D;
    private Double marginBottom;
    private Double marginLeft;
    private Double marginRight;
    private Boolean marginsUpdated;
    private Double marginTop;
    private Double maxZoomFactor;
    private Double minMarginBottom;
    private Double minMarginLeft;
    private Double minMarginRight;
    private Double minMarginTop;
    private Double plotAreaBorderAlpha;
    private Color plotAreaBorderColor;
    private Double plotAreaFillAlphas;
    private Color plotAreaFillColors;
    private Double plotAreaGradientAngle;
    private List<TrendLine> trendLines;
    private Double zoomOutButtonAlpha;
    private Color zoomOutButtonColor;
    private String zoomOutButtonImage;
    private Double zoomOutButtonImageSize;
    private Double zoomOutButtonPadding;
    private Double zoomOutButtonRollOverAlpha;
    private Double zoomOutButtonTabIndex;
    private String zoomOutText;

    /**
     * @param angle The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D"
     *              is > 0).
     * @return AmRectangularChart
     */
    public AmRectangularChart setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    public Double getAngle() {
        return angle;
    }

    /**
     * @param autoMarginOffset Space left from axis labels/title to the chart's outside border, if autoMargins set
     *                         to true.
     * @return AmRectangularChart
     */
    public AmRectangularChart setAutoMarginOffset(double autoMarginOffset) {
        this.autoMarginOffset = autoMarginOffset;
        return this;
    }

    public Double getAutoMarginOffset() {
        return autoMarginOffset;
    }

    /**
     * @param autoMargins Specifies if margins of a chart should be calculated automatically so that labels
     *                    of axes would fit. The chart will adjust only margins with axes. Other margins will
     *                    use values set with marginRight, marginTop, marginLeft and marginBottom properties.
     * @return AmRectangularChart
     */
    public AmRectangularChart setAutoMargins(boolean autoMargins) {
        this.autoMargins = autoMargins;
        return this;
    }

    public Boolean getAutoMargins() {
        return autoMargins;
    }

    /**
     * @param chartCursor Cursor of a chart.
     * @return AmRectangularChart
     */
    public AmRectangularChart setChartCursor(ChartCursor chartCursor) {
        this.chartCursor = chartCursor;
        return this;
    }

    public ChartCursor getChartCursor() {
        return chartCursor;
    }

    /**
     * @param chartScrollbar Chart's scrollbar.
     * @return AmRectangularChart
     */
    public AmRectangularChart setChartScrollbar(ChartScrollbar chartScrollbar) {
        this.chartScrollbar = chartScrollbar;
        return this;
    }

    public ChartScrollbar getChartScrollbar() {
        return chartScrollbar;
    }

    /**
     * @param depth3D The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is
     *                > 0).
     * @return AmRectangularChart
     */
    public AmRectangularChart setDepth3D(double depth3D) {
        this.depth3D = depth3D;
        return this;
    }

    public Double getDepth3D() {
        return depth3D;
    }

    /**
     * @param marginBottom Number of pixels between the container's bottom border and plot area. This space
     *                     can be used for bottom axis' values. If autoMargin is true and bottom side has axis,
     *                     this property is ignored.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * @param marginLeft Number of pixels between the container's left border and plot area. This space can
     *                   be used for left axis' values. If autoMargin is true and left side has axis, this
     *                   property is ignored.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * @param marginRight Number of pixels between the container's right border and plot area. This space can
     *                    be used for Right axis' values. If autoMargin is true and right side has axis, this
     *                    property is ignored.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * @param marginsUpdated Flag which should be set to false if you need margins to be recalculated on next
     *                       chart.validateNow() call.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMarginsUpdated(boolean marginsUpdated) {
        this.marginsUpdated = marginsUpdated;
        return this;
    }

    public Boolean getMarginsUpdated() {
        return marginsUpdated;
    }

    /**
     * @param marginTop Number of pixels between the container's top border and plot area. This space can
     *                  be used for top axis' values. If autoMargin is true and top side has axis, this property
     *                  is ignored.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * @param maxZoomFactor Maximum zoom factor value axes.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMaxZoomFactor(double maxZoomFactor) {
        this.maxZoomFactor = maxZoomFactor;
        return this;
    }

    public Double getMaxZoomFactor() {
        return maxZoomFactor;
    }

    /**
     * @param minMarginBottom If bottom side has a value axis and autoMargins is set to true (default), the margin
     *                        of this side will be not less than set on minMarginBottom property.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMinMarginBottom(double minMarginBottom) {
        this.minMarginBottom = minMarginBottom;
        return this;
    }

    public Double getMinMarginBottom() {
        return minMarginBottom;
    }

    /**
     * @param minMarginLeft If left side has a value axis and autoMargins is set to true (default), the margin
     *                      of this side will be not less than set on minMarginLeft property.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMinMarginLeft(double minMarginLeft) {
        this.minMarginLeft = minMarginLeft;
        return this;
    }

    public Double getMinMarginLeft() {
        return minMarginLeft;
    }

    /**
     * @param minMarginRight If right side has a value axis and autoMargins is set to true (default), the margin
     *                       of this side will be not less than set on minMarginRight property.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMinMarginRight(double minMarginRight) {
        this.minMarginRight = minMarginRight;
        return this;
    }

    public Double getMinMarginRight() {
        return minMarginRight;
    }

    /**
     * @param minMarginTop If top side has a value axis and autoMargins is set to true (default), the margin
     *                     of this side will be not less than set on minMarginTop property.
     * @return AmRectangularChart
     */
    public AmRectangularChart setMinMarginTop(double minMarginTop) {
        this.minMarginTop = minMarginTop;
        return this;
    }

    public Double getMinMarginTop() {
        return minMarginTop;
    }

    /**
     * @param plotAreaBorderAlpha The opacity of plot area's border. Value range is 0 - 1.
     * @return AmRectangularChart
     */
    public AmRectangularChart setPlotAreaBorderAlpha(double plotAreaBorderAlpha) {
        this.plotAreaBorderAlpha = plotAreaBorderAlpha;
        return this;
    }

    public Double getPlotAreaBorderAlpha() {
        return plotAreaBorderAlpha;
    }

    /**
     * @param plotAreaBorderColor The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha
     *                            default value is 0. Set it to a value higher than 0 to make it visible.
     * @return AmRectangularChart
     */
    public AmRectangularChart setPlotAreaBorderColor(Color plotAreaBorderColor) {
        this.plotAreaBorderColor = plotAreaBorderColor;
        return this;
    }

    public Color getPlotAreaBorderColor() {
        return plotAreaBorderColor;
    }

    /**
     * @param plotAreaFillAlphas Opacity of plot area. Plural form is used to keep the same property names as our
     *                           Flex charts'. Flex charts can accept array of numbers to generate gradients. Although
     *                           you can set array here, only first value of this array will be used.
     * @return AmRectangularChart
     */
    public AmRectangularChart setPlotAreaFillAlphas(double plotAreaFillAlphas) {
        this.plotAreaFillAlphas = plotAreaFillAlphas;
        return this;
    }

    public Double getPlotAreaFillAlphas() {
        return plotAreaFillAlphas;
    }

    /**
     * @param plotAreaFillColors You can set both one color if you need a solid color or array of colors to generate
     *                           gradients, for example: ["#000000", "#0000CC"]
     * @return AmRectangularChart
     */
    public AmRectangularChart setPlotAreaFillColors(Color plotAreaFillColors) {
        this.plotAreaFillColors = plotAreaFillColors;
        return this;
    }

    public Color getPlotAreaFillColors() {
        return plotAreaFillColors;
    }

    /**
     * @param plotAreaGradientAngle If you are using gradients to fill the plot area, you can use this property to set
     *                              gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180,
     *                              270.
     * @return AmRectangularChart
     */
    public AmRectangularChart setPlotAreaGradientAngle(double plotAreaGradientAngle) {
        this.plotAreaGradientAngle = plotAreaGradientAngle;
        return this;
    }

    public Double getPlotAreaGradientAngle() {
        return plotAreaGradientAngle;
    }

    /**
     * @param trendLines Array of trend lines added to a chart. You can add trend lines to a chart using this
     *                   array or access already existing trend lines
     * @return AmRectangularChart
     */
    public AmRectangularChart setTrendLines(List<TrendLine> trendLines) {
        this.trendLines = trendLines;
        return this;
    }

    public List<TrendLine> getTrendLines() {
        return trendLines;
    }

    /**
     * @param zoomOutButtonAlpha Opacity of zoom-out button background.
     * @return AmRectangularChart
     */
    public AmRectangularChart setZoomOutButtonAlpha(double zoomOutButtonAlpha) {
        this.zoomOutButtonAlpha = zoomOutButtonAlpha;
        return this;
    }

    public Double getZoomOutButtonAlpha() {
        return zoomOutButtonAlpha;
    }

    /**
     * @param zoomOutButtonColor Zoom-out button background color.
     * @return AmRectangularChart
     */
    public AmRectangularChart setZoomOutButtonColor(Color zoomOutButtonColor) {
        this.zoomOutButtonColor = zoomOutButtonColor;
        return this;
    }

    public Color getZoomOutButtonColor() {
        return zoomOutButtonColor;
    }

    /**
     * @param zoomOutButtonImage Name of zoom-out button image. In the images folder there is another lens image,
     *                           called lensWhite.png. You might want to have white lens when background is dark.
     *                           Or you can simply use your own image. Note, you don't have to set image extension.
     *                           If svgIcons is set to true (default) .svg will be added to the file name if SVG is
     *                           supported by the browser, otherwise – .png.
     * @return AmRectangularChart
     */
    public AmRectangularChart setZoomOutButtonImage(String zoomOutButtonImage) {
        this.zoomOutButtonImage = zoomOutButtonImage;
        return this;
    }

    public String getZoomOutButtonImage() {
        return zoomOutButtonImage;
    }

    /**
     * @param zoomOutButtonImageSize Size of zoom-out button image
     * @return AmRectangularChart
     */
    public AmRectangularChart setZoomOutButtonImageSize(double zoomOutButtonImageSize) {
        this.zoomOutButtonImageSize = zoomOutButtonImageSize;
        return this;
    }

    public Double getZoomOutButtonImageSize() {
        return zoomOutButtonImageSize;
    }

    /**
     * @param zoomOutButtonPadding Padding around the text and image.
     * @return AmRectangularChart
     */
    public AmRectangularChart setZoomOutButtonPadding(double zoomOutButtonPadding) {
        this.zoomOutButtonPadding = zoomOutButtonPadding;
        return this;
    }

    public Double getZoomOutButtonPadding() {
        return zoomOutButtonPadding;
    }

    /**
     * @param zoomOutButtonRollOverAlpha Opacity of zoom-out button background when mouse is over it.
     * @return AmRectangularChart
     */
    public AmRectangularChart setZoomOutButtonRollOverAlpha(double zoomOutButtonRollOverAlpha) {
        this.zoomOutButtonRollOverAlpha = zoomOutButtonRollOverAlpha;
        return this;
    }

    public Double getZoomOutButtonRollOverAlpha() {
        return zoomOutButtonRollOverAlpha;
    }

    /**
     * @param zoomOutButtonTabIndex In case you set it to some number, the chart will set focus on zoom-out button when
     *                              user clicks tab key. When a focus is set, screen readers like NVDA Screen reader
     *                              will read zoomOutText. If user clicks Enter when a focus is set, the chart will zoom-out.
     *                              Note, not all browsers and readers support this.
     * @return AmRectangularChart
     */
    public AmRectangularChart setZoomOutButtonTabIndex(double zoomOutButtonTabIndex) {
        this.zoomOutButtonTabIndex = zoomOutButtonTabIndex;
        return this;
    }

    public Double getZoomOutButtonTabIndex() {
        return zoomOutButtonTabIndex;
    }

    /**
     * @param zoomOutText Text in the zoom-out button.
     * @return AmRectangularChart
     */
    public AmRectangularChart setZoomOutText(String zoomOutText) {
        this.zoomOutText = zoomOutText;
        return this;
    }

    public String getZoomOutText() {
        return zoomOutText;
    }

}