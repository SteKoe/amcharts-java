package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

/**
 * Creates a cursor for the chart which follows the mouse movements. In case of AmSerialChart
 * charts it shows the balloons of hovered data points.
 */

public class ChartCursor implements Serializable {
    private Double adjustment;
    private Double animationDuration;
    private Boolean avoidBalloonOverlapping;
    private String balloonPointerOrientation;
    private Boolean bulletsEnabled;
    private Double bulletSize;
    private Double categoryBalloonAlpha;
    private Color categoryBalloonColor;
    private String categoryBalloonDateFormat;
    private Boolean categoryBalloonEnabled;
    private String categoryBalloonText;
    private Color color;
    private Double cursorAlpha;
    private Color cursorColor;
    private String cursorPosition;
    private Boolean enabled;
    private Boolean fullWidth;
    private Double graphBulletAlpha;
    private Double graphBulletSize;
    private Boolean leaveAfterTouch;
    private Boolean leaveCursor;
    private AmGraph limitToGraph;
    private List<Object> listeners;
    private Boolean oneBalloonOnly;
    private Boolean pan;
    private Double selectionAlpha;
    private Boolean selectWithoutZooming;
    private Boolean showNextAvailable;
    private Double tabIndex;
    private Boolean valueBalloonsEnabled;
    private Double valueLineAlpha;
    private Boolean valueLineBalloonEnabled;
    private Boolean valueLineEnabled;
    private Boolean valueZoomable;
    private Boolean zoomable;
    private Boolean zooming;

    /**
     * @param adjustment If you set adjustment to -1, the balloon will be shown near previous, if you set
     *                   it to 1 - near next data point.
     * @return ChartCursor
     */
    public ChartCursor setAdjustment(double adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    public Double getAdjustment() {
        return adjustment;
    }

    /**
     * @param animationDuration Duration of animation of a line, in seconds.
     * @return ChartCursor
     */
    public ChartCursor setAnimationDuration(double animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public Double getAnimationDuration() {
        return animationDuration;
    }

    /**
     * @param avoidBalloonOverlapping Specifies if cursor should arrange balloons so they won't overlap. If chart is rotated,
     *                                it might be good idea to turn this off.
     * @return ChartCursor
     */
    public ChartCursor setAvoidBalloonOverlapping(boolean avoidBalloonOverlapping) {
        this.avoidBalloonOverlapping = avoidBalloonOverlapping;
        return this;
    }

    public Boolean getAvoidBalloonOverlapping() {
        return avoidBalloonOverlapping;
    }

    /**
     * @param balloonPointerOrientation defines if the balloon should be shown above the datapoint or sideways
     * @return ChartCursor
     */
    public ChartCursor setBalloonPointerOrientation(String balloonPointerOrientation) {
        this.balloonPointerOrientation = balloonPointerOrientation;
        return this;
    }

    public String getBalloonPointerOrientation() {
        return balloonPointerOrientation;
    }

    /**
     * @param bulletsEnabled Specifies if bullet for each graph will follow the cursor.
     * @return ChartCursor
     */
    public ChartCursor setBulletsEnabled(boolean bulletsEnabled) {
        this.bulletsEnabled = bulletsEnabled;
        return this;
    }

    public Boolean getBulletsEnabled() {
        return bulletsEnabled;
    }

    /**
     * @param bulletSize Size of bullets, following the cursor.
     * @return ChartCursor
     */
    public ChartCursor setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
        return this;
    }

    public Double getBulletSize() {
        return bulletSize;
    }

    /**
     * @param categoryBalloonAlpha Opacity of the category balloon.
     * @return ChartCursor
     */
    public ChartCursor setCategoryBalloonAlpha(double categoryBalloonAlpha) {
        this.categoryBalloonAlpha = categoryBalloonAlpha;
        return this;
    }

    public Double getCategoryBalloonAlpha() {
        return categoryBalloonAlpha;
    }

    /**
     * @param categoryBalloonColor Color of the category balloon. cursorColor is used if not set.
     * @return ChartCursor
     */
    public ChartCursor setCategoryBalloonColor(Color categoryBalloonColor) {
        this.categoryBalloonColor = categoryBalloonColor;
        return this;
    }

    public Color getCategoryBalloonColor() {
        return categoryBalloonColor;
    }

    /**
     * @param categoryBalloonDateFormat Category balloon date format (used only if category axis parses dates). Check this
     *                                  page for instructions on how to format dates.
     * @return ChartCursor
     */
    public ChartCursor setCategoryBalloonDateFormat(String categoryBalloonDateFormat) {
        this.categoryBalloonDateFormat = categoryBalloonDateFormat;
        return this;
    }

    public String getCategoryBalloonDateFormat() {
        return categoryBalloonDateFormat;
    }

    /**
     * @param categoryBalloonEnabled Specifies whether category balloon is enabled.
     * @return ChartCursor
     */
    public ChartCursor setCategoryBalloonEnabled(boolean categoryBalloonEnabled) {
        this.categoryBalloonEnabled = categoryBalloonEnabled;
        return this;
    }

    public Boolean getCategoryBalloonEnabled() {
        return categoryBalloonEnabled;
    }

    /**
     * @param categoryBalloonText You can have [[category]] - [[toCategory]] tags in there and show category ranges
     *                            this way.
     * @return ChartCursor
     */
    public ChartCursor setCategoryBalloonText(String categoryBalloonText) {
        this.categoryBalloonText = categoryBalloonText;
        return this;
    }

    public String getCategoryBalloonText() {
        return categoryBalloonText;
    }

    /**
     * @param color Text color.
     * @return ChartCursor
     */
    public ChartCursor setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param cursorAlpha Opacity of the cursor line.
     * @return ChartCursor
     */
    public ChartCursor setCursorAlpha(double cursorAlpha) {
        this.cursorAlpha = cursorAlpha;
        return this;
    }

    public Double getCursorAlpha() {
        return cursorAlpha;
    }

    /**
     * @param cursorColor Color of the cursor line.
     * @return ChartCursor
     */
    public ChartCursor setCursorColor(Color cursorColor) {
        this.cursorColor = cursorColor;
        return this;
    }

    public Color getCursorColor() {
        return cursorColor;
    }

    /**
     * @param cursorPosition Specifies where the cursor line should be placed - on the beginning of the period
     *                       (day, hour, etc) or in the middle (only when parseDates property of categoryAxis
     *                       is set to true). If you want the cursor to follow mouse and not to glue to the nearest
     *                       data point, set "mouse" here. Possible values are: start, middle, mouse.
     * @return ChartCursor
     */
    public ChartCursor setCursorPosition(String cursorPosition) {
        this.cursorPosition = cursorPosition;
        return this;
    }

    public String getCursorPosition() {
        return cursorPosition;
    }

    /**
     * @param enabled Specifies whether cursor is enabled.
     * @return ChartCursor
     */
    public ChartCursor setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param fullWidth If set to true, instead of a cursor line user will see a fill which width will always
     *                  be equal to the width of one data item. We'd recommend setting cursorAlpha to 0.1
     *                  or some other small number if using this feature.
     * @return ChartCursor
     */
    public ChartCursor setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
        return this;
    }

