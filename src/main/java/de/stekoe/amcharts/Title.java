package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

public class Title implements Serializable {
    private Double alpha;
    private Boolean bold;
    private Color color;
    private String id;
    private Double size;
    private String text;

    /**
     * Opacity of a title.
     */
    public Title setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * Specifies if title should be bold or not.
     */
    public Title setBold(boolean bold) {
        this.bold = bold;
        return this;
    }

    public Boolean getBold() {
        return bold;
    }

    /**
     * Text color of a title.
     */
    public Title setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Unique id of a Title. You don't need to set it, unless you want to.
     */
    public Title setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * Text size of a title.
     */
    public Title setSize(double size) {
        this.size = size;
        return this;
    }

    public Double getSize() {
        return size;
    }

    /**
     * Text of a title.
     */
    public Title setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return text;
    }

}