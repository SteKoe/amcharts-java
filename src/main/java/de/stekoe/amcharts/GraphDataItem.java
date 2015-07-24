package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

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
     * Opacity of the data item.
     */
    public GraphDataItem setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * Bullet type.
     */
    public GraphDataItem setBullet(String bullet) {
        this.bullet = bullet;
        return this;
    }

    public String getBullet() {
        return bullet;
    }

    /**
     * Bullet size.
     */
    public GraphDataItem setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
        return this;
    }

    public Double getBulletSize() {
        return bulletSize;
    }

    /**
     * Category value.
     */
    public GraphDataItem setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getCategory() {
        return category;
    }

    /**
     * Color of the data item.
     */
    public GraphDataItem setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Custom bullet (path to file name).
     */
    public GraphDataItem setCustomBullet(String customBullet) {
        this.customBullet = customBullet;
        return this;
    }

    public String getCustomBullet() {
        return customBullet;
    }

    /**
     * Original object from data provider.
     */
    public GraphDataItem setDataContext(Object dataContext) {
        this.dataContext = dataContext;
        return this;
    }

    public Object getDataContext() {
        return dataContext;
    }

    /**
     * Description.
     */
    public GraphDataItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Array of colors of the data item, used by column and candlestick chart only.
     */
    public GraphDataItem setFillColors(List<Color> fillColors) {
        this.fillColors = fillColors;
        return this;
    }

    public List<Color> getFillColors() {
        return fillColors;
    }

    /**
     * Object which holds percents when recalculateToPercents is set to true.
     */
    public GraphDataItem setPercents(Object percents) {
        this.percents = percents;
        return this;
    }

    public Object getPercents() {
        return percents;
    }

    /**
     * SerialDataItem of this graphDataItem
     */
    public GraphDataItem setSerialDataItem(SerialDataItem serialDataItem) {
        this.serialDataItem = serialDataItem;
        return this;
    }

    public SerialDataItem getSerialDataItem() {
        return serialDataItem;
    }

    /**
     * url
     */
    public GraphDataItem setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }

    /**
     * Object which holds values of the data item (value, open, close, low, high).
     */
    public GraphDataItem setValues(Object values) {
        this.values = values;
        return this;
    }

    public Object getValues() {
        return values;
    }

    /**
     * x coordinate of the data item.
     */
    public GraphDataItem setX(double x) {
        this.x = x;
        return this;
    }

    public Double getX() {
        return x;
    }

    /**
     * y coordinate of the data item.
     */
    public GraphDataItem setY(double y) {
        this.y = y;
        return this;
    }

    public Double getY() {
        return y;
    }

}