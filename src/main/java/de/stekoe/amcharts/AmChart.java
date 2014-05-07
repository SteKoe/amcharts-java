package de.stekoe.amcharts;

import java.io.Serializable;
import java.util.List;

import de.stekoe.amcharts.addition.Color;

public class AmChart implements Serializable {
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
    private String legendDiv;
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
    private String version;

    /**
     * Array of Labels. Example of label object, with all possible properties: {"x": 20,
     * "y": 20, "text": "this is label", "align": "left", "size": 12, "color": "#CC0000",
     * "alpha": 1, "rotation": 0, "bold": true, "url": "http://www.amcharts.com"}
     **/
    public List<Label> getAllLabels() {
        return allLabels;
    }
    public AmChart setAllLabels(List<Label> allLabels) {
        this.allLabels = allLabels;
        return this;
    }

    /**
     * AmExport object.
     **/
    public AmExport getAmExport() {
        return amExport;
    }
    public AmChart setAmExport(AmExport amExport) {
        this.amExport = amExport;
        return this;
    }

    /**
     * Opacity of background. Set it to >0 value if you want backgroundColor to work. However
     * we recommend changing div's background-color style for changing background color.
     **/
    public Double getBackgroundAlpha() {
        return backgroundAlpha;
    }
    public AmChart setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
        return this;
    }

    /**
     * Background color. You should set backgroundAlpha to >0 value in order background
     * to be visible. We recommend setting background color directly on a chart's DIV instead
     * of using this property.
     **/
    public Color getBackgroundColor() {
        return backgroundColor;
    }
    public AmChart setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * The chart creates AmBalloon class itself. If you want to customize balloon, get balloon
     * instance using this property, and then change balloon's properties.
     **/
    public AmBalloon getBalloon() {
        return balloon;
    }
    public AmChart setBalloon(AmBalloon balloon) {
        this.balloon = balloon;
        return this;
    }

    /**
     * Opacity of chart's border. Value range is 0 - 1.
     **/
    public Double getBorderAlpha() {
        return borderAlpha;
    }
    public AmChart setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
        return this;
    }

    /**
     * Color of chart's border. You should set borderAlpha >0 in order border to be visible.
     * We recommend setting border color directly on a chart's DIV instead of using this
     * property.
     **/
    public Color getBorderColor() {
        return borderColor;
    }
    public AmChart setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * Text color.
     **/
    public Color getColor() {
        return color;
    }
    public AmChart setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Non-commercial version only. Specifies position of link to amCharts site.
     **/
    public String getCreditsPosition() {
        return creditsPosition;
    }
    public AmChart setCreditsPosition(String creditsPosition) {
        this.creditsPosition = creditsPosition;
        return this;
    }

    /**
     * Array of data objects, for example: [{country:"US", value:524},{country:"UK", value:624},{country:"Lithuania",
     * value:824}]. You can have any number of fields and use any field names. In case of
     * AmMap, data provider should be MapData object.
     **/
    public List<Object> getDataProvider() {
        return dataProvider;
    }
    public AmChart setDataProvider(List<Object> dataProvider) {
        this.dataProvider = dataProvider;
        return this;
    }

    /**
     * Decimal separator.
     **/
    public String getDecimalSeparator() {
        return decimalSeparator;
    }
    public AmChart setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
        return this;
    }

    /**
     * Object of export config. Will enable saving chart as an image for all modern browsers
     * except IE9 (IE10+ works fine). Check this article for more info.
     **/
    public Object getExportConfig() {
        return exportConfig;
    }
    public AmChart setExportConfig(Object exportConfig) {
        this.exportConfig = exportConfig;
        return this;
    }

    /**
     * Font family.
     **/
    public String getFontFamily() {
        return fontFamily;
    }
    public AmChart setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    /**
     * Font size.
     **/
    public Double getFontSize() {
        return fontSize;
    }
    public AmChart setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * If you set this to true, the lines of the chart will be distorted and will produce
     * hand-drawn effect. Try to adjust chart.handDrawScatter and chart.handDrawThickness
     * properties for a more scattered result.
     **/
    public Boolean getHandDrawn() {
        return handDrawn;
    }
    public AmChart setHandDrawn(boolean handDrawn) {
        this.handDrawn = handDrawn;
        return this;
    }

    /**
     *      *Defines by how many pixels hand-drawn line (when handDrawn is set to true) will fluctuate.
     **/
    public Double getHandDrawScatter() {
        return handDrawScatter;
    }
    public AmChart setHandDrawScatter(double handDrawScatter) {
        this.handDrawScatter = handDrawScatter;
        return this;
    }

    /**
     * Defines by how many pixels line thickness will fluctuate (when handDrawn is set to
     * true).
     **/
    public Double getHandDrawThickness() {
        return handDrawThickness;
    }
    public AmChart setHandDrawThickness(double handDrawThickness) {
        this.handDrawThickness = handDrawThickness;
        return this;
    }

    /**
     * Time, in milliseconds after which balloon is hidden if the user rolls-out of the
     * object. Might be useful for AmMap to avoid balloon flickering while moving mouse
     * over the areas. Note, this is not duration of fade-out. Duration of fade-out is set
     * in AmBalloon class.
     **/
    public Double getHideBalloonTime() {
        return hideBalloonTime;
    }
    public AmChart setHideBalloonTime(double hideBalloonTime) {
        this.hideBalloonTime = hideBalloonTime;
        return this;
    }

    /**
     * Legend of a chart.
     **/
    public AmLegend getLegend() {
        return legend;
    }
    public AmChart setLegend(AmLegend legend) {
        this.legend = legend;
        return this;
    }

    /**
     * Read-only. Reference to the div of the legend.
     **/
    public String getLegendDiv() {
        return legendDiv;
    }
    public AmChart setLegendDiv(String legendDiv) {
        this.legendDiv = legendDiv;
        return this;
    }

    /**
     * This setting affects touch-screen devices only. If a chart is on a page, and panEventsEnabled
     * are set to true, the page won't move if the user touches the chart first. If a chart
     * is big enough and occupies all the screen of your touch device, the user won’t be
     * able to move the page at all. If you think that selecting/panning the chart or moving/pinching
     * the map is a primary purpose of your users, you should set panEventsEnabled to true,
     * otherwise - false.
     **/
    public Boolean getPanEventsEnabled() {
        return panEventsEnabled;
    }
    public AmChart setPanEventsEnabled(boolean panEventsEnabled) {
        this.panEventsEnabled = panEventsEnabled;
        return this;
    }

    /**
     *      *Specifies path to the folder where images like resize grips, lens and similar are.
     **/
    public String getPathToImages() {
        return pathToImages;
    }
    public AmChart setPathToImages(String pathToImages) {
        this.pathToImages = pathToImages;
        return this;
    }

    /**
     * Precision of percent values. -1 means percent values won't be rounded at all and
     * show as they are.
     **/
    public Double getPercentPrecision() {
        return percentPrecision;
    }
    public AmChart setPercentPrecision(double percentPrecision) {
        this.percentPrecision = percentPrecision;
        return this;
    }

    /**
     *      *Precision of values. -1 means values won't be rounded at all and show as they are.
     **/
    public Double getPrecision() {
        return precision;
    }
    public AmChart setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    /**
     * Prefixes which are used to make big numbers shorter: 2M instead of 2000000, etc.
     * Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes
     * property to true.
     **/
    public List<Object> getPrefixesOfBigNumbers() {
        return prefixesOfBigNumbers;
    }
    public AmChart setPrefixesOfBigNumbers(List<Object> prefixesOfBigNumbers) {
        this.prefixesOfBigNumbers = prefixesOfBigNumbers;
        return this;
    }

    /**
     * Prefixes which are used to make small numbers shorter: 2μ instead of 0.000002, etc.
     * Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes
     * property to true.
     **/
    public List<Object> getPrefixesOfSmallNumbers() {
        return prefixesOfSmallNumbers;
    }
    public AmChart setPrefixesOfSmallNumbers(List<Object> prefixesOfSmallNumbers) {
        this.prefixesOfSmallNumbers = prefixesOfSmallNumbers;
        return this;
    }

    /**
     * Theme of a chart. Config files of themes can be found in amcharts/themes/ folder.
     * More info about using themes.
     **/
    public String getTheme() {
        return theme;
    }
    public AmChart setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    /**
     * Thousands separator.
     **/
    public String getThousandsSeparator() {
        return thousandsSeparator;
    }
    public AmChart setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
        return this;
    }

    /**
     * Array of Title objects.
     **/
    public List<Title> getTitles() {
        return titles;
    }
    public AmChart setTitles(List<Title> titles) {
        this.titles = titles;
        return this;
    }

    /**
     * Type of a chart. Required when creating chart using JSON. Possible types are: serial,
     * pie, xy, radar, funnel, gauge, map, stock.
     **/
    public String getType() {
        return type;
    }
    public AmChart setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * If true, prefixes will be used for big and small numbers. You can set arrays of prefixes
     * via prefixesOfSmallNumbers and prefixesOfBigNumbers properties.
     **/
    public Boolean getUsePrefixes() {
        return usePrefixes;
    }
    public AmChart setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
        return this;
    }

    /**
     * Read-only. Indicates current version of a script.
     **/
    public String getVersion() {
        return version;
    }
    public AmChart setVersion(String version) {
        this.version = version;
        return this;
    }


}