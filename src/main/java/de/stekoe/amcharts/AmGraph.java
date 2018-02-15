package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

/**
 * Creates the visualization of the data in following types: line, column, step line,
 * smoothed line, olhc and candlestick.
 */

public class AmGraph implements Serializable {
    private String accessibleLabel;
    private String alphaField;
    private Boolean animationPlayed;
    private AmBalloon balloon;
    private Color balloonColor;
    private String balloonText;
    private Boolean behindColumns;
    private String bullet;
    private Double bulletAlpha;
    private ValueAxis bulletAxis;
    private Double bulletBorderAlpha;
    private Color bulletBorderColor;
    private Double bulletBorderThickness;
    private Color bulletColor;
    private String bulletField;
    private Double bulletHitAreaSize;
    private Double bulletOffset;
    private Double bulletSize;
    private String bulletSizeField;
    private String classNameField;
    private String closeField;
    private Boolean clustered;
    private Color color;
    private String colorField;
    private String columnIndexField;
    private Double columnWidth;
    private Boolean connect;
    private Double cornerRadiusTop;
    private Double cursorBulletAlpha;
    private String customBullet;
    private String customBulletField;
    private String customMarker;
    private Double dashLength;
    private String dashLengthField;
    private String dateFormat;
    private String descriptionField;
    private String errorField;
    private Double fillAlphas;
    private Color fillColors;
    private String fillColorsField;
    private ValueAxis fillToAxis;
    private AmGraph fillToGraph;
    private Double fixedColumnWidth;
    private Double fontSize;
    private Boolean forceGap;
    private String gapField;
    private Double gapPeriod;
    private String gradientOrientation;
    private Boolean hidden;
    private Double hideBulletsCount;
    private String highField;
    private String id;
    private Boolean includeInMinMax;
    private String labelAnchor;
    private String labelColorField;
    private Double labelOffset;
    private String labelPosition;
    private Double labelRotation;
    private String labelText;
    private Double legendAlpha;
    private Color legendColor;
    private Object legendColorFunction;
    private String legendPeriodValueText;
    private String legendValueText;
    private Double lineAlpha;
    private Color lineColor;
    private String lineColorField;
    private Double lineThickness;
    private String lowField;
    private String markerType;
    private Double maxBulletSize;
    private Double minBulletSize;
    private Double minDistance;
    private Double negativeBase;
    private Double negativeFillAlphas;
    private Color negativeFillColors;
    private Double negativeLineAlpha;
    private Color negativeLineColor;
    private Boolean newStack;
    private Boolean noStepRisers;
    private String openField;
    private Object pattern;
    private String patternField;
    private Double periodSpan;
    private String pointPosition;
    private Double precision;
    private Boolean proCandlesticks;
    private Object segmentData;
    private Boolean showAllValueLabels;
    private Boolean showBalloon;
    private String showBalloonAt;
    private String showBulletsAt;
    private Boolean showHandOnHover;
    private Boolean showOnAxis;
    private Boolean stackable;
    private String stepDirection;
    private Boolean switchable;
    private Double tabIndex;
    private String title;
    private Double topRadius;
    private String type;
    private String urlField;
    private String urlTarget;
    private Boolean useLineColorForBulletBorder;
    private Boolean useNegativeColorIfDown;
    private ValueAxis valueAxis;
    private String valueField;
    private Boolean visibleInLegend;
    private ValueAxis xAxis;
    private String xField;
    private ValueAxis yAxis;
    private String yField;

    /**
     * @param accessibleLabel Text which screen readers will read if user rolls-over the bullet/column or sets
     *                        focus using tab key (this is possible only if tabIndex property of AmGraph is set
     *                        to some number). Text is added as aria-label tag. Note - not all screen readers and
     *                        browsers support this.
     * @return AmGraph
     */
    public AmGraph setAccessibleLabel(String accessibleLabel) {
        this.accessibleLabel = accessibleLabel;
        return this;
    }

    public String getAccessibleLabel() {
        return accessibleLabel;
    }

    /**
     * @param alphaField Name of the alpha field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setAlphaField(String alphaField) {
        this.alphaField = alphaField;
        return this;
    }

    public String getAlphaField() {
        return alphaField;
    }

    /**
     * @param animationPlayed If you set this to true before chart is drawn, the animation of this graph won't
     *                        be played.
     * @return AmGraph
     */
    public AmGraph setAnimationPlayed(boolean animationPlayed) {
        this.animationPlayed = animationPlayed;
        return this;
    }

    public Boolean getAnimationPlayed() {
        return animationPlayed;
    }

    /**
     * @param balloon Allows customizing graphs balloons individually (only when ChartCursor is used).
     *                Note: the balloon object is not created automatically, you should create it before
     *                setting properties
     * @return AmGraph
     */
    public AmGraph setBalloon(AmBalloon balloon) {
        this.balloon = balloon;
        return this;
    }

    public AmBalloon getBalloon() {
        return balloon;
    }

