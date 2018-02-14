package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

public class AmChart implements Serializable {
    private Boolean accessible;
    private String accessibleDescription;
    private String accessibleTitle;
    private Boolean addClassNames;
    private List<Label> allLabels;
    private Boolean autoDisplay;
    private Boolean autoResize;
    private Boolean autoTransform;
    private Double backgroundAlpha;
    private Color backgroundColor;
    private AmBalloon balloon;
    private Double borderAlpha;
    private Color borderColor;
    private String classNamePrefix;
    private Color color;
    private String creditsPosition;
    private Object dataLoader;
    private List<Object> dataProvider;
    private String decimalSeparator;
    private Object defs;
    private Object export;
    private String fontFamily;
    private Double fontSize;
    private Boolean handDrawn;
    private Double handDrawScatter;
    private Double handDrawThickness;
    private Double hideBalloonTime;
    private String language;
    private AmLegend legend;
    private String legendDiv;
    private List<Object> listeners;
    private Boolean panEventsEnabled;
    private String path;
    private String pathToImages;
    private Double percentPrecision;
    private Double precision;
    private List<Object> prefixesOfBigNumbers;
    private List<Object> prefixesOfSmallNumbers;
    private Double processCount;
    private Double processTimeout;
    private Object responsive;
    private Boolean svgIcons;
    private Boolean tapToActivate;
    private String theme;
    private String thousandsSeparator;
    private List<Title> titles;
    private Double touchClickDuration;
    private String type;
    private Boolean usePrefixes;
    private String version;

    /**
     * When enabled, chart adds aria-label attributes to columns, bullets or map objects.
     * You can control values of these labels using properties like accessibleLabel of AmGraph.
     * Note, not all screen readers support these tags. We tested this mostly with NVDA
     * Screen reader. WAI-ARIA is now official W3 standard, so in future more readers will
     * handle this well. We will be improving accessibility on our charts, so we would be
     * glad to hear your feedback.
     **/
    public AmChart setAccessible(boolean accessible) {
        this.accessible = accessible;
        return this;
    }

    public Boolean getAccessible() {
        return accessible;
    }

    /**
     * Description which will be added to node of SVG element. Most of the screen readers
     * will read this description.
     **/
    public AmChart setAccessibleDescription(String accessibleDescription) {
        this.accessibleDescription = accessibleDescription;
        return this;
    }

    public String getAccessibleDescription() {
        return accessibleDescription;
    }

    /**
     * Description which is added to of a SVG element. Some of the screen readers will read
     * this description.
     **/
    public AmChart setAccessibleTitle(String accessibleTitle) {
        this.accessibleTitle = accessibleTitle;
        return this;
    }

    public String getAccessibleTitle() {
        return accessibleTitle;
    }

    /**
     * Specifies, if class names should be added to chart elements.
     **/
    public AmChart setAddClassNames(boolean addClassNames) {
        this.addClassNames = addClassNames;
        return this;
    }

    public Boolean getAddClassNames() {
        return addClassNames;
    }

    /**
     * Array of Labels. Example of label object, with all possible properties: {"x": 20,
     * "y": 20, "text": "this is label", "align": "left", "size": 12, "color": "#CC0000",
     * "alpha": 1, "rotation": 0, "bold": true, "url": "http://www.amcharts.com"}
     **/
    public AmChart setAllLabels(List<Label> allLabels) {
        this.allLabels = allLabels;
        return this;
    }

    public List<Label> getAllLabels() {
        return allLabels;
    }

    /**
     * If you set it to true the chart will automatically monitor changes of display style
     * of chart’s container (or any of it’s parents) and will render chart correctly if
     * it is changed from none to block. We recommend setting it to true if you change this
     * style at a run time, as it affects performance a bit.
     **/
    public AmChart setAutoDisplay(boolean autoDisplay) {
        this.autoDisplay = autoDisplay;
        return this;
    }

    public Boolean getAutoDisplay() {
        return autoDisplay;
    }

    /**
     * Set this to false if you don't want chart to resize itself whenever its parent container
     * size changes.
     **/
    public AmChart setAutoResize(boolean autoResize) {
        this.autoResize = autoResize;
        return this;
    }

    public Boolean getAutoResize() {
        return autoResize;
    }

