package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;

public class AmGraph implements Serializable {
    private String alphaField;
    private Boolean animationPlayed;
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
     * Name of the alpha field in your dataProvider.
     */
    public AmGraph setAlphaField(String alphaField) {
        this.alphaField = alphaField;
        return this;
    }

    public String getAlphaField() {
        return alphaField;
    }

    /**
     * If you set this to true before chart is drawn, the animation of this graph won't
     * be played.
     */
    public AmGraph setAnimationPlayed(boolean animationPlayed) {
        this.animationPlayed = animationPlayed;
        return this;
    }

    public Boolean getAnimationPlayed() {
        return animationPlayed;
    }

    /**
     * Value balloon color. Will use graph or data item color if not set.
     */
    public AmGraph setBalloonColor(Color balloonColor) {
        this.balloonColor = balloonColor;
        return this;
    }

    public Color getBalloonColor() {
        return balloonColor;
    }

    /**
     * Balloon text. You can use tags like [[value]], [[description]], [[percents]], [[open]],
     * [[category]] or any other field name from your data provider. HTML tags can also
     * be used.
     */
    public AmGraph setBalloonText(String balloonText) {
        this.balloonText = balloonText;
        return this;
    }

    public String getBalloonText() {
        return balloonText;
    }

    /**
     * Specifies if the line graph should be placed behind column graphs
     */
    public AmGraph setBehindColumns(boolean behindColumns) {
        this.behindColumns = behindColumns;
        return this;
    }

    public Boolean getBehindColumns() {
        return behindColumns;
    }

    /**
     * Type of the bullets. Possible values are: "none", "round", "square", "triangleUp",
     * "triangleDown", "triangleLeft", "triangleRight", "bubble", "diamond", "xError", "yError"
     * and "custom".
     */
    public AmGraph setBullet(String bullet) {
        this.bullet = bullet;
        return this;
    }

    public String getBullet() {
        return bullet;
    }

    /**
     * Opacity of bullets. Value range is 0 - 1.
     */
    public AmGraph setBulletAlpha(double bulletAlpha) {
        this.bulletAlpha = bulletAlpha;
        return this;
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
     */
    public AmGraph setBulletAxis(ValueAxis bulletAxis) {
        this.bulletAxis = bulletAxis;
        return this;
    }

    public ValueAxis getBulletAxis() {
        return bulletAxis;
    }

    /**
     * Bullet border opacity.
     */
    public AmGraph setBulletBorderAlpha(double bulletBorderAlpha) {
        this.bulletBorderAlpha = bulletBorderAlpha;
        return this;
    }

    public Double getBulletBorderAlpha() {
        return bulletBorderAlpha;
    }

    /**
     * Bullet border color. Will use lineColor if not set.
     */
    public AmGraph setBulletBorderColor(Color bulletBorderColor) {
        this.bulletBorderColor = bulletBorderColor;
        return this;
    }

    public Color getBulletBorderColor() {
        return bulletBorderColor;
    }

    /**
     * Bullet border thickness.
     */
    public AmGraph setBulletBorderThickness(double bulletBorderThickness) {
        this.bulletBorderThickness = bulletBorderThickness;
        return this;
    }

    public Double getBulletBorderThickness() {
        return bulletBorderThickness;
    }

    /**
     * Bullet color. Will use lineColor if not set.
     */
    public AmGraph setBulletColor(Color bulletColor) {
        this.bulletColor = bulletColor;
        return this;
    }

    public Color getBulletColor() {
        return bulletColor;
    }

    /**
     * Name of the bullet field in your dataProvider.
     */
    public AmGraph setBulletField(String bulletField) {
        this.bulletField = bulletField;
        return this;
    }

    public String getBulletField() {
        return bulletField;
    }

    /**
     * Bullet offset. Distance from the actual data point to the bullet. Can be used to
     * place custom bullets above the columns.
     */
    public AmGraph setBulletOffset(double bulletOffset) {
        this.bulletOffset = bulletOffset;
        return this;
    }

    public Double getBulletOffset() {
        return bulletOffset;
    }

    /**
     * Bullet size.
     */
    public AmGraph setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
        return this;
    }

    public Double getBulletSize() {
        return bulletSize;
    }

