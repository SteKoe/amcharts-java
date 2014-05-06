package de.stekoe.amcharts;

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
    public void setAngle(double angle) {
        this.angle = angle;
    }
    public Double getAngle() {
        return angle;
    }

    /**
     * Space left from axis labels/title to the chart's outside border, if autoMargins set
     * to true.
     **/
    public void setAutoMarginOffset(double autoMarginOffset) {
        this.autoMarginOffset = autoMarginOffset;
    }
    public Double getAutoMarginOffset() {
        return autoMarginOffset;
    }

    /**
     * Specifies if margins of a chart should be calculated automatically so that labels
     * of axes would fit. The chart will adjust only margins with axes. Other margins will
     * use values set with marginRight, marginTop, marginLeft and marginBottom properties.
     **/
    public void setAutoMargins(boolean autoMargins) {
        this.autoMargins = autoMargins;
    }
    public boolean isAutoMargins() {
        return autoMargins;
    }

    /**
     * Cursor of a chart.
     **/
    public void setChartCursor(ChartCursor chartCursor) {
        this.chartCursor = chartCursor;
    }
    public ChartCursor getChartCursor() {
        return chartCursor;
    }

    /**
     * Chart's scrollbar.
     **/
    public void setChartScrollbar(ChartScrollbar chartScrollbar) {
        this.chartScrollbar = chartScrollbar;
    }
    public ChartScrollbar getChartScrollbar() {
        return chartScrollbar;
    }

    /**
     * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is
     * > 0).
     **/
    public void setDepth3D(double depth3D) {
        this.depth3D = depth3D;
    }
    public Double getDepth3D() {
        return depth3D;
    }

    /**
     * Number of pixels between the container's bottom border and plot area. This space
     * can be used for bottom axis' values. If autoMargin is true and bottom side has axis,
     * this property is ignored.
     **/
    public void setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
    }
    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Number of pixels between the container's left border and plot area. This space can
     * be used for left axis' values. If autoMargin is true and left side has axis, this
     * property is ignored.
     **/
    public void setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
    }
    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Number of pixels between the container's right border and plot area. This space can
     * be used for Right axis' values. If autoMargin is true and right side has axis, this
     * property is ignored.
     **/
    public void setMarginRight(double marginRight) {
        this.marginRight = marginRight;
    }
    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Flag which should be set to false if you need margins to be recalculated on next
     * chart.validateNow() call.
     **/
    public void setMarginsUpdated(boolean marginsUpdated) {
        this.marginsUpdated = marginsUpdated;
    }
    public boolean isMarginsUpdated() {
        return marginsUpdated;
    }

    /**
     * Number of pixels between the container's top border and plot area. This space can
     * be used for top axis' values. If autoMargin is true and top side has axis, this property
     * is ignored.
     **/
    public void setMarginTop(double marginTop) {
        this.marginTop = marginTop;
    }
    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * The opacity of plot area's border. Value range is 0 - 1.
     **/
    public void setPlotAreaBorderAlpha(double plotAreaBorderAlpha) {
        this.plotAreaBorderAlpha = plotAreaBorderAlpha;
    }
    public Double getPlotAreaBorderAlpha() {
        return plotAreaBorderAlpha;
    }

    /**
     * The color of the plot area's border. Note, the it is invisible by default, as plotAreaBorderAlpha
     * default value is 0. Set it to a value higher than 0 to make it visible.
     **/
    public void setPlotAreaBorderColor(Color plotAreaBorderColor) {
        this.plotAreaBorderColor = plotAreaBorderColor;
    }
    public Color getPlotAreaBorderColor() {
        return plotAreaBorderColor;
    }

    /**
     * Opacity of plot area. Plural form is used to keep the same property names as our
     * Flex charts'. Flex charts can accept array of numbers to generate gradients. Although
     * you can set array here, only first value of this array will be used.
     **/
    public void setPlotAreaFillAlphas(double plotAreaFillAlphas) {
        this.plotAreaFillAlphas = plotAreaFillAlphas;
    }
    public Double getPlotAreaFillAlphas() {
        return plotAreaFillAlphas;
    }

    /**
     * You can set both one color if you need a solid color or array of colors to generate
     * gradients, for example: ["#000000", "#0000CC"]
     **/
    public void setPlotAreaFillColors(Color plotAreaFillColors) {
        this.plotAreaFillColors = plotAreaFillColors;
    }
    public Color getPlotAreaFillColors() {
        return plotAreaFillColors;
    }

    /**
     * If you are using gradients to fill the plot area, you can use this property to set
     * gradient angle. The only allowed values are horizontal and vertical: 0, 90, 180,
     * 270.
     **/
    public void setPlotAreaGradientAngle(double plotAreaGradientAngle) {
        this.plotAreaGradientAngle = plotAreaGradientAngle;
    }
    public Double getPlotAreaGradientAngle() {
        return plotAreaGradientAngle;
    }

    /**
     * Array of trend lines added to a chart. You can add trend lines to a chart using this
     * array or access already existing trend lines
     **/
    public void setTrendLines(List<TrendLine> trendLines) {
        this.trendLines = trendLines;
    }
    public List<TrendLine> getTrendLines() {
        return trendLines;
    }

    /**
     * Opacity of zoom-out button background.
     **/
    public void setZoomOutButtonAlpha(double zoomOutButtonAlpha) {
        this.zoomOutButtonAlpha = zoomOutButtonAlpha;
    }
    public Double getZoomOutButtonAlpha() {
        return zoomOutButtonAlpha;
    }

    /**
     * Zoom-out button background color.
     **/
    public void setZoomOutButtonColor(Color zoomOutButtonColor) {
        this.zoomOutButtonColor = zoomOutButtonColor;
    }
    public Color getZoomOutButtonColor() {
        return zoomOutButtonColor;
    }

    /**
     * Name of zoom-out button image. In the images folder there is another lens image,
     * called lensWhite.png. You might want to have white lens when background is dark.
     * Or you can simply use your own image.
     **/
    public void setZoomOutButtonImage(String zoomOutButtonImage) {
        this.zoomOutButtonImage = zoomOutButtonImage;
    }
    public String getZoomOutButtonImage() {
        return zoomOutButtonImage;
    }

    /**
     * Size of zoom-out button image
     **/
    public void setZoomOutButtonImageSize(double zoomOutButtonImageSize) {
        this.zoomOutButtonImageSize = zoomOutButtonImageSize;
    }
    public Double getZoomOutButtonImageSize() {
        return zoomOutButtonImageSize;
    }

    /**
     * Padding around the text and image.
     **/
    public void setZoomOutButtonPadding(double zoomOutButtonPadding) {
        this.zoomOutButtonPadding = zoomOutButtonPadding;
    }
    public Double getZoomOutButtonPadding() {
        return zoomOutButtonPadding;
    }

    /**
     * Opacity of zoom-out button background when mouse is over it.
     **/
    public void setZoomOutButtonRollOverAlpha(double zoomOutButtonRollOverAlpha) {
        this.zoomOutButtonRollOverAlpha = zoomOutButtonRollOverAlpha;
    }
    public Double getZoomOutButtonRollOverAlpha() {
        return zoomOutButtonRollOverAlpha;
    }

    /**
     * Text in the zoom-out button.
     **/
    public void setZoomOutText(String zoomOutText) {
        this.zoomOutText = zoomOutText;
    }
    public String getZoomOutText() {
        return zoomOutText;
    }

}