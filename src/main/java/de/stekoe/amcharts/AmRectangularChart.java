package de.stekoe.amcharts;

import java.util.List;

import de.stekoe.amcharts.addition.Color;

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
    private String zoomOutText;

    /**
     * The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D"
     * is > 0).
     **/
    public Double getAngle() {
        return angle;
    }
    public AmRectangularChart setAngle(double angle) {
        this.angle = angle;
        return this;
    }

    /**
     * Space left from axis labels/title to the chart's outside border, if autoMargins set
     * to true.
     **/
    public Double getAutoMarginOffset() {
        return autoMarginOffset;
    }
    public AmRectangularChart setAutoMarginOffset(double autoMarginOffset) {
        this.autoMarginOffset = autoMarginOffset;
        return this;
    }

    /**
     * Specifies if margins of a chart should be calculated automatically so that labels
     * of axes would fit. The chart will adjust only margins with axes. Other margins will
     * use values set with marginRight, marginTop, marginLeft and marginBottom properties.
     **/
    public Boolean getAutoMargins() {
        return autoMargins;
    }
    public AmRectangularChart setAutoMargins(boolean autoMargins) {
        this.autoMargins = autoMargins;
        return this;
    }

    /**
     * Cursor of a chart.
     **/
    public ChartCursor getChartCursor() {
        return chartCursor;
    }
    public AmRectangularChart setChartCursor(ChartCursor chartCursor) {
        this.chartCursor = chartCursor;
        return this;
    }

    /**
     * Chart's scrollbar.
     **/
    public ChartScrollbar getChartScrollbar() {
        return chartScrollbar;
    }
    public AmRectangularChart setChartScrollbar(ChartScrollbar chartScrollbar) {
        this.chartScrollbar = chartScrollbar;
        return this;
    }

    /**
     * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is
     * > 0).
     **/
    public Double getDepth3D() {
        return depth3D;
    }
    public AmRectangularChart setDepth3D(double depth3D) {
        this.depth3D = depth3D;
        return this;
    }

    /**
     * Number of pixels between the container's bottom border and plot area. This space
     * can be used for bottom axis' values. If autoMargin is true and bottom side has axis,
     * this property is ignored.
     **/
    public Double getMarginBottom() {
        return marginBottom;
    }
    public AmRectangularChart setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    /**
     * Number of pixels between the container's left border and plot area. This space can
     * be used for left axis' values. If autoMargin is true and left side has axis, this
     * property is ignored.
     **/
    public Double getMarginLeft() {
        return marginLeft;
    }
    public AmRectangularChart setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    /**
     * Number of pixels between the container's right border and plot area. This space can
     * be used for Right axis' values. If autoMargin is true and right side has axis, this
     * property is ignored.
     **/
    public Double getMarginRight() {
        return marginRight;
    }
    public AmRectangularChart setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    /**
     * Flag which should be set to false if you need margins to be recalculated on next
     * chart.validateNow() call.
     **/
    public Boolean getMarginsUpdated() {
        return marginsUpdated;
    }
    public AmRectangularChart setMarginsUpdated(boolean marginsUpdated) {
        this.marginsUpdated = marginsUpdated;
        return this;
    }

    /**
     * Number of pixels between the container's top border and plot area. This space can
     * be used for top axis' values. If autoMargin is true and top side has axis, this property
     * is ignored.
     **/
    public Double getMarginTop() {
        return marginTop;
    }
    public AmRectangularChart setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    /**
     * The opacity of plot area's border. Value range is 0 - 1.
     **/
    public Double getPlotAreaBorderAlpha() {
        return plotAreaBorderAlpha;
    }
    public AmRectangularChart setPlotAreaBorderAlpha(double plotAreaBorderAlpha) {
        this.plotAreaBorderAlpha = plotAreaBorderAlpha;
        return this;
    }

    /**
     * The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha
     * default value is 0. Set it to a value higher than 0 to make it visible.
     **/
    public Color getPlotAreaBorderColor() {
        return plotAreaBorderColor;
    }
    public AmRectangularChart setPlotAreaBorderColor(Color plotAreaBorderColor) {
        this.plotAreaBorderColor = plotAreaBorderColor;
        return this;
    }

    /**
     * Opacity of plot area. Plural form is used to keep the same property names as our
     * Flex charts'. Flex charts can accept array of numbers to generate gradients. Although
     * you can set array here, only first value of this array will be used.
     **/
    public Double getPlotAreaFillAlphas() {
        return plotAreaFillAlphas;
    }
    public AmRectangularChart setPlotAreaFillAlphas(double plotAreaFillAlphas) {
        this.plotAreaFillAlphas = plotAreaFillAlphas;
        return this;
    }

    /**
     * You can set both one color if you need a solid color or array of colors to generate
     * gradients, for example: ["#000000", "#0000CC"]
     **/
    public Color getPlotAreaFillColors() {
        return plotAreaFillColors;
    }
    public AmRectangularChart setPlotAreaFillColors(Color plotAreaFillColors) {
        this.plotAreaFillColors = plotAreaFillColors;
        return this;
    }

    /**
     * If you are using gradients to fill the plot area, you can use this property to set
     * gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180,
     * 270.
     **/
    public Double getPlotAreaGradientAngle() {
        return plotAreaGradientAngle;
    }
    public AmRectangularChart setPlotAreaGradientAngle(double plotAreaGradientAngle) {
        this.plotAreaGradientAngle = plotAreaGradientAngle;
        return this;
    }

    /**
     * Array of trend lines added to a chart. You can add trend lines to a chart using this
     * array or access already existing trend lines
     **/
    public List<TrendLine> getTrendLines() {
        return trendLines;
    }
    public AmRectangularChart setTrendLines(List<TrendLine> trendLines) {
        this.trendLines = trendLines;
        return this;
    }

    /**
     * Opacity of zoom-out button background.
     **/
    public Double getZoomOutButtonAlpha() {
        return zoomOutButtonAlpha;
    }
    public AmRectangularChart setZoomOutButtonAlpha(double zoomOutButtonAlpha) {
        this.zoomOutButtonAlpha = zoomOutButtonAlpha;
        return this;
    }

    /**
     * Zoom-out button background color.
     **/
    public Color getZoomOutButtonColor() {
        return zoomOutButtonColor;
    }
    public AmRectangularChart setZoomOutButtonColor(Color zoomOutButtonColor) {
        this.zoomOutButtonColor = zoomOutButtonColor;
        return this;
    }

    /**
     * Name of zoom-out button image. In the images folder there is another lens image,
     * called lensWhite.png. You might want to have white lens when background is dark.
     * Or you can simply use your own image.
     **/
    public String getZoomOutButtonImage() {
        return zoomOutButtonImage;
    }
    public AmRectangularChart setZoomOutButtonImage(String zoomOutButtonImage) {
        this.zoomOutButtonImage = zoomOutButtonImage;
        return this;
    }

    /**
     * Size of zoom-out button image
     **/
    public Double getZoomOutButtonImageSize() {
        return zoomOutButtonImageSize;
    }
    public AmRectangularChart setZoomOutButtonImageSize(double zoomOutButtonImageSize) {
        this.zoomOutButtonImageSize = zoomOutButtonImageSize;
        return this;
    }

    /**
     * Padding around the text and image.
     **/
    public Double getZoomOutButtonPadding() {
        return zoomOutButtonPadding;
    }
    public AmRectangularChart setZoomOutButtonPadding(double zoomOutButtonPadding) {
        this.zoomOutButtonPadding = zoomOutButtonPadding;
        return this;
    }

    /**
     * Opacity of zoom-out button background when mouse is over it.
     **/
    public Double getZoomOutButtonRollOverAlpha() {
        return zoomOutButtonRollOverAlpha;
    }
    public AmRectangularChart setZoomOutButtonRollOverAlpha(double zoomOutButtonRollOverAlpha) {
        this.zoomOutButtonRollOverAlpha = zoomOutButtonRollOverAlpha;
        return this;
    }

    /**
     * Text in the zoom-out button.
     **/
    public String getZoomOutText() {
        return zoomOutText;
    }
    public AmRectangularChart setZoomOutText(String zoomOutText) {
        this.zoomOutText = zoomOutText;
        return this;
    }

}