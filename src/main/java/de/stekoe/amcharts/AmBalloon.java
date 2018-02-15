package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

/**
 * Creates the balloons ( tooltips ) of the chart, It follows the mouse cursor when
 * you roll-over the data items. The framework generates the instances automatically
 * you only need to adjust the appearance to your needs.
 */

public class AmBalloon implements Serializable {
    private Boolean adjustBorderColor;
    private Double animationDuration;
    private Double borderAlpha;
    private Color borderColor;
    private Double borderThickness;
    private Color color;
    private Double cornerRadius;
    private Boolean disableMouseEvents;
    private Boolean drop;
    private Boolean enabled;
    private Double fadeOutDuration;
    private Double fillAlpha;
    private Color fillColor;
    private Boolean fixedPosition;
    private Double fontSize;
    private Double horizontalPadding;
    private Double maxWidth;
    private Double offsetX;
    private Double offsetY;
    private String pointerOrientation;
    private Double pointerWidth;
    private Double shadowAlpha;
    private Color shadowColor;
    private Boolean showBullet;
    private String textAlign;
    private Double verticalPadding;

    /**
     * @param adjustBorderColor If this is set to true, border color instead of background color will be changed
     *                          when user rolls-over the slice, graph, etc.
     * @return AmBalloon
     */
    public AmBalloon setAdjustBorderColor(boolean adjustBorderColor) {
        this.adjustBorderColor = adjustBorderColor;
        return this;
    }

    public Boolean getAdjustBorderColor() {
        return adjustBorderColor;
    }

