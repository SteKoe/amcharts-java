package de.stekoe.amcharts;

import org.json.JSONObject;

import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.helper.Jsonifyable;
import de.stekoe.amcharts.helper.Jsonifyer;

public class ChartScrollbar implements Jsonifyable {
    private Boolean autoGridCount;
    private Double backgroundAlpha;
    private Color backgroundColor;
    private CategoryAxis categoryAxis;
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
    public Boolean getAutoGridCount() {
        return autoGridCount;
    }
    public ChartScrollbar setAutoGridCount(boolean autoGridCount) {
        this.autoGridCount = autoGridCount;
        return this;
    }

    /**
     * Background opacity.
     **/
    public Double getBackgroundAlpha() {
        return backgroundAlpha;
    }
    public ChartScrollbar setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
        return this;
    }

    /**
     * Background color of the scrollbar.
     **/
    public Color getBackgroundColor() {
        return backgroundColor;
    }
    public ChartScrollbar setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * Read-only. Category axis of the scrollbar.
     **/
    public CategoryAxis getCategoryAxis() {
        return categoryAxis;
    }
    public ChartScrollbar setCategoryAxis(CategoryAxis categoryAxis) {
        this.categoryAxis = categoryAxis;
        return this;
    }

    /**
     * Text color.
     **/
    public Color getColor() {
        return color;
    }
    public ChartScrollbar setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Height of resize grip image. Note, you should also update the image in amcharts/images
     * folder if you don't want it to be distorted because of resizing.
     **/
    public Double getDragIconHeight() {
        return dragIconHeight;
    }
    public ChartScrollbar setDragIconHeight(double dragIconHeight) {
        this.dragIconHeight = dragIconHeight;
        return this;
    }

    /**
     * Width of resize grip image. Note, you should also update the image in amcharts/images
     * folder if you don't want it to be distorted because of resizing.
     **/
    public Double getDragIconWidth() {
        return dragIconWidth;
    }
    public ChartScrollbar setDragIconWidth(double dragIconWidth) {
        this.dragIconWidth = dragIconWidth;
        return this;
    }

    /**
     * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar
     * can display a graph.
     **/
    public AmGraph getGraph() {
        return graph;
    }
    public ChartScrollbar setGraph(AmGraph graph) {
        this.graph = graph;
        return this;
    }

    /**
     * Graph fill opacity. Value range is 0 - 1.
     **/
    public Double getGraphFillAlpha() {
        return graphFillAlpha;
    }
    public ChartScrollbar setGraphFillAlpha(double graphFillAlpha) {
        this.graphFillAlpha = graphFillAlpha;
        return this;
    }

    /**
     * Graph fill color.
     **/
    public Color getGraphFillColor() {
        return graphFillColor;
    }
    public ChartScrollbar setGraphFillColor(Color graphFillColor) {
        this.graphFillColor = graphFillColor;
        return this;
    }

    /**
     * Graph line opacity. Value range is 0 - 1.
     **/
    public Double getGraphLineAlpha() {
        return graphLineAlpha;
    }
    public ChartScrollbar setGraphLineAlpha(double graphLineAlpha) {
        this.graphLineAlpha = graphLineAlpha;
        return this;
    }

    /**
     * Graph line color.
     **/
    public Color getGraphLineColor() {
        return graphLineColor;
    }
    public ChartScrollbar setGraphLineColor(Color graphLineColor) {
        this.graphLineColor = graphLineColor;
        return this;
    }

    /**
     * by default the graph type is the same as the original graph's type, however in case
     * of candlestick or ohlc you might want to show line graph in the scrollbar. Possible
     * values are: line, column, step, smoothedLine, candlestick, ohlc
     **/
    public String getGraphType() {
        return graphType;
    }
    public ChartScrollbar setGraphType(String graphType) {
        this.graphType = graphType;
        return this;
    }

    /**
     * Grid opacity. Value range is 0 - 1.
     **/
    public Double getGridAlpha() {
        return gridAlpha;
    }
    public ChartScrollbar setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
        return this;
    }

    /**
     * Grid color.
     **/
    public Color getGridColor() {
        return gridColor;
    }
    public ChartScrollbar setGridColor(Color gridColor) {
        this.gridColor = gridColor;
        return this;
    }

    /**
     * The number of grid lines.
     **/
    public Double getGridCount() {
        return gridCount;
    }
    public ChartScrollbar setGridCount(double gridCount) {
        this.gridCount = gridCount;
        return this;
    }

    /**
     * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
     **/
    public Boolean getHideResizeGrips() {
        return hideResizeGrips;
    }
    public ChartScrollbar setHideResizeGrips(boolean hideResizeGrips) {
        this.hideResizeGrips = hideResizeGrips;
        return this;
    }

    /**
     *      *Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, of not set.
     **/
    public Double getMaximum() {
        return maximum;
    }
    public ChartScrollbar setMaximum(double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     *      *Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, of not set.
     **/
    public Double getMinimum() {
        return minimum;
    }
    public ChartScrollbar setMinimum(double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Distance from plot area to scrollbar, in pixels.
     **/
    public Double getOffset() {
        return offset;
    }
    public ChartScrollbar setOffset(double offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Specifies whether scrollbar has a resize feature.
     **/
    public Boolean getResizeEnabled() {
        return resizeEnabled;
    }
    public ChartScrollbar setResizeEnabled(boolean resizeEnabled) {
        this.resizeEnabled = resizeEnabled;
        return this;
    }

    /**
     * Height (width, if chart is rotated) of a scrollbar.
     **/
    public Double getScrollbarHeight() {
        return scrollbarHeight;
    }
    public ChartScrollbar setScrollbarHeight(double scrollbarHeight) {
        this.scrollbarHeight = scrollbarHeight;
        return this;
    }

    /**
     * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
     * Note, updateOnReleaseOnly should be set to false in order animation to happen.
     **/
    public Double getScrollDuration() {
        return scrollDuration;
    }
    public ChartScrollbar setScrollDuration(double scrollDuration) {
        this.scrollDuration = scrollDuration;
        return this;
    }

    /**
     * Selected backround opacity.
     **/
    public Double getSelectedBackgroundAlpha() {
        return selectedBackgroundAlpha;
    }
    public ChartScrollbar setSelectedBackgroundAlpha(double selectedBackgroundAlpha) {
        this.selectedBackgroundAlpha = selectedBackgroundAlpha;
        return this;
    }

    /**
     * Selected background color.
     **/
    public Color getSelectedBackgroundColor() {
        return selectedBackgroundColor;
    }
    public ChartScrollbar setSelectedBackgroundColor(Color selectedBackgroundColor) {
        this.selectedBackgroundColor = selectedBackgroundColor;
        return this;
    }

    /**
     * Selected graph's fill opacity. Value range is 0 - 1.
     **/
    public Double getSelectedGraphFillAlpha() {
        return selectedGraphFillAlpha;
    }
    public ChartScrollbar setSelectedGraphFillAlpha(double selectedGraphFillAlpha) {
        this.selectedGraphFillAlpha = selectedGraphFillAlpha;
        return this;
    }

    /**
     * Selected graph's fill color.
     **/
    public Color getSelectedGraphFillColor() {
        return selectedGraphFillColor;
    }
    public ChartScrollbar setSelectedGraphFillColor(Color selectedGraphFillColor) {
        this.selectedGraphFillColor = selectedGraphFillColor;
        return this;
    }

    /**
     * Selected graph's line opacity. Value range is 0 - 1.
     **/
    public Double getSelectedGraphLineAlpha() {
        return selectedGraphLineAlpha;
    }
    public ChartScrollbar setSelectedGraphLineAlpha(double selectedGraphLineAlpha) {
        this.selectedGraphLineAlpha = selectedGraphLineAlpha;
        return this;
    }

    /**
     * Selected graph's line color.
     **/
    public Color getSelectedGraphLineColor() {
        return selectedGraphLineColor;
    }
    public ChartScrollbar setSelectedGraphLineColor(Color selectedGraphLineColor) {
        this.selectedGraphLineColor = selectedGraphLineColor;
        return this;
    }

    /**
     * Specifies if the chart should be updated while dragging/resizing the scrollbar or
     * only at the moment when user releases mouse button.
     **/
    public Boolean getUpdateOnReleaseOnly() {
        return updateOnReleaseOnly;
    }
    public ChartScrollbar setUpdateOnReleaseOnly(boolean updateOnReleaseOnly) {
        this.updateOnReleaseOnly = updateOnReleaseOnly;
        return this;
    }

    public JSONObject toJson() {
        return new Jsonifyer(this).toJson();
    }
}