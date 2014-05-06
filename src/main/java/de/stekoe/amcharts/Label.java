package de.stekoe.amcharts;

public class Label {
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
    public void setAlign(String align) {
        this.align = align;
    }
    public String getAlign() {
        return align;
    }

    /**
     * 
     **/
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
    public Double getAlpha() {
        return alpha;
    }

    /**
     * Specifies if label is bold or not.
     **/
    public void setBold(boolean bold) {
        this.bold = bold;
    }
    public boolean isBold() {
        return bold;
    }

    /**
     * Color of a label.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Unique id of a Label. You don't need to set it, unless you want to.
     **/
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    /**
     * Rotation angle.
     **/
    public void setRotation(double rotation) {
        this.rotation = rotation;
    }
    public Double getRotation() {
        return rotation;
    }

    /**
     * Text size.
     **/
    public void setSize(double size) {
        this.size = size;
    }
    public Double getSize() {
        return size;
    }

    /**
     * Text of a label.
     **/
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    /**
     * URL which will be access if user clicks on a label.
     **/
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    /**
     * X position of a label.
     **/
    public void setX(String x) {
        this.x = x;
    }
    public String getX() {
        return x;
    }

    /**
     * y position of a label.
     **/
    public void setY(String y) {
        this.y = y;
    }
    public String getY() {
        return y;
    }

}