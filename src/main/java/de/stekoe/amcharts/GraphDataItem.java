package de.stekoe.amcharts;

import java.io.Serializable;
import java.util.List;

import de.stekoe.amcharts.addition.Color;

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
     **/
    public Double getAlpha() {
        return alpha;
    }
    public GraphDataItem setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    /**
     * Bullet type.
     **/
    public String getBullet() {
        return bullet;
    }
    public GraphDataItem setBullet(String bullet) {
        this.bullet = bullet;
        return this;
    }

    /**
     * Bullet size.
     **/
    public Double getBulletSize() {
        return bulletSize;
    }
    public GraphDataItem setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
        return this;
    }

    /**
     * Category value.
     **/
    public String getCategory() {
        return category;
    }
    public GraphDataItem setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Color of the data item.
     **/
    public Color getColor() {
        return color;
    }
    public GraphDataItem setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Custom bullet (path to file name).
     **/
    public String getCustomBullet() {
        return customBullet;
    }
    public GraphDataItem setCustomBullet(String customBullet) {
        this.customBullet = customBullet;
        return this;
    }

    /**
     * Original object from data provider.
     **/
    public Object getDataContext() {
        return dataContext;
    }
    public GraphDataItem setDataContext(Object dataContext) {
        this.dataContext = dataContext;
        return this;
    }

    /**
     * Description.
     **/
    public String getDescription() {
        return description;
    }
    public GraphDataItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Array of colors of the data item, used by column and candlestick chart only.
     **/
    public List<Color> getFillColors() {
        return fillColors;
    }
    public GraphDataItem setFillColors(List<Color> fillColors) {
        this.fillColors = fillColors;
        return this;
    }

    /**
     * Object which holds percents when recalculateToPercents is set to true.
     **/
    public Object getPercents() {
        return percents;
    }
    public GraphDataItem setPercents(Object percents) {
        this.percents = percents;
        return this;
    }

    /**
     * SerialDataItem of this graphDataItem
     **/
    public SerialDataItem getSerialDataItem() {
        return serialDataItem;
    }
    public GraphDataItem setSerialDataItem(SerialDataItem serialDataItem) {
        this.serialDataItem = serialDataItem;
        return this;
    }

    /**
     * url
     **/
    public String getUrl() {
        return url;
    }
    public GraphDataItem setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Object which holds values of the data item (value, open, close, low, high).
     **/
    public Object getValues() {
        return values;
    }
    public GraphDataItem setValues(Object values) {
        this.values = values;
        return this;
    }

    /**
     * x coordinate of the data item.
     **/
    public Double getX() {
        return x;
    }
    public GraphDataItem setX(double x) {
        this.x = x;
        return this;
    }

    /**
     * y coordinate of the data item.
     **/
    public Double getY() {
        return y;
    }
    public GraphDataItem setY(double y) {
        this.y = y;
        return this;
    }


}