    /**
     * If you set it to true and your chart div (or any of the parent div) has css scale
     * applied, the chart will position mouse at a correct position. Default value is false
     * because this operation consumes some CPU and quite a few people are using css transfroms.
     **/
    public AmChart setAutoTransform(boolean autoTransform) {
        this.autoTransform = autoTransform;
        return this;
    }

    public Boolean getAutoTransform() {
        return autoTransform;
    }

    /**
     * Opacity of background. Set it to >0 value if you want backgroundColor to work. However
     * we recommend changing div's background-color style for changing background color.
     **/
    public AmChart setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
        return this;
    }

    public Double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Background color. You should set backgroundAlpha to >0 value in order background
     * to be visible. We recommend setting background color directly on a chart's DIV instead
     * of using this property.
     **/
    public AmChart setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * The chart creates AmBalloon class itself. If you want to customize balloon, get balloon
     * instance using this property, and then change balloon's properties.
     **/
    public AmChart setBalloon(AmBalloon balloon) {
        this.balloon = balloon;
        return this;
    }

    public AmBalloon getBalloon() {
        return balloon;
    }

    /**
     * Opacity of chart's border. Value range is 0 - 1.
     **/
    public AmChart setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
        return this;
    }

    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * Color of chart's border. You should set borderAlpha >0 in order border to be visible.
     * We recommend setting border color directly on a chart's DIV instead of using this
     * property.
     **/
    public AmChart setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * This prefix is added to all class names which are added to all visual elements of
     * a chart in case addClassNames is set to true.
     **/
    public AmChart setClassNamePrefix(String classNamePrefix) {
        this.classNamePrefix = classNamePrefix;
        return this;
    }

    public String getClassNamePrefix() {
        return classNamePrefix;
    }

    /**
     * Text color.
     **/
    public AmChart setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Non-commercial version only. Specifies position of link to amCharts site. Allowed
     * values are: top-left, top-right, bottom-left and bottom-right.
     **/
    public AmChart setCreditsPosition(String creditsPosition) {
        this.creditsPosition = creditsPosition;
        return this;
    }

    public String getCreditsPosition() {
        return creditsPosition;
    }

    /**
     * A config object for Data Loader plugin. Please refer to the following page for more
     * information.
     **/
    public AmChart setDataLoader(Object dataLoader) {
        this.dataLoader = dataLoader;
        return this;
    }

    public Object getDataLoader() {
        return dataLoader;
    }

    /**
     * Array of data objects, for example: [{country:"US", value:524},{country:"UK", value:624},{country:"Lithuania",
     * value:824}]. You can have any number of fields and use any field names. In case of
     * AmMap, data provider should be MapData object. The data set data. Important: if you
     * are using date/time-based category axis, the data points needs to come pre-ordered
     * in ascending order. Data with incorrect order might result in visual and functional
     * glitches on the chart.
     **/
    public AmChart setDataProvider(List<Object> dataProvider) {
        this.dataProvider = dataProvider;
        return this;
    }

    public List<Object> getDataProvider() {
        return dataProvider;
    }

    /**
     * Decimal separator.
     **/
    public AmChart setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
        return this;
    }

    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * Using this property you can add any additional information to SVG, like SVG filters
     * or clip paths. The structure of this object should be identical to XML structure
     * of a object you are adding, only in JSON format.
     **/
    public AmChart setDefs(Object defs) {
        this.defs = defs;
        return this;
    }

    public Object getDefs() {
        return defs;
    }

    /**
     * Export config. Specifies how export to image/data export/print/annotate menu will
     * look and behave. You can find a lot of examples in amcharts/plugins/export folder.
     * More details can be found here.
     **/
    public AmChart setExport(Object export) {
        this.export = export;
        return this;
    }

    public Object getExport() {
        return export;
    }

    /**
     * Font family.
     **/
    public AmChart setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Font size.
     **/
    public AmChart setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * If you set this to true, the lines of the chart will be distorted and will produce
     * hand-drawn effect. Try to adjust chart.handDrawScatter and chart.handDrawThickness
     * properties for a more scattered result.
     **/
    public AmChart setHandDrawn(boolean handDrawn) {
        this.handDrawn = handDrawn;
        return this;
    }

    public Boolean getHandDrawn() {
        return handDrawn;
    }

    /**
     * *Defines by how many pixels hand-drawn line (when handDrawn is set to true) will fluctuate.
     **/
    public AmChart setHandDrawScatter(double handDrawScatter) {
        this.handDrawScatter = handDrawScatter;
        return this;
    }

    public Double getHandDrawScatter() {
        return handDrawScatter;
    }

    /**
     * Defines by how many pixels line thickness will fluctuate (when handDrawn is set to
     * true).
     **/
    public AmChart setHandDrawThickness(double handDrawThickness) {
        this.handDrawThickness = handDrawThickness;
        return this;
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
    public AmChart setHideBalloonTime(double hideBalloonTime) {
        this.hideBalloonTime = hideBalloonTime;
        return this;
    }

    public Double getHideBalloonTime() {
        return hideBalloonTime;
    }

    /**
     * Allows changing language easily. Note, you should include language js file from amcharts/lang
     * or ammap/lang folder and then use variable name used in this file, like chart.language
     * = "de"; Note, for maps this works differently - you use language only for country
     * names, as there are no other strings in the maps application.
     **/
    public AmChart setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    /**
     * Legend of a chart.
     **/
    public AmChart setLegend(AmLegend legend) {
        this.legend = legend;
        return this;
    }

    public AmLegend getLegend() {
        return legend;
    }

    /**
     * Read-only. Reference to the div of the legend.
     **/
    public AmChart setLegendDiv(String legendDiv) {
        this.legendDiv = legendDiv;
        return this;
    }

    public String getLegendDiv() {
        return legendDiv;
    }

    /**
     * You can add listeners of events using this property. Example: listeners = [{"event":"dataUpdated",
     * "method":handleEvent}];
     **/
    public AmChart setListeners(List<Object> listeners) {
        this.listeners = listeners;
        return this;
    }

    public List<Object> getListeners() {
        return listeners;
    }

    /**
     * This setting affects touch-screen devices only. If a chart is on a page, and panEventsEnabled
     * are set to true, the page won't move if the user touches the chart first. If a chart
     * is big enough and occupies all the screen of your touch device, the user won’t be
     * able to move the page at all. If you think that selecting/panning the chart or moving/pinching
     * the map is a primary purpose of your users, you should set panEventsEnabled to true,
     * otherwise - false.
     **/
    public AmChart setPanEventsEnabled(boolean panEventsEnabled) {
        this.panEventsEnabled = panEventsEnabled;
        return this;
    }

    public Boolean getPanEventsEnabled() {
        return panEventsEnabled;
    }

    /**
     * Specifies absolute or relative path to amCharts files, i.e. "amcharts/". (where all
     * .js files are located) If relative URLs are used, they will be relative to the current
     * web page, displaying the chart. You can also set path globally, using global JavaScript
     * variable AmCharts_path. If this variable is set, and "path" is not set in chart config,
     * the chart will assume the path from the global variable. This allows setting amCharts
     * path globally. I.e.: var AmCharts_path = "/libs/amcharts/"; "path" parameter will
     * be used by the charts to locate it's files, like images, plugins or patterns.
     **/
    public AmChart setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }

    /**
     * Specifies path to the folder where images like resize grips, lens and similar are.
     * IMPORTANT: Since V3.14.12, you should use "path" to point to amCharts directory instead.
     * The "pathToImages" will be automatically set and does not need to be in the chart
     * config, unless you keep your images separately from other amCharts files.
     **/
    public AmChart setPathToImages(String pathToImages) {
        this.pathToImages = pathToImages;
        return this;
    }

    public String getPathToImages() {
        return pathToImages;
    }

    /**
     * Precision of percent values. -1 means percent values won't be rounded at all and
     * show as they are.
     **/
    public AmChart setPercentPrecision(double percentPrecision) {
        this.percentPrecision = percentPrecision;
        return this;
    }

    public Double getPercentPrecision() {
        return percentPrecision;
    }

    /**
     * *Precision of values. -1 means values won't be rounded at all and show as they are.
     **/
    public AmChart setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    public Double getPrecision() {
        return precision;
    }

    /**
     * Prefixes which are used to make big numbers shorter: 2M instead of 2000000, etc.
     * Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes
     * property to true.
     **/
    public AmChart setPrefixesOfBigNumbers(List<Object> prefixesOfBigNumbers) {
        this.prefixesOfBigNumbers = prefixesOfBigNumbers;
        return this;
    }

    public List<Object> getPrefixesOfBigNumbers() {
        return prefixesOfBigNumbers;
    }

    /**
     * Prefixes which are used to make small numbers shorter: 2μ instead of 0.000002, etc.
     * Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes
     * property to true.
     **/
    public AmChart setPrefixesOfSmallNumbers(List<Object> prefixesOfSmallNumbers) {
        this.prefixesOfSmallNumbers = prefixesOfSmallNumbers;
        return this;
    }

    public List<Object> getPrefixesOfSmallNumbers() {
        return prefixesOfSmallNumbers;
    }

    /**
     * If processTimeout is > 0, 1000 data items will be parsed at a time, then the chart
     * will make pause and continue parsing data until it finishes.
     **/
    public AmChart setProcessCount(double processCount) {
        this.processCount = processCount;
        return this;
    }

    public Double getProcessCount() {
        return processCount;
    }

    /**
     * If you set it to 1 millisecond or some bigger value, chart will be built in chunks
     * instead of all at once. This is useful if you work with a lot of data and the initial
     * build of the chart takes a lot of time, which freezes the whole web application by
     * not allowing other processes to do their job while the chart is busy.
     **/
    public AmChart setProcessTimeout(double processTimeout) {
        this.processTimeout = processTimeout;
        return this;
    }

    public Double getProcessTimeout() {
        return processTimeout;
    }

    /**
     * A config object for Responsive plugin. Please refer to the following page for more
     * information.
     **/
    public AmChart setResponsive(Object responsive) {
        this.responsive = responsive;
        return this;
    }

    public Object getResponsive() {
        return responsive;
    }

    /**
     * Charts will use SVG icons (some are loaded from images folder and some are drawn
     * inline) if browser supports SVG. his makes icons look good on retina displays on
     * all resolutions.
     **/
    public AmChart setSvgIcons(boolean svgIcons) {
        this.svgIcons = svgIcons;
        return this;
    }

    public Boolean getSvgIcons() {
        return svgIcons;
    }

    /**
     * Charts which require gestures like swipe (charts with scrollbar/cursor) or pinch
     * (maps) used to prevent regular page scrolling and could result page to stick to the
     * same spot if the chart occupied whole screen. Now, in order these gestures to start
     * working user has to touch the chart/maps once. Regular touch events like touching
     * on the bar/slice/map area do not require the first tap and will show balloons and
     * perform other tasks as usual. If you have a map or chart which occupies full screen
     * and your page does not require scrolling, set tapToActivate to false – this will
     * bring old behavior back.
     **/
    public AmChart setTapToActivate(boolean tapToActivate) {
        this.tapToActivate = tapToActivate;
        return this;
    }

    public Boolean getTapToActivate() {
        return tapToActivate;
    }

    /**
     * Theme of a chart. Config files of themes can be found in amcharts/themes/ folder.
     * More info about using themes.
     **/
    public AmChart setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    public String getTheme() {
        return theme;
    }

    /**
     * Thousands separator.
     **/
    public AmChart setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
        return this;
    }

    public String getThousandsSeparator() {
        return thousandsSeparator;
    }

    /**
     * Array of Title objects.
     **/
    public AmChart setTitles(List<Title> titles) {
        this.titles = titles;
        return this;
    }

    public List<Title> getTitles() {
        return titles;
    }

    /**
     * If you set it to 200 (milliseconds) or so, the chart will fire clickGraphItem or
     * clickSlice (AmSlicedChart) or clickMapObject only if user holds his/her finger for
     * 0.2 seconds (200 ms) on the column/bullet/slice/map object.
     **/
    public AmChart setTouchClickDuration(double touchClickDuration) {
        this.touchClickDuration = touchClickDuration;
        return this;
    }

    public Double getTouchClickDuration() {
        return touchClickDuration;
    }

    /**
     * Type of a chart. Required when creating chart using JSON. Possible types are: serial,
     * pie, xy, radar, funnel, gauge, map, gantt, stock.
     **/
    public AmChart setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    /**
     * If true, prefixes will be used for big and small numbers. You can set arrays of prefixes
     * via prefixesOfSmallNumbers and prefixesOfBigNumbers properties.
     **/
    public AmChart setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
        return this;
    }

    public Boolean getUsePrefixes() {
        return usePrefixes;
    }

    /**
     * Read-only. Indicates current version of a script.
     **/
    public AmChart setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }

}