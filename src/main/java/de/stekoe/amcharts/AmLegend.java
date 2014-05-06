package de.stekoe.amcharts;

import java.util.List;
public class AmLegend {
    private String align;
    private Boolean autoMargins;
    private Double backgroundAlpha;
    private Color backgroundColor;
    private Double borderAlpha;
    private Color borderColor;
    private Double bottom;
    private Color color;
    private List<Object> data;
    private String divId;
    private Boolean equalWidths;
    private Double fontSize;
    private Double horizontalGap;
    private String labelText;
    private Double left;
    private Double marginBottom;
    private Double marginLeft;
    private Double marginRight;
    private Double marginTop;
    private Double markerBorderAlpha;
    private Color markerBorderColor;
    private Double markerBorderThickness;
    private Color markerDisabledColor;
    private Double markerLabelGap;
    private Double markerSize;
    private String markerType;
    private Double maxColumns;
    private String periodValueText;
    private String position;
    private Boolean reversedOrder;
    private Double right;
    private Color rollOverColor;
    private Double rollOverGraphAlpha;
    private Boolean showEntries;
    private Double spacing;
    private Boolean switchable;
    private Color switchColor;
    private String switchType;
    private Boolean textClickEnabled;
    private Double top;
    private Boolean useGraphSettings;
    private Boolean useMarkerColorForLabels;
    private Boolean useMarkerColorForValues;
    private String valueAlign;
    private String valueText;
    private Double valueWidth;
    private Double verticalGap;
    private Double width;

    /**
     * Alignment of legend entries. Possible values are: "left", "center", "right".
     **/
    public void setAlign(String align) {
        this.align = align;
    }
    public String getAlign() {
        return align;
    }

    /**
     * Used if chart is Serial or XY. In case true, margins of the legend are adjusted and
     * made equal to chart's margins.
     **/
    public void setAutoMargins(boolean autoMargins) {
        this.autoMargins = autoMargins;
    }
    public boolean isAutoMargins() {
        return autoMargins;
    }

