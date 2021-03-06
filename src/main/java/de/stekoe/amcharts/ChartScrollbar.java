package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

/**
 * Create a scrollbar for AmSerialChart and AmXYChart charts.
 */

public class ChartScrollbar implements Serializable {
    private String accessibleLabel;
    private Boolean autoGridCount;
    private Double backgroundAlpha;
    private Color backgroundColor;
    private CategoryAxis categoryAxis;
    private Color color;
    private String dragCursorDown;
    private String dragCursorHover;
    private String dragIcon;
    private Double dragIconHeight;
    private Double dragIconWidth;
    private Boolean enabled;
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
    private String hResizeCursor;
    private String hResizeCursorDown;
    private String hResizeCursorHover;
    private Boolean ignoreCustomColors;
    private Double maximum;
    private Double minimum;
    private Double offset;
    private Boolean oppositeAxis;
    private Boolean resizeEnabled;
    private Double scrollbarHeight;
    private Double scrollDuration;
    private Double selectedBackgroundAlpha;
    private Color selectedBackgroundColor;
    private Double selectedGraphFillAlpha;
    private Color selectedGraphFillColor;
    private Double selectedGraphLineAlpha;
    private Color selectedGraphLineColor;
    private Double tabIndex;
    private Boolean updateOnReleaseOnly;
    private String vResizeCursor;
    private String vResizeCursorDown;
    private String vResizeCursorHover;

    /**
     * @param accessibleLabel Text which screen readers will read if user rolls-over or sets focus using tab key
     *                        (this is possible only if tabIndex property of AmGraph is set to some number) on
     *                        the grips or draggable part of a scrollbar. Text is added as aria-label tag. Note
     *                        - not all screen readers and browsers support this. Note, you should set tabIndex
     *                        to some number in order it would be possible to zoom chart using cursor keys.
     * @return ChartScrollbar
     */
    public ChartScrollbar setAccessibleLabel(String accessibleLabel) {
        this.accessibleLabel = accessibleLabel;
        return this;
    }

    public String getAccessibleLabel() {
        return accessibleLabel;
    }

    /**
     * @param autoGridCount Specifies whether number of gridCount is specified automatically, according to the
     *                      axis size.
     * @return ChartScrollbar
     */
    public ChartScrollbar setAutoGridCount(boolean autoGridCount) {
        this.autoGridCount = autoGridCount;
        return this;
    }

    public Boolean getAutoGridCount() {
        return autoGridCount;
    }

