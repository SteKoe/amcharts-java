package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

/**
 * Base class of AmCharts. It can not be instantiated explicitly. Its makeChart method
 * gives you the possibility to create charts easily with a single object.
 */

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
     * @param accessible When enabled, chart adds aria-label attributes to columns, bullets or map objects.
     *                   You can control values of these labels using properties like accessibleLabel of AmGraph.
     *                   Note, not all screen readers support these tags. We tested this mostly with NVDA
     *                   Screen reader. WAI-ARIA is now official W3 standard, so in future more readers will
     *                   handle this well. We will be improving accessibility on our charts, so we would be
     *                   glad to hear your feedback.
     * @return AmChart
     */
    public AmChart setAccessible(boolean accessible) {
        this.accessible = accessible;
        return this;
    }

    public Boolean getAccessible() {
        return accessible;
    }

    /**
     * @param accessibleDescription Description which will be added to node of SVG element. Most of the screen readers
     *                              will read this description.
     * @return AmChart
     */
    public AmChart setAccessibleDescription(String accessibleDescription) {
        this.accessibleDescription = accessibleDescription;
        return this;
    }

    public String getAccessibleDescription() {
        return accessibleDescription;
    }

    /**
     * @param accessibleTitle Description which is added to of a SVG element. Some of the screen readers will read
     *                        this description.
     * @return AmChart
     */
    public AmChart setAccessibleTitle(String accessibleTitle) {
        this.accessibleTitle = accessibleTitle;
        return this;
    }

    public String getAccessibleTitle() {
        return accessibleTitle;
    }

    /**
     * @param addClassNames Specifies, if class names should be added to chart elements.
     * @return AmChart
     */
    public AmChart setAddClassNames(boolean addClassNames) {
        this.addClassNames = addClassNames;
        return this;
    }

    public Boolean getAddClassNames() {
        return addClassNames;
    }

    /**
     * @param allLabels Array of Labels. Example of label object, with all possible properties: {"x": 20,
     *                  "y": 20, "text": "this is label", "align": "left", "size": 12, "color": "#CC0000",
     *                  "alpha": 1, "rotation": 0, "bold": true, "url": "http://www.amcharts.com"}
     * @return AmChart
     */
    public AmChart setAllLabels(List<Label> allLabels) {
        this.allLabels = allLabels;
        return this;
    }

    public List<Label> getAllLabels() {
        return allLabels;
    }

    /**
     * @param autoDisplay If you set it to true the chart will automatically monitor changes of display style
     *                    of chart’s container (or any of it’s parents) and will render chart correctly if
     *                    it is changed from none to block. We recommend setting it to true if you change this
     *                    style at a run time, as it affects performance a bit.
     * @return AmChart
     */
    public AmChart setAutoDisplay(boolean autoDisplay) {
        this.autoDisplay = autoDisplay;
        return this;
    }

    public Boolean getAutoDisplay() {
        return autoDisplay;
    }

    /**
     * @param autoResize Set this to false if you don't want chart to resize itself whenever its parent container
     *                   size changes.
     * @return AmChart
     */
    public AmChart setAutoResize(boolean autoResize) {
        this.autoResize = autoResize;
        return this;
    }

    public Boolean getAutoResize() {
        return autoResize;
    }

    /**
     * @param autoTransform If you set it to true and your chart div (or any of the parent div) has css scale
     *                      applied, the chart will position mouse at a correct position. Default value is false
     *                      because this operation consumes some CPU and quite a few people are using css transfroms.
     * @return AmChart
     */
    public AmChart setAutoTransform(boolean autoTransform) {
        this.autoTransform = autoTransform;
        return this;
    }

    public Boolean getAutoTransform() {
        return autoTransform;
    }

    /**
     * @param backgroundAlpha Opacity of background. Set it to >0 value if you want backgroundColor to work. However
     *                        we recommend changing div's background-color style for changing background color.
     * @return AmChart
     */
    public AmChart setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
        return this;
    }

    public Double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * @param backgroundColor Background color. You should set backgroundAlpha to >0 value in order background
     *                        to be visible. We recommend setting background color directly on a chart's DIV instead
     *                        of using this property.
     * @return AmChart
     */
    public AmChart setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param balloon The chart creates AmBalloon class itself. If you want to customize balloon, get balloon
     *                instance using this property, and then change balloon's properties.
     * @return AmChart
     */
    public AmChart setBalloon(AmBalloon balloon) {
        this.balloon = balloon;
        return this;
    }

    public AmBalloon getBalloon() {
        return balloon;
    }

    /**
     * @param borderAlpha Opacity of chart's border. Value range is 0 - 1.
     * @return AmChart
     */
    public AmChart setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
        return this;
    }

    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * @param borderColor Color of chart's border. You should set borderAlpha >0 in order border to be visible.
     *                    We recommend setting border color directly on a chart's DIV instead of using this
     *                    property.
     * @return AmChart
     */
    public AmChart setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * @param classNamePrefix This prefix is added to all class names which are added to all visual elements of
     *                        a chart in case addClassNames is set to true.
     * @return AmChart
     */
    public AmChart setClassNamePrefix(String classNamePrefix) {
        this.classNamePrefix = classNamePrefix;
        return this;
    }

    public String getClassNamePrefix() {
        return classNamePrefix;
    }

    /**
     * @param color Text color.
     * @return AmChart
     */
    public AmChart setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param creditsPosition Non-commercial version only. Specifies position of link to amCharts site. Allowed
     *                        values are: top-left, top-right, bottom-left and bottom-right.
     * @return AmChart
     */
    public AmChart setCreditsPosition(String creditsPosition) {
        this.creditsPosition = creditsPosition;
        return this;
    }

    public String getCreditsPosition() {
        return creditsPosition;
    }

    /**
     * @param dataLoader A config object for Data Loader plugin. Please refer to the following page for more
     *                   information.
     * @return AmChart
     */
    public AmChart setDataLoader(Object dataLoader) {
        this.dataLoader = dataLoader;
        return this;
    }

    public Object getDataLoader() {
        return dataLoader;
    }

    /**
     * @param dataProvider Array of data objects, for example: [{country:"US", value:524},{country:"UK", value:624},{country:"Lithuania",
     *                     value:824}]. You can have any number of fields and use any field names. In case of
     *                     AmMap, data provider should be MapData object. The data set data. Important: if you
     *                     are using date/time-based category axis, the data points needs to come pre-ordered
     *                     in ascending order. Data with incorrect order might result in visual and functional
     *                     glitches on the chart.
     * @return AmChart
     */
    public AmChart setDataProvider(List<Object> dataProvider) {
        this.dataProvider = dataProvider;
        return this;
    }

    public List<Object> getDataProvider() {
        return dataProvider;
    }

    /**
     * @param decimalSeparator Decimal separator.
     * @return AmChart
     */
    public AmChart setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
        return this;
    }

    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * @param defs Using this property you can add any additional information to SVG, like SVG filters
     *             or clip paths. The structure of this object should be identical to XML structure
     *             of a object you are adding, only in JSON format.
     * @return AmChart
     */
    public AmChart setDefs(Object defs) {
        this.defs = defs;
        return this;
    }

    public Object getDefs() {
        return defs;
    }

    /**
     * @param export Export config. Specifies how export to image/data export/print/annotate menu will
     *               look and behave. You can find a lot of examples in amcharts/plugins/export folder.
     *               More details can be found here.
     * @return AmChart
     */
    public AmChart setExport(Object export) {
        this.export = export;
        return this;
    }

    public Object getExport() {
        return export;
    }

    /**
     * @param fontFamily Font family.
     * @return AmChart
     */
    public AmChart setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * @param fontSize Font size.
     * @return AmChart
     */
    public AmChart setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * @param handDrawn If you set this to true, the lines of the chart will be distorted and will produce
     *                  hand-drawn effect. Try to adjust chart.handDrawScatter and chart.handDrawThickness
     *                  properties for a more scattered result.
     * @return AmChart
     */
    public AmChart setHandDrawn(boolean handDrawn) {
        this.handDrawn = handDrawn;
        return this;
    }

    public Boolean getHandDrawn() {
        return handDrawn;
    }

    /**
     * @param handDrawScatter *Defines by how many pixels hand-drawn line (when handDrawn is set to true) will fluctuate.
     * @return AmChart
     */
    public AmChart setHandDrawScatter(double handDrawScatter) {
        this.handDrawScatter = handDrawScatter;
        return this;
    }

    public Double getHandDrawScatter() {
        return handDrawScatter;
    }

    /**
     * @param handDrawThickness Defines by how many pixels line thickness will fluctuate (when handDrawn is set to
     *                          true).
     * @return AmChart
     */
    public AmChart setHandDrawThickness(double handDrawThickness) {
        this.handDrawThickness = handDrawThickness;
        return this;
    }

    public Double getHandDrawThickness() {
        return handDrawThickness;
    }

    /**
     * @param hideBalloonTime Time, in milliseconds after which balloon is hidden if the user rolls-out of the
     *                        object. Might be useful for AmMap to avoid balloon flickering while moving mouse
     *                        over the areas. Note, this is not duration of fade-out. Duration of fade-out is set
     *                        in AmBalloon class.
     * @return AmChart
     */
    public AmChart setHideBalloonTime(double hideBalloonTime) {
        this.hideBalloonTime = hideBalloonTime;
        return this;
    }

    public Double getHideBalloonTime() {
        return hideBalloonTime;
    }

    /**
     * @param language Allows changing language easily. Note, you should include language js file from amcharts/lang
     *                 or ammap/lang folder and then use variable name used in this file, like chart.language
     *                 = "de"; Note, for maps this works differently - you use language only for country
     *                 names, as there are no other strings in the maps application.
     * @return AmChart
     */
    public AmChart setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    /**
     * @param legend Legend of a chart.
     * @return AmChart
     */
    public AmChart setLegend(AmLegend legend) {
        this.legend = legend;
        return this;
    }

    public AmLegend getLegend() {
        return legend;
    }

    /**
     * @param legendDiv Read-only. Reference to the div of the legend.
     * @return AmChart
     */
    public AmChart setLegendDiv(String legendDiv) {
        this.legendDiv = legendDiv;
        return this;
    }

    public String getLegendDiv() {
        return legendDiv;
    }

    /**
     * @param listeners You can add listeners of events using this property. Example: listeners = [{"event":"dataUpdated",
     *                  "method":handleEvent}];
     * @return AmChart
     */
    public AmChart setListeners(List<Object> listeners) {
        this.listeners = listeners;
        return this;
    }

    public List<Object> getListeners() {
        return listeners;
    }

    /**
     * @param panEventsEnabled This setting affects touch-screen devices only. If a chart is on a page, and panEventsEnabled
     *                         are set to true, the page won't move if the user touches the chart first. If a chart
     *                         is big enough and occupies all the screen of your touch device, the user won’t be
     *                         able to move the page at all. If you think that selecting/panning the chart or moving/pinching
     *                         the map is a primary purpose of your users, you should set panEventsEnabled to true,
     *                         otherwise - false.
     * @return AmChart
     */
    public AmChart setPanEventsEnabled(boolean panEventsEnabled) {
        this.panEventsEnabled = panEventsEnabled;
        return this;
    }

    public Boolean getPanEventsEnabled() {
        return panEventsEnabled;
    }

    /**
     * @param path Specifies absolute or relative path to amCharts files, i.e. "amcharts/". (where all
     *             .js files are located) If relative URLs are used, they will be relative to the current
     *             web page, displaying the chart. You can also set path globally, using global JavaScript
     *             variable AmCharts_path. If this variable is set, and "path" is not set in chart config,
     *             the chart will assume the path from the global variable. This allows setting amCharts
     *             path globally. I.e.: var AmCharts_path = "/libs/amcharts/"; "path" parameter will
     *             be used by the charts to locate it's files, like images, plugins or patterns.
     * @return AmChart
     */
    public AmChart setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }

    /**
     * @param pathToImages Specifies path to the folder where images like resize grips, lens and similar are.
     *                     IMPORTANT: Since V3.14.12, you should use "path" to point to amCharts directory instead.
     *                     The "pathToImages" will be automatically set and does not need to be in the chart
     *                     config, unless you keep your images separately from other amCharts files.
     * @return AmChart
     */
    public AmChart setPathToImages(String pathToImages) {
        this.pathToImages = pathToImages;
        return this;
    }

    public String getPathToImages() {
        return pathToImages;
    }

    /**
     * @param percentPrecision Precision of percent values. -1 means percent values won't be rounded at all and
     *                         show as they are.
     * @return AmChart
     */
    public AmChart setPercentPrecision(double percentPrecision) {
        this.percentPrecision = percentPrecision;
        return this;
    }

    public Double getPercentPrecision() {
        return percentPrecision;
    }

    /**
     * @param precision *Precision of values. -1 means values won't be rounded at all and show as they are.
     * @return AmChart
     */
    public AmChart setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    public Double getPrecision() {
        return precision;
    }

    /**
     * @param prefixesOfBigNumbers Prefixes which are used to make big numbers shorter: 2M instead of 2000000, etc.
     *                             Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes
     *                             property to true.
     * @return AmChart
     */
    public AmChart setPrefixesOfBigNumbers(List<Object> prefixesOfBigNumbers) {
        this.prefixesOfBigNumbers = prefixesOfBigNumbers;
        return this;
    }

    public List<Object> getPrefixesOfBigNumbers() {
        return prefixesOfBigNumbers;
    }

    /**
     * @param prefixesOfSmallNumbers Prefixes which are used to make small numbers shorter: 2μ instead of 0.000002, etc.
     *                               Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes
     *                               property to true.
     * @return AmChart
     */
    public AmChart setPrefixesOfSmallNumbers(List<Object> prefixesOfSmallNumbers) {
        this.prefixesOfSmallNumbers = prefixesOfSmallNumbers;
        return this;
    }

    public List<Object> getPrefixesOfSmallNumbers() {
        return prefixesOfSmallNumbers;
    }

    /**
     * @param processCount If processTimeout is > 0, 1000 data items will be parsed at a time, then the chart
     *                     will make pause and continue parsing data until it finishes.
     * @return AmChart
     */
    public AmChart setProcessCount(double processCount) {
        this.processCount = processCount;
        return this;
    }

    public Double getProcessCount() {
        return processCount;
    }

    /**
     * @param processTimeout If you set it to 1 millisecond or some bigger value, chart will be built in chunks
     *                       instead of all at once. This is useful if you work with a lot of data and the initial
     *                       build of the chart takes a lot of time, which freezes the whole web application by
     *                       not allowing other processes to do their job while the chart is busy.
     * @return AmChart
     */
    public AmChart setProcessTimeout(double processTimeout) {
        this.processTimeout = processTimeout;
        return this;
    }

    public Double getProcessTimeout() {
        return processTimeout;
    }

    /**
     * @param responsive A config object for Responsive plugin. Please refer to the following page for more
     *                   information.
     * @return AmChart
     */
    public AmChart setResponsive(Object responsive) {
        this.responsive = responsive;
        return this;
    }

    public Object getResponsive() {
        return responsive;
    }

    /**
     * @param svgIcons Charts will use SVG icons (some are loaded from images folder and some are drawn
     *                 inline) if browser supports SVG. his makes icons look good on retina displays on
     *                 all resolutions.
     * @return AmChart
     */
    public AmChart setSvgIcons(boolean svgIcons) {
        this.svgIcons = svgIcons;
        return this;
    }

    public Boolean getSvgIcons() {
        return svgIcons;
    }

    /**
     * @param tapToActivate Charts which require gestures like swipe (charts with scrollbar/cursor) or pinch
     *                      (maps) used to prevent regular page scrolling and could result page to stick to the
     *                      same spot if the chart occupied whole screen. Now, in order these gestures to start
     *                      working user has to touch the chart/maps once. Regular touch events like touching
     *                      on the bar/slice/map area do not require the first tap and will show balloons and
     *                      perform other tasks as usual. If you have a map or chart which occupies full screen
     *                      and your page does not require scrolling, set tapToActivate to false – this will
     *                      bring old behavior back.
     * @return AmChart
     */
    public AmChart setTapToActivate(boolean tapToActivate) {
        this.tapToActivate = tapToActivate;
        return this;
    }

    public Boolean getTapToActivate() {
        return tapToActivate;
    }

    /**
     * @param theme Theme of a chart. Config files of themes can be found in amcharts/themes/ folder.
     *              More info about using themes.
     * @return AmChart
     */
    public AmChart setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    public String getTheme() {
        return theme;
    }

    /**
     * @param thousandsSeparator Thousands separator.
     * @return AmChart
     */
    public AmChart setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
        return this;
    }

    public String getThousandsSeparator() {
        return thousandsSeparator;
    }

    /**
     * @param titles Array of Title objects.
     * @return AmChart
     */
    public AmChart setTitles(List<Title> titles) {
        this.titles = titles;
        return this;
    }

    public List<Title> getTitles() {
        return titles;
    }

    /**
     * @param touchClickDuration If you set it to 200 (milliseconds) or so, the chart will fire clickGraphItem or
     *                           clickSlice (AmSlicedChart) or clickMapObject only if user holds his/her finger for
     *                           0.2 seconds (200 ms) on the column/bullet/slice/map object.
     * @return AmChart
     */
    public AmChart setTouchClickDuration(double touchClickDuration) {
        this.touchClickDuration = touchClickDuration;
        return this;
    }

    public Double getTouchClickDuration() {
        return touchClickDuration;
    }

    /**
     * @param type Type of a chart. Required when creating chart using JSON. Possible types are: serial,
     *             pie, xy, radar, funnel, gauge, map, gantt, stock.
     * @return AmChart
     */
    public AmChart setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    /**
     * @param usePrefixes If true, prefixes will be used for big and small numbers. You can set arrays of prefixes
     *                    via prefixesOfSmallNumbers and prefixesOfBigNumbers properties.
     * @return AmChart
     */
    public AmChart setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
        return this;
    }

    public Boolean getUsePrefixes() {
        return usePrefixes;
    }

    /**
     * @param version Read-only. Indicates current version of a script.
     * @return AmChart
     */
    public AmChart setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }

}