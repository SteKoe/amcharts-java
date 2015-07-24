package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

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
     * Roll-over balloon color.
     */
    public Image setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
        return this;
    }

    public Color getBalloonColor() {
        return balloonColor;
    }

    /**
     * Roll-over text.
     */
    public Image setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Color of an image. Works only if an image is generated using SVG path (using svgPath
     * property on an Image)
     */
    public Image setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Height of an image.
     */
    public Image setHeight(double height) {
        this.height = height;
        return this;
    }

    public Double getHeight() {
        return height;
    }

    /**
     * Horizontal offset.
     */
    public Image setOffsetX(double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    /**
     * Vertical offset.
     */
    public Image setOffsetY(double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    /**
     * Color of image outline. Works only if an image is generated using SVG path (using
     * svgPath property on an Image)
     */
    public Image setOutlineColor(Color outlineColor) {
        this.outlineColor = outlineColor;
        return this;
    }

    public Color getOutlineColor() {
        return outlineColor;
    }

    /**
     * Rotation of an image.
     */
    public Image setRotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public Double getRotation() {
        return rotation;
    }

    /**
     * Svg path of an image. Will not work with IE8.
     */
    public Image setSvgPath(String svgPath) {
        this.svgPath = svgPath;
        return this;
    }

    public String getSvgPath() {
        return svgPath;
    }

    /**
     * Url of an image.
     */
    public Image setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    /**
     * Width on an image.
     */
    public Image setWidth(double width) {
        this.width = width;
        return this;
    }

    public Double getWidth() {
        return width;
    }

}