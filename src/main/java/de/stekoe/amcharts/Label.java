package de.stekoe.amcharts;

import org.json.JSONObject;

import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.helper.Jsonifyable;
import de.stekoe.amcharts.helper.Jsonifyer;

public class Label implements Jsonifyable {
    private String align;
    private Double alpha;
    private Boolean bold;
    private Color color;
    private String id;
    private Double rotation;
    private Double size;
    private String text;
    private String url;
    private String x;
    private String y;

    /**
     * 
     **/
    public String getAlign() {
        return align;
    }
    public Label setAlign(String align) {
        this.align = align;
        return this;
    }

    /**
     * 
     **/
    public Double getAlpha() {
        return alpha;
    }
    public Label setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    /**
     * Specifies if label is bold or not.
     **/
    public Boolean getBold() {
        return bold;
    }
    public Label setBold(boolean bold) {
        this.bold = bold;
        return this;
    }

    /**
     * Color of a label.
     **/
    public Color getColor() {
        return color;
    }
    public Label setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Unique id of a Label. You don't need to set it, unless you want to.
     **/
    public String getId() {
        return id;
    }
    public Label setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Rotation angle.
     **/
    public Double getRotation() {
        return rotation;
    }
    public Label setRotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    /**
     * Text size.
     **/
    public Double getSize() {
        return size;
    }
    public Label setSize(double size) {
        this.size = size;
        return this;
    }

    /**
     * Text of a label.
     **/
    public String getText() {
        return text;
    }
    public Label setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * URL which will be access if user clicks on a label.
     **/
    public String getUrl() {
        return url;
    }
    public Label setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * X position of a label.
     **/
    public String getX() {
        return x;
    }
    public Label setX(String x) {
        this.x = x;
        return this;
    }

    /**
     * y position of a label.
     **/
    public String getY() {
        return y;
    }
    public Label setY(String y) {
        this.y = y;
        return this;
    }

    public JSONObject toJson() {
        return new Jsonifyer(this).toJson();
    }
}