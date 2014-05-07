package de.stekoe.amcharts;

import java.io.Serializable;

import de.stekoe.amcharts.addition.Color;

public class AmGraph implements Serializable {
    private String alphaField;
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
    private Double bulletOffset;
    private Double bulletSize;
    private String bulletSizeField;
    private String closeField;
    private Boolean clustered;
    private Color color;
    private String colorField;
    private Double columnWidth;
    private Boolean connect;
    private Double cornerRadiusTop;
    private Double cursorBulletAlpha;
    private String customBullet;
    private String customBulletField;
    private String customMarker;
    private Double dashLength;
    private String dashLengthField;
    private String descriptionField;
    private String errorField;
    private Double fillAlphas;
    private Color fillColors;
    private String fillColorsField;
    private AmGraph fillToGraph;
    private Double fontSize;
    private String gradientOrientation;
    private Boolean hidden;
    private Double hideBulletsCount;
    private String highField;
    private String id;
    private Boolean includeInMinMax;
    private String labelColorField;
    private String labelPosition;
    private String labelText;
    private Double legendAlpha;
    private Color legendColor;
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
    private Boolean showAllValueLabels;
    private Boolean showBalloon;
    private String showBalloonAt;
    private String showBulletsAt;
    private Boolean showHandOnHover;
    private Boolean stackable;
    private String title;
    private String type;
    private String urlField;
    private String urlTarget;
    private ValueAxis valueAxis;
    private String valueField;
    private Boolean visibleInLegend;
    private ValueAxis xAxis;
    private String xField;
    private ValueAxis yAxis;
    private String yField;

    /**
     * Name of the alpha field in your dataProvider.
     **/
    public String getAlphaField() {
        return alphaField;
    }
    public AmGraph setAlphaField(String alphaField) {
        this.alphaField = alphaField;
        return this;
    }

