package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

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
     *
     **/
    public Label setAlign(String align) {
        this.align = align;
        return this;
    }

    public String getAlign() {
        return align;
    }

    /**
     *
     **/
    public Label setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * Specifies if label is bold or not.
     **/
    public Label setBold(boolean bold) {
        this.bold = bold;
        return this;
    }

    public Boolean getBold() {
        return bold;
    }

    /**
     * Color of a label.
     **/
    public Label setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Unique id of a Label. You don't need to set it, unless you want to.
     **/
    public Label setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * Rotation angle.
     **/
    public Label setRotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public Double getRotation() {
        return rotation;
    }

    /**
     * Text size.
     **/
    public Label setSize(double size) {
        this.size = size;
        return this;
    }

    public Double getSize() {
        return size;
    }

    /**
     * In case you set it to some number, the chart will set focus on the label when user
     * clicks tab key. When a focus is set, screen readers like NVDA Screen reader will
     * read the title. Note, not all browsers and readers support this.
     **/
    public Label setTabIndex(double tabIndex) {
        this.tabIndex = tabIndex;
        return this;
    }

    public Double getTabIndex() {
        return tabIndex;
    }

    /**
     * Text of a label.
     **/
    public Label setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return text;
    }

    /**
     * URL which will be access if user clicks on a label.
     **/
    public Label setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    /**
     * X position of a label.
     **/
    public Label setX(String x) {
        this.x = x;
        return this;
    }

    public String getX() {
        return x;
    }

    /**
     * y position of a label.
     **/
    public Label setY(String y) {
        this.y = y;
        return this;
    }

    public String getY() {
        return y;
    }

}