    public Boolean getFullWidth() {
        return fullWidth;
    }

    /**
     * @param graphBulletAlpha If you make graph's bullets invisible by setting their opacity to 0 and will set
     *                         graphBulletAlpha to 1, the bullets will only appear at the cursor's position.
     * @return ChartCursor
     */
    public ChartCursor setGraphBulletAlpha(double graphBulletAlpha) {
        this.graphBulletAlpha = graphBulletAlpha;
        return this;
    }

    public Double getGraphBulletAlpha() {
        return graphBulletAlpha;
    }

    /**
     * @param graphBulletSize Size of a graph's bullet (if available) at the cursor position. If you don't want
     *                        the bullet to change it's size, set this property to 1.
     * @return ChartCursor
     */
    public ChartCursor setGraphBulletSize(double graphBulletSize) {
        this.graphBulletSize = graphBulletSize;
        return this;
    }

    public Double getGraphBulletSize() {
        return graphBulletSize;
    }

    /**
     * @param leaveAfterTouch This makes cursor and balloons to remain after user touches the chart.
     * @return ChartCursor
     */
    public ChartCursor setLeaveAfterTouch(boolean leaveAfterTouch) {
        this.leaveAfterTouch = leaveAfterTouch;
        return this;
    }

    public Boolean getLeaveAfterTouch() {
        return leaveAfterTouch;
    }

    /**
     * @param leaveCursor Specifies if cursor should be left at it's last position. Useful for touch devices
     *                    - user might want to see the balloons after he moves finger away.
     * @return ChartCursor
     */
    public ChartCursor setLeaveCursor(boolean leaveCursor) {
        this.leaveCursor = leaveCursor;
        return this;
    }

    public Boolean getLeaveCursor() {
        return leaveCursor;
    }

    /**
     * @param limitToGraph If set to an id or a reference to AmGraph object, CategoryAxis cursor line will be
     *                     limited to this graph instead of being drawn through full height of plot area. Note,
     *                     this works with serial chart only. Also, cursorPosition of ChartCursor must be set
     *                     to middle.
     * @return ChartCursor
     */
    public ChartCursor setLimitToGraph(AmGraph limitToGraph) {
        this.limitToGraph = limitToGraph;
        return this;
    }

    public AmGraph getLimitToGraph() {
        return limitToGraph;
    }

    /**
     * @param listeners You can add listeners of events using this property. Example: listeners = [{"event":"changed",
     *                  "method":handleEvent}];
     * @return ChartCursor
     */
    public ChartCursor setListeners(List<Object> listeners) {
        this.listeners = listeners;
        return this;
    }

    public List<Object> getListeners() {
        return listeners;
    }

