package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

/**
 * GraphDataItem holds all the information about the graph's data item. When working
 * with a chart, you do not create GraphDataItem objects or change it's properties directly.
 * GraphDataItem is passed to you by events when user interacts with data item on the
 * chart. The list of properties below will help you to extract data item's value/coordinate/etc.
 */

public class GraphDataItem implements Serializable {
    private Double alpha;
    private String bullet;
    private Double bulletSize;
    private String category;
    private Color color;
    private String customBullet;
    private Object dataContext;
    private String description;
    private List<Color> fillColors;
    private Object percents;
    private SerialDataItem serialDataItem;
    private String url;
    private Object values;
    private Double x;
    private Double y;

    /**
     * @param alpha Opacity of the data item.
     * @return GraphDataItem
     */
    public GraphDataItem setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * @param bullet Bullet type.
     * @return GraphDataItem
     */
    public GraphDataItem setBullet(String bullet) {
        this.bullet = bullet;
        return this;
    }

    public String getBullet() {
        return bullet;
    }

    /**
     * @param bulletSize Bullet size.
     * @return GraphDataItem
     */
    public GraphDataItem setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
        return this;
    }

    public Double getBulletSize() {
        return bulletSize;
    }

    /**
     * @param category Category value.
     * @return GraphDataItem
     */
    public GraphDataItem setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getCategory() {
        return category;
    }

    /**
     * @param color Color of the data item.
     * @return GraphDataItem
     */
    public GraphDataItem setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param customBullet Custom bullet (path to file name).
     * @return GraphDataItem
     */
    public GraphDataItem setCustomBullet(String customBullet) {
        this.customBullet = customBullet;
        return this;
    }

    public String getCustomBullet() {
        return customBullet;
    }

    /**
     * @param dataContext Original object from data provider.
     * @return GraphDataItem
     */
    public GraphDataItem setDataContext(Object dataContext) {
        this.dataContext = dataContext;
        return this;
    }

    public Object getDataContext() {
        return dataContext;
    }

    /**
     * @param description Description.
     * @return GraphDataItem
     */
    public GraphDataItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    /**
     * @param fillColors Array of colors of the data item, used by column and candlestick chart only.
     * @return GraphDataItem
     */
    public GraphDataItem setFillColors(List<Color> fillColors) {
        this.fillColors = fillColors;
        return this;
    }

    public List<Color> getFillColors() {
        return fillColors;
    }

    /**
     * @param percents Object which holds percents when recalculateToPercents is set to true.
     * @return GraphDataItem
     */
    public GraphDataItem setPercents(Object percents) {
        this.percents = percents;
        return this;
    }

    public Object getPercents() {
        return percents;
    }

    /**
     * @param serialDataItem SerialDataItem of this graphDataItem
     * @return GraphDataItem
     */
    public GraphDataItem setSerialDataItem(SerialDataItem serialDataItem) {
        this.serialDataItem = serialDataItem;
        return this;
    }

    public SerialDataItem getSerialDataItem() {
        return serialDataItem;
    }

    /**
     * @param url url
     * @return GraphDataItem
     */
    public GraphDataItem setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    /**
     * @param values Object which holds values of the data item (value, open, close, low, high).
     * @return GraphDataItem
     */
    public GraphDataItem setValues(Object values) {
        this.values = values;
        return this;
    }

    public Object getValues() {
        return values;
    }

    /**
     * @param x x coordinate of the data item.
     * @return GraphDataItem
     */
    public GraphDataItem setX(double x) {
        this.x = x;
        return this;
    }

    public Double getX() {
        return x;
    }

    /**
     * @param y y coordinate of the data item.
     * @return GraphDataItem
     */
    public GraphDataItem setY(double y) {
        this.y = y;
        return this;
    }

    public Double getY() {
        return y;
    }

}