    /**
     * Name of the bullet size field in your dataProvider.
     */
    public AmGraph setBulletSizeField(String bulletSizeField) {
        this.bulletSizeField = bulletSizeField;
        return this;
    }

    public String getBulletSizeField() {
        return bulletSizeField;
    }

    /**
     * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
     */
    public AmGraph setCloseField(String closeField) {
        this.closeField = closeField;
        return this;
    }

    public String getCloseField() {
        return closeField;
    }

    /**
     * In case you want to place this graph's columns in front of other columns, set this
     * to false. In case "true", the columns will be clustered next to each other.
     */
    public AmGraph setClustered(boolean clustered) {
        this.clustered = clustered;
        return this;
    }

    public Boolean getClustered() {
        return clustered;
    }

    /**
     * Color of value labels. Will use chart's color if not set.
     */
    public AmGraph setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Name of the color field in your dataProvider.
     */
    public AmGraph setColorField(String colorField) {
        this.colorField = colorField;
        return this;
    }

    public String getColorField() {
        return colorField;
    }

    /**
     * You can specify custom column width for each graph individually. Value range is 0
     * - 1 (we set relative width, not pixel width here).
     */
    public AmGraph setColumnWidth(double columnWidth) {
        this.columnWidth = columnWidth;
        return this;
    }

    public Double getColumnWidth() {
        return columnWidth;
    }

    /**
     * Specifies whether to connect data points if data is missing. The default value is
     * true. This feature does not work with XY chart.
     */
    public AmGraph setConnect(boolean connect) {
        this.connect = connect;
        return this;
    }

    public Boolean getConnect() {
        return connect;
    }

    /**
     * Corner radius of column. It can be set both in pixels or in percents. The chart's
     * depth and angle styles must be set to 0. The default value is 0. Note, cornerRadiusTop
     * will be applied for all corners of the column, JavaScript charts do not have a possibility
     * to set separate corner radius for top and bottom. As we want all the property names
     * to be the same both on JS and Flex, we didn't change this too.
     */
    public AmGraph setCornerRadiusTop(double cornerRadiusTop) {
        this.cornerRadiusTop = cornerRadiusTop;
        return this;
    }

    public Double getCornerRadiusTop() {
        return cornerRadiusTop;
    }

    /**
     * If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor.
     * You can set opacity of each graphs bullet. In case you want to disable these bullets
     * for a certain graph, set opacity to 0.
     */
    public AmGraph setCursorBulletAlpha(double cursorBulletAlpha) {
        this.cursorBulletAlpha = cursorBulletAlpha;
        return this;
    }

    public Double getCursorBulletAlpha() {
        return cursorBulletAlpha;
    }

    /**
     * Path to the image of custom bullet.
     */
    public AmGraph setCustomBullet(String customBullet) {
        this.customBullet = customBullet;
        return this;
    }

    public String getCustomBullet() {
        return customBullet;
    }

    /**
     * Name of the custom bullet field in your dataProvider.
     */
    public AmGraph setCustomBulletField(String customBulletField) {
        this.customBulletField = customBulletField;
        return this;
    }

    public String getCustomBulletField() {
        return customBulletField;
    }

    /**
     * Path to the image for legend marker.
     */
    public AmGraph setCustomMarker(String customMarker) {
        this.customMarker = customMarker;
        return this;
    }

    public String getCustomMarker() {
        return customMarker;
    }

    /**
     * Dash length. If you set it to a value greater than 0, the graph line (or columns
     * border) will be dashed.
     */
    public AmGraph setDashLength(double dashLength) {
        this.dashLength = dashLength;
        return this;
    }

    public Double getDashLength() {
        return dashLength;
    }

    /**
     * Name of the dash length field in your dataProvider. This property adds a possibility
     * to change graphs’ line from solid to dashed on any data point. You can also make
     * columns border dashed using this setting.
     */
    public AmGraph setDashLengthField(String dashLengthField) {
        this.dashLengthField = dashLengthField;
        return this;
    }

    public String getDashLengthField() {
        return dashLengthField;
    }

    /**
     * Used to format balloons if value axis is date-based.
     */
    public AmGraph setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Name of the description field in your dataProvider.
     */
    public AmGraph setDescriptionField(String descriptionField) {
        this.descriptionField = descriptionField;
        return this;
    }