    /**
     * @param animationDuration Duration of balloon movement from previous point to current point, in seconds.
     * @return AmBalloon
     */
    public AmBalloon setAnimationDuration(double animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    public Double getAnimationDuration() {
        return animationDuration;
    }

    /**
     * @param borderAlpha Balloon border opacity. Value range is 0 - 1.
     * @return AmBalloon
     */
    public AmBalloon setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
        return this;
    }

    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * @param borderColor Balloon border color. Will only be used of adjustBorderColor is false.
     * @return AmBalloon
     */
    public AmBalloon setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * @param borderThickness Balloon border thickness.
     * @return AmBalloon
     */
    public AmBalloon setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
        return this;
    }

    public Double getBorderThickness() {
        return borderThickness;
    }

    /**
     * @param color Color of text in the balloon.
     * @return AmBalloon
     */
    public AmBalloon setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param cornerRadius Balloon corner radius.
     * @return AmBalloon
     */
    public AmBalloon setCornerRadius(double cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public Double getCornerRadius() {
        return cornerRadius;
    }

    /**
     * @param disableMouseEvents If your balloon has links, you have to set this to false in order for those links
     *                           to be clickable.
     * @return AmBalloon
     */
    public AmBalloon setDisableMouseEvents(boolean disableMouseEvents) {
        this.disableMouseEvents = disableMouseEvents;
        return this;
    }

    public Boolean getDisableMouseEvents() {
        return disableMouseEvents;
    }

    /**
     * @param drop Allows having drop-shaped balloons. Note, these balloons will not check for overlapping
     *             with other balloons, or if they go outside plot area. It also does not change pointer
     *             orientation automatically based on its vertical position like regular balloons do.
     *             You can use pointerOrientation property if you want it to point to different direction.
     *             Not supported by IE8.
     * @return AmBalloon
     */
    public AmBalloon setDrop(boolean drop) {
        this.drop = drop;
        return this;
    }

    public Boolean getDrop() {
        return drop;
    }

    /**
     * @param enabled Use this property to disable balloons for certain value axes. I.e.: "valueAxes":
     *                [{
     *                // ...
     *                // value balloons are shown
     *                }, {
     *                // ...
     *                "balloon": {
     *                "enabled":
     *                false
     *                }
     *                // value balloons are not shown
     *                }]
     * @return AmBalloon
     */
    public AmBalloon setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param fadeOutDuration Duration of a fade out animation, in seconds.
     * @return AmBalloon
     */
    public AmBalloon setFadeOutDuration(double fadeOutDuration) {
        this.fadeOutDuration = fadeOutDuration;
        return this;
    }

    public Double getFadeOutDuration() {
        return fadeOutDuration;
    }

    /**
     * @param fillAlpha Balloon background opacity.
     * @return AmBalloon
     */
    public AmBalloon setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
        return this;
    }

    public Double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * @param fillColor Balloon background color. Usually balloon background color is set by the chart. Only
     *                  if "adjustBorderColor" is "true" this color will be used.
     * @return AmBalloon
     */
    public AmBalloon setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public Color getFillColor() {
        return fillColor;
    }

    /**
     * @param fixedPosition Specifies if balloon should follow mouse when hovering the slice/column/bullet or
     *                      stay in fixed position (this does not affect balloon behavior if ChartCursor is used).
     *                      Note: This setting is ignored in JavaScript Maps.
     * @return AmBalloon
     */
    public AmBalloon setFixedPosition(boolean fixedPosition) {
        this.fixedPosition = fixedPosition;
        return this;
    }

    public Boolean getFixedPosition() {
        return fixedPosition;
    }

    /**
     * @param fontSize Size of text in the balloon. Chart's fontSize is used by default.
     * @return AmBalloon
     */
    public AmBalloon setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * @param horizontalPadding Horizontal padding of the balloon.
     * @return AmBalloon
     */
    public AmBalloon setHorizontalPadding(double horizontalPadding) {
        this.horizontalPadding = horizontalPadding;
        return this;
    }

    public Double getHorizontalPadding() {
        return horizontalPadding;
    }

    /**
     * @param maxWidth Maximum width of a balloon.
     * @return AmBalloon
     */
    public AmBalloon setMaxWidth(double maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }

    public Double getMaxWidth() {
        return maxWidth;
    }

    /**
     * @param offsetX Defines horizontal distance from mouse pointer to balloon pointer. If you set it
     *                to a small value, the balloon might flicker, as mouse might lose focus on hovered
     *                object. NOTE: this setting is ignored unless fixedPosition is set to false or Chart
     *                Cursor is enabled.
     * @return AmBalloon
     */
    public AmBalloon setOffsetX(double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    /**
     * @param offsetY Defines vertical distance from mouse pointer to balloon pointer. If you set it to
     *                a small value, the balloon might flicker, as mouse might lose focus on hovered object.
     *                NOTE: this setting is ignored unless fixedPosition is set to false or Chart Cursor
     *                is enabled.
     * @return AmBalloon
     */
    public AmBalloon setOffsetY(double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    /**
     * @param pointerOrientation Works only if balloon.drop set to true, specifies direction of a pointer.
     * @return AmBalloon
     */
    public AmBalloon setPointerOrientation(String pointerOrientation) {
        this.pointerOrientation = pointerOrientation;
        return this;
    }

    public String getPointerOrientation() {
        return pointerOrientation;
    }

    /**
     * @param pointerWidth The width of the pointer (arrow) "root". Only used if cornerRadius is 0.
     * @return AmBalloon
     */
    public AmBalloon setPointerWidth(double pointerWidth) {
        this.pointerWidth = pointerWidth;
        return this;
    }

    public Double getPointerWidth() {
        return pointerWidth;
    }

    /**
     * @param shadowAlpha Opacity of a shadow.
     * @return AmBalloon
     */
    public AmBalloon setShadowAlpha(double shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
        return this;
    }

    public Double getShadowAlpha() {
        return shadowAlpha;
    }

    /**
     * @param shadowColor Color of a shadow.
     * @return AmBalloon
     */
    public AmBalloon setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    /**
     * @param showBullet If cornerRadius of a balloon is >0, showBullet is set to true for value balloons
     *                   when ChartCursor is used. If you don't want the bullet near the balloon, set it to
     *                   false: chart.balloon.showBullet = false
     * @return AmBalloon
     */
    public AmBalloon setShowBullet(boolean showBullet) {
        this.showBullet = showBullet;
        return this;
    }

    public Boolean getShowBullet() {
        return showBullet;
    }

    /**
     * @param textAlign Text alignment, possible values "left", "middle" and "right"
     * @return AmBalloon
     */
    public AmBalloon setTextAlign(String textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public String getTextAlign() {
        return textAlign;
    }

    /**
     * @param verticalPadding Vertical padding of the balloon.
     * @return AmBalloon
     */
    public AmBalloon setVerticalPadding(double verticalPadding) {
        this.verticalPadding = verticalPadding;
        return this;
    }

    public Double getVerticalPadding() {
        return verticalPadding;
    }

}