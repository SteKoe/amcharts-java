package de.stekoe.amcharts;

import org.json.JSONObject;

import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.helper.Jsonifyable;
import de.stekoe.amcharts.helper.Jsonifyer;

public class ChartCursor implements Jsonifyable {
    private Double adjustment;
    private Double animationDuration;
    private Boolean bulletsEnabled;
    private Double bulletSize;
    private Double categoryBalloonAlpha;
    private Color categoryBalloonColor;
    private String categoryBalloonDateFormat;
    private Boolean categoryBalloonEnabled;
    private Color color;
    private Double cursorAlpha;
    private Color cursorColor;
    private String cursorPosition;
    private Boolean enabled;
    private Boolean fullWidth;
    private Double graphBulletSize;
    private Boolean oneBalloonOnly;
    private Boolean pan;
    private Double selectionAlpha;
    private Boolean selectWithoutZooming;
    private Boolean showNextAvailable;
    private Boolean valueBalloonsEnabled;
    private Boolean zoomable;
    private Boolean zooming;

    /**
     * If you set adjustment to -1, the balloon will be shown near previous, if you set
     * it to 1 - near next data point.
     **/
    public Double getAdjustment() {
        return adjustment;
    }
    public ChartCursor setAdjustment(double adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    /**
     * Duration of animation of a line, in seconds.
     **/
    public Double getAnimationDuration() {
        return animationDuration;
    }
    public ChartCursor setAnimationDuration(double animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    /**
     * Specifies if bullet for each graph will follow the cursor.
     **/
    public Boolean getBulletsEnabled() {
        return bulletsEnabled;
    }
    public ChartCursor setBulletsEnabled(boolean bulletsEnabled) {
        this.bulletsEnabled = bulletsEnabled;
        return this;
    }

    /**
     * Size of bullets, following the cursor.
     **/
    public Double getBulletSize() {
        return bulletSize;
    }
    public ChartCursor setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
        return this;
    }

    /**
     * Opacity of the category balloon.
     **/
    public Double getCategoryBalloonAlpha() {
        return categoryBalloonAlpha;
    }
    public ChartCursor setCategoryBalloonAlpha(double categoryBalloonAlpha) {
        this.categoryBalloonAlpha = categoryBalloonAlpha;
        return this;
    }

    /**
     * Color of the category balloon. cursorColor is used if not set.
     **/
    public Color getCategoryBalloonColor() {
        return categoryBalloonColor;
    }
    public ChartCursor setCategoryBalloonColor(Color categoryBalloonColor) {
        this.categoryBalloonColor = categoryBalloonColor;
        return this;
    }

    /**
     * Category balloon date format (used only if category axis parses dates). Check this
     * page for instructions on how to format dates.
     **/
    public String getCategoryBalloonDateFormat() {
        return categoryBalloonDateFormat;
    }
    public ChartCursor setCategoryBalloonDateFormat(String categoryBalloonDateFormat) {
        this.categoryBalloonDateFormat = categoryBalloonDateFormat;
        return this;
    }

    /**
     * Specifies whether category balloon is enabled.
     **/
    public Boolean getCategoryBalloonEnabled() {
        return categoryBalloonEnabled;
    }
    public ChartCursor setCategoryBalloonEnabled(boolean categoryBalloonEnabled) {
        this.categoryBalloonEnabled = categoryBalloonEnabled;
        return this;
    }

    /**
     * Text color.
     **/
    public Color getColor() {
        return color;
    }
    public ChartCursor setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Opacity of the cursor line.
     **/
    public Double getCursorAlpha() {
        return cursorAlpha;
    }
    public ChartCursor setCursorAlpha(double cursorAlpha) {
        this.cursorAlpha = cursorAlpha;
        return this;
    }

    /**
     * Color of the cursor line.
     **/
    public Color getCursorColor() {
        return cursorColor;
    }
    public ChartCursor setCursorColor(Color cursorColor) {
        this.cursorColor = cursorColor;
        return this;
    }

    /**
     * Specifies where the cursor line should be placed - on the beginning of the period
     * (day, hour, etc) or in the middle (only when parseDates property of categoryAxis
     * is set to true). If you want the cursor to follow mouse and not to glue to the nearest
     * data point, set "mouse" here. Possible values are: start, middle, mouse.
     **/
    public String getCursorPosition() {
        return cursorPosition;
    }
    public ChartCursor setCursorPosition(String cursorPosition) {
        this.cursorPosition = cursorPosition;
        return this;
    }

    /**
     * Specifies whether cursor is enabled.
     **/
    public Boolean getEnabled() {
        return enabled;
    }
    public ChartCursor setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * If set to true, instead of a cursor line user will see a fill which width will always
     * be equal to the width of one data item. We'd recommend setting cusrsorAlpha to 0.1
     * or some other small number if using this feature.
     **/
    public Boolean getFullWidth() {
        return fullWidth;
    }
    public ChartCursor setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
        return this;
    }

