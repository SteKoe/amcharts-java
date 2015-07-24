package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

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
    private Boolean leaveCursor;
    private List<Object> listeners;
    private Boolean oneBalloonOnly;
    private Boolean pan;
    private Double selectionAlpha;
    private Boolean selectWithoutZooming;
    private Boolean showNextAvailable;
    private Boolean valueBalloonsEnabled;
    private Double valueLineAlpha;
    private ValueAxis valueLineAxis;
    private Boolean valueLineBalloonEnabled;
    private Boolean valueLineEnabled;
    private Boolean zoomable;
    private Boolean zooming;

    /**
     * If you set adjustment to -1, the balloon will be shown near previous, if you set
     * it to 1 - near next data point.
     */
    public ChartCursor setAdjustment(double adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    public Double getAdjustment() {
        return adjustment;
    }

    /**
     * Duration of animation of a line, in seconds.
     */
    public ChartCursor setAnimationDuration(double animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public Double getAnimationDuration() {
        return animationDuration;
    }

    /**
     * Specifies if cursor should arrange balloons so they won't overlap. If chart is rotated,
     * it might be good idea to turn this off.
     */
    public ChartCursor setAvoidBalloonOverlapping(boolean avoidBalloonOverlapping) {
        this.avoidBalloonOverlapping = avoidBalloonOverlapping;
        return this;
    }

    public Boolean getAvoidBalloonOverlapping() {
        return avoidBalloonOverlapping;
    }

    /**
     * defines if the balloon should be shown above the datapoint or sideways
     */
    public ChartCursor setBalloonPointerOrientation(String balloonPointerOrientation) {
        this.balloonPointerOrientation = balloonPointerOrientation;
        return this;
    }

    public String getBalloonPointerOrientation() {
        return balloonPointerOrientation;
    }

    /**
     * Specifies if bullet for each graph will follow the cursor.
     */
    public ChartCursor setBulletsEnabled(boolean bulletsEnabled) {
        this.bulletsEnabled = bulletsEnabled;
        return this;
    }

    public Boolean getBulletsEnabled() {
        return bulletsEnabled;
    }

    /**
     * Size of bullets, following the cursor.
     */
    public ChartCursor setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
        return this;
    }

    public Double getBulletSize() {
        return bulletSize;
    }

    /**
     * Opacity of the category balloon.
     */
    public ChartCursor setCategoryBalloonAlpha(double categoryBalloonAlpha) {
        this.categoryBalloonAlpha = categoryBalloonAlpha;
        return this;
    }

    public Double getCategoryBalloonAlpha() {
        return categoryBalloonAlpha;
    }

    /**
     * Color of the category balloon. cursorColor is used if not set.
     */
    public ChartCursor setCategoryBalloonColor(Color categoryBalloonColor) {
        this.categoryBalloonColor = categoryBalloonColor;
        return this;
    }

    public Color getCategoryBalloonColor() {
        return categoryBalloonColor;
    }

    /**
     * Category balloon date format (used only if category axis parses dates). Check this
     * page for instructions on how to format dates.
     */
    public ChartCursor setCategoryBalloonDateFormat(String categoryBalloonDateFormat) {
        this.categoryBalloonDateFormat = categoryBalloonDateFormat;
        return this;
    }

    public String getCategoryBalloonDateFormat() {
        return categoryBalloonDateFormat;
    }

    /**
     * Specifies whether category balloon is enabled.
     */
    public ChartCursor setCategoryBalloonEnabled(boolean categoryBalloonEnabled) {
        this.categoryBalloonEnabled = categoryBalloonEnabled;
        return this;
    }

    public Boolean getCategoryBalloonEnabled() {
        return categoryBalloonEnabled;
    }

    /**
     * You can have [[category]] - [[toCategory]] tags in there and show category ranges
     * this way.
     */
    public ChartCursor setCategoryBalloonText(String categoryBalloonText) {
        this.categoryBalloonText = categoryBalloonText;
        return this;
    }

    public String getCategoryBalloonText() {
        return categoryBalloonText;
    }

    /**
     * Text color.
     */
    public ChartCursor setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Opacity of the cursor line.
     */
    public ChartCursor setCursorAlpha(double cursorAlpha) {
        this.cursorAlpha = cursorAlpha;
        return this;
    }

    public Double getCursorAlpha() {
        return cursorAlpha;
    }

    /**
     * Color of the cursor line.
     */
    public ChartCursor setCursorColor(Color cursorColor) {
        this.cursorColor = cursorColor;
        return this;
    }

    public Color getCursorColor() {
        return cursorColor;
    }

    /**
     * Specifies where the cursor line should be placed - on the beginning of the period
     * (day, hour, etc) or in the middle (only when parseDates property of categoryAxis
     * is set to true). If you want the cursor to follow mouse and not to glue to the nearest
     * data point, set "mouse" here. Possible values are: start, middle, mouse.
     */
    public ChartCursor setCursorPosition(String cursorPosition) {
        this.cursorPosition = cursorPosition;
        return this;
    }

    public String getCursorPosition() {
        return cursorPosition;
    }

    /**
     * Specifies whether cursor is enabled.
     */
    public ChartCursor setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * If set to true, instead of a cursor line user will see a fill which width will always
     * be equal to the width of one data item. We'd recommend setting cusrsorAlpha to 0.1
     * or some other small number if using this feature.
     */
    public ChartCursor setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
        return this;
    }

    public Boolean getFullWidth() {
        return fullWidth;
    }

    /**
     * If you make graph's bullets invisible by setting their opacity to 0 and will set
     * graphBulletAlpha to 1, the bullets will only appear at the cursor's position.
     */
    public ChartCursor setGraphBulletAlpha(double graphBulletAlpha) {
        this.graphBulletAlpha = graphBulletAlpha;
        return this;
    }

    public Double getGraphBulletAlpha() {
        return graphBulletAlpha;
    }

    /**
     * Size of a graph's bullet (if available) at the cursor position. If you don't want
     * the bullet to change it's size, set this property to 1.
     */
    public ChartCursor setGraphBulletSize(double graphBulletSize) {
        this.graphBulletSize = graphBulletSize;
        return this;
    }

    public Double getGraphBulletSize() {
        return graphBulletSize;
    }

    /**
     * Specifies if cursor should be left at it's last position. Useful for touch devices
     * - user might want to see the balloons after he moves finger away.
     */
    public ChartCursor setLeaveCursor(boolean leaveCursor) {
        this.leaveCursor = leaveCursor;
        return this;
    }

    public Boolean getLeaveCursor() {
        return leaveCursor;
    }

    /**
     * You can add listeners of events using this property. Example: listeners = [{"event":"changed",
     * "method":handleEvent}];
     */
    public ChartCursor setListeners(List<Object> listeners) {
        this.listeners = listeners;
        return this;
    }

    public List<Object> getListeners() {
        return listeners;
    }

    /**
     * If this is set to true, only one balloon at a time will be displayed. Note, this
     * is quite CPU consuming.
     */
    public ChartCursor setOneBalloonOnly(boolean oneBalloonOnly) {
        this.oneBalloonOnly = oneBalloonOnly;
        return this;
    }

    public Boolean getOneBalloonOnly() {
        return oneBalloonOnly;
    }

    /**
     * If this is set to true, the user will be able to pan the chart (Serial only) instead
     * of zooming.
     */
    public ChartCursor setPan(boolean pan) {
        this.pan = pan;
        return this;
    }

    public Boolean getPan() {
        return pan;
    }

    /**
     * Opacity of the selection.
     */
    public ChartCursor setSelectionAlpha(double selectionAlpha) {
        this.selectionAlpha = selectionAlpha;
        return this;
    }

    public Double getSelectionAlpha() {
        return selectionAlpha;
    }

    /**
     * Specifies if cursor should only mark selected area but not zoom-in after user releases
     * mouse button.
     */
    public ChartCursor setSelectWithoutZooming(boolean selectWithoutZooming) {
        this.selectWithoutZooming = selectWithoutZooming;
        return this;
    }

    public Boolean getSelectWithoutZooming() {
        return selectWithoutZooming;
    }

    /**
     * If true, the graph will display balloon on next available data point if currently
     * hovered item doesn't have value for this graph.
     */
    public ChartCursor setShowNextAvailable(boolean showNextAvailable) {
        this.showNextAvailable = showNextAvailable;
        return this;
    }

    public Boolean getShowNextAvailable() {
        return showNextAvailable;
    }

    /**
     * Specifies whether value balloons are enabled. In case they are not, the balloons
     * might be displayed anyway, when the user rolls-over the column or bullet.
     */
    public ChartCursor setValueBalloonsEnabled(boolean valueBalloonsEnabled) {
        this.valueBalloonsEnabled = valueBalloonsEnabled;
        return this;
    }

    public Boolean getValueBalloonsEnabled() {
        return valueBalloonsEnabled;
    }

    /**
     * Opacity of value line. Will use cursorAlpha value if not set.
     */
    public ChartCursor setValueLineAlpha(double valueLineAlpha) {
        this.valueLineAlpha = valueLineAlpha;
        return this;
    }

    public Double getValueLineAlpha() {
        return valueLineAlpha;
    }

    /**
     * Axis of value line. If you set valueLineBalloonEnabled to true, but you have more
     * than one axis, you can use this property to indicate which axis should display balloon.
     */
    public ChartCursor setValueLineAxis(ValueAxis valueLineAxis) {
        this.valueLineAxis = valueLineAxis;
        return this;
    }

    public ValueAxis getValueLineAxis() {
        return valueLineAxis;
    }

    /**
     * Specifies if value balloon next to value axis labels should be displayed. If you
     * have more than one axis, set valueLineAxis property to indicate which axis should
     * display the balloon.
     */
    public ChartCursor setValueLineBalloonEnabled(boolean valueLineBalloonEnabled) {
        this.valueLineBalloonEnabled = valueLineBalloonEnabled;
        return this;
    }

    public Boolean getValueLineBalloonEnabled() {
        return valueLineBalloonEnabled;
    }

    /**
     * Specifies if cursor of Serial chart should display horizontal (or vertical if chart
     * is rotated) line. This line might help users to compare distant values of a chart.
     * You can also enable value balloon on this line by setting valueLineAxis property
     * of ChartCursor.
     */
    public ChartCursor setValueLineEnabled(boolean valueLineEnabled) {
        this.valueLineEnabled = valueLineEnabled;
        return this;
    }

    public Boolean getValueLineEnabled() {
        return valueLineEnabled;
    }

    /**
     * Specifies if the user can zoom-in the chart. If pan is set to true, zoomable is switched
     * to false automatically.
     */
    public ChartCursor setZoomable(boolean zoomable) {
        this.zoomable = zoomable;
        return this;
    }

    public Boolean getZoomable() {
        return zoomable;
    }

    /**
     * Read-only. Indicates if currently user is selecting some chart area to zoom-in.
     */
    public ChartCursor setZooming(boolean zooming) {
        this.zooming = zooming;
        return this;
    }

    public Boolean getZooming() {
        return zooming;
    }

}