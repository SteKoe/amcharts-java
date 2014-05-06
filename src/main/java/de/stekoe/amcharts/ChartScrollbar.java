package de.stekoe.amcharts;

public class ChartScrollbar {
    private Boolean autoGridCount;
    private Double backgroundAlpha;
    private Color backgroundColor;
    private Color color;
    private Double dragIconHeight;
    private Double dragIconWidth;
    private AmGraph graph;
    private Double graphFillAlpha;
    private Color graphFillColor;
    private Double graphLineAlpha;
    private Color graphLineColor;
    private String graphType;
    private Double gridAlpha;
    private Color gridColor;
    private Double gridCount;
    private Boolean hideResizeGrips;
    private Double maximum;
    private Double minimum;
    private Double offset;
    private Boolean resizeEnabled;
    private Double scrollbarHeight;
    private Double scrollDuration;
    private Double selectedBackgroundAlpha;
    private Color selectedBackgroundColor;
    private Double selectedGraphFillAlpha;
    private Color selectedGraphFillColor;
    private Double selectedGraphLineAlpha;
    private Color selectedGraphLineColor;
    private Boolean updateOnReleaseOnly;

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
     * Background opacity.
     **/
    public void setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
    }
    public Double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Background color of the scrollbar.
     **/
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Text color.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Height of resize grip image. Note, you should also update the image in amcharts/images
     * folder if you don't want it to be distorted because of resizing.
     **/
    public void setDragIconHeight(double dragIconHeight) {
        this.dragIconHeight = dragIconHeight;
    }
    public Double getDragIconHeight() {
        return dragIconHeight;
    }

    /**
     * Width of resize grip image. Note, you should also update the image in amcharts/images
     * folder if you don't want it to be distorted because of resizing.
     **/
    public void setDragIconWidth(double dragIconWidth) {
        this.dragIconWidth = dragIconWidth;
    }
    public Double getDragIconWidth() {
        return dragIconWidth;
    }

    /**
     * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar
     * can display a graph.
     **/
    public void setGraph(AmGraph graph) {
        this.graph = graph;
    }
    public AmGraph getGraph() {
        return graph;
    }

    /**
     * Graph fill opacity. Value range is 0 - 1.
     **/
    public void setGraphFillAlpha(double graphFillAlpha) {
        this.graphFillAlpha = graphFillAlpha;
    }
    public Double getGraphFillAlpha() {
        return graphFillAlpha;
    }

    /**
     * Graph fill color.
     **/
    public void setGraphFillColor(Color graphFillColor) {
        this.graphFillColor = graphFillColor;
    }
    public Color getGraphFillColor() {
        return graphFillColor;
    }

    /**
     * Graph line opacity. Value range is 0 - 1.
     **/
    public void setGraphLineAlpha(double graphLineAlpha) {
        this.graphLineAlpha = graphLineAlpha;
    }
    public Double getGraphLineAlpha() {
        return graphLineAlpha;
    }

    /**
     * Graph line color.
     **/
    public void setGraphLineColor(Color graphLineColor) {
        this.graphLineColor = graphLineColor;
    }
    public Color getGraphLineColor() {
        return graphLineColor;
    }

    /**
     * by default the graph type is the same as the original graph's type, however in case
     * of candlestick or ohlc you might want to show line graph in the scrollbar. Possible
     * values are: line, column, step, smoothedLine, candlestick, ohlc
     **/
    public void setGraphType(String graphType) {
        this.graphType = graphType;
    }
    public String getGraphType() {
        return graphType;
    }

    /**
     * Grid opacity. Value range is 0 - 1.
     **/
    public void setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
    }
    public Double getGridAlpha() {
        return gridAlpha;
    }

    /**
     * Grid color.
     **/
    public void setGridColor(Color gridColor) {
        this.gridColor = gridColor;
    }
    public Color getGridColor() {
        return gridColor;
    }

    /**
     * The number of grid lines.
     **/
    public void setGridCount(double gridCount) {
        this.gridCount = gridCount;
    }
    public Double getGridCount() {
        return gridCount;
    }

    /**
     * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
     **/
    public void setHideResizeGrips(boolean hideResizeGrips) {
        this.hideResizeGrips = hideResizeGrips;
    }
    public boolean isHideResizeGrips() {
        return hideResizeGrips;
    }

    /**
     *      *Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, of not set.
     **/
    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }
    public Double getMaximum() {
        return maximum;
    }

    /**
     *      *Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, of not set.
     **/
    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }
    public Double getMinimum() {
        return minimum;
    }

    /**
     * Distance from plot area to scrollbar, in pixels.
     **/
    public void setOffset(double offset) {
        this.offset = offset;
    }
    public Double getOffset() {
        return offset;
    }

    /**
     * Specifies whether scrollbar has a resize feature.
     **/
    public void setResizeEnabled(boolean resizeEnabled) {
        this.resizeEnabled = resizeEnabled;
    }
    public boolean isResizeEnabled() {
        return resizeEnabled;
    }

    /**
     * Height (width, if chart is rotated) of a scrollbar.
     **/
    public void setScrollbarHeight(double scrollbarHeight) {
        this.scrollbarHeight = scrollbarHeight;
    }
    public Double getScrollbarHeight() {
        return scrollbarHeight;
    }

    /**
     * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
     * Note, updateOnReleaseOnly should be set to false in order animation to happen.
     **/
    public void setScrollDuration(double scrollDuration) {
        this.scrollDuration = scrollDuration;
    }
    public Double getScrollDuration() {
        return scrollDuration;
    }

    /**
     * Selected backround opacity.
     **/
    public void setSelectedBackgroundAlpha(double selectedBackgroundAlpha) {
        this.selectedBackgroundAlpha = selectedBackgroundAlpha;
    }
    public Double getSelectedBackgroundAlpha() {
        return selectedBackgroundAlpha;
    }

    /**
     * Selected background color.
     **/
    public void setSelectedBackgroundColor(Color selectedBackgroundColor) {
        this.selectedBackgroundColor = selectedBackgroundColor;
    }
    public Color getSelectedBackgroundColor() {
        return selectedBackgroundColor;
    }

    /**
     * Selected graph's fill opacity. Value range is 0 - 1.
     **/
    public void setSelectedGraphFillAlpha(double selectedGraphFillAlpha) {
        this.selectedGraphFillAlpha = selectedGraphFillAlpha;
    }
    public Double getSelectedGraphFillAlpha() {
        return selectedGraphFillAlpha;
    }

    /**
     * Selected graph's fill color.
     **/
    public void setSelectedGraphFillColor(Color selectedGraphFillColor) {
        this.selectedGraphFillColor = selectedGraphFillColor;
    }
    public Color getSelectedGraphFillColor() {
        return selectedGraphFillColor;
    }

    /**
     * Selected graph's line opacity. Value range is 0 - 1.
     **/
    public void setSelectedGraphLineAlpha(double selectedGraphLineAlpha) {
        this.selectedGraphLineAlpha = selectedGraphLineAlpha;
    }
    public Double getSelectedGraphLineAlpha() {
        return selectedGraphLineAlpha;
    }

    /**
     * Selected graph's line color.
     **/
    public void setSelectedGraphLineColor(Color selectedGraphLineColor) {
        this.selectedGraphLineColor = selectedGraphLineColor;
    }
    public Color getSelectedGraphLineColor() {
        return selectedGraphLineColor;
    }

    /**
     * Specifies if the chart should be updated while dragging/resizing the scrollbar or
     * only at the moment when user releases mouse button.
     **/
    public void setUpdateOnReleaseOnly(boolean updateOnReleaseOnly) {
        this.updateOnReleaseOnly = updateOnReleaseOnly;
    }
    public boolean isUpdateOnReleaseOnly() {
        return updateOnReleaseOnly;
    }

}