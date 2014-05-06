package de.stekoe.amcharts;

public class AmGraph {
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
    public void setAlphaField(String alphaField) {
        this.alphaField = alphaField;
    }
    public String getAlphaField() {
        return alphaField;
    }

    /**
     * Value balloon color. Will use graph or data item color if not set.
     **/
    public void setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
    }
    public Color getBalloonColor() {
        return balloonColor;
    }

    /**
     * Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]],
     * [[category]] or any other field name from your data provider. HTML tags can also
     * be used.
     **/
    public void setBalloonText(String balloonText) {
        this.balloonText = balloonText;
    }
    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Specifies if the line graph should be placed behind column graphs
     **/
    public void setBehindColumns(boolean behindColumns) {
        this.behindColumns = behindColumns;
    }
    public boolean isBehindColumns() {
        return behindColumns;
    }

    /**
     * Type of the bullets. Possible values are: "none", "round", "square", "triangleUp",
     * "triangleDown", "triangleLeft", "triangleRight", "bubble", "diamond", "xError", "yError"
     * and "custom".
     **/
    public void setBullet(String bullet) {
        this.bullet = bullet;
    }
    public String getBullet() {
        return bullet;
    }

    /**
     * Opacity of bullets. Value range is 0 - 1.
     **/
    public void setBulletAlpha(double bulletAlpha) {
        this.bulletAlpha = bulletAlpha;
    }
    public Double getBulletAlpha() {
        return bulletAlpha;
    }

    /**
     * bulletAxis value is used when you are building error chart. Error chart is a regular
     * serial or XY chart with bullet type set to "xError" or "yError". The graph should
     * know which axis should be used to determine the size of this bullet - that's when
     * bulletAxis should be set. Besides that, you should also set graph.errorField. You
     * can also use other bullet types with this feature too. For example, if you set bulletAxis
     * for XY chart, the size of a bullet will change as you zoom the chart.
     **/
    public void setBulletAxis(ValueAxis bulletAxis) {
        this.bulletAxis = bulletAxis;
    }
    public ValueAxis getBulletAxis() {
        return bulletAxis;
    }

    /**
     * Bullet border opacity.
     **/
    public void setBulletBorderAlpha(double bulletBorderAlpha) {
        this.bulletBorderAlpha = bulletBorderAlpha;
    }
    public Double getBulletBorderAlpha() {
        return bulletBorderAlpha;
    }

    /**
     * Bullet border color. Will use lineColor if not set.
     **/
    public void setBulletBorderColor(Color bulletBorderColor) {
        this.bulletBorderColor = bulletBorderColor;
    }
    public Color getBulletBorderColor() {
        return bulletBorderColor;
    }

    /**
     * Bullet border thickness.
     **/
    public void setBulletBorderThickness(double bulletBorderThickness) {
        this.bulletBorderThickness = bulletBorderThickness;
    }
    public Double getBulletBorderThickness() {
        return bulletBorderThickness;
    }

    /**
     * Bullet color. Will use lineColor if not set.
     **/
    public void setBulletColor(Color bulletColor) {
        this.bulletColor = bulletColor;
    }
    public Color getBulletColor() {
        return bulletColor;
    }

    /**
     * Name of the bullet field in your dataProvider.
     **/
    public void setBulletField(String bulletField) {
        this.bulletField = bulletField;
    }
    public String getBulletField() {
        return bulletField;
    }

    /**
     * Bullet offset. Distance from the actual data point to the bullet. Can be used to
     * place custom bullets above the columns.
     **/
    public void setBulletOffset(double bulletOffset) {
        this.bulletOffset = bulletOffset;
    }
    public Double getBulletOffset() {
        return bulletOffset;
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
     * Name of the bullet size field in your dataProvider.
     **/
    public void setBulletSizeField(String bulletSizeField) {
        this.bulletSizeField = bulletSizeField;
    }
    public String getBulletSizeField() {
        return bulletSizeField;
    }

    /**
     * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
     **/
    public void setCloseField(String closeField) {
        this.closeField = closeField;
    }
    public String getCloseField() {
        return closeField;
    }

    /**
     * In case you want to place this graph's columns in front of other columns, set this
     * to false. In case "true", the columns will be clustered next to each other.
     **/
    public void setClustered(boolean clustered) {
        this.clustered = clustered;
    }
    public boolean isClustered() {
        return clustered;
    }

    /**
     * Color of value labels. Will use chart's color if not set.
     **/
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    /**
     * Name of the color field in your dataProvider.
     **/
    public void setColorField(String colorField) {
        this.colorField = colorField;
    }
    public String getColorField() {
        return colorField;
    }

    /**
     * You can specify custom column width for each graph individually. Value range is 0
     * - 1 (we set relative width, not pixel width here).
     **/
    public void setColumnWidth(double columnWidth) {
        this.columnWidth = columnWidth;
    }
    public Double getColumnWidth() {
        return columnWidth;
    }

    /**
     * Specifies whether to connect data points if data is missing. The default value is
     * true.
     **/
    public void setConnect(boolean connect) {
        this.connect = connect;
    }
    public boolean isConnect() {
        return connect;
    }

    /**
     * Corner radius of column. It can be set both in pixels or in percents. The chart's
     * depth and angle styles must be set to 0. The default value is 0. Note, cornerRadiusTop
     * will be applied for all corners of the column, JavaScript charts do not have a possibility
     * to set separate corner radius for top and bottom. As we want all the property names
     * to be the same both on JS and Flex, we didn't change this too.
     **/
    public void setCornerRadiusTop(double cornerRadiusTop) {
        this.cornerRadiusTop = cornerRadiusTop;
    }
    public Double getCornerRadiusTop() {
        return cornerRadiusTop;
    }

    /**
     * If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor.
     * You can set opacity of each graphs bullet. In case you want to disable these bullets
     * for a certain graph, set opacity to 0.
     **/
    public void setCursorBulletAlpha(double cursorBulletAlpha) {
        this.cursorBulletAlpha = cursorBulletAlpha;
    }
    public Double getCursorBulletAlpha() {
        return cursorBulletAlpha;
    }

    /**
     * Path to the image of custom bullet.
     **/
    public void setCustomBullet(String customBullet) {
        this.customBullet = customBullet;
    }
    public String getCustomBullet() {
        return customBullet;
    }

    /**
     * Name of the custom bullet field in your dataProvider.
     **/
    public void setCustomBulletField(String customBulletField) {
        this.customBulletField = customBulletField;
    }
    public String getCustomBulletField() {
        return customBulletField;
    }

    /**
     * Path to the image for legend marker.
     **/
    public void setCustomMarker(String customMarker) {
        this.customMarker = customMarker;
    }
    public String getCustomMarker() {
        return customMarker;
    }

    /**
     * Dash length. If you set it to a value greater than 0, the graph line (or columns
     * border) will be dashed.
     **/
    public void setDashLength(double dashLength) {
        this.dashLength = dashLength;
    }
    public Double getDashLength() {
        return dashLength;
    }

    /**
     * Name of the dash length field in your dataProvider. This property adds a possibility
     * to change graphs’ line from solid to dashed on any data point. You can also make
     * columns border dashed using this setting.
     **/
    public void setDashLengthField(String dashLengthField) {
        this.dashLengthField = dashLengthField;
    }
    public String getDashLengthField() {
        return dashLengthField;
    }

    /**
     * Name of the description field in your dataProvider.
     **/
    public void setDescriptionField(String descriptionField) {
        this.descriptionField = descriptionField;
    }
    public String getDescriptionField() {
        return descriptionField;
    }

    /**
     * Name of error value field in your data provider.
     **/
    public void setErrorField(String errorField) {
        this.errorField = errorField;
    }
    public String getErrorField() {
        return errorField;
    }

    /**
     * Opacity of fill. Plural form is used to keep the same property names as our Flex
     * charts'. Flex charts can accept array of numbers to generate gradients. Although
     * you can set array here, only first value of this array will be used.
     **/
    public void setFillAlphas(double fillAlphas) {
        this.fillAlphas = fillAlphas;
    }
    public Double getFillAlphas() {
        return fillAlphas;
    }

    /**
     *      *Fill color. Will use lineColor if not set. You can also set array of colors here.
     **/
    public void setFillColors(Color fillColors) {
        this.fillColors = fillColors;
    }
    public Color getFillColors() {
        return fillColors;
    }

    /**
     * Name of the fill colors field in your dataProvider. This property adds a possibility
     * to change line graphs’ fill color on any data point to create highlighted sections
     * of the graph.
     **/
    public void setFillColorsField(String fillColorsField) {
        this.fillColorsField = fillColorsField;
    }
    public String getFillColorsField() {
        return fillColorsField;
    }

    /**
     * You can set another graph here and if fillAlpha is >0, the area from this graph to
     * fillToGraph will be filled (instead of filling the area to the X axis).
     **/
    public void setFillToGraph(AmGraph fillToGraph) {
        this.fillToGraph = fillToGraph;
    }
    public AmGraph getFillToGraph() {
        return fillToGraph;
    }

    /**
     * Size of value labels text. Will use chart's fontSize if not set.
     **/
    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }
    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Orientation of the gradient fills (only for "column" graph type). Possible values
     * are "vertical" and "horizontal".
     **/
    public void setGradientOrientation(String gradientOrientation) {
        this.gradientOrientation = gradientOrientation;
    }
    public String getGradientOrientation() {
        return gradientOrientation;
    }

    /**
     * Specifies whether the graph is hidden. Do not use this to show/hide the graph, use
     * hideGraph(graph) and showGraph(graph) methods instead.
     **/
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
    public boolean isHidden() {
        return hidden;
    }

    /**
     * If there are more data points than hideBulletsCount, the bullets will not be shown.
     * 0 means the bullets will always be visible.
     **/
    public void setHideBulletsCount(double hideBulletsCount) {
        this.hideBulletsCount = hideBulletsCount;
    }
    public Double getHideBulletsCount() {
        return hideBulletsCount;
    }

    /**
     * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
     **/
    public void setHighField(String highField) {
        this.highField = highField;
    }
    public String getHighField() {
        return highField;
    }

    /**
     * Unique id of a graph. It is not required to set one, unless you want to use this
     * graph for as your scrollbar's graph and need to indicate which graph should be used.
     **/
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    /**
     * Whether to include this graph when calculating min and max value of the axis.
     **/
    public void setIncludeInMinMax(boolean includeInMinMax) {
        this.includeInMinMax = includeInMinMax;
    }
    public boolean isIncludeInMinMax() {
        return includeInMinMax;
    }

    /**
     * Name of label color field in data provider.
     **/
    public void setLabelColorField(String labelColorField) {
        this.labelColorField = labelColorField;
    }
    public String getLabelColorField() {
        return labelColorField;
    }

    /**
     * Position of value label. Possible values are: "bottom", "top", "right", "left", "inside",
     * "middle". Sometimes position is changed by the chart, depending on a graph type,
     * rotation, etc.
     **/
    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }
    public String getLabelPosition() {
        return labelPosition;
    }

    /**
     * Value label text. You can use tags like [[value]], [[description]], [[percents]],
     * [[open]], [[category]].
     **/
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }
    public String getLabelText() {
        return labelText;
    }

    /**
     * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
     **/
    public void setLegendAlpha(double legendAlpha) {
        this.legendAlpha = legendAlpha;
    }
    public Double getLegendAlpha() {
        return legendAlpha;
    }

    /**
     * Legend marker color. Will use lineColor if not set.
     **/
    public void setLegendColor(Color legendColor) {
        this.legendColor = legendColor;
    }
    public Color getLegendColor() {
        return legendColor;
    }

    /**
     * The text which will be displayed in the value portion of the legend when user is
     * not hovering above any data point. The tags should be made out of two parts - the
     * name of a field (value / open / close / high / low) and the value of the period you
     * want to be show - open / close / high / low / sum / average / count. For example:
     * [[value.sum]] means that sum of all data points of value field in the selected period
     * will be displayed.
     **/
    public void setLegendPeriodValueText(String legendPeriodValueText) {
        this.legendPeriodValueText = legendPeriodValueText;
    }
    public String getLegendPeriodValueText() {
        return legendPeriodValueText;
    }

    /**
     * Legend value text. You can use tags like [[value]], [[description]], [[percents]],
     * [[open]], [[category]] You can also use custom fields from your dataProvider. If
     * not set, uses Legend's valueText.
     **/
    public void setLegendValueText(String legendValueText) {
        this.legendValueText = legendValueText;
    }
    public String getLegendValueText() {
        return legendValueText;
    }

    /**
     * Opacity of the line (or column border). Value range is 0 - 1.
     **/
    public void setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
    }
    public Double getLineAlpha() {
        return lineAlpha;
    }

    /**
     *      *Color of the line (or column border). If you do not set any, the color from [[AmCoordinateChart
     **/
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    public Color getLineColor() {
        return lineColor;
    }

    /**
     * Name of the line color field in your dataProvider. This property adds a possibility
     * to change graphs’ line color on any data point to create highlighted sections of
     * the graph.
     **/
    public void setLineColorField(String lineColorField) {
        this.lineColorField = lineColorField;
    }
    public String getLineColorField() {
        return lineColorField;
    }

    /**
     * Specifies thickness of the graph line (or column border).
     **/
    public void setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
    }
    public Double getLineThickness() {
        return lineThickness;
    }

    /**
     * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
     **/
    public void setLowField(String lowField) {
        this.lowField = lowField;
    }
    public String getLowField() {
        return lowField;
    }

    /**
     * Legend marker type. You can set legend marker (key) type for individual graphs. Possible
     * values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown,
     * bubble, line, none.
     **/
    public void setMarkerType(String markerType) {
        this.markerType = markerType;
    }
    public String getMarkerType() {
        return markerType;
    }

    /**
     * Specifies size of the bullet which value is the biggest (XY chart).
     **/
    public void setMaxBulletSize(double maxBulletSize) {
        this.maxBulletSize = maxBulletSize;
    }
    public Double getMaxBulletSize() {
        return maxBulletSize;
    }

    /**
     * Specifies minimum size of the bullet (XY chart).
     **/
    public void setMinBulletSize(double minBulletSize) {
        this.minBulletSize = minBulletSize;
    }
    public Double getMinBulletSize() {
        return minBulletSize;
    }

    /**
     * It is useful if you have really lots of data points. Based on this property the graph
     * will omit some of the lines (if the distance between points is less that minDistance,
     * in pixels). This will not affect the bullets or indicator in anyway, so the user
     * will not see any difference (unless you set minValue to a bigger value, let say 5),
     * but will increase performance as less lines will be drawn. By setting value to a
     * bigger number you can also make your lines look less jagged.
     **/
    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }
    public Double getMinDistance() {
        return minDistance;
    }

    /**
     * If you use different colors for your negative values, a graph below zero line is
     * filled with negativeColor. With this property you can define a different base value
     * at which colors should be changed to negative colors.
     **/
    public void setNegativeBase(double negativeBase) {
        this.negativeBase = negativeBase;
    }
    public Double getNegativeBase() {
        return negativeBase;
    }

    /**
     * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
     **/
    public void setNegativeFillAlphas(double negativeFillAlphas) {
        this.negativeFillAlphas = negativeFillAlphas;
    }
    public Double getNegativeFillAlphas() {
        return negativeFillAlphas;
    }

    /**
     * Fill color of negative part of the graph. Will use fillColors if not set.
     **/
    public void setNegativeFillColors(Color negativeFillColors) {
        this.negativeFillColors = negativeFillColors;
    }
    public Color getNegativeFillColors() {
        return negativeFillColors;
    }

    /**
     * Opacity of the negative portion of the line (or column border). Value range is 0
     * - 1.
     **/
    public void setNegativeLineAlpha(double negativeLineAlpha) {
        this.negativeLineAlpha = negativeLineAlpha;
    }
    public Double getNegativeLineAlpha() {
        return negativeLineAlpha;
    }

    /**
     * Color of the line (or column) when the values are negative. In case the graph type
     * is candlestick or ohlc, negativeLineColor is used when close value is less then open
     * value.
     **/
    public void setNegativeLineColor(Color negativeLineColor) {
        this.negativeLineColor = negativeLineColor;
    }
    public Color getNegativeLineColor() {
        return negativeLineColor;
    }

    /**
     * If you set it to true, column chart will begin new stack. This allows having Clustered
     * and Stacked column/bar chart.
     **/
    public void setNewStack(boolean newStack) {
        this.newStack = newStack;
    }
    public boolean isNewStack() {
        return newStack;
    }

    /**
     * In case you want to have a step line graph without risers, you should set this to
     * true.
     **/
    public void setNoStepRisers(boolean noStepRisers) {
        this.noStepRisers = noStepRisers;
    }
    public boolean isNoStepRisers() {
        return noStepRisers;
    }

    /**
     * Name of the open field (used by floating columns, candlesticks and ohlc) in your
     * dataProvider.
     **/
    public void setOpenField(String openField) {
        this.openField = openField;
    }
    public String getOpenField() {
        return openField;
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
    public void setPattern(Object pattern) {
        this.pattern = pattern;
    }
    public Object getPattern() {
        return pattern;
    }

    /**
     * Field name in your data provider which holds pattern information. Value of pattern
     * should be object with url, width, height of an image, optionally it might have x,
     * y, randomX and randomY values. For example: {"url":"../amcharts/patterns/black/pattern1.png",
     * "width":4, "height":4}. Check amcharts/patterns folder for some patterns. You can
     * create your own patterns and use them. Note, x, y, randomX and randomY properties
     * won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns.
     **/
    public void setPatternField(String patternField) {
        this.patternField = patternField;
    }
    public String getPatternField() {
        return patternField;
    }

    /**
     * This property can be used by step graphs - you can set how many periods one horizontal
     * line should span.
     **/
    public void setPeriodSpan(double periodSpan) {
        this.periodSpan = periodSpan;
    }
    public Double getPeriodSpan() {
        return periodSpan;
    }

    /**
     * Specifies where data points should be placed - on the beginning of the period (day,
     * hour, etc) or in the middle (only when parseDates property of categoryAxis is set
     * to true). This setting affects Serial chart only. Possible values are "start", "middle"
     * and "end"
     **/
    public void setPointPosition(String pointPosition) {
        this.pointPosition = pointPosition;
    }
    public String getPointPosition() {
        return pointPosition;
    }

    /**
     * Precision of values. Will use chart's precision if not set any.
     **/
    public void setPrecision(double precision) {
        this.precision = precision;
    }
    public Double getPrecision() {
        return precision;
    }

    /**
     * If graph's type is column and labelText is set, graph hides labels which do not fit
     * into the column's space. If you don't want these labels to be hidden, set this to
     * true.
     **/
    public void setShowAllValueLabels(boolean showAllValueLabels) {
        this.showAllValueLabels = showAllValueLabels;
    }
    public boolean isShowAllValueLabels() {
        return showAllValueLabels;
    }

    /**
     * Specifies whether the value balloon of this graph is shown when mouse is over data
     * item or chart's indicator is over some series.
     **/
    public void setShowBalloon(boolean showBalloon) {
        this.showBalloon = showBalloon;
    }
    public boolean isShowBalloon() {
        return showBalloon;
    }

    /**
     * Specifies graphs value at which cursor is showed. This is only important for candlestick
     * and ohlc charts, also if column chart has "open" value. Possible values are: "open",
     * "close", "high", "low".
     **/
    public void setShowBalloonAt(String showBalloonAt) {
        this.showBalloonAt = showBalloonAt;
    }
    public String getShowBalloonAt() {
        return showBalloonAt;
    }

    /**
     * Works with candlestick graph type, you can set it to open, close, high, low. If you
     * set it to high, the events will be shown at the tip of the high line.
     **/
    public void setShowBulletsAt(String showBulletsAt) {
        this.showBulletsAt = showBulletsAt;
    }
    public String getShowBulletsAt() {
        return showBulletsAt;
    }

    /**
     * If you want mouse pointer to change to hand when hovering the graph, set this property
     * to true.
     **/
    public void setShowHandOnHover(boolean showHandOnHover) {
        this.showHandOnHover = showHandOnHover;
    }
    public boolean isShowHandOnHover() {
        return showHandOnHover;
    }

    /**
     * If the value axis of this graph has stack types like "regular" or "100%" You can
     * exclude this graph from stacking.
     **/
    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }
    public boolean isStackable() {
        return stackable;
    }

    /**
     * Graph title.
     **/
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    /**
     * Type of the graph. Possible values are: "line", "column", "step", "smoothedLine",
     * "candlestick", "ohlc". XY and Radar charts can only display "line" type graphs.
     **/
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    /**
     * Name of the url field in your dataProvider.
     **/
    public void setUrlField(String urlField) {
        this.urlField = urlField;
    }
    public String getUrlField() {
        return urlField;
    }

    /**
     * Target to open URLs in, i.e. _blank, _top, etc.
     **/
    public void setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
    }
    public String getUrlTarget() {
        return urlTarget;
    }

    /**
     * Specifies which value axis the graph will use. Will use the first value axis if not
     * set. You can use reference to the real ValueAxis object or set value axis id.
     **/
    public void setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
    }
    public ValueAxis getValueAxis() {
        return valueAxis;
    }

    /**
     * Name of the value field in your dataProvider.
     **/
    public void setValueField(String valueField) {
        this.valueField = valueField;
    }
    public String getValueField() {
        return valueField;
    }

    /**
     * Specifies whether this graph should be shown in the Legend.
     **/
    public void setVisibleInLegend(boolean visibleInLegend) {
        this.visibleInLegend = visibleInLegend;
    }
    public boolean isVisibleInLegend() {
        return visibleInLegend;
    }

    /**
     * XY chart only. A horizontal value axis object to attach graph to.
     **/
    public void setXAxis(ValueAxis xAxis) {
        this.xAxis = xAxis;
    }
    public ValueAxis getXAxis() {
        return xAxis;
    }

    /**
     * XY chart only. Name of the x field in your dataProvider.
     **/
    public void setXField(String xField) {
        this.xField = xField;
    }
    public String getXField() {
        return xField;
    }

    /**
     * XY chart only. A vertical value axis object to attach graph to.
     **/
    public void setYAxis(ValueAxis yAxis) {
        this.yAxis = yAxis;
    }
    public ValueAxis getYAxis() {
        return yAxis;
    }

    /**
     * XY chart only. Name of the y field in your dataProvider.
     **/
    public void setYField(String yField) {
        this.yField = yField;
    }
    public String getYField() {
        return yField;
    }

}