    public String getDescriptionField() {
        return descriptionField;
    }

    /**
     * Name of error value field in your data provider.
     */
    public AmGraph setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }

    public String getErrorField() {
        return errorField;
    }

    /**
     * Opacity of fill. Plural form is used to keep the same property names as our Flex
     * charts'. Flex charts can accept array of numbers to generate gradients. Although
     * you can set array here, only first value of this array will be used.
     */
    public AmGraph setFillAlphas(double fillAlphas) {
        this.fillAlphas = fillAlphas;
        return this;
    }

    public Double getFillAlphas() {
        return fillAlphas;
    }

    /**
     * *Fill color. Will use lineColor if not set. You can also set array of colors here.
     */
    public AmGraph setFillColors(Color fillColors) {
        this.fillColors = fillColors;
        return this;
    }

    public Color getFillColors() {
        return fillColors;
    }

    /**
     * Name of the fill colors field in your dataProvider. This property adds a possibility
     * to change line graphs’ fill color on any data point to create highlighted sections
     * of the graph. Works only with AmSerialChart.
     */
    public AmGraph setFillColorsField(String fillColorsField) {
        this.fillColorsField = fillColorsField;
        return this;
    }

    public String getFillColorsField() {
        return fillColorsField;
    }

    /**
     * XY chart only. If you set this property to id or reference of your X or Y axis, and
     * the fillAlphas is > 0, the area between graph and axis will be filled with color,
     * like in this demo.
     */
    public AmGraph setFillToAxis(ValueAxis fillToAxis) {
        this.fillToAxis = fillToAxis;
        return this;
    }

    public ValueAxis getFillToAxis() {
        return fillToAxis;
    }

    /**
     * You can set another graph here and if fillAlpha is >0, the area from this graph to
     * fillToGraph will be filled (instead of filling the area to the X axis). This feature
     * is not supported by smoothedLine graphs and Radar chart.
     */
    public AmGraph setFillToGraph(AmGraph fillToGraph) {
        this.fillToGraph = fillToGraph;
        return this;
    }

    public AmGraph getFillToGraph() {
        return fillToGraph;
    }

    /**
     * Column width in pixels. If you set this property, columns will be of a fixed width
     * and won't adjust to the available space.
     */
    public AmGraph setFixedColumnWidth(double fixedColumnWidth) {
        this.fixedColumnWidth = fixedColumnWidth;
        return this;
    }

    public Double getFixedColumnWidth() {
        return fixedColumnWidth;
    }

    /**
     * Size of value labels text. Will use chart's fontSize if not set.
     */
    public AmGraph setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * Name of the gap field in your dataProvider. You can force graph to show gap at a
     * desired data point using this feature. This feature does not work with XY chart.
     */
    public AmGraph setGapField(String gapField) {
        this.gapField = gapField;
        return this;
    }

    public String getGapField() {
        return gapField;
    }

    /**
     * Using this property you can specify when graph should display gap - if the time difference
     * between data points is bigger than duration of minPeriod * gapPeriod, and connect
     * property of a graph is set to false, graph will display gap.
     */
    public AmGraph setGapPeriod(double gapPeriod) {
        this.gapPeriod = gapPeriod;
        return this;
    }

    public Double getGapPeriod() {
        return gapPeriod;
    }

    /**
     * Orientation of the gradient fills (only for "column" graph type). Possible values
     * are "vertical" and "horizontal".
     */
    public AmGraph setGradientOrientation(String gradientOrientation) {
        this.gradientOrientation = gradientOrientation;
        return this;
    }

    public String getGradientOrientation() {
        return gradientOrientation;
    }

    /**
     * Specifies whether the graph is hidden. Do not use this to show/hide the graph, use
     * hideGraph(graph) and showGraph(graph) methods instead.
     */
    public AmGraph setHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public Boolean getHidden() {
        return hidden;
    }

    /**
     * If there are more data points than hideBulletsCount, the bullets will not be shown.
     * 0 means the bullets will always be visible.
     */
    public AmGraph setHideBulletsCount(double hideBulletsCount) {
        this.hideBulletsCount = hideBulletsCount;
        return this;
    }

    public Double getHideBulletsCount() {
        return hideBulletsCount;
    }

    /**
     * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
     */
    public AmGraph setHighField(String highField) {
        this.highField = highField;
        return this;
    }

    public String getHighField() {
        return highField;
    }

    /**
     * Unique id of a graph. It is not required to set one, unless you want to use this
     * graph for as your scrollbar's graph and need to indicate which graph should be used.
     */
    public AmGraph setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    /**
     * Whether to include this graph when calculating min and max value of the axis.
     */
    public AmGraph setIncludeInMinMax(boolean includeInMinMax) {
        this.includeInMinMax = includeInMinMax;
        return this;
    }

    public Boolean getIncludeInMinMax() {
        return includeInMinMax;
    }

    /**
     * Data label text anchor.
     */
    public AmGraph setLabelAnchor(String labelAnchor) {
        this.labelAnchor = labelAnchor;
        return this;
    }

    public String getLabelAnchor() {
        return labelAnchor;
    }

    /**
     * Name of label color field in data provider.
     */
    public AmGraph setLabelColorField(String labelColorField) {
        this.labelColorField = labelColorField;
        return this;
    }

    public String getLabelColorField() {
        return labelColorField;
    }

    /**
     * Offset of data label.
     */
    public AmGraph setLabelOffset(double labelOffset) {
        this.labelOffset = labelOffset;
        return this;
    }

    public Double getLabelOffset() {
        return labelOffset;
    }

    /**
     * Position of value label. Possible values are: "bottom", "top", "right", "left", "inside",
     * "middle". Sometimes position is changed by the chart, depending on a graph type,
     * rotation, etc.
     */
    public AmGraph setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
        return this;
    }

    public String getLabelPosition() {
        return labelPosition;
    }

    /**
     * Rotation of a data label.
     */
    public AmGraph setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
        return this;
    }

    public Double getLabelRotation() {
        return labelRotation;
    }

    /**
     * Value label text. You can use tags like [[value]], [[description]], [[percents]],
     * [[open]], [[category]].
     */
    public AmGraph setLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    public String getLabelText() {
        return labelText;
    }

    /**
     * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
     */
    public AmGraph setLegendAlpha(double legendAlpha) {
        this.legendAlpha = legendAlpha;
        return this;
    }

    public Double getLegendAlpha() {
        return legendAlpha;
    }

    /**
     * Legend marker color. Will use lineColor if not set.
     */
    public AmGraph setLegendColor(Color legendColor) {
        this.legendColor = legendColor;
        return this;
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
     */
    public AmGraph setLegendPeriodValueText(String legendPeriodValueText) {
        this.legendPeriodValueText = legendPeriodValueText;
        return this;
    }

    public String getLegendPeriodValueText() {
        return legendPeriodValueText;
    }

    /**
     * Legend value text. You can use tags like [[value]], [[description]], [[percents]],
     * [[open]], [[category]] You can also use custom fields from your dataProvider. If
     * not set, uses Legend's valueText.
     */
    public AmGraph setLegendValueText(String legendValueText) {
        this.legendValueText = legendValueText;
        return this;
    }

    public String getLegendValueText() {
        return legendValueText;
    }

    /**
     * Opacity of the line (or column border). Value range is 0 - 1.
     */
    public AmGraph setLineAlpha(double lineAlpha) {
        this.lineAlpha = lineAlpha;
        return this;
    }

    public Double getLineAlpha() {
        return lineAlpha;
    }

    /**
     * Color of the line (or column border). If you do not set any, the color from AmCoordinateChart.colors
     * array will be used for each subsequent graph.
     */
    public AmGraph setLineColor(Color lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Color getLineColor() {
        return lineColor;
    }

    /**
     * Name of the line color field in your dataProvider. This property adds a possibility
     * to change graphs’ line color on any data point to create highlighted sections of
     * the graph. Works only with AmSerialChart.
     */
    public AmGraph setLineColorField(String lineColorField) {
        this.lineColorField = lineColorField;
        return this;
    }

    public String getLineColorField() {
        return lineColorField;
    }

    /**
     * Specifies thickness of the graph line (or column border).
     */
    public AmGraph setLineThickness(double lineThickness) {
        this.lineThickness = lineThickness;
        return this;
    }

    public Double getLineThickness() {
        return lineThickness;
    }

    /**
     * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
     */
    public AmGraph setLowField(String lowField) {
        this.lowField = lowField;
        return this;
    }

    public String getLowField() {
        return lowField;
    }

    /**
     * Legend marker type. You can set legend marker (key) type for individual graphs. Possible
     * values are: square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown,
     * bubble, line, none.
     */
    public AmGraph setMarkerType(String markerType) {
        this.markerType = markerType;
        return this;
    }

    public String getMarkerType() {
        return markerType;
    }

    /**
     * Specifies size of the bullet which value is the biggest (XY chart).
     */
    public AmGraph setMaxBulletSize(double maxBulletSize) {
        this.maxBulletSize = maxBulletSize;
        return this;
    }

    public Double getMaxBulletSize() {
        return maxBulletSize;
    }

    /**
     * Specifies minimum size of the bullet (XY chart).
     */
    public AmGraph setMinBulletSize(double minBulletSize) {
        this.minBulletSize = minBulletSize;
        return this;
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
     */
    public AmGraph setMinDistance(double minDistance) {
        this.minDistance = minDistance;
        return this;
    }

    public Double getMinDistance() {
        return minDistance;
    }

    /**
     * If you use different colors for your negative values, a graph below zero line is
     * filled with negativeColor. With this property you can define a different base value
     * at which colors should be changed to negative colors.
     */
    public AmGraph setNegativeBase(double negativeBase) {
        this.negativeBase = negativeBase;
        return this;
    }

    public Double getNegativeBase() {
        return negativeBase;
    }

    /**
     * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
     */
    public AmGraph setNegativeFillAlphas(double negativeFillAlphas) {
        this.negativeFillAlphas = negativeFillAlphas;
        return this;
    }

    public Double getNegativeFillAlphas() {
        return negativeFillAlphas;
    }

    /**
     * Fill color of negative part of the graph. Will use fillColors if not set.
     */
    public AmGraph setNegativeFillColors(Color negativeFillColors) {
        this.negativeFillColors = negativeFillColors;
        return this;
    }

    public Color getNegativeFillColors() {
        return negativeFillColors;
    }

    /**
     * Opacity of the negative portion of the line (or column border). Value range is 0
     * - 1.
     */
    public AmGraph setNegativeLineAlpha(double negativeLineAlpha) {
        this.negativeLineAlpha = negativeLineAlpha;
        return this;
    }

    public Double getNegativeLineAlpha() {
        return negativeLineAlpha;
    }

    /**
     * Color of the line (or column) when the values are negative. In case the graph type
     * is candlestick or ohlc, negativeLineColor is used when close value is less then open
     * value.
     */
    public AmGraph setNegativeLineColor(Color negativeLineColor) {
        this.negativeLineColor = negativeLineColor;
        return this;
    }

    public Color getNegativeLineColor() {
        return negativeLineColor;
    }

    /**
     * If you set it to true, column chart will begin new stack. This allows having Clustered
     * and Stacked column/bar chart.
     */
    public AmGraph setNewStack(boolean newStack) {
        this.newStack = newStack;
        return this;
    }

    public Boolean getNewStack() {
        return newStack;
    }

    /**
     * In case you want to have a step line graph without risers, you should set this to
     * true.
     */
    public AmGraph setNoStepRisers(boolean noStepRisers) {
        this.noStepRisers = noStepRisers;
        return this;
    }

    public Boolean getNoStepRisers() {
        return noStepRisers;
    }

    /**
     * Name of the open field (used by floating columns, candlesticks and ohlc) in your
     * dataProvider.
     */
    public AmGraph setOpenField(String openField) {
        this.openField = openField;
        return this;
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
     */
    public AmGraph setPattern(Object pattern) {
        this.pattern = pattern;
        return this;
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
     */
    public AmGraph setPatternField(String patternField) {
        this.patternField = patternField;
        return this;
    }

    public String getPatternField() {
        return patternField;
    }

    /**
     * This property can be used by step graphs - you can set how many periods one horizontal
     * line should span.
     */
    public AmGraph setPeriodSpan(double periodSpan) {
        this.periodSpan = periodSpan;
        return this;
    }

    public Double getPeriodSpan() {
        return periodSpan;
    }

    /**
     * Specifies where data points should be placed - on the beginning of the period (day,
     * hour, etc) or in the middle (only when parseDates property of categoryAxis is set
     * to true). This setting affects Serial chart only. Possible values are "start", "middle"
     * and "end"
     */
    public AmGraph setPointPosition(String pointPosition) {
        this.pointPosition = pointPosition;
        return this;
    }

    public String getPointPosition() {
        return pointPosition;
    }

    /**
     * Precision of values. Will use chart's precision if not set any.
     */
    public AmGraph setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    public Double getPrecision() {
        return precision;
    }

    /**
     * If this is set to true, candlesticks will be colored in a different manner - if current
     * close is less than current open, the candlestick will be empty, otherwise - filled
     * with color. If previous close is less than current close, the candlestick will use
     * positive color, otherwise - negative color.
     */
    public AmGraph setProCandlesticks(boolean proCandlesticks) {
        this.proCandlesticks = proCandlesticks;
        return this;
    }

    public Boolean getProCandlesticks() {
        return proCandlesticks;
    }

    /**
     * Gantt chart only. Contains unmodified segment object from data provider.
     */
    public AmGraph setSegmentData(Object segmentData) {
        this.segmentData = segmentData;
        return this;
    }

    public Object getSegmentData() {
        return segmentData;
    }

    /**
     * If graph's type is column and labelText is set, graph hides labels which do not fit
     * into the column's space. If you don't want these labels to be hidden, set this to
     * true.
     */
    public AmGraph setShowAllValueLabels(boolean showAllValueLabels) {
        this.showAllValueLabels = showAllValueLabels;
        return this;
    }

    public Boolean getShowAllValueLabels() {
        return showAllValueLabels;
    }

    /**
     * Specifies whether the value balloon of this graph is shown when mouse is over data
     * item or chart's indicator is over some series.
     */
    public AmGraph setShowBalloon(boolean showBalloon) {
        this.showBalloon = showBalloon;
        return this;
    }

    public Boolean getShowBalloon() {
        return showBalloon;
    }

    /**
     * Specifies graphs value at which cursor is showed. This is only important for candlestick
     * and ohlc charts, also if column chart has "open" value. Possible values are: "open",
     * "close", "high", "low". "top" and "bottom" values will glue the balloon to top/bottom
     * of the plot area.
     */
    public AmGraph setShowBalloonAt(String showBalloonAt) {
        this.showBalloonAt = showBalloonAt;
        return this;
    }

    public String getShowBalloonAt() {
        return showBalloonAt;
    }

    /**
     * Works with candlestick graph type, you can set it to open, close, high, low. If you
     * set it to high, the events will be shown at the tip of the high line.
     */
    public AmGraph setShowBulletsAt(String showBulletsAt) {
        this.showBulletsAt = showBulletsAt;
        return this;
    }

    public String getShowBulletsAt() {
        return showBulletsAt;
    }

    /**
     * If you want mouse pointer to change to hand when hovering the graph, set this property
     * to true.
     */
    public AmGraph setShowHandOnHover(boolean showHandOnHover) {
        this.showHandOnHover = showHandOnHover;
        return this;
    }

    public Boolean getShowHandOnHover() {
        return showHandOnHover;
    }

    /**
     * It can only be used together with topRadius (when columns look like cylinders). If
     * you set it to true, the cylinder will be lowered down so that the center of it's
     * bottom circle would be right on category axis.
     */
    public AmGraph setShowOnAxis(boolean showOnAxis) {
        this.showOnAxis = showOnAxis;
        return this;
    }

    public Boolean getShowOnAxis() {
        return showOnAxis;
    }

    /**
     * If the value axis of this graph has stack types like "regular" or "100%" You can
     * exclude this graph from stacking.
     */
    public AmGraph setStackable(boolean stackable) {
        this.stackable = stackable;
        return this;
    }

    public Boolean getStackable() {
        return stackable;
    }

    /**
     * Step graph only. Specifies to which direction step should be drawn.
     */
    public AmGraph setStepDirection(String stepDirection) {
        this.stepDirection = stepDirection;
        return this;
    }

    public String getStepDirection() {
        return stepDirection;
    }

    /**
     * *If you set it to false, the graph will not be hidden when user clicks on legend entry.
     */
    public AmGraph setSwitchable(boolean switchable) {
        this.switchable = switchable;
        return this;
    }

    public Boolean getSwitchable() {
        return switchable;
    }

    /**
     * Graph title.
     */
    public AmGraph setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return title;
    }

    /**
     * If you set this to 1, columns will become cylinders (must set depth3D and angle properties
     * of a chart to >0 values in order this to be visible). you can make columns look like
     * cones (set topRadius to 0) or even like some glasses (set to bigger than 1). We strongly
     * recommend setting grid opacity to 0 in order this to look good.
     */
    public AmGraph setTopRadius(double topRadius) {
        this.topRadius = topRadius;
        return this;
    }

    public Double getTopRadius() {
        return topRadius;
    }

    /**
     * Type of the graph. Possible values are: "line", "column", "step", "smoothedLine",
     * "candlestick", "ohlc". XY and Radar charts can only display "line" type graphs.
     */
    public AmGraph setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    /**
     * Name of the url field in your dataProvider.
     */
    public AmGraph setUrlField(String urlField) {
        this.urlField = urlField;
        return this;
    }

    public String getUrlField() {
        return urlField;
    }

    /**
     * Target to open URLs in, i.e. _blank, _top, etc.
     */
    public AmGraph setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
        return this;
    }

    public String getUrlTarget() {
        return urlTarget;
    }

    /**
     * If set to true, the bullet border will take the same color as graph line.
     */
    public AmGraph setUseLineColorForBulletBorder(boolean useLineColorForBulletBorder) {
        this.useLineColorForBulletBorder = useLineColorForBulletBorder;
        return this;
    }

    public Boolean getUseLineColorForBulletBorder() {
        return useLineColorForBulletBorder;
    }

    /**
     * If negativeLineColor and/or negativeFillColors are set and useNegativeColorIfDown
     * is set to true (default is false), the line, step and column graphs will use these
     * colors for lines, bullets or columns if previous value is bigger than current value.
     * In case you set openField for the graph, the graph will compare current value with
     * openField value instead of comparing to previous value. Here is a demo.
     */
    public AmGraph setUseNegativeColorIfDown(boolean useNegativeColorIfDown) {
        this.useNegativeColorIfDown = useNegativeColorIfDown;
        return this;
    }

    public Boolean getUseNegativeColorIfDown() {
        return useNegativeColorIfDown;
    }

    /**
     * Specifies which value axis the graph will use. Will use the first value axis if not
     * set. You can use reference to the real ValueAxis object or set value axis id.
     */
    public AmGraph setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    public ValueAxis getValueAxis() {
        return valueAxis;
    }

    /**
     * Name of the value field in your dataProvider.
     */
    public AmGraph setValueField(String valueField) {
        this.valueField = valueField;
        return this;
    }

    public String getValueField() {
        return valueField;
    }

    /**
     * Specifies whether this graph should be shown in the Legend.
     */
    public AmGraph setVisibleInLegend(boolean visibleInLegend) {
        this.visibleInLegend = visibleInLegend;
        return this;
    }

    public Boolean getVisibleInLegend() {
        return visibleInLegend;
    }

    /**
     * XY chart only. A horizontal value axis object to attach graph to.
     */
    public AmGraph setXAxis(ValueAxis xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public ValueAxis getXAxis() {
        return xAxis;
    }

    /**
     * XY chart only. Name of the x field in your dataProvider.
     */
    public AmGraph setXField(String xField) {
        this.xField = xField;
        return this;
    }

    public String getXField() {
        return xField;
    }

    /**
     * XY chart only. A vertical value axis object to attach graph to.
     */
    public AmGraph setYAxis(ValueAxis yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public ValueAxis getYAxis() {
        return yAxis;
    }

    /**
     * XY chart only. Name of the y field in your dataProvider.
     */
    public AmGraph setYField(String yField) {
        this.yField = yField;
        return this;
    }

    public String getYField() {
        return yField;
    }

}