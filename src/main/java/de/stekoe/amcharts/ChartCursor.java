package de.stekoe.amcharts;

public class ChartCursor {
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

    /**
     * If you set adjustment to -1, the balloon will be shown near previous, if you set
     * it to 1 - near next data point.
     **/
    public void setAdjustment(double adjustment) {
        this.adjustment = adjustment;
    }
    public Double getAdjustment() {
        return adjustment;
    }

    /**
     * Duration of animation of a line, in seconds.
     **/
    public void setAnimationDuration(double animationDuration) {
        this.animationDuration = animationDuration;
    }
    public Double getAnimationDuration() {
        return animationDuration;
    }

    /**
     * Specifies if bullet for each graph will follow the cursor.
     **/
    public void setBulletsEnabled(boolean bulletsEnabled) {
        this.bulletsEnabled = bulletsEnabled;
    }
    public boolean isBulletsEnabled() {
        return bulletsEnabled;
    }

    /**
     * Size of bullets, following the cursor.
     **/
    public void setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
    }
    public Double getBulletSize() {
        return bulletSize;
    }

    /**
     * Opacity of the category balloon.
     **/
    public void setCategoryBalloonAlpha(double categoryBalloonAlpha) {
        this.categoryBalloonAlpha = categoryBalloonAlpha;
    }
    public Double getCategoryBalloonAlpha() {
        return categoryBalloonAlpha;
    }

    /**
     * Color of the category balloon. cursorColor is used if not set.
     **/
    public void setCategoryBalloonColor(Color categoryBalloonColor) {
        this.categoryBalloonColor = categoryBalloonColor;
    }
    public Color getCategoryBalloonColor() {
        return categoryBalloonColor;
    }

    /**
     * Category balloon date format (used only if category axis parses dates). Check this
     * page for instructions on how to format dates.
     **/
    public void setCategoryBalloonDateFormat(String categoryBalloonDateFormat) {
        this.categoryBalloonDateFormat = categoryBalloonDateFormat;
    }
    public String getCategoryBalloonDateFormat() {
        return categoryBalloonDateFormat;
    }

    /**
     * Specifies whether category balloon is enabled.
     **/
    public void setCategoryBalloonEnabled(boolean categoryBalloonEnabled) {
        this.categoryBalloonEnabled = categoryBalloonEnabled;
    }
    public boolean isCategoryBalloonEnabled() {
        return categoryBalloonEnabled;
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
     * Opacity of the cursor line.
     **/
    public void setCursorAlpha(double cursorAlpha) {
        this.cursorAlpha = cursorAlpha;
    }
    public Double getCursorAlpha() {
        return cursorAlpha;
    }

    /**
     * Color of the cursor line.
     **/
    public void setCursorColor(Color cursorColor) {
        this.cursorColor = cursorColor;
    }
    public Color getCursorColor() {
        return cursorColor;
    }

    /**
     * Specifies where the cursor line should be placed - on the beginning of the period
     * (day, hour, etc) or in the middle (only when parseDates property of categoryAxis
     * is set to true). If you want the cursor to follow mouse and not to glue to the nearest
     * data point, set "mouse" here. Possible values are: start, middle, mouse.
     **/
    public void setCursorPosition(String cursorPosition) {
        this.cursorPosition = cursorPosition;
    }
    public String getCursorPosition() {
        return cursorPosition;
    }

    /**
     * Specifies whether cursor is enabled.
     **/
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * If set to true, instead of a cursor line user will see a fill which width will always
     * be equal to the width of one data item. We'd recommend setting cusrsorAlpha to 0.1
     * or some other small number if using this feature.
     **/
    public void setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
    }
    public boolean isFullWidth() {
        return fullWidth;
    }

    /**
     * Size of a graph's bullet (if available) at the cursor position. If you don't want
     * the bullet to change it's size, set this property to 1.
     **/
    public void setGraphBulletSize(double graphBulletSize) {
        this.graphBulletSize = graphBulletSize;
    }
    public Double getGraphBulletSize() {
        return graphBulletSize;
    }

    /**
     * If this is set to true, only one balloon at a time will be displayed. Note, this
     * is quite CPU consuming.
     **/
    public void setOneBalloonOnly(boolean oneBalloonOnly) {
        this.oneBalloonOnly = oneBalloonOnly;
    }
    public boolean isOneBalloonOnly() {
        return oneBalloonOnly;
    }

    /**
     * If this is set to true, the user will be able to pan the chart (Serial only) instead
     * of zooming.
     **/
    public void setPan(boolean pan) {
        this.pan = pan;
    }
    public boolean isPan() {
        return pan;
    }

    /**
     * Opacity of the selection.
     **/
    public void setSelectionAlpha(double selectionAlpha) {
        this.selectionAlpha = selectionAlpha;
    }
    public Double getSelectionAlpha() {
        return selectionAlpha;
    }

    /**
     * Specifies if cursor should only mark selected area but not zoom-in after user releases
     * mouse button.
     **/
    public void setSelectWithoutZooming(boolean selectWithoutZooming) {
        this.selectWithoutZooming = selectWithoutZooming;
    }
    public boolean isSelectWithoutZooming() {
        return selectWithoutZooming;
    }

    /**
     * If true, the graph will display balloon on next available data point if currently
     * hovered item doesn't have value for this graph.
     **/
    public void setShowNextAvailable(boolean showNextAvailable) {
        this.showNextAvailable = showNextAvailable;
    }
    public boolean isShowNextAvailable() {
        return showNextAvailable;
    }

    /**
     * Specifies whether value balloons are enabled. In case they are not, the balloons
     * might be displayed anyway, when the user rolls-over the column or bullet.
     **/
    public void setValueBalloonsEnabled(boolean valueBalloonsEnabled) {
        this.valueBalloonsEnabled = valueBalloonsEnabled;
    }
    public boolean isValueBalloonsEnabled() {
        return valueBalloonsEnabled;
    }

    /**
     * Specifies if the user can zoom-in the chart. If pan is set to true, zoomable is switched
     * to false automatically.
     **/
    public void setZoomable(boolean zoomable) {
        this.zoomable = zoomable;
    }
    public boolean isZoomable() {
        return zoomable;
    }

}