    /**
     * Opacity of legend's background. Value range is 0 - 1
     **/
    public void setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
    }
    public Double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Background color. You should set backgroundAlpha to >0 vallue in order background
     * to be visible.
     **/
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public Color getBackgroundColor() {
        return backgroundColor;
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
     *      *Color of legend's border. You should set borderAlpha >0 in order border to be visible.
     **/
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * In case legend position is set to "absolute", you can set distance from bottom of
     * the chart, in pixels.
     **/
    public void setBottom(double bottom) {
        this.bottom = bottom;
    }
    public Double getBottom() {
        return bottom;
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
     * You can pass array of objects with title, color, markerType values, for example:
     * [{title: "One", color: "#3366CC"},{title: "Two", color: "#FFCC33"}]
     **/
    public void setData(List<Object> data) {
        this.data = data;
    }
    public List<Object> getData() {
        return data;
    }

    /**
     * You can set id of a div or a reference to div object in case you want the legend
     * to be placed in a separate container.
     **/
    public void setDivId(String divId) {
        this.divId = divId;
    }
    public String getDivId() {
        return divId;
    }

    /**
     * Specifies if each of legend entry should be equal to the most wide entry. Won't look
     * good if legend has more than one line.
     **/
    public void setEqualWidths(boolean equalWidths) {
        this.equalWidths = equalWidths;
    }
    public boolean isEqualWidths() {
        return equalWidths;
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
     * Horizontal space between legend item and left/right border.
     **/
    public void setHorizontalGap(double horizontalGap) {
        this.horizontalGap = horizontalGap;
    }
    public Double getHorizontalGap() {
        return horizontalGap;
    }

    /**
     * The text which will be displayed in the legend. Tag [[title]] will be replaced with
     * the title of the graph.
     **/
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }
    public String getLabelText() {
        return labelText;
    }

    /**
     * In case legend position is set to "absolute", you can set distance from left side
     * of the chart, in pixels.
     **/
    public void setLeft(double left) {
        this.left = left;
    }
    public Double getLeft() {
        return left;
    }

    /**
     * Bottom margin.
     **/
    public void setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
    }
    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Left margin. This property will be ignored if chart is Serial or XY and autoMargins
     * property of the legend is true (default).
     **/
    public void setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
    }
    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Right margin. This property will be ignored if chart is Serial or XY and autoMargins
     * property of the legend is true (default).
     **/
    public void setMarginRight(double marginRight) {
        this.marginRight = marginRight;
    }
    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Top margin.
     **/
    public void setMarginTop(double marginTop) {
        this.marginTop = marginTop;
    }
    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * Marker border opacity.
     **/
    public void setMarkerBorderAlpha(double markerBorderAlpha) {
        this.markerBorderAlpha = markerBorderAlpha;
    }
    public Double getMarkerBorderAlpha() {
        return markerBorderAlpha;
    }

    /**
     * Marker border color. If not set, will use the same color as marker.
     **/
    public void setMarkerBorderColor(Color markerBorderColor) {
        this.markerBorderColor = markerBorderColor;
    }
    public Color getMarkerBorderColor() {
        return markerBorderColor;
    }

    /**
     * Thickness of the legend border. The default value (0) means the line will be a "hairline"
     * (1 px). In case marker type is line, this style will be used for line thickness.
     **/
    public void setMarkerBorderThickness(double markerBorderThickness) {
        this.markerBorderThickness = markerBorderThickness;
    }
    public Double getMarkerBorderThickness() {
        return markerBorderThickness;
    }

    /**
     * The color of the disabled marker (when the graph is hidden).
     **/
    public void setMarkerDisabledColor(Color markerDisabledColor) {
        this.markerDisabledColor = markerDisabledColor;
    }
    public Color getMarkerDisabledColor() {
        return markerDisabledColor;
    }

    /**
     * Space between legend marker and legend text, in pixels.
     **/
    public void setMarkerLabelGap(double markerLabelGap) {
        this.markerLabelGap = markerLabelGap;
    }
    public Double getMarkerLabelGap() {
        return markerLabelGap;
    }

    /**
     * Size of the legend marker (key).
     **/
    public void setMarkerSize(double markerSize) {
        this.markerSize = markerSize;
    }
    public Double getMarkerSize() {
        return markerSize;
    }

    /**
     * Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp,
     * triangleDown, triangleLeft, triangleDown, bubble, line, none.
     **/
    public void setMarkerType(String markerType) {
        this.markerType = markerType;
    }
    public String getMarkerType() {
        return markerType;
    }

    /**
     * Maximum number of columns in the legend. If Legend's position is set to "right" or
     * "left", maxColumns is automatically set to 1.
     **/
    public void setMaxColumns(double maxColumns) {
        this.maxColumns = maxColumns;
    }
    public Double getMaxColumns() {
        return maxColumns;
    }

    /**
     * The text which will be displayed in the value portion of the legend when user is
     * not hovering above any data point. The tags should be made out of two parts - the
     * name of a field (value / open / close / high / low) and the value of the period you
     * want to be show - open / close / high / low / sum / average / count. For example:
     * [[value.sum]] means that sum of all data points of value field in the selected period
     * will be displayed.
     **/
    public void setPeriodValueText(String periodValueText) {
        this.periodValueText = periodValueText;
    }
    public String getPeriodValueText() {
        return periodValueText;
    }

    /**
     * Position of a legend. Possible values are: "bottom", "top", "left", "right" and "absolute".
     * In case "absolute", you should set left and top properties too. (this setting is
     * ignored in Stock charts). In case legend is used with AmMap, position is set to "absolute"
     * automatically.
     **/
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }

    /**
     * Specifies whether legend entries should be placed in reversed order.
     **/
    public void setReversedOrder(boolean reversedOrder) {
        this.reversedOrder = reversedOrder;
    }
    public boolean isReversedOrder() {
        return reversedOrder;
    }

    /**
     * In case legend position is set to "absolute", you can set distance from right side
     * of the chart, in pixels.
     **/
    public void setRight(double right) {
        this.right = right;
    }
    public Double getRight() {
        return right;
    }

    /**
     * Legend item text color on roll-over.
     **/
    public void setRollOverColor(Color rollOverColor) {
        this.rollOverColor = rollOverColor;
    }
    public Color getRollOverColor() {
        return rollOverColor;
    }

    /**
     * When you roll-over the legend entry, all other graphs can reduce their opacity, so
     * that the graph you rolled-over would be distinguished. This style specifies the opacity
     * of the graphs.
     **/
    public void setRollOverGraphAlpha(double rollOverGraphAlpha) {
        this.rollOverGraphAlpha = rollOverGraphAlpha;
    }
    public Double getRollOverGraphAlpha() {
        return rollOverGraphAlpha;
    }

    /**
     * You can use this property to turn all the legend entries off.
     **/
    public void setShowEntries(boolean showEntries) {
        this.showEntries = showEntries;
    }
    public boolean isShowEntries() {
        return showEntries;
    }

    /**
     * Horizontal space between legend items, in pixels.
     **/
    public void setSpacing(double spacing) {
        this.spacing = spacing;
    }
    public Double getSpacing() {
        return spacing;
    }

    /**
     * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
     * In case legend is used with AmMap, this is set to false automatically.
     **/
    public void setSwitchable(boolean switchable) {
        this.switchable = switchable;
    }
    public boolean isSwitchable() {
        return switchable;
    }

    /**
     * Legend switch color.
     **/
    public void setSwitchColor(Color switchColor) {
        this.switchColor = switchColor;
    }
    public Color getSwitchColor() {
        return switchColor;
    }

    /**
     * Legend switch type (in case the legend is switchable). Possible values are "x" and
     * "v".
     **/
    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }
    public String getSwitchType() {
        return switchType;
    }

    /**
     * If true, clicking on the text will show/hide balloon of the graph. Otherwise it will
     * show/hide graph/slice, if switchable is set to true.
     **/
    public void setTextClickEnabled(boolean textClickEnabled) {
        this.textClickEnabled = textClickEnabled;
    }
    public boolean isTextClickEnabled() {
        return textClickEnabled;
    }

    /**
     * In case legend position is set to "absolute", you can set distance from top of the
     * chart, in pixels.
     **/
    public void setTop(double top) {
        this.top = top;
    }
    public Double getTop() {
        return top;
    }

    /**
     * Legend markers can mirror graph’s settings, displaying a line and a real bullet as
     * in the graph itself. Set this property to true if you want to enable this feature.
     **/
    public void setUseGraphSettings(boolean useGraphSettings) {
        this.useGraphSettings = useGraphSettings;
    }
    public boolean isUseGraphSettings() {
        return useGraphSettings;
    }

    /**
     * Labels will use marker color if you set this to true.
     **/
    public void setUseMarkerColorForLabels(boolean useMarkerColorForLabels) {
        this.useMarkerColorForLabels = useMarkerColorForLabels;
    }
    public boolean isUseMarkerColorForLabels() {
        return useMarkerColorForLabels;
    }

    /**
     * Specifies if legend values should be use same color as corresponding markers.
     **/
    public void setUseMarkerColorForValues(boolean useMarkerColorForValues) {
        this.useMarkerColorForValues = useMarkerColorForValues;
    }
    public boolean isUseMarkerColorForValues() {
        return useMarkerColorForValues;
    }

    /**
     * Alignment of the value text. Possible values are "left" and "right".
     **/
    public void setValueAlign(String valueAlign) {
        this.valueAlign = valueAlign;
    }
    public String getValueAlign() {
        return valueAlign;
    }

    /**
     * The text which will be displayed in the value portion of the legend. You can use
     * tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
     **/
    public void setValueText(String valueText) {
        this.valueText = valueText;
    }
    public String getValueText() {
        return valueText;
    }

    /**
     * Width of the value text.
     **/
    public void setValueWidth(double valueWidth) {
        this.valueWidth = valueWidth;
    }
    public Double getValueWidth() {
        return valueWidth;
    }

    /**
     * Vertical space between legend items also between legend border and first and last
     * legend row.
     **/
    public void setVerticalGap(double verticalGap) {
        this.verticalGap = verticalGap;
    }
    public Double getVerticalGap() {
        return verticalGap;
    }

    /**
     * Width of a legend, when position is set to absolute.
     **/
    public void setWidth(double width) {
        this.width = width;
    }
    public Double getWidth() {
        return width;
    }

}