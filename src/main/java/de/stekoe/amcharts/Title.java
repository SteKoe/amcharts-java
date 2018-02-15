package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

/**
 * Creates a title on above the chart, multiple can be assigned.
 */

public class Title implements Serializable {
    private Double alpha;
    private Boolean bold;
    private Color color;
    private String id;
    private Double size;
    private Double tabIndex;
    private String text;

    /**
     * @param alpha Opacity of a title.
     * @return Title
     */
    public Title setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * @param bold Specifies if title should be bold or not.
     * @return Title
     */
    public Title setBold(boolean bold) {
        this.bold = bold;
        return this;
    }

    public Boolean getBold() {
        return bold;
    }

    /**
     * @param color Text color of a title.
     * @return Title
     */
    public Title setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param id Unique id of a Title. You don't need to set it, unless you want to.
     * @return Title
     */
    public Title setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * @param size Text size of a title.
     * @return Title
     */
    public Title setSize(double size) {
        this.size = size;
        return this;
    }

    public Double getSize() {
        return size;
    }

    /**
     * @param tabIndex In case you set it to some number, the chart will set focus on the title when user
     *                 clicks tab key. When a focus is set, screen readers like NVDA Screen reader will
     *                 read the title. Note, not all browsers and readers support this.
     * @return Title
     */
    public Title setTabIndex(double tabIndex) {
        this.tabIndex = tabIndex;
        return this;
    }

    public Double getTabIndex() {
        return tabIndex;
    }

    /**
     * @param text Text of a title.
     * @return Title
     */
    public Title setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return text;
    }

}