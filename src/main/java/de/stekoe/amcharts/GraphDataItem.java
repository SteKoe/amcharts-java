package de.stekoe.amcharts;

import java.util.List;
public class GraphDataItem {
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
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
    public Double getAlpha() {
        return alpha;
    }

    /**
     * Bullet type.
     **/
    public void setBullet(String bullet) {
        this.bullet = bullet;
    }
    public String getBullet() {
        return bullet;
    }

    /**
     * Bullet size.
     **/
    public void setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
    }
    public Double getBulletSize() {
        return bulletSize;
    }

    /**
     * Category value.
     **/
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    /**
     * Color of the data item.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Custom bullet (path to file name).
     **/
    public void setCustomBullet(String customBullet) {
        this.customBullet = customBullet;
    }
    public String getCustomBullet() {
        return customBullet;
    }

    /**
     * Original object from data provider.
     **/
    public void setDataContext(Object dataContext) {
        this.dataContext = dataContext;
    }
    public Object getDataContext() {
        return dataContext;
    }

    /**
     * Description.
     **/
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    /**
     * Array of colors of the data item, used by column and candlestick chart only.
     **/
    public void setFillColors(List<Color> fillColors) {
        this.fillColors = fillColors;
    }
    public List<Color> getFillColors() {
        return fillColors;
    }

    /**
     * Object which holds percents when recalculateToPercents is set to true.
     **/
    public void setPercents(Object percents) {
        this.percents = percents;
    }
    public Object getPercents() {
        return percents;
    }

    /**
     * SerialDataItem of this graphDataItem
     **/
    public void setSerialDataItem(SerialDataItem serialDataItem) {
        this.serialDataItem = serialDataItem;
    }
    public SerialDataItem getSerialDataItem() {
        return serialDataItem;
    }

    /**
     * url
     **/
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    /**
     * Object which holds values of the data item (value, open, close, low, high).
     **/
    public void setValues(Object values) {
        this.values = values;
    }
    public Object getValues() {
        return values;
    }

    /**
     * x coordinate of the data item.
     **/
    public void setX(double x) {
        this.x = x;
    }
    public Double getX() {
        return x;
    }

    /**
     * y coordinate of the data item.
     **/
    public void setY(double y) {
        this.y = y;
    }
    public Double getY() {
        return y;
    }

}