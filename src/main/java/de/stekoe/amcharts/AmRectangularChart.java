package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.util.List;

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
     * The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D"
     * is > 0).
     **/
    public AmRectangularChart setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    public Double getAngle() {
        return angle;
    }

    /**
     * Space left from axis labels/title to the chart's outside border, if autoMargins set
     * to true.
     **/
    public AmRectangularChart setAutoMarginOffset(double autoMarginOffset) {
        this.autoMarginOffset = autoMarginOffset;
        return this;
    }

    public Double getAutoMarginOffset() {
        return autoMarginOffset;
    }

    /**
     * Specifies if margins of a chart should be calculated automatically so that labels
     * of axes would fit. The chart will adjust only margins with axes. Other margins will
     * use values set with marginRight, marginTop, marginLeft and marginBottom properties.
     **/
    public AmRectangularChart setAutoMargins(boolean autoMargins) {
        this.autoMargins = autoMargins;
        return this;
    }

    public Boolean getAutoMargins() {
        return autoMargins;
    }

    /**
     * Cursor of a chart.
     **/
    public AmRectangularChart setChartCursor(ChartCursor chartCursor) {
        this.chartCursor = chartCursor;
        return this;
    }

    public ChartCursor getChartCursor() {
        return chartCursor;
    }

    /**
     * Chart's scrollbar.
     **/
    public AmRectangularChart setChartScrollbar(ChartScrollbar chartScrollbar) {
        this.chartScrollbar = chartScrollbar;
        return this;
    }

    public ChartScrollbar getChartScrollbar() {
        return chartScrollbar;
    }

    /**
     * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is
     * > 0).
     **/
    public AmRectangularChart setDepth3D(double depth3D) {
        this.depth3D = depth3D;
        return this;
    }

    public Double getDepth3D() {
        return depth3D;
    }

    /**
     * Number of pixels between the container's bottom border and plot area. This space
     * can be used for bottom axis' values. If autoMargin is true and bottom side has axis,
     * this property is ignored.
     **/
    public AmRectangularChart setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Number of pixels between the container's left border and plot area. This space can
     * be used for left axis' values. If autoMargin is true and left side has axis, this
     * property is ignored.
     **/
    public AmRectangularChart setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Number of pixels between the container's right border and plot area. This space can
     * be used for Right axis' values. If autoMargin is true and right side has axis, this
     * property is ignored.
     **/
    public AmRectangularChart setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Flag which should be set to false if you need margins to be recalculated on next
     * chart.validateNow() call.
     **/
    public AmRectangularChart setMarginsUpdated(boolean marginsUpdated) {
        this.marginsUpdated = marginsUpdated;
        return this;
    }

    public Boolean getMarginsUpdated() {
        return marginsUpdated;
    }

    /**
     * Number of pixels between the container's top border and plot area. This space can
     * be used for top axis' values. If autoMargin is true and top side has axis, this property
     * is ignored.
     **/
    public AmRectangularChart setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * Maximum zoom factor value axes.
     **/
    public AmRectangularChart setMaxZoomFactor(double maxZoomFactor) {
        this.maxZoomFactor = maxZoomFactor;
        return this;
    }

    public Double getMaxZoomFactor() {
        return maxZoomFactor;
    }

    /**
     * If bottom side has a value axis and autoMargins is set to true (default), the margin
     * of this side will be not less than set on minMarginBottom property.
     **/
    public AmRectangularChart setMinMarginBottom(double minMarginBottom) {
        this.minMarginBottom = minMarginBottom;
        return this;
    }

    public Double getMinMarginBottom() {
        return minMarginBottom;
    }

    /**
     * If left side has a value axis and autoMargins is set to true (default), the margin
     * of this side will be not less than set on minMarginLeft property.
     **/
    public AmRectangularChart setMinMarginLeft(double minMarginLeft) {
        this.minMarginLeft = minMarginLeft;
        return this;
    }

    public Double getMinMarginLeft() {
        return minMarginLeft;
    }

    /**
     * If right side has a value axis and autoMargins is set to true (default), the margin
     * of this side will be not less than set on minMarginRight property.
     **/
    public AmRectangularChart setMinMarginRight(double minMarginRight) {
        this.minMarginRight = minMarginRight;
        return this;
    }

    public Double getMinMarginRight() {
        return minMarginRight;
    }

    /**
     * If top side has a value axis and autoMargins is set to true (default), the margin
     * of this side will be not less than set on minMarginTop property.
     **/
    public AmRectangularChart setMinMarginTop(double minMarginTop) {
        this.minMarginTop = minMarginTop;
        return this;
    }

    public Double getMinMarginTop() {
        return minMarginTop;
    }

    /**
     * The opacity of plot area's border. Value range is 0 - 1.
     **/
    public AmRectangularChart setPlotAreaBorderAlpha(double plotAreaBorderAlpha) {
        this.plotAreaBorderAlpha = plotAreaBorderAlpha;
        return this;
    }

    public Double getPlotAreaBorderAlpha() {
        return plotAreaBorderAlpha;
    }

    /**
     * The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha
     * default value is 0. Set it to a value higher than 0 to make it visible.
     **/
    public AmRectangularChart setPlotAreaBorderColor(Color plotAreaBorderColor) {
        this.plotAreaBorderColor = plotAreaBorderColor;
        return this;
    }

    public Color getPlotAreaBorderColor() {
        return plotAreaBorderColor;
    }

    /**
     * Opacity of plot area. Plural form is used to keep the same property names as our
     * Flex charts'. Flex charts can accept array of numbers to generate gradients. Although
     * you can set array here, only first value of this array will be used.
     **/
    public AmRectangularChart setPlotAreaFillAlphas(double plotAreaFillAlphas) {
        this.plotAreaFillAlphas = plotAreaFillAlphas;
        return this;
    }

    public Double getPlotAreaFillAlphas() {
        return plotAreaFillAlphas;
    }

    /**
     * You can set both one color if you need a solid color or array of colors to generate
     * gradients, for example: ["#000000", "#0000CC"]
     **/
    public AmRectangularChart setPlotAreaFillColors(Color plotAreaFillColors) {
        this.plotAreaFillColors = plotAreaFillColors;
        return this;
    }

    public Color getPlotAreaFillColors() {
        return plotAreaFillColors;
    }

    /**
     * If you are using gradients to fill the plot area, you can use this property to set
     * gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180,
     * 270.
     **/
    public AmRectangularChart setPlotAreaGradientAngle(double plotAreaGradientAngle) {
        this.plotAreaGradientAngle = plotAreaGradientAngle;
        return this;
    }

    public Double getPlotAreaGradientAngle() {
        return plotAreaGradientAngle;
    }

    /**
     * Array of trend lines added to a chart. You can add trend lines to a chart using this
     * array or access already existing trend lines
     **/
    public AmRectangularChart setTrendLines(List<TrendLine> trendLines) {
        this.trendLines = trendLines;
        return this;
    }

    public List<TrendLine> getTrendLines() {
        return trendLines;
    }

    /**
     * Opacity of zoom-out button background.
     **/
    public AmRectangularChart setZoomOutButtonAlpha(double zoomOutButtonAlpha) {
        this.zoomOutButtonAlpha = zoomOutButtonAlpha;
        return this;
    }

    public Double getZoomOutButtonAlpha() {
        return zoomOutButtonAlpha;
    }

    /**
     * Zoom-out button background color.
     **/
    public AmRectangularChart setZoomOutButtonColor(Color zoomOutButtonColor) {
        this.zoomOutButtonColor = zoomOutButtonColor;
        return this;
    }

    public Color getZoomOutButtonColor() {
        return zoomOutButtonColor;
    }

    /**
     * Name of zoom-out button image. In the images folder there is another lens image,
     * called lensWhite.png. You might want to have white lens when background is dark.
     * Or you can simply use your own image. Note, you don't have to set image extension.
     * If svgIcons is set to true (default) .svg will be added to the file name if SVG is
     * supported by the browser, otherwise – .png.
     **/
    public AmRectangularChart setZoomOutButtonImage(String zoomOutButtonImage) {
        this.zoomOutButtonImage = zoomOutButtonImage;
        return this;
    }

    public String getZoomOutButtonImage() {
        return zoomOutButtonImage;
    }

    /**
     * Size of zoom-out button image
     **/
    public AmRectangularChart setZoomOutButtonImageSize(double zoomOutButtonImageSize) {
        this.zoomOutButtonImageSize = zoomOutButtonImageSize;
        return this;
    }

    public Double getZoomOutButtonImageSize() {
        return zoomOutButtonImageSize;
    }

    /**
     * Padding around the text and image.
     **/
    public AmRectangularChart setZoomOutButtonPadding(double zoomOutButtonPadding) {
        this.zoomOutButtonPadding = zoomOutButtonPadding;
        return this;
    }

    public Double getZoomOutButtonPadding() {
        return zoomOutButtonPadding;
    }

    /**
     * Opacity of zoom-out button background when mouse is over it.
     **/
    public AmRectangularChart setZoomOutButtonRollOverAlpha(double zoomOutButtonRollOverAlpha) {
        this.zoomOutButtonRollOverAlpha = zoomOutButtonRollOverAlpha;
        return this;
    }

    public Double getZoomOutButtonRollOverAlpha() {
        return zoomOutButtonRollOverAlpha;
    }

    /**
     * In case you set it to some number, the chart will set focus on zoom-out button when
     * user clicks tab key. When a focus is set, screen readers like NVDA Screen reader
     * will read zoomOutText. If user clicks Enter when a focus is set, the chart will zoom-out.
     * Note, not all browsers and readers support this.
     **/
    public AmRectangularChart setZoomOutButtonTabIndex(double zoomOutButtonTabIndex) {
        this.zoomOutButtonTabIndex = zoomOutButtonTabIndex;
        return this;
    }

    public Double getZoomOutButtonTabIndex() {
        return zoomOutButtonTabIndex;
    }

    /**
     * Text in the zoom-out button.
     **/
    public AmRectangularChart setZoomOutText(String zoomOutText) {
        this.zoomOutText = zoomOutText;
        return this;
    }

    public String getZoomOutText() {
        return zoomOutText;
    }

}