    /**
     * @param backgroundAlpha Background opacity.
     * @return ChartScrollbar
     */
    public ChartScrollbar setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
        return this;
    }

    public Double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * @param backgroundColor Background color of the scrollbar.
     * @return ChartScrollbar
     */
    public ChartScrollbar setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param categoryAxis Read-only. Category axis of the scrollbar.
     * @return ChartScrollbar
     */
    public ChartScrollbar setCategoryAxis(CategoryAxis categoryAxis) {
        this.categoryAxis = categoryAxis;
        return this;
    }

    public CategoryAxis getCategoryAxis() {
        return categoryAxis;
    }

    /**
     * @param color Text color.
     * @return ChartScrollbar
     */
    public ChartScrollbar setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param dragCursorDown Mouse cursor displayed when clicked on selected part of a scrollbar.
     * @return ChartScrollbar
     */
    public ChartScrollbar setDragCursorDown(String dragCursorDown) {
        this.dragCursorDown = dragCursorDown;
        return this;
    }

    public String getDragCursorDown() {
        return dragCursorDown;
    }

    /**
     * @param dragCursorHover Mouse cursor displayed when hovering over selected part of a scrollbar.
     * @return ChartScrollbar
     */
    public ChartScrollbar setDragCursorHover(String dragCursorHover) {
        this.dragCursorHover = dragCursorHover;
        return this;
    }

    public String getDragCursorHover() {
        return dragCursorHover;
    }

    /**
     * @param dragIcon File name of scrollbar drag (resize grip) icon. You can find a set of icons in amcharts/images
     *                 folder - you can choose from these: dragIconRectBig, dragIconRectBigBlack, dragIconRectSmall,
     *                 dragIconRectSmallBlack, dragIconRoundBig, dragIconRoundBigBlack, dragIconRoundSmall,
     *                 dragIconRoundSmallBlack. You can also use your own custom icons. Don't forget to
     *                 change dragIconWidth and dragIconHeight if you change icons.
     * @return ChartScrollbar
     */
    public ChartScrollbar setDragIcon(String dragIcon) {
        this.dragIcon = dragIcon;
        return this;
    }

    public String getDragIcon() {
        return dragIcon;
    }

    /**
     * @param dragIconHeight Height of resize grip image. Note, you should also update the image in amcharts/images
     *                       folder if you don't want it to be distorted because of resizing.
     * @return ChartScrollbar
     */
    public ChartScrollbar setDragIconHeight(double dragIconHeight) {
        this.dragIconHeight = dragIconHeight;
        return this;
    }

    public Double getDragIconHeight() {
        return dragIconHeight;
    }

    /**
     * @param dragIconWidth Width of resize grip image. Note, you should also update the image in amcharts/images
     *                      folder if you don't want it to be distorted because of resizing.
     * @return ChartScrollbar
     */
    public ChartScrollbar setDragIconWidth(double dragIconWidth) {
        this.dragIconWidth = dragIconWidth;
        return this;
    }

    public Double getDragIconWidth() {
        return dragIconWidth;
    }

    /**
     * @param enabled Specifies if scrollbar is enabled. You can hide/show scrollbar using this property
     *                without actually removing it.
     * @return ChartScrollbar
     */
    public ChartScrollbar setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param graph Specifies which graph will be displayed in the scrollbar. Only Serial chart's category
     *              scrollbar can display a graph.
     * @return ChartScrollbar
     */
    public ChartScrollbar setGraph(AmGraph graph) {
        this.graph = graph;
        return this;
    }

    public AmGraph getGraph() {
        return graph;
    }

    /**
     * @param graphFillAlpha Graph fill opacity. Value range is 0 - 1.
     * @return ChartScrollbar
     */
    public ChartScrollbar setGraphFillAlpha(double graphFillAlpha) {
        this.graphFillAlpha = graphFillAlpha;
        return this;
    }

    public Double getGraphFillAlpha() {
        return graphFillAlpha;
    }

    /**
     * @param graphFillColor Graph fill color.
     * @return ChartScrollbar
     */
    public ChartScrollbar setGraphFillColor(Color graphFillColor) {
        this.graphFillColor = graphFillColor;
        return this;
    }

    public Color getGraphFillColor() {
        return graphFillColor;
    }

    /**
     * @param graphLineAlpha Graph line opacity. Value range is 0 - 1.
     * @return ChartScrollbar
     */
    public ChartScrollbar setGraphLineAlpha(double graphLineAlpha) {
        this.graphLineAlpha = graphLineAlpha;
        return this;
    }

    public Double getGraphLineAlpha() {
        return graphLineAlpha;
    }

    /**
     * @param graphLineColor Graph line color.
     * @return ChartScrollbar
     */
    public ChartScrollbar setGraphLineColor(Color graphLineColor) {
        this.graphLineColor = graphLineColor;
        return this;
    }

    public Color getGraphLineColor() {
        return graphLineColor;
    }

    /**
     * @param graphType by default the graph type is the same as the original graph's type, however in case
     *                  of candlestick or ohlc you might want to show line graph in the scrollbar. Possible
     *                  values are: line, column, step, smoothedLine, candlestick, ohlc
     * @return ChartScrollbar
     */
    public ChartScrollbar setGraphType(String graphType) {
        this.graphType = graphType;
        return this;
    }

    public String getGraphType() {
        return graphType;
    }

    /**
     * @param gridAlpha Grid opacity. Value range is 0 - 1.
     * @return ChartScrollbar
     */
    public ChartScrollbar setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
        return this;
    }

    public Double getGridAlpha() {
        return gridAlpha;
    }

    /**
     * @param gridColor Grid color.
     * @return ChartScrollbar
     */
    public ChartScrollbar setGridColor(Color gridColor) {
        this.gridColor = gridColor;
        return this;
    }

    public Color getGridColor() {
        return gridColor;
    }

    /**
     * @param gridCount The number of grid lines.
     * @return ChartScrollbar
     */
    public ChartScrollbar setGridCount(double gridCount) {
        this.gridCount = gridCount;
        return this;
    }

    public Double getGridCount() {
        return gridCount;
    }

    /**
     * @param hideResizeGrips Specifies whether resize grips are hidden when mouse is away from the scrollbar.
     * @return ChartScrollbar
     */
    public ChartScrollbar setHideResizeGrips(boolean hideResizeGrips) {
        this.hideResizeGrips = hideResizeGrips;
        return this;
    }

    public Boolean getHideResizeGrips() {
        return hideResizeGrips;
    }

    /**
     * @param hResizeCursor Mouse cursor type shown when user hovers horizontal cursor's resize grips.
     * @return ChartScrollbar
     */
    public ChartScrollbar setHResizeCursor(String hResizeCursor) {
        this.hResizeCursor = hResizeCursor;
        return this;
    }

    public String getHResizeCursor() {
        return hResizeCursor;
    }

    /**
     * @param hResizeCursorDown CSS value of cursor displayed when mouse is pressed down over horizontal cursor's
     *                          resize grip.
     * @return ChartScrollbar
     */
    public ChartScrollbar setHResizeCursorDown(String hResizeCursorDown) {
        this.hResizeCursorDown = hResizeCursorDown;
        return this;
    }

    public String getHResizeCursorDown() {
        return hResizeCursorDown;
    }

    /**
     * @param hResizeCursorHover *CSS value of cursor displayed when hovering over horizontal cursor's resize grip.
     * @return ChartScrollbar
     */
    public ChartScrollbar setHResizeCursorHover(String hResizeCursorHover) {
        this.hResizeCursorHover = hResizeCursorHover;
        return this;
    }

    public String getHResizeCursorHover() {
        return hResizeCursorHover;
    }

    /**
     * @param ignoreCustomColors If you have column type graph in your scrollbar, and this graph has custom colors
     *                           for one or more columns in data provider, those columns will be colored with this
     *                           custom color. However you might not want this in some cases. Set this property to
     *                           true to use scrollbar's graph colors.
     * @return ChartScrollbar
     */
    public ChartScrollbar setIgnoreCustomColors(boolean ignoreCustomColors) {
        this.ignoreCustomColors = ignoreCustomColors;
        return this;
    }

    public Boolean getIgnoreCustomColors() {
        return ignoreCustomColors;
    }

    /**
     * @param maximum *Maximum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set.
     * @return ChartScrollbar
     */
    public ChartScrollbar setMaximum(double maximum) {
        this.maximum = maximum;
        return this;
    }

    public Double getMaximum() {
        return maximum;
    }

    /**
     * @param minimum *Minimum value of ValueAxis of ChartScrollbar. Calculated automatically, if not set.
     * @return ChartScrollbar
     */
    public ChartScrollbar setMinimum(double minimum) {
        this.minimum = minimum;
        return this;
    }

    public Double getMinimum() {
        return minimum;
    }

    /**
     * @param offset Distance from plot area to scrollbar, in pixels.
     * @return ChartScrollbar
     */
    public ChartScrollbar setOffset(double offset) {
        this.offset = offset;
        return this;
    }

    public Double getOffset() {
        return offset;
    }

    /**
     * @param oppositeAxis By default, scrollbar is in the opsite side of plot area from the axis. If you set
     *                     this property to false, scrollbar will be placed next to category/value axis. However
     *                     it won't adjust it's position regarding axis labels, so you might need to use offset
     *                     property to move scrollbar away from labels.
     * @return ChartScrollbar
     */
    public ChartScrollbar setOppositeAxis(boolean oppositeAxis) {
        this.oppositeAxis = oppositeAxis;
        return this;
    }

    public Boolean getOppositeAxis() {
        return oppositeAxis;
    }

    /**
     * @param resizeEnabled If set to false it will prevent the chart scroll bar to change selection scope. The
     *                      grip images will not be shown as well. The user would still be able to pan / move
     *                      selection.
     * @return ChartScrollbar
     */
    public ChartScrollbar setResizeEnabled(boolean resizeEnabled) {
        this.resizeEnabled = resizeEnabled;
        return this;
    }

    public Boolean getResizeEnabled() {
        return resizeEnabled;
    }

    /**
     * @param scrollbarHeight Height (width, if chart is rotated) of a scrollbar.
     * @return ChartScrollbar
     */
    public ChartScrollbar setScrollbarHeight(double scrollbarHeight) {
        this.scrollbarHeight = scrollbarHeight;
        return this;
    }

    public Double getScrollbarHeight() {
        return scrollbarHeight;
    }

    /**
     * @param scrollDuration Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
     *                       Note, updateOnReleaseOnly should be set to false in order animation to happen.
     * @return ChartScrollbar
     */
    public ChartScrollbar setScrollDuration(double scrollDuration) {
        this.scrollDuration = scrollDuration;
        return this;
    }

    public Double getScrollDuration() {
        return scrollDuration;
    }

    /**
     * @param selectedBackgroundAlpha Selected backround opacity.
     * @return ChartScrollbar
     */
    public ChartScrollbar setSelectedBackgroundAlpha(double selectedBackgroundAlpha) {
        this.selectedBackgroundAlpha = selectedBackgroundAlpha;
        return this;
    }

    public Double getSelectedBackgroundAlpha() {
        return selectedBackgroundAlpha;
    }

    /**
     * @param selectedBackgroundColor Selected background color.
     * @return ChartScrollbar
     */
    public ChartScrollbar setSelectedBackgroundColor(Color selectedBackgroundColor) {
        this.selectedBackgroundColor = selectedBackgroundColor;
        return this;
    }

    public Color getSelectedBackgroundColor() {
        return selectedBackgroundColor;
    }

    /**
     * @param selectedGraphFillAlpha Selected graph's fill opacity. Value range is 0 - 1.
     * @return ChartScrollbar
     */
    public ChartScrollbar setSelectedGraphFillAlpha(double selectedGraphFillAlpha) {
        this.selectedGraphFillAlpha = selectedGraphFillAlpha;
        return this;
    }

    public Double getSelectedGraphFillAlpha() {
        return selectedGraphFillAlpha;
    }

    /**
     * @param selectedGraphFillColor Selected graph's fill color.
     * @return ChartScrollbar
     */
    public ChartScrollbar setSelectedGraphFillColor(Color selectedGraphFillColor) {
        this.selectedGraphFillColor = selectedGraphFillColor;
        return this;
    }

    public Color getSelectedGraphFillColor() {
        return selectedGraphFillColor;
    }

    /**
     * @param selectedGraphLineAlpha Selected graph's line opacity. Value range is 0 - 1.
     * @return ChartScrollbar
     */
    public ChartScrollbar setSelectedGraphLineAlpha(double selectedGraphLineAlpha) {
        this.selectedGraphLineAlpha = selectedGraphLineAlpha;
        return this;
    }

    public Double getSelectedGraphLineAlpha() {
        return selectedGraphLineAlpha;
    }

    /**
     * @param selectedGraphLineColor Selected graph's line color.
     * @return ChartScrollbar
     */
    public ChartScrollbar setSelectedGraphLineColor(Color selectedGraphLineColor) {
        this.selectedGraphLineColor = selectedGraphLineColor;
        return this;
    }

    public Color getSelectedGraphLineColor() {
        return selectedGraphLineColor;
    }

    /**
     * @param tabIndex In case you set it to some number, the chart will set focus on grips and draggable
     *                 area of the scrollbar when user clicks tab key. When a focus is set, screen readers
     *                 like NVDA Screen reader will read label which is set using accessibleLabel property
     *                 of ChartScrollbar. When a focus is set user can zoom-in, zoom-out or pan the scrollbar
     *                 using cursor keys. Note, not all browsers and readers support this.
     * @return ChartScrollbar
     */
    public ChartScrollbar setTabIndex(double tabIndex) {
        this.tabIndex = tabIndex;
        return this;
    }

    public Double getTabIndex() {
        return tabIndex;
    }

    /**
     * @param updateOnReleaseOnly Specifies if the chart should be updated while dragging/resizing the scrollbar or
     *                            only at the moment when user releases mouse button.
     * @return ChartScrollbar
     */
    public ChartScrollbar setUpdateOnReleaseOnly(boolean updateOnReleaseOnly) {
        this.updateOnReleaseOnly = updateOnReleaseOnly;
        return this;
    }

    public Boolean getUpdateOnReleaseOnly() {
        return updateOnReleaseOnly;
    }

    /**
     * @param vResizeCursor Mouse cursor type shown when user hovers vertical cursor's resize grips.
     * @return ChartScrollbar
     */
    public ChartScrollbar setVResizeCursor(String vResizeCursor) {
        this.vResizeCursor = vResizeCursor;
        return this;
    }

    public String getVResizeCursor() {
        return vResizeCursor;
    }

    /**
     * @param vResizeCursorDown CSS value of cursor displayed when mouse is pressed down over vertical cursor's resize
     *                          grip.
     * @return ChartScrollbar
     */
    public ChartScrollbar setVResizeCursorDown(String vResizeCursorDown) {
        this.vResizeCursorDown = vResizeCursorDown;
        return this;
    }

    public String getVResizeCursorDown() {
        return vResizeCursorDown;
    }

    /**
     * @param vResizeCursorHover CSS value of cursor displayed when hovering over vertical cursor's resize grip.
     * @return ChartScrollbar
     */
    public ChartScrollbar setVResizeCursorHover(String vResizeCursorHover) {
        this.vResizeCursorHover = vResizeCursorHover;
        return this;
    }

    public String getVResizeCursorHover() {
        return vResizeCursorHover;
    }

}