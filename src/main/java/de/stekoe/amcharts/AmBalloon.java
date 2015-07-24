package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

public class AmBalloon implements Serializable {
    private Boolean adjustBorderColor;
    private Double animationDuration;
    private Double borderAlpha;
    private Color borderColor;
    private Double borderThickness;
    private Color color;
    private Double cornerRadius;
    private Boolean disableMouseEvents;
    private Double fadeOutDuration;
    private Double fillAlpha;
    private Color fillColor;
    private Boolean fixedPosition;
    private Double fontSize;
    private Double horizontalPadding;
    private Double maxWidth;
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
     */
    public AmBalloon setAdjustBorderColor(boolean adjustBorderColor) {
        this.adjustBorderColor = adjustBorderColor;
        return this;
    }

    public Boolean getAdjustBorderColor() {
        return adjustBorderColor;
    }

    /**
     * Duration of balloon movement from previous point to current point, in seconds.
     */
    public AmBalloon setAnimationDuration(double animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public Double getAnimationDuration() {
        return animationDuration;
    }

    /**
     * Balloon border opacity. Value range is 0 - 1.
     */
    public AmBalloon setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
        return this;
    }

    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * Balloon border color. Will only be used of adjustBorderColor is false.
     */
    public AmBalloon setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * Balloon border thickness.
     */
    public AmBalloon setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
        return this;
    }

    public Double getBorderThickness() {
        return borderThickness;
    }

    /**
     * Color of text in the balloon.
     */
    public AmBalloon setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Balloon corner radius.
     */
    public AmBalloon setCornerRadius(double cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public Double getCornerRadius() {
        return cornerRadius;
    }

    /**
     * *In case your balloon has links, you have to set this to true in order links to work.
     */
    public AmBalloon setDisableMouseEvents(boolean disableMouseEvents) {
        this.disableMouseEvents = disableMouseEvents;
        return this;
    }

    public Boolean getDisableMouseEvents() {
        return disableMouseEvents;
    }

    /**
     * Duration of a fade out animation, in seconds.
     */
    public AmBalloon setFadeOutDuration(double fadeOutDuration) {
        this.fadeOutDuration = fadeOutDuration;
        return this;
    }

    public Double getFadeOutDuration() {
        return fadeOutDuration;
    }

    /**
     * Balloon background opacity.
     */
    public AmBalloon setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
        return this;
    }

    public Double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * Balloon background color. Usually balloon background color is set by the chart. Only
     * if "adjustBorderColor" is "true" this color will be used.
     */
    public AmBalloon setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public Color getFillColor() {
        return fillColor;
    }

    /**
     * Specifies if balloon should follow mouse when hovering the slice/column/bullet or
     * stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
     */
    public AmBalloon setFixedPosition(boolean fixedPosition) {
        this.fixedPosition = fixedPosition;
        return this;
    }

    public Boolean getFixedPosition() {
        return fixedPosition;
    }

    /**
     * Size of text in the balloon. Chart's fontSize is used by default.
     */
    public AmBalloon setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Horizontal padding of the balloon.
     */
    public AmBalloon setHorizontalPadding(double horizontalPadding) {
        this.horizontalPadding = horizontalPadding;
        return this;
    }

    public Double getHorizontalPadding() {
        return horizontalPadding;
    }

    /**
     * Maximum width of a balloon.
     */
    public AmBalloon setMaxWidth(double maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    public Double getMaxWidth() {
        return maxWidth;
    }

    /**
     * Defines horizontal distance from mouse pointer to balloon pointer. If you set it
     * to a small value, the balloon might flicker, as mouse might lose focus on hovered
     * object.
     */
    public AmBalloon setOffsetX(double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    /**
     * Defines vertical distance from mouse pointer to balloon pointer. If you set it to
     * a small value, the balloon might flicker, as mouse might lose focus on hovered object.
     */
    public AmBalloon setOffsetY(double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    /**
     * The width of the pointer (arrow) "root". Only used if cornerRadius is 0.
     */
    public AmBalloon setPointerWidth(double pointerWidth) {
        this.pointerWidth = pointerWidth;
        return this;
    }

    public Double getPointerWidth() {
        return pointerWidth;
    }

    /**
     * Opacity of a shadow.
     */
    public AmBalloon setShadowAlpha(double shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
        return this;
    }

    public Double getShadowAlpha() {
        return shadowAlpha;
    }

    /**
     * Color of a shadow.
     */
    public AmBalloon setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    /**
     * If cornerRadius of a balloon is >0, showBullet is set to true for value balloons
     * when ChartCursor is used. If you don't want the bullet near the balloon, set it to
     * false: chart.balloon.showBullet = false
     */
    public AmBalloon setShowBullet(boolean showBullet) {
        this.showBullet = showBullet;
        return this;
    }

    public Boolean getShowBullet() {
        return showBullet;
    }

    /**
     * Text alignment, possible values "left", "middle" and "right"
     */
    public AmBalloon setTextAlign(String textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public String getTextAlign() {
        return textAlign;
    }

    /**
     * Vertical padding of the balloon.
     */
    public AmBalloon setVerticalPadding(double verticalPadding) {
        this.verticalPadding = verticalPadding;
        return this;
    }

    public Double getVerticalPadding() {
        return verticalPadding;
    }

}