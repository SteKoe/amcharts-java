package de.stekoe.amcharts;

import java.util.List;
public class AmChart {
    private List<Label> allLabels;
    private AmExport amExport;
    private Double backgroundAlpha;
    private Color backgroundColor;
    private AmBalloon balloon;
    private Double borderAlpha;
    private Color borderColor;
    private Color color;
    private String creditsPosition;
    private List<Object> dataProvider;
    private String decimalSeparator;
    private Object exportConfig;
    private String fontFamily;
    private Double fontSize;
    private Boolean handDrawn;
    private Double handDrawScatter;
    private Double handDrawThickness;
    private Double hideBalloonTime;
    private AmLegend legend;
    private Boolean panEventsEnabled;
    private String pathToImages;
    private Double percentPrecision;
    private Double precision;
    private List<Object> prefixesOfBigNumbers;
    private List<Object> prefixesOfSmallNumbers;
    private String theme;
    private String thousandsSeparator;
    private List<Title> titles;
    private String type;
    private Boolean usePrefixes;

    /**
     * Array of Labels. Example of label object, with all possible properties: {"x": 20,
     * "y": 20, "text": "this is label", "align": "left", "size": 12, "color": "#CC0000",
     * "alpha": 1, "rotation": 0, "bold": true, "url": "http://www.amcharts.com"}
     **/
    public void setAllLabels(List<Label> allLabels) {
        this.allLabels = allLabels;
    }
    public List<Label> getAllLabels() {
        return allLabels;
    }

    /**
     * AmExport object.
     **/
    public void setAmExport(AmExport amExport) {
        this.amExport = amExport;
    }
    public AmExport getAmExport() {
        return amExport;
    }