    /**
     * Size of a graph's bullet (if available) at the cursor position. If you don't want
     * the bullet to change it's size, set this property to 1.
     **/
    public Double getGraphBulletSize() {
        return graphBulletSize;
    }
    public ChartCursor setGraphBulletSize(double graphBulletSize) {
        this.graphBulletSize = graphBulletSize;
        return this;
    }

    /**
     * If this is set to true, only one balloon at a time will be displayed. Note, this
     * is quite CPU consuming.
     **/
    public Boolean getOneBalloonOnly() {
        return oneBalloonOnly;
    }
    public ChartCursor setOneBalloonOnly(boolean oneBalloonOnly) {
        this.oneBalloonOnly = oneBalloonOnly;
        return this;
    }

    /**
     * If this is set to true, the user will be able to pan the chart (Serial only) instead
     * of zooming.
     **/
    public Boolean getPan() {
        return pan;
    }
    public ChartCursor setPan(boolean pan) {
        this.pan = pan;
        return this;
    }

    /**
     * Opacity of the selection.
     **/
    public Double getSelectionAlpha() {
        return selectionAlpha;
    }
    public ChartCursor setSelectionAlpha(double selectionAlpha) {
        this.selectionAlpha = selectionAlpha;
        return this;
    }

    /**
     * Specifies if cursor should only mark selected area but not zoom-in after user releases
     * mouse button.
     **/
    public Boolean getSelectWithoutZooming() {
        return selectWithoutZooming;
    }
    public ChartCursor setSelectWithoutZooming(boolean selectWithoutZooming) {
        this.selectWithoutZooming = selectWithoutZooming;
        return this;
    }

    /**
     * If true, the graph will display balloon on next available data point if currently
     * hovered item doesn't have value for this graph.
     **/
    public Boolean getShowNextAvailable() {
        return showNextAvailable;
    }
    public ChartCursor setShowNextAvailable(boolean showNextAvailable) {
        this.showNextAvailable = showNextAvailable;
        return this;
    }

    /**
     * Specifies whether value balloons are enabled. In case they are not, the balloons
     * might be displayed anyway, when the user rolls-over the column or bullet.
     **/
    public Boolean getValueBalloonsEnabled() {
        return valueBalloonsEnabled;
    }
    public ChartCursor setValueBalloonsEnabled(boolean valueBalloonsEnabled) {
        this.valueBalloonsEnabled = valueBalloonsEnabled;
        return this;
    }

    /**
     * Specifies if the user can zoom-in the chart. If pan is set to true, zoomable is switched
     * to false automatically.
     **/
    public Boolean getZoomable() {
        return zoomable;
    }
    public ChartCursor setZoomable(boolean zoomable) {
        this.zoomable = zoomable;
        return this;
    }

    /**
     * Read-only. Indicates if currently user is selecting some chart area to zoom-in.
     **/
    public Boolean getZooming() {
        return zooming;
    }
    public ChartCursor setZooming(boolean zooming) {
        this.zooming = zooming;
        return this;
    }

    public JSONObject toJson() {
        return new Jsonifyer(this).toJson();
    }
}