    /**
     * @param balloonColor Value balloon color. Will use graph or data item color if not set.
     * @return AmGraph
     */
    public AmGraph setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
        return this;
    }

    public Color getBalloonColor() {
        return balloonColor;
    }

    /**
     * @param balloonText Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]],
     *                    [[category]] or any other field name from your data provider. HTML tags can also
     *                    be used.
     * @return AmGraph
     */
    public AmGraph setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * @param behindColumns Specifies if the line graph should be placed behind column graphs
     * @return AmGraph
     */
    public AmGraph setBehindColumns(boolean behindColumns) {
        this.behindColumns = behindColumns;
        return this;
    }

    public Boolean getBehindColumns() {
        return behindColumns;
    }

    /**
     * @param bullet Type of the bullets. Possible values are: "none", "round", "square", "triangleUp",
     *               "triangleDown", "triangleLeft", "triangleRight", "bubble", "diamond", "xError", "yError"
     *               and "custom".
     * @return AmGraph
     */
    public AmGraph setBullet(String bullet) {
        this.bullet = bullet;
        return this;
    }

    public String getBullet() {
        return bullet;
    }

    /**
     * @param bulletAlpha Opacity of bullets. Value range is 0 - 1.
     * @return AmGraph
     */
    public AmGraph setBulletAlpha(double bulletAlpha) {
        this.bulletAlpha = bulletAlpha;
        return this;
    }

    public Double getBulletAlpha() {
        return bulletAlpha;
    }

    /**
     * @param bulletAxis bulletAxis value is used when you are building error chart. Error chart is a regular
     *                   serial or XY chart with bullet type set to "xError" or "yError". The graph should
     *                   know which axis should be used to determine the size of this bullet - that's when
     *                   bulletAxis should be set. Besides that, you should also set graph.errorField. You
     *                   can also use other bullet types with this feature too. For example, if you set bulletAxis
     *                   for XY chart, the size of a bullet will change as you zoom the chart.
     * @return AmGraph
     */
    public AmGraph setBulletAxis(ValueAxis bulletAxis) {
        this.bulletAxis = bulletAxis;
        return this;
    }

    public ValueAxis getBulletAxis() {
        return bulletAxis;
    }

    /**
     * @param bulletBorderAlpha Bullet border opacity.
     * @return AmGraph
     */
    public AmGraph setBulletBorderAlpha(double bulletBorderAlpha) {
        this.bulletBorderAlpha = bulletBorderAlpha;
        return this;
    }

    public Double getBulletBorderAlpha() {
        return bulletBorderAlpha;
    }

    /**
     * @param bulletBorderColor Bullet border color. Will use lineColor if not set.
     * @return AmGraph
     */
    public AmGraph setBulletBorderColor(Color bulletBorderColor) {
        this.bulletBorderColor = bulletBorderColor;
        return this;
    }

    public Color getBulletBorderColor() {
        return bulletBorderColor;
    }

    /**
     * @param bulletBorderThickness Bullet border thickness.
     * @return AmGraph
     */
    public AmGraph setBulletBorderThickness(double bulletBorderThickness) {
        this.bulletBorderThickness = bulletBorderThickness;
        return this;
    }

    public Double getBulletBorderThickness() {
        return bulletBorderThickness;
    }

    /**
     * @param bulletColor Bullet color. Will use lineColor if not set.
     * @return AmGraph
     */
    public AmGraph setBulletColor(Color bulletColor) {
        this.bulletColor = bulletColor;
        return this;
    }

    public Color getBulletColor() {
        return bulletColor;
    }

    /**
     * @param bulletField Name of the bullet field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setBulletField(String bulletField) {
        this.bulletField = bulletField;
        return this;
    }

    public String getBulletField() {
        return bulletField;
    }

    /**
     * @param bulletHitAreaSize Useful for touch devices - if you set it to 20 or so, the bullets of a graph will
     *                          have invisible circle around the actual bullet (bullets should still be enabled),
     *                          which will be easier to touch (bullets usually are smaller and hard to hit).
     * @return AmGraph
     */
    public AmGraph setBulletHitAreaSize(double bulletHitAreaSize) {
        this.bulletHitAreaSize = bulletHitAreaSize;
        return this;
    }

    public Double getBulletHitAreaSize() {
        return bulletHitAreaSize;
    }

    /**
     * @param bulletOffset Bullet offset. Distance from the actual data point to the bullet. Can be used to
     *                     place custom bullets above the columns.
     * @return AmGraph
     */
    public AmGraph setBulletOffset(double bulletOffset) {
        this.bulletOffset = bulletOffset;
        return this;
    }

    public Double getBulletOffset() {
        return bulletOffset;
    }

    /**
     * @param bulletSize Bullet size.
     * @return AmGraph
     */
    public AmGraph setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
        return this;
    }

    public Double getBulletSize() {
        return bulletSize;
    }

    /**
     * @param bulletSizeField Name of the bullet size field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setBulletSizeField(String bulletSizeField) {
        this.bulletSizeField = bulletSizeField;
        return this;
    }

    public String getBulletSizeField() {
        return bulletSizeField;
    }

    /**
     * @param classNameField If this field is set and addClassNames is enabled, the chart will look for a class
     *                       name string in data using this setting and apply additional class names to elements
     *                       of the particular data points, such as bullets.
     * @return AmGraph
     */
    public AmGraph setClassNameField(String classNameField) {
        this.classNameField = classNameField;
        return this;
    }

    public String getClassNameField() {
        return classNameField;
    }

    /**
     * @param closeField Name of the close field (used by candlesticks and ohlc) in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setCloseField(String closeField) {
        this.closeField = closeField;
        return this;
    }

    public String getCloseField() {
        return closeField;
    }

    /**
     * @param clustered In case you want to place this graph's columns in front of other columns, set this
     *                  to false. In case "true", the columns will be clustered next to each other. NOTE:
     *                  clustering works only for graphs of type "column".
     * @return AmGraph
     */
    public AmGraph setClustered(boolean clustered) {
        this.clustered = clustered;
        return this;
    }

    public Boolean getClustered() {
        return clustered;
    }

    /**
     * @param color Color of value labels. Will use chart's color if not set.
     * @return AmGraph
     */
    public AmGraph setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param colorField Name of the color field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setColorField(String colorField) {
        this.colorField = colorField;
        return this;
    }

    public String getColorField() {
        return colorField;
    }

    /**
     * @param columnIndexField You can use this property with non-stacked column graphs and specify order of columns
     *                         of each category (starting from 0). Important: this feature does not work in stacked
     *                         columns scenarios as well as with graph toggling enabled in legend.
     * @return AmGraph
     */
    public AmGraph setColumnIndexField(String columnIndexField) {
        this.columnIndexField = columnIndexField;
        return this;
    }

    public String getColumnIndexField() {
        return columnIndexField;
    }

    /**
     * @param columnWidth You can specify custom column width for each graph individually. Value range is 0
     *                    - 1 (we set relative width, not pixel width here).
     * @return AmGraph
     */
    public AmGraph setColumnWidth(double columnWidth) {
        this.columnWidth = columnWidth;
        return this;
    }

    public Double getColumnWidth() {
        return columnWidth;
    }

    /**
     * @param connect Specifies whether to connect data points if data is missing. The default value is
     *                true. This feature does not work with XY chart.
     * @return AmGraph
     */
    public AmGraph setConnect(boolean connect) {
        this.connect = connect;
        return this;
    }

    public Boolean getConnect() {
        return connect;
    }

    /**
     * @param cornerRadiusTop Corner radius of column. It can be set both in pixels or in percents. The chart's
     *                        depth and angle styles must be set to 0. The default value is 0. Note, cornerRadiusTop
     *                        will be applied for all corners of the column, JavaScript charts do not have a possibility
     *                        to set separate corner radius for top and bottom. As we want all the property names
     *                        to be the same both on JS and Flex, we didn't change this too.
     * @return AmGraph
     */
    public AmGraph setCornerRadiusTop(double cornerRadiusTop) {
        this.cornerRadiusTop = cornerRadiusTop;
        return this;
    }

    public Double getCornerRadiusTop() {
        return cornerRadiusTop;
    }

    /**
     * @param cursorBulletAlpha If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor.
     *                          You can set opacity of each graphs bullet. In case you want to disable these bullets
     *                          for a certain graph, set opacity to 0.
     * @return AmGraph
     */
    public AmGraph setCursorBulletAlpha(double cursorBulletAlpha) {
        this.cursorBulletAlpha = cursorBulletAlpha;
        return this;
    }

    public Double getCursorBulletAlpha() {
        return cursorBulletAlpha;
    }

    /**
     * @param customBullet Path to the image of custom bullet.
     * @return AmGraph
     */
    public AmGraph setCustomBullet(String customBullet) {
        this.customBullet = customBullet;
        return this;
    }

    public String getCustomBullet() {
        return customBullet;
    }

    /**
     * @param customBulletField Name of the custom bullet field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setCustomBulletField(String customBulletField) {
        this.customBulletField = customBulletField;
        return this;
    }

    public String getCustomBulletField() {
        return customBulletField;
    }

    /**
     * @param customMarker Path to the image for legend marker.
     * @return AmGraph
     */
    public AmGraph setCustomMarker(String customMarker) {
        this.customMarker = customMarker;
        return this;
    }

    public String getCustomMarker() {
        return customMarker;
    }

    /**
     * @param dashLength Dash length. If you set it to a value greater than 0, the graph line (or columns
     *                   border) will be dashed.
     * @return AmGraph
     */
    public AmGraph setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    public Double getDashLength() {
        return dashLength;
    }

    /**
     * @param dashLengthField Name of the dash length field in your dataProvider. This property adds a possibility
     *                        to change graphs’ line from solid to dashed on any data point. You can also make
     *                        columns border dashed using this setting. Note, this won't work with smoothedLineGraph.
     * @return AmGraph
     */
    public AmGraph setDashLengthField(String dashLengthField) {
        this.dashLengthField = dashLengthField;
        return this;
    }

    public String getDashLengthField() {
        return dashLengthField;
    }

    /**
     * @param dateFormat Used to format balloons if value axis is date-based.
     * @return AmGraph
     */
    public AmGraph setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * @param descriptionField Name of the description field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setDescriptionField(String descriptionField) {
        this.descriptionField = descriptionField;
        return this;
    }

    public String getDescriptionField() {
        return descriptionField;
    }

    /**
     * @param errorField Name of error value field in your data provider.
     * @return AmGraph
     */
    public AmGraph setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }

    public String getErrorField() {
        return errorField;
    }

    /**
     * @param fillAlphas Opacity of fill. Plural form is used to keep the same property names as our Flex
     *                   charts'. Flex charts can accept array of numbers to generate gradients. Although
     *                   you can set array here, only first value of this array will be used.
     * @return AmGraph
     */
    public AmGraph setFillAlphas(double fillAlphas) {
        this.fillAlphas = fillAlphas;
        return this;
    }

    public Double getFillAlphas() {
        return fillAlphas;
    }

    /**
     * @param fillColors *Fill color. Will use lineColor if not set. You can also set array of colors here.
     * @return AmGraph
     */
    public AmGraph setFillColors(Color fillColors) {
        this.fillColors = fillColors;
        return this;
    }

    public Color getFillColors() {
        return fillColors;
    }

    /**
     * @param fillColorsField Name of the fill colors field in your dataProvider. This property adds a possibility
     *                        to change line graphs’ fill color on any data point to create highlighted sections
     *                        of the graph. Works only with AmSerialChart.
     * @return AmGraph
     */
    public AmGraph setFillColorsField(String fillColorsField) {
        this.fillColorsField = fillColorsField;
        return this;
    }

    public String getFillColorsField() {
        return fillColorsField;
    }

    /**
     * @param fillToAxis XY chart only. If you set this property to id or reference of your X or Y axis, and
     *                   the fillAlphas is > 0, the area between graph and axis will be filled with color,
     *                   like in this demo.
     * @return AmGraph
     */
    public AmGraph setFillToAxis(ValueAxis fillToAxis) {
        this.fillToAxis = fillToAxis;
        return this;
    }

    public ValueAxis getFillToAxis() {
        return fillToAxis;
    }

    /**
     * @param fillToGraph You can set another graph here and if fillAlpha is >0, the area from this graph to
     *                    fillToGraph will be filled (instead of filling the area to the X axis). This feature
     *                    is not supported by smoothedLine graphs and Radar chart.
     * @return AmGraph
     */
    public AmGraph setFillToGraph(AmGraph fillToGraph) {
        this.fillToGraph = fillToGraph;
        return this;
    }

    public AmGraph getFillToGraph() {
        return fillToGraph;
    }

    /**
     * @param fixedColumnWidth Column width in pixels. If you set this property, columns will be of a fixed width
     *                         and won't adjust to the available space.
     * @return AmGraph
     */
    public AmGraph setFixedColumnWidth(double fixedColumnWidth) {
        this.fixedColumnWidth = fixedColumnWidth;
        return this;
    }

    public Double getFixedColumnWidth() {
        return fixedColumnWidth;
    }

    /**
     * @param fontSize Size of value labels text. Will use chart's fontSize if not set.
     * @return AmGraph
     */
    public AmGraph setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * @param forceGap If this is set `true`, the graph will always break the line if the distance in time
     *                 between two adjacent data points is bigger than `gapPeriod x minPeriod`, even if
     *                 `connect` is set to `true`.
     * @return AmGraph
     */
    public AmGraph setForceGap(boolean forceGap) {
        this.forceGap = forceGap;
        return this;
    }

    public Boolean getForceGap() {
        return forceGap;
    }

    /**
     * @param gapField Name of the gap field in your dataProvider. You can force graph to show gap at a
     *                 desired data point using this feature. This feature does not work with XY chart.
     * @return AmGraph
     */
    public AmGraph setGapField(String gapField) {
        this.gapField = gapField;
        return this;
    }

    public String getGapField() {
        return gapField;
    }

    /**
     * @param gapPeriod Using this property you can specify when graph should display gap - if the time difference
     *                  between data points is bigger than duration of minPeriod * gapPeriod, and connect
     *                  property of a graph is set to false, graph will display gap.
     * @return AmGraph
     */
    public AmGraph setGapPeriod(double gapPeriod) {
        this.gapPeriod = gapPeriod;
        return this;
    }

    public Double getGapPeriod() {
        return gapPeriod;
    }

    /**
     * @param gradientOrientation Orientation of the gradient fills (only for "column" graph type). Possible values
     *                            are "vertical" and "horizontal".
     * @return AmGraph
     */
    public AmGraph setGradientOrientation(String gradientOrientation) {
        this.gradientOrientation = gradientOrientation;
        return this;
    }

    public String getGradientOrientation() {
        return gradientOrientation;
    }

    /**
     * @param hidden Specifies whether the graph is hidden. Do not use this to show/hide the graph, use
     *               hideGraph(graph) and showGraph(graph) methods instead.
     * @return AmGraph
     */
    public AmGraph setHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public Boolean getHidden() {
        return hidden;
    }

    /**
     * @param hideBulletsCount If there are more data points than hideBulletsCount, the bullets will not be shown.
     *                         0 means the bullets will always be visible.
     * @return AmGraph
     */
    public AmGraph setHideBulletsCount(double hideBulletsCount) {
        this.hideBulletsCount = hideBulletsCount;
        return this;
    }

    public Double getHideBulletsCount() {
        return hideBulletsCount;
    }

    /**
     * @param highField Name of the high field (used by candlesticks and ohlc) in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setHighField(String highField) {
        this.highField = highField;
        return this;
    }

    public String getHighField() {
        return highField;
    }

    /**
     * @param id Unique id of a graph. It is not required to set one, unless you want to use this
     *           graph for as your scrollbar's graph and need to indicate which graph should be used.
     * @return AmGraph
     */
    public AmGraph setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * @param includeInMinMax Whether to include this graph when calculating min and max value of the axis.
     * @return AmGraph
     */
    public AmGraph setIncludeInMinMax(boolean includeInMinMax) {
        this.includeInMinMax = includeInMinMax;
        return this;
    }

    public Boolean getIncludeInMinMax() {
        return includeInMinMax;
    }

    /**
     * @param labelAnchor Data label text anchor.
     * @return AmGraph
     */
    public AmGraph setLabelAnchor(String labelAnchor) {
        this.labelAnchor = labelAnchor;
        return this;
    }

    public String getLabelAnchor() {
        return labelAnchor;
    }

    /**
     * @param labelColorField Name of label color field in data provider.
     * @return AmGraph
     */
    public AmGraph setLabelColorField(String labelColorField) {
        this.labelColorField = labelColorField;
        return this;
    }

    public String getLabelColorField() {
        return labelColorField;
    }

    /**
     * @param labelOffset Offset of data label.
     * @return AmGraph
     */
    public AmGraph setLabelOffset(double labelOffset) {
        this.labelOffset = labelOffset;
        return this;
    }

    public Double getLabelOffset() {
        return labelOffset;
    }

    /**
     * @param labelPosition Position of value label. Possible values are: "bottom", "top", "right", "left", "inside",
     *                      "middle". Sometimes position is changed by the chart, depending on a graph type,
     *                      rotation, etc.
     * @return AmGraph
     */
    public AmGraph setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
        return this;
    }

    public String getLabelPosition() {
        return labelPosition;
    }

    /**
     * @param labelRotation Rotation of a data label.
     * @return AmGraph
     */
    public AmGraph setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
        return this;
    }

    public Double getLabelRotation() {
        return labelRotation;
    }

    /**
     * @param labelText Value label text. You can use tags like [[value]], [[description]], [[percents]],
     *                  [[open]], [[category]].
     * @return AmGraph
     */
    public AmGraph setLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    public String getLabelText() {
        return labelText;
    }

    /**
     * @param legendAlpha Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
     * @return AmGraph
     */
    public AmGraph setLegendAlpha(double legendAlpha) {
        this.legendAlpha = legendAlpha;
        return this;
    }

    public Double getLegendAlpha() {
        return legendAlpha;
    }

    /**
     * @param legendColor Legend marker color. Will use lineColor if not set.
     * @return AmGraph
     */
    public AmGraph setLegendColor(Color legendColor) {
        this.legendColor = legendColor;
        return this;
    }

    public Color getLegendColor() {
        return legendColor;
    }

    /**
     * @param legendColorFunction It is called and the following attributes are passed: dataItem, formattedText, periodValues,
     *                            periodPercentValues. It should return hex color code which will be used for legend
     *                            marker.
     * @return AmGraph
     */
    public AmGraph setLegendColorFunction(Object legendColorFunction) {
        this.legendColorFunction = legendColorFunction;
        return this;
    }

    public Object getLegendColorFunction() {
        return legendColorFunction;
    }

    /**
     * @param legendPeriodValueText The text which will be displayed in the value portion of the legend when user is
     *                              not hovering above any data point. The tags should be made out of two parts - the
     *                              name of a field (value / open / close / high / low) and the value of the period you
     *                              want to be show - open / close / high / low / sum / average / count. For example:
     *                              [[value.sum]] means that sum of all data points of value field in the selected period
     *                              will be displayed.
     * @return AmGraph
     */
    public AmGraph setLegendPeriodValueText(String legendPeriodValueText) {
        this.legendPeriodValueText = legendPeriodValueText;
        return this;
    }

    public String getLegendPeriodValueText() {
        return legendPeriodValueText;
    }

    /**
     * @param legendValueText Legend value text. You can use tags like [[value]], [[description]], [[percents]],
     *                        [[open]], [[category]] You can also use custom fields from your dataProvider. If
     *                        not set, uses Legend's valueText.
     * @return AmGraph
     */
    public AmGraph setLegendValueText(String legendValueText) {
        this.legendValueText = legendValueText;
        return this;
    }

    public String getLegendValueText() {
        return legendValueText;
    }

    /**
     * @param lineAlpha Opacity of the line (or column border). Value range is 0 - 1.
     * @return AmGraph
     */
    public AmGraph setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
        return this;
    }

    public Double getLineAlpha() {
        return lineAlpha;
    }

    /**
     * @param lineColor Color of the line (or column border). If you do not set any, the color from AmCoordinateChart.colors
     *                  array will be used for each subsequent graph.
     * @return AmGraph
     */
    public AmGraph setLineColor(Color lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Color getLineColor() {
        return lineColor;
    }

    /**
     * @param lineColorField Name of the line color field in your dataProvider. This property adds a possibility
     *                       to change graphs’ line color on any data point to create highlighted sections of
     *                       the graph. Works only with AmSerialChart.
     * @return AmGraph
     */
    public AmGraph setLineColorField(String lineColorField) {
        this.lineColorField = lineColorField;
        return this;
    }

    public String getLineColorField() {
        return lineColorField;
    }

    /**
     * @param lineThickness Specifies thickness of the graph line (or column border).
     * @return AmGraph
     */
    public AmGraph setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
        return this;
    }

    public Double getLineThickness() {
        return lineThickness;
    }

    /**
     * @param lowField Name of the low field (used by candlesticks and ohlc) in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setLowField(String lowField) {
        this.lowField = lowField;
        return this;
    }

    public String getLowField() {
        return lowField;
    }

    /**
     * @param markerType Legend marker type. You can set legend marker (key) type for individual graphs. Possible
     *                   values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown,
     *                   bubble, line, none.
     * @return AmGraph
     */
    public AmGraph setMarkerType(String markerType) {
        this.markerType = markerType;
        return this;
    }

    public String getMarkerType() {
        return markerType;
    }

    /**
     * @param maxBulletSize Specifies size of the bullet which value is the biggest (XY chart).
     * @return AmGraph
     */
    public AmGraph setMaxBulletSize(double maxBulletSize) {
        this.maxBulletSize = maxBulletSize;
        return this;
    }

    public Double getMaxBulletSize() {
        return maxBulletSize;
    }

    /**
     * @param minBulletSize Specifies minimum size of the bullet (XY chart).
     * @return AmGraph
     */
    public AmGraph setMinBulletSize(double minBulletSize) {
        this.minBulletSize = minBulletSize;
        return this;
    }

    public Double getMinBulletSize() {
        return minBulletSize;
    }

    /**
     * @param minDistance It is useful if you have really lots of data points. Based on this property the graph
     *                    will omit some of the lines (if the distance between points is less that minDistance,
     *                    in pixels). This will not affect the bullets or indicator in anyway, so the user
     *                    will not see any difference (unless you set minValue to a bigger value, let say 5),
     *                    but will increase performance as less lines will be drawn. By setting value to a
     *                    bigger number you can also make your lines look less jagged.
     * @return AmGraph
     */
    public AmGraph setMinDistance(double minDistance) {
        this.minDistance = minDistance;
        return this;
    }

    public Double getMinDistance() {
        return minDistance;
    }

    /**
     * @param negativeBase If you use different colors for your negative values, a graph below zero line is
     *                     filled with negativeColor. With this property you can define a different base value
     *                     at which colors should be changed to negative colors.
     * @return AmGraph
     */
    public AmGraph setNegativeBase(double negativeBase) {
        this.negativeBase = negativeBase;
        return this;
    }

    public Double getNegativeBase() {
        return negativeBase;
    }

    /**
     * @param negativeFillAlphas Fill opacity of negative part of the graph. Will use fillAlphas if not set.
     * @return AmGraph
     */
    public AmGraph setNegativeFillAlphas(double negativeFillAlphas) {
        this.negativeFillAlphas = negativeFillAlphas;
        return this;
    }

    public Double getNegativeFillAlphas() {
        return negativeFillAlphas;
    }

    /**
     * @param negativeFillColors Fill color of negative part of the graph. Will use fillColors if not set.
     * @return AmGraph
     */
    public AmGraph setNegativeFillColors(Color negativeFillColors) {
        this.negativeFillColors = negativeFillColors;
        return this;
    }

    public Color getNegativeFillColors() {
        return negativeFillColors;
    }

    /**
     * @param negativeLineAlpha Opacity of the negative portion of the line (or column border). Value range is 0
     *                          - 1.
     * @return AmGraph
     */
    public AmGraph setNegativeLineAlpha(double negativeLineAlpha) {
        this.negativeLineAlpha = negativeLineAlpha;
        return this;
    }

    public Double getNegativeLineAlpha() {
        return negativeLineAlpha;
    }

    /**
     * @param negativeLineColor Color of the line (or column) when the values are negative. In case the graph type
     *                          is candlestick or ohlc, negativeLineColor is used when close value is less then open
     *                          value.
     * @return AmGraph
     */
    public AmGraph setNegativeLineColor(Color negativeLineColor) {
        this.negativeLineColor = negativeLineColor;
        return this;
    }

    public Color getNegativeLineColor() {
        return negativeLineColor;
    }

    /**
     * @param newStack If you set it to true, column chart will begin new stack. This allows having Clustered
     *                 and Stacked column/bar chart.
     * @return AmGraph
     */
    public AmGraph setNewStack(boolean newStack) {
        this.newStack = newStack;
        return this;
    }

    public Boolean getNewStack() {
        return newStack;
    }

    /**
     * @param noStepRisers In case you want to have a step line graph without risers, you should set this to
     *                     true.
     * @return AmGraph
     */
    public AmGraph setNoStepRisers(boolean noStepRisers) {
        this.noStepRisers = noStepRisers;
        return this;
    }

    public Boolean getNoStepRisers() {
        return noStepRisers;
    }

    /**
     * @param openField Name of the open field (used by floating columns, candlesticks and ohlc) in your
     *                  dataProvider.
     * @return AmGraph
     */
    public AmGraph setOpenField(String openField) {
        this.openField = openField;
        return this;
    }

    public String getOpenField() {
        return openField;
    }

    /**
     * @param pattern Value of pattern should be object with url, width, height of an image, optionally
     *                it might have x, y, randomX and randomY values. For example: {"url":"../amcharts/patterns/black/pattern1.png",
     *                "width":4, "height":4}. If you want to have individual patterns for each column,
     *                define patterns in data provider and set graph.patternField property. Check amcharts/patterns
     *                folder for some patterns. You can create your own patterns and use them. Note, x,
     *                y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts
     *                won't work properly with patterns.
     * @return AmGraph
     */
    public AmGraph setPattern(Object pattern) {
        this.pattern = pattern;
        return this;
    }

    public Object getPattern() {
        return pattern;
    }

    /**
     * @param patternField Field name in your data provider which holds pattern information. Value of pattern
     *                     should be object with url, width, height of an image, optionally it might have x,
     *                     y, randomX and randomY values. For example: {"url":"../amcharts/patterns/black/pattern1.png",
     *                     "width":4, "height":4}. Check amcharts/patterns folder for some patterns. You can
     *                     create your own patterns and use them. Note, x, y, randomX and randomY properties
     *                     won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns.
     * @return AmGraph
     */
    public AmGraph setPatternField(String patternField) {
        this.patternField = patternField;
        return this;
    }

    public String getPatternField() {
        return patternField;
    }

    /**
     * @param periodSpan This property can be used by step graphs - you can set how many periods one horizontal
     *                   line should span.
     * @return AmGraph
     */
    public AmGraph setPeriodSpan(double periodSpan) {
        this.periodSpan = periodSpan;
        return this;
    }

    public Double getPeriodSpan() {
        return periodSpan;
    }

    /**
     * @param pointPosition Specifies where data points should be placed - on the beginning of the period (day,
     *                      hour, etc) or in the middle (only when parseDates property of categoryAxis is set
     *                      to true). This setting affects Serial chart only. Possible values are "start", "middle"
     *                      and "end"
     * @return AmGraph
     */
    public AmGraph setPointPosition(String pointPosition) {
        this.pointPosition = pointPosition;
        return this;
    }

    public String getPointPosition() {
        return pointPosition;
    }

    /**
     * @param precision Precision of values. Will use chart's precision if not set any.
     * @return AmGraph
     */
    public AmGraph setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    public Double getPrecision() {
        return precision;
    }

    /**
     * @param proCandlesticks If this is set to true, candlesticks will be colored in a different manner - if current
     *                        close is less than current open, the candlestick will be empty, otherwise - filled
     *                        with color. If previous close is less than current close, the candlestick will use
     *                        positive color, otherwise - negative color.
     * @return AmGraph
     */
    public AmGraph setProCandlesticks(boolean proCandlesticks) {
        this.proCandlesticks = proCandlesticks;
        return this;
    }

    public Boolean getProCandlesticks() {
        return proCandlesticks;
    }

    /**
     * @param segmentData Gantt chart only. Contains unmodified segment object from data provider.
     * @return AmGraph
     */
    public AmGraph setSegmentData(Object segmentData) {
        this.segmentData = segmentData;
        return this;
    }

    public Object getSegmentData() {
        return segmentData;
    }

    /**
     * @param showAllValueLabels If graph's type is column and labelText is set, graph hides labels which do not fit
     *                           into the column's space or go outside plot area. If you don't want these labels to
     *                           be hidden, set this to true.
     * @return AmGraph
     */
    public AmGraph setShowAllValueLabels(boolean showAllValueLabels) {
        this.showAllValueLabels = showAllValueLabels;
        return this;
    }

    public Boolean getShowAllValueLabels() {
        return showAllValueLabels;
    }

    /**
     * @param showBalloon Specifies whether the value balloon of this graph is shown when mouse is over data
     *                    item or chart's indicator is over some series.
     * @return AmGraph
     */
    public AmGraph setShowBalloon(boolean showBalloon) {
        this.showBalloon = showBalloon;
        return this;
    }

    public Boolean getShowBalloon() {
        return showBalloon;
    }

    /**
     * @param showBalloonAt Specifies graphs value at which cursor is showed. This is only important for candlestick
     *                      and ohlc charts, also if column chart has "open" value. Possible values are: "open",
     *                      "close", "high", "low". "top" and "bottom" values will glue the balloon to top/bottom
     *                      of the plot area.
     * @return AmGraph
     */
    public AmGraph setShowBalloonAt(String showBalloonAt) {
        this.showBalloonAt = showBalloonAt;
        return this;
    }

    public String getShowBalloonAt() {
        return showBalloonAt;
    }

    /**
     * @param showBulletsAt Works with candlestick graph type, you can set it to open, close, high, low. If you
     *                      set it to high, the events will be shown at the tip of the high line.
     * @return AmGraph
     */
    public AmGraph setShowBulletsAt(String showBulletsAt) {
        this.showBulletsAt = showBulletsAt;
        return this;
    }

    public String getShowBulletsAt() {
        return showBulletsAt;
    }

    /**
     * @param showHandOnHover If you want mouse pointer to change to hand when hovering the graph, set this property
     *                        to true.
     * @return AmGraph
     */
    public AmGraph setShowHandOnHover(boolean showHandOnHover) {
        this.showHandOnHover = showHandOnHover;
        return this;
    }

    public Boolean getShowHandOnHover() {
        return showHandOnHover;
    }

    /**
     * @param showOnAxis It can only be used together with topRadius (when columns look like cylinders). If
     *                   you set it to true, the cylinder will be lowered down so that the center of it's
     *                   bottom circle would be right on category axis.
     * @return AmGraph
     */
    public AmGraph setShowOnAxis(boolean showOnAxis) {
        this.showOnAxis = showOnAxis;
        return this;
    }

    public Boolean getShowOnAxis() {
        return showOnAxis;
    }

    /**
     * @param stackable If the value axis of this graph has stack types like "regular" or "100%" You can
     *                  exclude this graph from stacking.
     * @return AmGraph
     */
    public AmGraph setStackable(boolean stackable) {
        this.stackable = stackable;
        return this;
    }

    public Boolean getStackable() {
        return stackable;
    }

    /**
     * @param stepDirection Step graph only. Specifies to which direction step should be drawn.
     * @return AmGraph
     */
    public AmGraph setStepDirection(String stepDirection) {
        this.stepDirection = stepDirection;
        return this;
    }

    public String getStepDirection() {
        return stepDirection;
    }

    /**
     * @param switchable *If you set it to false, the graph will not be hidden when user clicks on legend entry.
     * @return AmGraph
     */
    public AmGraph setSwitchable(boolean switchable) {
        this.switchable = switchable;
        return this;
    }

    public Boolean getSwitchable() {
        return switchable;
    }

    /**
     * @param tabIndex In case you set it to some number, the chart will set focus on bullet/column (starting
     *                 from first) when user clicks tab key. When a focus is set, screen readers like NVDA
     *                 Screen reader will read label which is set using accessibleLabel property of AmGraph.
     *                 Note, not all browsers and readers support this.
     * @return AmGraph
     */
    public AmGraph setTabIndex(double tabIndex) {
        this.tabIndex = tabIndex;
        return this;
    }

    public Double getTabIndex() {
        return tabIndex;
    }

    /**
     * @param title Graph title.
     * @return AmGraph
     */
    public AmGraph setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    /**
     * @param topRadius If you set this to 1, columns will become cylinders (must set depth3D and angle properties
     *                  of a chart to >0 values in order this to be visible). you can make columns look like
     *                  cones (set topRadius to 0) or even like some glasses (set to bigger than 1). We strongly
     *                  recommend setting grid opacity to 0 in order this to look good.
     * @return AmGraph
     */
    public AmGraph setTopRadius(double topRadius) {
        this.topRadius = topRadius;
        return this;
    }

    public Double getTopRadius() {
        return topRadius;
    }

    /**
     * @param type Type of the graph. Possible values are: "line", "column", "step", "smoothedLine",
     *             "candlestick", "ohlc". XY and Radar charts can only display "line" type graphs.
     * @return AmGraph
     */
    public AmGraph setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    /**
     * @param urlField Name of the url field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setUrlField(String urlField) {
        this.urlField = urlField;
        return this;
    }

    public String getUrlField() {
        return urlField;
    }

    /**
     * @param urlTarget Target to open URLs in, i.e. _blank, _top, etc.
     * @return AmGraph
     */
    public AmGraph setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
        return this;
    }

    public String getUrlTarget() {
        return urlTarget;
    }

    /**
     * @param useLineColorForBulletBorder If set to true, the bullet border will take the same color as graph line.
     * @return AmGraph
     */
    public AmGraph setUseLineColorForBulletBorder(boolean useLineColorForBulletBorder) {
        this.useLineColorForBulletBorder = useLineColorForBulletBorder;
        return this;
    }

    public Boolean getUseLineColorForBulletBorder() {
        return useLineColorForBulletBorder;
    }

    /**
     * @param useNegativeColorIfDown If negativeLineColor and/or negativeFillColors are set and useNegativeColorIfDown
     *                               is set to true (default is false), the line, step and column graphs will use these
     *                               colors for lines, bullets or columns if previous value is bigger than current value.
     *                               In case you set openField for the graph, the graph will compare current value with
     *                               openField value instead of comparing to previous value. Here is a demo.
     * @return AmGraph
     */
    public AmGraph setUseNegativeColorIfDown(boolean useNegativeColorIfDown) {
        this.useNegativeColorIfDown = useNegativeColorIfDown;
        return this;
    }

    public Boolean getUseNegativeColorIfDown() {
        return useNegativeColorIfDown;
    }

    /**
     * @param valueAxis Specifies which value axis the graph will use. Will use the first value axis if not
     *                  set. You can use reference to the real ValueAxis object or set value axis id.
     * @return AmGraph
     */
    public AmGraph setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    public ValueAxis getValueAxis() {
        return valueAxis;
    }

    /**
     * @param valueField Name of the value field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setValueField(String valueField) {
        this.valueField = valueField;
        return this;
    }

    public String getValueField() {
        return valueField;
    }

    /**
     * @param visibleInLegend Specifies whether this graph should be shown in the Legend.
     * @return AmGraph
     */
    public AmGraph setVisibleInLegend(boolean visibleInLegend) {
        this.visibleInLegend = visibleInLegend;
        return this;
    }

    public Boolean getVisibleInLegend() {
        return visibleInLegend;
    }

    /**
     * @param xAxis XY chart only. A horizontal value axis object to attach graph to.
     * @return AmGraph
     */
    public AmGraph setXAxis(ValueAxis xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public ValueAxis getXAxis() {
        return xAxis;
    }

    /**
     * @param xField XY chart only. Name of the x field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setXField(String xField) {
        this.xField = xField;
        return this;
    }

    public String getXField() {
        return xField;
    }

    /**
     * @param yAxis XY chart only. A vertical value axis object to attach graph to.
     * @return AmGraph
     */
    public AmGraph setYAxis(ValueAxis yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public ValueAxis getYAxis() {
        return yAxis;
    }

    /**
     * @param yField XY chart only. Name of the y field in your dataProvider.
     * @return AmGraph
     */
    public AmGraph setYField(String yField) {
        this.yField = yField;
        return this;
    }

    public String getYField() {
        return yField;
    }

}