    /**
     * @param oneBalloonOnly If this is set to true, only one balloon at a time will be displayed. Note, this
     *                       is quite CPU consuming.
     * @return ChartCursor
     */
    public ChartCursor setOneBalloonOnly(boolean oneBalloonOnly) {
        this.oneBalloonOnly = oneBalloonOnly;
        return this;
    }

    public Boolean getOneBalloonOnly() {
        return oneBalloonOnly;
    }

    /**
     * @param pan *If this is set to true, the user will be able to pan the chart instead of zooming.
     * @return ChartCursor
     */
    public ChartCursor setPan(boolean pan) {
        this.pan = pan;
        return this;
    }

    public Boolean getPan() {
        return pan;
    }

    /**
     * @param selectionAlpha Opacity of the selection.
     * @return ChartCursor
     */
    public ChartCursor setSelectionAlpha(double selectionAlpha) {
        this.selectionAlpha = selectionAlpha;
        return this;
    }

    public Double getSelectionAlpha() {
        return selectionAlpha;
    }

    /**
     * @param selectWithoutZooming Specifies if cursor should only mark selected area but not zoom-in after user releases
     *                             mouse button.
     * @return ChartCursor
     */
    public ChartCursor setSelectWithoutZooming(boolean selectWithoutZooming) {
        this.selectWithoutZooming = selectWithoutZooming;
        return this;
    }

    public Boolean getSelectWithoutZooming() {
        return selectWithoutZooming;
    }

    /**
     * @param showNextAvailable If true, the graph will display balloon on next available data point if currently
     *                          hovered item doesn't have value for this graph.
     * @return ChartCursor
     */
    public ChartCursor setShowNextAvailable(boolean showNextAvailable) {
        this.showNextAvailable = showNextAvailable;
        return this;
    }

    public Boolean getShowNextAvailable() {
        return showNextAvailable;
    }

    /**
     * @param tabIndex In case you set it to some number, the chart will set focus on chart cursor (works
     *                 only with serial chart) when user clicks tab key. When a focus is set user can move
     *                 cursor using cursor keys. Note, not all browsers and readers support this.
     * @return ChartCursor
     */
    public ChartCursor setTabIndex(double tabIndex) {
        this.tabIndex = tabIndex;
        return this;
    }

    public Double getTabIndex() {
        return tabIndex;
    }

    /**
     * @param valueBalloonsEnabled Specifies whether value balloons are enabled. In case they are not, the balloons
     *                             might be displayed anyway, when the user rolls-over the column or bullet.
     * @return ChartCursor
     */
    public ChartCursor setValueBalloonsEnabled(boolean valueBalloonsEnabled) {
        this.valueBalloonsEnabled = valueBalloonsEnabled;
        return this;
    }

    public Boolean getValueBalloonsEnabled() {
        return valueBalloonsEnabled;
    }

    /**
     * @param valueLineAlpha Opacity of value line. Will use cursorAlpha value if not set.
     * @return ChartCursor
     */
    public ChartCursor setValueLineAlpha(double valueLineAlpha) {
        this.valueLineAlpha = valueLineAlpha;
        return this;
    }

    public Double getValueLineAlpha() {
        return valueLineAlpha;
    }

    /**
     * @param valueLineBalloonEnabled Specifies if value balloon next to value axes labels should be displayed.
     * @return ChartCursor
     */
    public ChartCursor setValueLineBalloonEnabled(boolean valueLineBalloonEnabled) {
        this.valueLineBalloonEnabled = valueLineBalloonEnabled;
        return this;
    }

    public Boolean getValueLineBalloonEnabled() {
        return valueLineBalloonEnabled;
    }

    /**
     * @param valueLineEnabled Specifies if cursor of Serial chart should display horizontal (or vertical if chart
     *                         is rotated) line. This line might help users to compare distant values of a chart.
     *                         You can also enable value balloons on this line by setting valueLineBalloonEnabled
     *                         to true.
     * @return ChartCursor
     */
    public ChartCursor setValueLineEnabled(boolean valueLineEnabled) {
        this.valueLineEnabled = valueLineEnabled;
        return this;
    }

    public Boolean getValueLineEnabled() {
        return valueLineEnabled;
    }

    /**
     * @param valueZoomable Specifies if the user can zoom-in value axess of a serial chart.
     * @return ChartCursor
     */
    public ChartCursor setValueZoomable(boolean valueZoomable) {
        this.valueZoomable = valueZoomable;
        return this;
    }

    public Boolean getValueZoomable() {
        return valueZoomable;
    }

    /**
     * @param zoomable Specifies if the user can zoom-in the chart. If pan is set to true, zoomable is switched
     *                 to false automatically.
     * @return ChartCursor
     */
    public ChartCursor setZoomable(boolean zoomable) {
        this.zoomable = zoomable;
        return this;
    }

    public Boolean getZoomable() {
        return zoomable;
    }

    /**
     * @param zooming Read-only. Indicates if currently user is selecting some chart area to zoom-in.
     * @return ChartCursor
     */
    public ChartCursor setZooming(boolean zooming) {
        this.zooming = zooming;
        return this;
    }

    public Boolean getZooming() {
        return zooming;
    }

}