    /**
     * Value balloon color. Will use graph or data item color if not set.
     **/
    public Color getBalloonColor() {
        return balloonColor;
    }
    public AmGraph setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
        return this;
    }

    /**
     * Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]],
     * [[category]] or any other field name from your data provider. HTML tags can also
     * be used.
     **/
    public String getBalloonText() {
        return balloonText;
    }
    public AmGraph setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    /**
     * Specifies if the line graph should be placed behind column graphs
     **/
    public Boolean getBehindColumns() {
        return behindColumns;
    }
    public AmGraph setBehindColumns(boolean behindColumns) {
        this.behindColumns = behindColumns;
        return this;
    }

    /**
     * Type of the bullets. Possible values are: "none", "round", "square", "triangleUp",
     * "triangleDown", "triangleLeft", "triangleRight", "bubble", "diamond", "xError", "yError"
     * and "custom".
     **/
    public String getBullet() {
        return bullet;
    }
    public AmGraph setBullet(String bullet) {
        this.bullet = bullet;
        return this;
    }

    /**
     * Opacity of bullets. Value range is 0 - 1.
     **/
    public Double getBulletAlpha() {
        return bulletAlpha;
    }
    public AmGraph setBulletAlpha(double bulletAlpha) {
        this.bulletAlpha = bulletAlpha;
        return this;
    }

    /**
     * bulletAxis value is used when you are building error chart. Error chart is a regular
     * serial or XY chart with bullet type set to "xError" or "yError". The graph should
     * know which axis should be used to determine the size of this bullet - that's when
     * bulletAxis should be set. Besides that, you should also set graph.errorField. You
     * can also use other bullet types with this feature too. For example, if you set bulletAxis
     * for XY chart, the size of a bullet will change as you zoom the chart.
     **/
    public ValueAxis getBulletAxis() {
        return bulletAxis;
    }
    public AmGraph setBulletAxis(ValueAxis bulletAxis) {
        this.bulletAxis = bulletAxis;
        return this;
    }

    /**
     * Bullet border opacity.
     **/
    public Double getBulletBorderAlpha() {
        return bulletBorderAlpha;
    }
    public AmGraph setBulletBorderAlpha(double bulletBorderAlpha) {
        this.bulletBorderAlpha = bulletBorderAlpha;
        return this;
    }

    /**
     * Bullet border color. Will use lineColor if not set.
     **/
    public Color getBulletBorderColor() {
        return bulletBorderColor;
    }
    public AmGraph setBulletBorderColor(Color bulletBorderColor) {
        this.bulletBorderColor = bulletBorderColor;
        return this;
    }

    /**
     * Bullet border thickness.
     **/
    public Double getBulletBorderThickness() {
        return bulletBorderThickness;
    }
    public AmGraph setBulletBorderThickness(double bulletBorderThickness) {
        this.bulletBorderThickness = bulletBorderThickness;
        return this;
    }

    /**
     * Bullet color. Will use lineColor if not set.
     **/
    public Color getBulletColor() {
        return bulletColor;
    }
    public AmGraph setBulletColor(Color bulletColor) {
        this.bulletColor = bulletColor;
        return this;
    }

    /**
     * Name of the bullet field in your dataProvider.
     **/
    public String getBulletField() {
        return bulletField;
    }
    public AmGraph setBulletField(String bulletField) {
        this.bulletField = bulletField;
        return this;
    }

    /**
     * Bullet offset. Distance from the actual data point to the bullet. Can be used to
     * place custom bullets above the columns.
     **/
    public Double getBulletOffset() {
        return bulletOffset;
    }
    public AmGraph setBulletOffset(double bulletOffset) {
        this.bulletOffset = bulletOffset;
        return this;
    }

    /**
     * Bullet size.
     **/
    public Double getBulletSize() {
        return bulletSize;
    }
    public AmGraph setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
        return this;
    }

    /**
     * Name of the bullet size field in your dataProvider.
     **/
    public String getBulletSizeField() {
        return bulletSizeField;
    }
    public AmGraph setBulletSizeField(String bulletSizeField) {
        this.bulletSizeField = bulletSizeField;
        return this;
    }

    /**
     * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
     **/
    public String getCloseField() {
        return closeField;
    }
    public AmGraph setCloseField(String closeField) {
        this.closeField = closeField;
        return this;
    }

    /**
     * In case you want to place this graph's columns in front of other columns, set this
     * to false. In case "true", the columns will be clustered next to each other.
     **/
    public Boolean getClustered() {
        return clustered;
    }
    public AmGraph setClustered(boolean clustered) {
        this.clustered = clustered;
        return this;
    }

    /**
     * Color of value labels. Will use chart's color if not set.
     **/
    public Color getColor() {
        return color;
    }
    public AmGraph setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * Name of the color field in your dataProvider.
     **/
    public String getColorField() {
        return colorField;
    }
    public AmGraph setColorField(String colorField) {
        this.colorField = colorField;
        return this;
    }

    /**
     * You can specify custom column width for each graph individually. Value range is 0
     * - 1 (we set relative width, not pixel width here).
     **/
    public Double getColumnWidth() {
        return columnWidth;
    }
    public AmGraph setColumnWidth(double columnWidth) {
        this.columnWidth = columnWidth;
        return this;
    }

    /**
     * Specifies whether to connect data points if data is missing. The default value is
     * true.
     **/
    public Boolean getConnect() {
        return connect;
    }
    public AmGraph setConnect(boolean connect) {
        this.connect = connect;
        return this;
    }

    /**
     * Corner radius of column. It can be set both in pixels or in percents. The chart's
     * depth and angle styles must be set to 0. The default value is 0. Note, cornerRadiusTop
     * will be applied for all corners of the column, JavaScript charts do not have a possibility
     * to set separate corner radius for top and bottom. As we want all the property names
     * to be the same both on JS and Flex, we didn't change this too.
     **/
    public Double getCornerRadiusTop() {
        return cornerRadiusTop;
    }
    public AmGraph setCornerRadiusTop(double cornerRadiusTop) {
        this.cornerRadiusTop = cornerRadiusTop;
        return this;
    }

    /**
     * If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor.
     * You can set opacity of each graphs bullet. In case you want to disable these bullets
     * for a certain graph, set opacity to 0.
     **/
    public Double getCursorBulletAlpha() {
        return cursorBulletAlpha;
    }
    public AmGraph setCursorBulletAlpha(double cursorBulletAlpha) {
        this.cursorBulletAlpha = cursorBulletAlpha;
        return this;
    }

    /**
     * Path to the image of custom bullet.
     **/
    public String getCustomBullet() {
        return customBullet;
    }
    public AmGraph setCustomBullet(String customBullet) {
        this.customBullet = customBullet;
        return this;
    }

    /**
     * Name of the custom bullet field in your dataProvider.
     **/
    public String getCustomBulletField() {
        return customBulletField;
    }
    public AmGraph setCustomBulletField(String customBulletField) {
        this.customBulletField = customBulletField;
        return this;
    }

    /**
     * Path to the image for legend marker.
     **/
    public String getCustomMarker() {
        return customMarker;
    }
    public AmGraph setCustomMarker(String customMarker) {
        this.customMarker = customMarker;
        return this;
    }

    /**
     * Dash length. If you set it to a value greater than 0, the graph line (or columns
     * border) will be dashed.
     **/
    public Double getDashLength() {
        return dashLength;
    }
    public AmGraph setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    /**
     * Name of the dash length field in your dataProvider. This property adds a possibility
     * to change graphs’ line from solid to dashed on any data point. You can also make
     * columns border dashed using this setting.
     **/
    public String getDashLengthField() {
        return dashLengthField;
    }
    public AmGraph setDashLengthField(String dashLengthField) {
        this.dashLengthField = dashLengthField;
        return this;
    }

    /**
     * Name of the description field in your dataProvider.
     **/
    public String getDescriptionField() {
        return descriptionField;
    }
    public AmGraph setDescriptionField(String descriptionField) {
        this.descriptionField = descriptionField;
        return this;
    }

    /**
     * Name of error value field in your data provider.
     **/
    public String getErrorField() {
        return errorField;
    }
    public AmGraph setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }

    /**
     * Opacity of fill. Plural form is used to keep the same property names as our Flex
     * charts'. Flex charts can accept array of numbers to generate gradients. Although
     * you can set array here, only first value of this array will be used.
     **/
    public Double getFillAlphas() {
        return fillAlphas;
    }
    public AmGraph setFillAlphas(double fillAlphas) {
        this.fillAlphas = fillAlphas;
        return this;
    }

    /**
     *      *Fill color. Will use lineColor if not set. You can also set array of colors here.
     **/
    public Color getFillColors() {
        return fillColors;
    }
    public AmGraph setFillColors(Color fillColors) {
        this.fillColors = fillColors;
        return this;
    }

    /**
     * Name of the fill colors field in your dataProvider. This property adds a possibility
     * to change line graphs’ fill color on any data point to create highlighted sections
     * of the graph.
     **/
    public String getFillColorsField() {
        return fillColorsField;
    }
    public AmGraph setFillColorsField(String fillColorsField) {
        this.fillColorsField = fillColorsField;
        return this;
    }

    /**
     * You can set another graph here and if fillAlpha is >0, the area from this graph to
     * fillToGraph will be filled (instead of filling the area to the X axis).
     **/
    public AmGraph getFillToGraph() {
        return fillToGraph;
    }
    public AmGraph setFillToGraph(AmGraph fillToGraph) {
        this.fillToGraph = fillToGraph;
        return this;
    }

    /**
     * Size of value labels text. Will use chart's fontSize if not set.
     **/
    public Double getFontSize() {
        return fontSize;
    }
    public AmGraph setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * Orientation of the gradient fills (only for "column" graph type). Possible values
     * are "vertical" and "horizontal".
     **/
    public String getGradientOrientation() {
        return gradientOrientation;
    }
    public AmGraph setGradientOrientation(String gradientOrientation) {
        this.gradientOrientation = gradientOrientation;
        return this;
    }

    /**
     * Specifies whether the graph is hidden. Do not use this to show/hide the graph, use
     * hideGraph(graph) and showGraph(graph) methods instead.
     **/
    public Boolean getHidden() {
        return hidden;
    }
    public AmGraph setHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /**
     * If there are more data points than hideBulletsCount, the bullets will not be shown.
     * 0 means the bullets will always be visible.
     **/
    public Double getHideBulletsCount() {
        return hideBulletsCount;
    }
    public AmGraph setHideBulletsCount(double hideBulletsCount) {
        this.hideBulletsCount = hideBulletsCount;
        return this;
    }

    /**
     * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
     **/
    public String getHighField() {
        return highField;
    }
    public AmGraph setHighField(String highField) {
        this.highField = highField;
        return this;
    }

    /**
     * Unique id of a graph. It is not required to set one, unless you want to use this
     * graph for as your scrollbar's graph and need to indicate which graph should be used.
     **/
    public String getId() {
        return id;
    }
    public AmGraph setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Whether to include this graph when calculating min and max value of the axis.
     **/
    public Boolean getIncludeInMinMax() {
        return includeInMinMax;
    }
    public AmGraph setIncludeInMinMax(boolean includeInMinMax) {
        this.includeInMinMax = includeInMinMax;
        return this;
    }

    /**
     * Name of label color field in data provider.
     **/
    public String getLabelColorField() {
        return labelColorField;
    }
    public AmGraph setLabelColorField(String labelColorField) {
        this.labelColorField = labelColorField;
        return this;
    }

    /**
     * Position of value label. Possible values are: "bottom", "top", "right", "left", "inside",
     * "middle". Sometimes position is changed by the chart, depending on a graph type,
     * rotation, etc.
     **/
    public String getLabelPosition() {
        return labelPosition;
    }
    public AmGraph setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
        return this;
    }

    /**
     * Value label text. You can use tags like [[value]], [[description]], [[percents]],
     * [[open]], [[category]].
     **/
    public String getLabelText() {
        return labelText;
    }
    public AmGraph setLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    /**
     * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
     **/
    public Double getLegendAlpha() {
        return legendAlpha;
    }
    public AmGraph setLegendAlpha(double legendAlpha) {
        this.legendAlpha = legendAlpha;
        return this;
    }

    /**
     * Legend marker color. Will use lineColor if not set.
     **/
    public Color getLegendColor() {
        return legendColor;
    }
    public AmGraph setLegendColor(Color legendColor) {
        this.legendColor = legendColor;
        return this;
    }

    /**
     * The text which will be displayed in the value portion of the legend when user is
     * not hovering above any data point. The tags should be made out of two parts - the
     * name of a field (value / open / close / high / low) and the value of the period you
     * want to be show - open / close / high / low / sum / average / count. For example:
     * [[value.sum]] means that sum of all data points of value field in the selected period
     * will be displayed.
     **/
    public String getLegendPeriodValueText() {
        return legendPeriodValueText;
    }
    public AmGraph setLegendPeriodValueText(String legendPeriodValueText) {
        this.legendPeriodValueText = legendPeriodValueText;
        return this;
    }

    /**
     * Legend value text. You can use tags like [[value]], [[description]], [[percents]],
     * [[open]], [[category]] You can also use custom fields from your dataProvider. If
     * not set, uses Legend's valueText.
     **/
    public String getLegendValueText() {
        return legendValueText;
    }
    public AmGraph setLegendValueText(String legendValueText) {
        this.legendValueText = legendValueText;
        return this;
    }

    /**
     * Opacity of the line (or column border). Value range is 0 - 1.
     **/
    public Double getLineAlpha() {
        return lineAlpha;
    }
    public AmGraph setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
        return this;
    }

    /**
     *      *Color of the line (or column border). If you do not set any, the color from [[AmCoordinateChart
     **/
    public Color getLineColor() {
        return lineColor;
    }
    public AmGraph setLineColor(Color lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    /**
     * Name of the line color field in your dataProvider. This property adds a possibility
     * to change graphs’ line color on any data point to create highlighted sections of
     * the graph.
     **/
    public String getLineColorField() {
        return lineColorField;
    }
    public AmGraph setLineColorField(String lineColorField) {
        this.lineColorField = lineColorField;
        return this;
    }

    /**
     * Specifies thickness of the graph line (or column border).
     **/
    public Double getLineThickness() {
        return lineThickness;
    }
    public AmGraph setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
        return this;
    }

    /**
     * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
     **/
    public String getLowField() {
        return lowField;
    }
    public AmGraph setLowField(String lowField) {
        this.lowField = lowField;
        return this;
    }

    /**
     * Legend marker type. You can set legend marker (key) type for individual graphs. Possible
     * values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown,
     * bubble, line, none.
     **/
    public String getMarkerType() {
        return markerType;
    }
    public AmGraph setMarkerType(String markerType) {
        this.markerType = markerType;
        return this;
    }

    /**
     * Specifies size of the bullet which value is the biggest (XY chart).
     **/
    public Double getMaxBulletSize() {
        return maxBulletSize;
    }
    public AmGraph setMaxBulletSize(double maxBulletSize) {
        this.maxBulletSize = maxBulletSize;
        return this;
    }

    /**
     * Specifies minimum size of the bullet (XY chart).
     **/
    public Double getMinBulletSize() {
        return minBulletSize;
    }
    public AmGraph setMinBulletSize(double minBulletSize) {
        this.minBulletSize = minBulletSize;
        return this;
    }

    /**
     * It is useful if you have really lots of data points. Based on this property the graph
     * will omit some of the lines (if the distance between points is less that minDistance,
     * in pixels). This will not affect the bullets or indicator in anyway, so the user
     * will not see any difference (unless you set minValue to a bigger value, let say 5),
     * but will increase performance as less lines will be drawn. By setting value to a
     * bigger number you can also make your lines look less jagged.
     **/
    public Double getMinDistance() {
        return minDistance;
    }
    public AmGraph setMinDistance(double minDistance) {
        this.minDistance = minDistance;
        return this;
    }

    /**
     * If you use different colors for your negative values, a graph below zero line is
     * filled with negativeColor. With this property you can define a different base value
     * at which colors should be changed to negative colors.
     **/
    public Double getNegativeBase() {
        return negativeBase;
    }
    public AmGraph setNegativeBase(double negativeBase) {
        this.negativeBase = negativeBase;
        return this;
    }

    /**
     * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
     **/
    public Double getNegativeFillAlphas() {
        return negativeFillAlphas;
    }
    public AmGraph setNegativeFillAlphas(double negativeFillAlphas) {
        this.negativeFillAlphas = negativeFillAlphas;
        return this;
    }

    /**
     * Fill color of negative part of the graph. Will use fillColors if not set.
     **/
    public Color getNegativeFillColors() {
        return negativeFillColors;
    }
    public AmGraph setNegativeFillColors(Color negativeFillColors) {
        this.negativeFillColors = negativeFillColors;
        return this;
    }

    /**
     * Opacity of the negative portion of the line (or column border). Value range is 0
     * - 1.
     **/
    public Double getNegativeLineAlpha() {
        return negativeLineAlpha;
    }
    public AmGraph setNegativeLineAlpha(double negativeLineAlpha) {
        this.negativeLineAlpha = negativeLineAlpha;
        return this;
    }

    /**
     * Color of the line (or column) when the values are negative. In case the graph type
     * is candlestick or ohlc, negativeLineColor is used when close value is less then open
     * value.
     **/
    public Color getNegativeLineColor() {
        return negativeLineColor;
    }
    public AmGraph setNegativeLineColor(Color negativeLineColor) {
        this.negativeLineColor = negativeLineColor;
        return this;
    }

    /**
     * If you set it to true, column chart will begin new stack. This allows having Clustered
     * and Stacked column/bar chart.
     **/
    public Boolean getNewStack() {
        return newStack;
    }
    public AmGraph setNewStack(boolean newStack) {
        this.newStack = newStack;
        return this;
    }

    /**
     * In case you want to have a step line graph without risers, you should set this to
     * true.
     **/
    public Boolean getNoStepRisers() {
        return noStepRisers;
    }
    public AmGraph setNoStepRisers(boolean noStepRisers) {
        this.noStepRisers = noStepRisers;
        return this;
    }

    /**
     * Name of the open field (used by floating columns, candlesticks and ohlc) in your
     * dataProvider.
     **/
    public String getOpenField() {
        return openField;
    }
    public AmGraph setOpenField(String openField) {
        this.openField = openField;
        return this;
    }

    /**
     * Value of pattern should be object with url, width, height of an image, optionally
     * it might have x, y, randomX and randomY values. For example: {"url":"../amcharts/patterns/black/pattern1.png",
     * "width":4, "height":4}. If you want to have individual patterns for each column,
     * define patterns in data provider and set graph.patternField property. Check amcharts/patterns
     * folder for some patterns. You can create your own patterns and use them. Note, x,
     * y, randomX and randomY properties won't work with IE8 and older. 3D bar/Pie charts
     * won't work properly with patterns.
     **/
    public Object getPattern() {
        return pattern;
    }
    public AmGraph setPattern(Object pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Field name in your data provider which holds pattern information. Value of pattern
     * should be object with url, width, height of an image, optionally it might have x,
     * y, randomX and randomY values. For example: {"url":"../amcharts/patterns/black/pattern1.png",
     * "width":4, "height":4}. Check amcharts/patterns folder for some patterns. You can
     * create your own patterns and use them. Note, x, y, randomX and randomY properties
     * won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns.
     **/
    public String getPatternField() {
        return patternField;
    }
    public AmGraph setPatternField(String patternField) {
        this.patternField = patternField;
        return this;
    }

    /**
     * This property can be used by step graphs - you can set how many periods one horizontal
     * line should span.
     **/
    public Double getPeriodSpan() {
        return periodSpan;
    }
    public AmGraph setPeriodSpan(double periodSpan) {
        this.periodSpan = periodSpan;
        return this;
    }

    /**
     * Specifies where data points should be placed - on the beginning of the period (day,
     * hour, etc) or in the middle (only when parseDates property of categoryAxis is set
     * to true). This setting affects Serial chart only. Possible values are "start", "middle"
     * and "end"
     **/
    public String getPointPosition() {
        return pointPosition;
    }
    public AmGraph setPointPosition(String pointPosition) {
        this.pointPosition = pointPosition;
        return this;
    }

    /**
     * Precision of values. Will use chart's precision if not set any.
     **/
    public Double getPrecision() {
        return precision;
    }
    public AmGraph setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    /**
     * If graph's type is column and labelText is set, graph hides labels which do not fit
     * into the column's space. If you don't want these labels to be hidden, set this to
     * true.
     **/
    public Boolean getShowAllValueLabels() {
        return showAllValueLabels;
    }
    public AmGraph setShowAllValueLabels(boolean showAllValueLabels) {
        this.showAllValueLabels = showAllValueLabels;
        return this;
    }

    /**
     * Specifies whether the value balloon of this graph is shown when mouse is over data
     * item or chart's indicator is over some series.
     **/
    public Boolean getShowBalloon() {
        return showBalloon;
    }
    public AmGraph setShowBalloon(boolean showBalloon) {
        this.showBalloon = showBalloon;
        return this;
    }

    /**
     * Specifies graphs value at which cursor is showed. This is only important for candlestick
     * and ohlc charts, also if column chart has "open" value. Possible values are: "open",
     * "close", "high", "low".
     **/
    public String getShowBalloonAt() {
        return showBalloonAt;
    }
    public AmGraph setShowBalloonAt(String showBalloonAt) {
        this.showBalloonAt = showBalloonAt;
        return this;
    }

    /**
     * Works with candlestick graph type, you can set it to open, close, high, low. If you
     * set it to high, the events will be shown at the tip of the high line.
     **/
    public String getShowBulletsAt() {
        return showBulletsAt;
    }
    public AmGraph setShowBulletsAt(String showBulletsAt) {
        this.showBulletsAt = showBulletsAt;
        return this;
    }

    /**
     * If you want mouse pointer to change to hand when hovering the graph, set this property
     * to true.
     **/
    public Boolean getShowHandOnHover() {
        return showHandOnHover;
    }
    public AmGraph setShowHandOnHover(boolean showHandOnHover) {
        this.showHandOnHover = showHandOnHover;
        return this;
    }

    /**
     * If the value axis of this graph has stack types like "regular" or "100%" You can
     * exclude this graph from stacking.
     **/
    public Boolean getStackable() {
        return stackable;
    }
    public AmGraph setStackable(boolean stackable) {
        this.stackable = stackable;
        return this;
    }

    /**
     * Graph title.
     **/
    public String getTitle() {
        return title;
    }
    public AmGraph setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Type of the graph. Possible values are: "line", "column", "step", "smoothedLine",
     * "candlestick", "ohlc". XY and Radar charts can only display "line" type graphs.
     **/
    public String getType() {
        return type;
    }
    public AmGraph setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Name of the url field in your dataProvider.
     **/
    public String getUrlField() {
        return urlField;
    }
    public AmGraph setUrlField(String urlField) {
        this.urlField = urlField;
        return this;
    }

    /**
     * Target to open URLs in, i.e. _blank, _top, etc.
     **/
    public String getUrlTarget() {
        return urlTarget;
    }
    public AmGraph setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
        return this;
    }

    /**
     * Specifies which value axis the graph will use. Will use the first value axis if not
     * set. You can use reference to the real ValueAxis object or set value axis id.
     **/
    public ValueAxis getValueAxis() {
        return valueAxis;
    }
    public AmGraph setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    /**
     * Name of the value field in your dataProvider.
     **/
    public String getValueField() {
        return valueField;
    }
    public AmGraph setValueField(String valueField) {
        this.valueField = valueField;
        return this;
    }

    /**
     * Specifies whether this graph should be shown in the Legend.
     **/
    public Boolean getVisibleInLegend() {
        return visibleInLegend;
    }
    public AmGraph setVisibleInLegend(boolean visibleInLegend) {
        this.visibleInLegend = visibleInLegend;
        return this;
    }

    /**
     * XY chart only. A horizontal value axis object to attach graph to.
     **/
    public ValueAxis getXAxis() {
        return xAxis;
    }
    public AmGraph setXAxis(ValueAxis xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    /**
     * XY chart only. Name of the x field in your dataProvider.
     **/
    public String getXField() {
        return xField;
    }
    public AmGraph setXField(String xField) {
        this.xField = xField;
        return this;
    }

    /**
     * XY chart only. A vertical value axis object to attach graph to.
     **/
    public ValueAxis getYAxis() {
        return yAxis;
    }
    public AmGraph setYAxis(ValueAxis yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    /**
     * XY chart only. Name of the y field in your dataProvider.
     **/
    public String getYField() {
        return yField;
    }
    public AmGraph setYField(String yField) {
        this.yField = yField;
        return this;
    }


}