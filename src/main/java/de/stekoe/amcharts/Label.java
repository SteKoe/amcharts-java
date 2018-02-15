package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

/**
 * *Creates a label on the chart which can be placed anywhere, multiple can be assigned.
 */

public class Label implements Serializable {
    private String align;
    private Double alpha;
    private Boolean bold;
    private Color color;
    private String id;
    private Double rotation;
    private Double size;
    private Double tabIndex;
    private String text;
    private String url;
    private String x;
    private String y;

    /**
     * @param align
     * @return Label
     */
    public Label setAlign(String align) {
        this.align = align;
        return this;
    }

    public String getAlign() {
        return align;
    }

    /**
     * @param alpha
     * @return Label
     */
    public Label setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * @param bold Specifies if label is bold or not.
     * @return Label
     */
    public Label setBold(boolean bold) {
        this.bold = bold;
        return this;
    }

    public Boolean getBold() {
        return bold;
    }

    /**
     * @param color Color of a label.
     * @return Label
     */
    public Label setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param id Unique id of a Label. You don't need to set it, unless you want to.
     * @return Label
     */
    public Label setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * @param rotation Rotation angle.
     * @return Label
     */
    public Label setRotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public Double getRotation() {
        return rotation;
    }

    /**
     * @param size Text size.
     * @return Label
     */
    public Label setSize(double size) {
        this.size = size;
        return this;
    }

    public Double getSize() {
        return size;
    }

    /**
     * @param tabIndex In case you set it to some number, the chart will set focus on the label when user
     *                 clicks tab key. When a focus is set, screen readers like NVDA Screen reader will
     *                 read the title. Note, not all browsers and readers support this.
     * @return Label
     */
    public Label setTabIndex(double tabIndex) {
        this.tabIndex = tabIndex;
        return this;
    }

    public Double getTabIndex() {
        return tabIndex;
    }

    /**
     * @param text Text of a label.
     * @return Label
     */
    public Label setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return text;
    }

    /**
     * @param url URL which will be access if user clicks on a label.
     * @return Label
     */
    public Label setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    /**
     * @param x X position of a label.
     * @return Label
     */
    public Label setX(String x) {
        this.x = x;
        return this;
    }

    public String getX() {
        return x;
    }

    /**
     * @param y y position of a label.
     * @return Label
     */
    public Label setY(String y) {
        this.y = y;
        return this;
    }

    public String getY() {
        return y;
    }

}