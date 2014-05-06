package de.stekoe.amcharts;

public class Title {
    private Double alpha;
    private Boolean bold;
    private Color color;
    private String id;
    private Double size;
    private String text;

    /**
     * Opacity of a title.
     **/
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
    public Double getAlpha() {
        return alpha;
    }

    /**
     * Specifies if title should be bold or not.
     **/
    public void setBold(boolean bold) {
        this.bold = bold;
    }
    public boolean isBold() {
        return bold;
    }

    /**
     * Text color of a title.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Unique id of a Title. You don't need to set it, unless you want to.
     **/
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    /**
     * Text size of a title.
     **/
    public void setSize(double size) {
        this.size = size;
    }
    public Double getSize() {
        return size;
    }

    /**
     * Text of a title.
     **/
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

}