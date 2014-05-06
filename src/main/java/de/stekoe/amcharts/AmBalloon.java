package de.stekoe.amcharts;

public class AmBalloon {
    private Boolean adjustBorderColor;
    private Double animationDuration;
    private Double borderAlpha;
    private Color borderColor;
    private Double borderThickness;
    private Color color;
    private Double cornerRadius;
    private Double fadeOutDuration;
    private Double fillAlpha;
    private Color fillColor;
    private Boolean fixedPosition;
    private Double fontSize;
    private Double horizontalPadding;
    private Double offsetX;
    private Double offsetY;
    private Double pointerWidth;
    private Double shadowAlpha;
    private Color shadowColor;
    private Boolean showBullet;
    private String textAlign;
    private Double verticalPadding;

    /**
     * If this is set to true, border color instead of background color will be changed
     * when user rolls-over the slice, graph, etc.
     **/
    public void setAdjustBorderColor(boolean adjustBorderColor) {
        this.adjustBorderColor = adjustBorderColor;
    }
    public boolean isAdjustBorderColor() {
        return adjustBorderColor;
    }

    /**
     * Duration of balloon movement from previous point to current point, in seconds.
     **/
    public void setAnimationDuration(double animationDuration) {
        this.animationDuration = animationDuration;
    }
    public Double getAnimationDuration() {
        return animationDuration;
    }

    /**
     * Balloon border opacity. Value range is 0 - 1.
     **/
    public void setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
    }
    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * Balloon border color. Will only be used of adjustBorderColor is false.
     **/
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * Balloon border thickness.
     **/
    public void setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
    }
    public Double getBorderThickness() {
        return borderThickness;
    }

    /**
     * Color of text in the balloon.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Balloon corner radius.
     **/
    public void setCornerRadius(double cornerRadius) {
        this.cornerRadius = cornerRadius;
    }
    public Double getCornerRadius() {
        return cornerRadius;
    }

    /**
     * Duration of a fade out animation, in seconds.
     **/
    public void setFadeOutDuration(double fadeOutDuration) {
        this.fadeOutDuration = fadeOutDuration;
    }
    public Double getFadeOutDuration() {
        return fadeOutDuration;
    }

    /**
     * Balloon background opacity.
     **/
    public void setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
    }
    public Double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * Balloon background color. Usually balloon background color is set by the chart. Only
     * if "adjustBorderColor" is "true" this color will be used.
     **/
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
    public Color getFillColor() {
        return fillColor;
    }

    /**
     * Specifies if balloon should follow mouse when hovering the slice/column/bullet or
     * stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
     **/
    public void setFixedPosition(boolean fixedPosition) {
        this.fixedPosition = fixedPosition;
    }
    public boolean isFixedPosition() {
        return fixedPosition;
    }

    /**
     * Size of text in the balloon. Chart's fontSize is used by default.
     **/
    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }
    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Horizontal padding of the balloon.
     **/
    public void setHorizontalPadding(double horizontalPadding) {
        this.horizontalPadding = horizontalPadding;
    }
    public Double getHorizontalPadding() {
        return horizontalPadding;
    }

    /**
     * Defines horizontal distance from mouse pointer to balloon pointer. If you set it
     * to a small value, the balloon might flicker, as mouse might lose focus on hovered
     * object.
     **/
    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }
    public Double getOffsetX() {
        return offsetX;
    }

    /**
     * Defines vertical distance from mouse pointer to balloon pointer. If you set it to
     * a small value, the balloon might flicker, as mouse might lose focus on hovered object.
     **/
    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }
    public Double getOffsetY() {
        return offsetY;
    }

    /**
     * The width of the pointer (arrow) "root". Only used if cornerRadius is 0.
     **/
    public void setPointerWidth(double pointerWidth) {
        this.pointerWidth = pointerWidth;
    }
    public Double getPointerWidth() {
        return pointerWidth;
    }

    /**
     * Opacity of a shadow.
     **/
    public void setShadowAlpha(double shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
    }
    public Double getShadowAlpha() {
        return shadowAlpha;
    }

    /**
     * Color of a shadow.
     **/
    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
    }
    public Color getShadowColor() {
        return shadowColor;
    }

    /**
     * If cornerRadius of a balloon is >0, showBullet is set to true for value balloons
     * when ChartCursor is used. If you don't want the bullet near the balloon, set it to
     * false: chart.balloon.showBullet = false
     **/
    public void setShowBullet(boolean showBullet) {
        this.showBullet = showBullet;
    }
    public boolean isShowBullet() {
        return showBullet;
    }

    /**
     * Text alignment, possible values "left", "middle" and "right"
     **/
    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }
    public String getTextAlign() {
        return textAlign;
    }

    /**
     * Vertical padding of the balloon.
     **/
    public void setVerticalPadding(double verticalPadding) {
        this.verticalPadding = verticalPadding;
    }
    public Double getVerticalPadding() {
        return verticalPadding;
    }

}