    /**
     * Opacity of background. Set it to >0 value if you want backgroundColor to work. However
     * we recommend changing div's background-color style for changing background color.
     **/
    public void setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
    }
    public Double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Background color. You should set backgroundAlpha to >0 value in order background
     * to be visible. We recommend setting background color directly on a chart's DIV instead
     * of using this property.
     **/
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * The chart creates AmBalloon class itself. If you want to customize balloon, get balloon
     * instance using this property, and then change balloon's properties.
     **/
    public void setBalloon(AmBalloon balloon) {
        this.balloon = balloon;
    }
    public AmBalloon getBalloon() {
        return balloon;
    }

    /**
     * Opacity of chart's border. Value range is 0 - 1.
     **/
    public void setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
    }
    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * Color of chart's border. You should set borderAlpha >0 in order border to be visible.
     * We recommend setting border color directly on a chart's DIV instead of using this
     * property.
     **/
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * Text color.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Non-commercial version only. Specifies position of link to amCharts site.
     **/
    public void setCreditsPosition(String creditsPosition) {
        this.creditsPosition = creditsPosition;
    }
    public String getCreditsPosition() {
        return creditsPosition;
    }

    /**
     * Array of data objects, for example: [{country:"US", value:524},{country:"UK", value:624},{country:"Lithuania",
     * value:824}]. You can have any number of fields and use any field names. In case of
     * AmMap, data provider should be MapData object.
     **/
    public void setDataProvider(List<Object> dataProvider) {
        this.dataProvider = dataProvider;
    }
    public List<Object> getDataProvider() {
        return dataProvider;
    }

    /**
     * Decimal separator.
     **/
    public void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }
    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * Object of export config. Will enable saving chart as an image for all modern browsers
     * except IE9 (IE10+ works fine). Check this article for more info.
     **/
    public void setExportConfig(Object exportConfig) {
        this.exportConfig = exportConfig;
    }
    public Object getExportConfig() {
        return exportConfig;
    }

    /**
     * Font family.
     **/
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Font size.
     **/
    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }
    public Double getFontSize() {
        return fontSize;
    }

    /**
     * If you set this to true, the lines of the chart will be distorted and will produce
     * hand-drawn effect. Try to adjust chart.handDrawScatter and chart.handDrawThickness
     * properties for a more scattered result.
     **/
    public void setHandDrawn(boolean handDrawn) {
        this.handDrawn = handDrawn;
    }
    public boolean isHandDrawn() {
        return handDrawn;
    }

    /**
     *      *Defines by how many pixels hand-drawn line (when handDrawn is set to true) will fluctuate.
     **/
    public void setHandDrawScatter(double handDrawScatter) {
        this.handDrawScatter = handDrawScatter;
    }
    public Double getHandDrawScatter() {
        return handDrawScatter;
    }

    /**
     * Defines by how many pixels line thickness will fluctuate (when handDrawn is set to
     * true).
     **/
    public void setHandDrawThickness(double handDrawThickness) {
        this.handDrawThickness = handDrawThickness;
    }
    public Double getHandDrawThickness() {
        return handDrawThickness;
    }

    /**
     * Time, in milliseconds after which balloon is hidden if the user rolls-out of the
     * object. Might be useful for AmMap to avoid balloon flickering while moving mouse
     * over the areas. Note, this is not duration of fade-out. Duration of fade-out is set
     * in AmBalloon class.
     **/
    public void setHideBalloonTime(double hideBalloonTime) {
        this.hideBalloonTime = hideBalloonTime;
    }
    public Double getHideBalloonTime() {
        return hideBalloonTime;
    }

    /**
     * Legend of a chart.
     **/
    public void setLegend(AmLegend legend) {
        this.legend = legend;
    }
    public AmLegend getLegend() {
        return legend;
    }

    /**
     * This setting affects touch-screen devices only. If a chart is on a page, and panEventsEnabled
     * are set to true, the page won't move if the user touches the chart first. If a chart
     * is big enough and occupies all the screen of your touch device, the user won’t be
     * able to move the page at all. If you think that selecting/panning the chart or moving/pinching
     * the map is a primary purpose of your users, you should set panEventsEnabled to true,
     * otherwise - false.
     **/
    public void setPanEventsEnabled(boolean panEventsEnabled) {
        this.panEventsEnabled = panEventsEnabled;
    }
    public boolean isPanEventsEnabled() {
        return panEventsEnabled;
    }

    /**
     *      *Specifies path to the folder where images like resize grips, lens and similar are.
     **/
    public void setPathToImages(String pathToImages) {
        this.pathToImages = pathToImages;
    }
    public String getPathToImages() {
        return pathToImages;
    }

    /**
     * Precision of percent values. -1 means percent values won't be rounded at all and
     * show as they are.
     **/
    public void setPercentPrecision(double percentPrecision) {
        this.percentPrecision = percentPrecision;
    }
    public Double getPercentPrecision() {
        return percentPrecision;
    }

    /**
     *      *Precision of values. -1 means values won't be rounded at all and show as they are.
     **/
    public void setPrecision(double precision) {
        this.precision = precision;
    }
    public Double getPrecision() {
        return precision;
    }

    /**
     * Prefixes which are used to make big numbers shorter: 2M instead of 2000000, etc.
     * Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes
     * property to true.
     **/
    public void setPrefixesOfBigNumbers(List<Object> prefixesOfBigNumbers) {
        this.prefixesOfBigNumbers = prefixesOfBigNumbers;
    }
    public List<Object> getPrefixesOfBigNumbers() {
        return prefixesOfBigNumbers;
    }

    /**
     * Prefixes which are used to make small numbers shorter: 2μ instead of 0.000002, etc.
     * Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes
     * property to true.
     **/
    public void setPrefixesOfSmallNumbers(List<Object> prefixesOfSmallNumbers) {
        this.prefixesOfSmallNumbers = prefixesOfSmallNumbers;
    }
    public List<Object> getPrefixesOfSmallNumbers() {
        return prefixesOfSmallNumbers;
    }

    /**
     * Theme of a chart. Config files of themes can be found in amcharts/themes/ folder.
     * More info about using themes.
     **/
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public String getTheme() {
        return theme;
    }

    /**
     * Thousands separator.
     **/
    public void setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }
    public String getThousandsSeparator() {
        return thousandsSeparator;
    }

    /**
     * Array of Title objects.
     **/
    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }
    public List<Title> getTitles() {
        return titles;
    }

    /**
     * Type of a chart. Required when creating chart using JSON. Possible types are: serial,
     * pie, xy, radar, funnel, gauge, map, stock.
     **/
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    /**
     * If true, prefixes will be used for big and small numbers. You can set arrays of prefixes
     * via prefixesOfSmallNumbers and prefixesOfBigNumbers properties.
     **/
    public void setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
    }
    public boolean isUsePrefixes() {
        return usePrefixes;
    }

}