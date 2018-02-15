package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

/**
 * Image is used to add images to the end/start of trend lines. Allows you to display
 * image anywhere on chart's plot area.
 */

public class Image implements Serializable {
    private Color balloonColor;
    private String balloonText;
    private Color color;
    private Double height;
    private Double offsetX;
    private Double offsetY;
    private Color outlineColor;
    private Double rotation;
    private String svgPath;
    private String url;
    private Double width;

    /**
     * @param balloonColor Roll-over balloon color.
     * @return Image
     */
    public Image setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
        return this;
    }

    public Color getBalloonColor() {
        return balloonColor;
    }

    /**
     * @param balloonText Roll-over text.
     * @return Image
     */
    public Image setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * @param color Color of an image. Works only if an image is generated using SVG path (using svgPath
     *              property on an Image)
     * @return Image
     */
    public Image setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param height Height of an image.
     * @return Image
     */
    public Image setHeight(double height) {
        this.height = height;
        return this;
    }

    public Double getHeight() {
        return height;
    }

    /**
     * @param offsetX Horizontal offset.
     * @return Image
     */
    public Image setOffsetX(double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    /**
     * @param offsetY Vertical offset.
     * @return Image
     */
    public Image setOffsetY(double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    /**
     * @param outlineColor Color of image outline. Works only if an image is generated using SVG path (using
     *                     svgPath property on an Image)
     * @return Image
     */
    public Image setOutlineColor(Color outlineColor) {
        this.outlineColor = outlineColor;
        return this;
    }

    public Color getOutlineColor() {
        return outlineColor;
    }

    /**
     * @param rotation Rotation of an image.
     * @return Image
     */
    public Image setRotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public Double getRotation() {
        return rotation;
    }

    /**
     * @param svgPath Svg path of an image. Will not work with IE8.
     * @return Image
     */
    public Image setSvgPath(String svgPath) {
        this.svgPath = svgPath;
        return this;
    }

    public String getSvgPath() {
        return svgPath;
    }

    /**
     * @param url Url of an image.
     * @return Image
     */
    public Image setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    /**
     * @param width Width on an image.
     * @return Image
     */
    public Image setWidth(double width) {
        this.width = width;
        return this;
    }

    public Double getWidth() {
        return width;
    }

}