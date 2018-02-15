package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.io.Serializable;
import java.util.List;

/**
 * Creates the legend for the chart, automatically adapts the color settings of the
 * graphs.
 */

public class AmLegend implements Serializable {
    private String accessibleLabel;
    private String align;
    private Boolean autoMargins;
    private Double backgroundAlpha;
    private Color backgroundColor;
    private Double borderAlpha;
    private Color borderColor;
    private Double bottom;
    private Color color;
    private Boolean combineLegend;
    private List<Object> data;
    private String divId;
    private Boolean enabled;
    private Boolean equalWidths;
    private Double fontSize;
    private Boolean forceWidth;
    private Double gradientRotation;
    private Double horizontalGap;
    private String labelText;
    private Double labelWidth;
    private Double left;
    private List<Object> listeners;
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
    private Double tabIndex;
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
     * @param accessibleLabel Text which screen readers will read if user rolls-over the element or sets focus
     *                        on it using tab key (this is possible only if tabIndex property of AmLegend is set
     *                        to some number). Text is added as aria-label tag. Note - not all screen readers and
     *                        browsers support this.
     * @return AmLegend
     */
    public AmLegend setAccessibleLabel(String accessibleLabel) {
        this.accessibleLabel = accessibleLabel;
        return this;
    }

    public String getAccessibleLabel() {
        return accessibleLabel;
    }

    /**
     * @param align Alignment of legend entries. Possible values are: "left", "center", "right".
     * @return AmLegend
     */
    public AmLegend setAlign(String align) {
        this.align = align;
        return this;
    }

    public String getAlign() {
        return align;
    }

    /**
     * @param autoMargins Used if chart is Serial or XY. In case true, margins of the legend are adjusted and
     *                    made equal to chart's margins.
     * @return AmLegend
     */
    public AmLegend setAutoMargins(boolean autoMargins) {
        this.autoMargins = autoMargins;
        return this;
    }

    public Boolean getAutoMargins() {
        return autoMargins;
    }

    /**
     * @param backgroundAlpha Opacity of legend's background. Value range is 0 - 1
     * @return AmLegend
     */
    public AmLegend setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
        return this;
    }

    public Double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * @param backgroundColor Background color. You should set backgroundAlpha to >0 vallue in order background
     *                        to be visible.
     * @return AmLegend
     */
    public AmLegend setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param borderAlpha Opacity of chart's border. Value range is 0 - 1.
     * @return AmLegend
     */
    public AmLegend setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
        return this;
    }

    public Double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * @param borderColor *Color of legend's border. You should set borderAlpha >0 in order border to be visible.
     * @return AmLegend
     */
    public AmLegend setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * @param bottom In case legend position is set to "absolute", you can set distance from bottom of
     *               the chart, in pixels.
     * @return AmLegend
     */
    public AmLegend setBottom(double bottom) {
        this.bottom = bottom;
        return this;
    }

    public Double getBottom() {
        return bottom;
    }

    /**
     * @param color Text color.
     * @return AmLegend
     */
    public AmLegend setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    /**
     * @param combineLegend If you set it to true, and you have some legend items set using legend.data property,
     *                      both graph’s entries and those added using data property will be displayed.
     * @return AmLegend
     */
    public AmLegend setCombineLegend(boolean combineLegend) {
        this.combineLegend = combineLegend;
        return this;
    }

    public Boolean getCombineLegend() {
        return combineLegend;
    }

    /**
     * @param data You can pass array of objects with title, color, markerType values, for example:
     *             [{title: "One", color: "#3366CC"},{title: "Two", color: "#FFCC33"}]
     * @return AmLegend
     */
    public AmLegend setData(List<Object> data) {
        this.data = data;
        return this;
    }

    public List<Object> getData() {
        return data;
    }

    /**
     * @param divId You can set id of a div or a reference to div object in case you want the legend
     *              to be placed in a separate container.
     * @return AmLegend
     */
    public AmLegend setDivId(String divId) {
        this.divId = divId;
        return this;
    }

    public String getDivId() {
        return divId;
    }

    /**
     * @param enabled Specifies if legend is enabled or not.
     * @return AmLegend
     */
    public AmLegend setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * @param equalWidths Specifies if each of legend entry should be equal to the most wide entry. Won't look
     *                    good if legend has more than one line.
     * @return AmLegend
     */
    public AmLegend setEqualWidths(boolean equalWidths) {
        this.equalWidths = equalWidths;
        return this;
    }

    public Boolean getEqualWidths() {
        return equalWidths;
    }

    /**
     * @param fontSize Font size.
     * @return AmLegend
     */
    public AmLegend setFontSize(double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Double getFontSize() {
        return fontSize;
    }

    /**
     * @param forceWidth If you set this property to true, width of legend item labels won't be adjusted.
     *                   Useful when you have more than one chart and want to align all the legends.
     * @return AmLegend
     */
    public AmLegend setForceWidth(boolean forceWidth) {
        this.forceWidth = forceWidth;
        return this;
    }

    public Boolean getForceWidth() {
        return forceWidth;
    }

    /**
     * @param gradientRotation Can be used if legend uses custom data. Set it to 0, 90, 180 or 270.
     * @return AmLegend
     */
    public AmLegend setGradientRotation(double gradientRotation) {
        this.gradientRotation = gradientRotation;
        return this;
    }

    public Double getGradientRotation() {
        return gradientRotation;
    }

    /**
     * @param horizontalGap Horizontal space between legend item and left/right border.
     * @return AmLegend
     */
    public AmLegend setHorizontalGap(double horizontalGap) {
        this.horizontalGap = horizontalGap;
        return this;
    }

    public Double getHorizontalGap() {
        return horizontalGap;
    }

    /**
     * @param labelText The text which will be displayed in the legend. Tag [[title]] will be replaced with
     *                  the title of the graph.
     * @return AmLegend
     */
    public AmLegend setLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    public String getLabelText() {
        return labelText;
    }

    /**
     * @param labelWidth If width of the label is bigger than labelWidth, it will be wrapped.
     * @return AmLegend
     */
    public AmLegend setLabelWidth(double labelWidth) {
        this.labelWidth = labelWidth;
        return this;
    }

    public Double getLabelWidth() {
        return labelWidth;
    }

    /**
     * @param left In case legend position is set to "absolute", you can set distance from left side
     *             of the chart, in pixels.
     * @return AmLegend
     */
    public AmLegend setLeft(double left) {
        this.left = left;
        return this;
    }

    public Double getLeft() {
        return left;
    }

    /**
     * @param listeners You can add listeners of events using this property. Example: listeners = [{"event":"clickLabel",
     *                  "method":handleEvent}];
     * @return AmLegend
     */
    public AmLegend setListeners(List<Object> listeners) {
        this.listeners = listeners;
        return this;
    }

    public List<Object> getListeners() {
        return listeners;
    }

    /**
     * @param marginBottom Bottom margin.
     * @return AmLegend
     */
    public AmLegend setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * @param marginLeft Left margin. This property will be ignored if chart is Serial or XY and autoMargins
     *                   property of the legend is true (default).
     * @return AmLegend
     */
    public AmLegend setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * @param marginRight Right margin. This property will be ignored if chart is Serial or XY and autoMargins
     *                    property of the legend is true (default).
     * @return AmLegend
     */
    public AmLegend setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * @param marginTop Top margin.
     * @return AmLegend
     */
    public AmLegend setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * @param markerBorderAlpha Marker border opacity.
     * @return AmLegend
     */
    public AmLegend setMarkerBorderAlpha(double markerBorderAlpha) {
        this.markerBorderAlpha = markerBorderAlpha;
        return this;
    }

    public Double getMarkerBorderAlpha() {
        return markerBorderAlpha;
    }

    /**
     * @param markerBorderColor Marker border color. If not set, will use the same color as marker.
     * @return AmLegend
     */
    public AmLegend setMarkerBorderColor(Color markerBorderColor) {
        this.markerBorderColor = markerBorderColor;
        return this;
    }

    public Color getMarkerBorderColor() {
        return markerBorderColor;
    }

    /**
     * @param markerBorderThickness Thickness of the legend border. The default value (0) means the line will be a "hairline"
     *                              (1 px). In case marker type is line, this style will be used for line thickness.
     * @return AmLegend
     */
    public AmLegend setMarkerBorderThickness(double markerBorderThickness) {
        this.markerBorderThickness = markerBorderThickness;
        return this;
    }

    public Double getMarkerBorderThickness() {
        return markerBorderThickness;
    }

    /**
     * @param markerDisabledColor The color of the disabled marker (when the graph is hidden).
     * @return AmLegend
     */
    public AmLegend setMarkerDisabledColor(Color markerDisabledColor) {
        this.markerDisabledColor = markerDisabledColor;
        return this;
    }

    public Color getMarkerDisabledColor() {
        return markerDisabledColor;
    }

    /**
     * @param markerLabelGap Space between legend marker and legend text, in pixels.
     * @return AmLegend
     */
    public AmLegend setMarkerLabelGap(double markerLabelGap) {
        this.markerLabelGap = markerLabelGap;
        return this;
    }

    public Double getMarkerLabelGap() {
        return markerLabelGap;
    }

    /**
     * @param markerSize Size of the legend marker (key).
     * @return AmLegend
     */
    public AmLegend setMarkerSize(double markerSize) {
        this.markerSize = markerSize;
        return this;
    }

    public Double getMarkerSize() {
        return markerSize;
    }

    /**
     * @param markerType Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp,
     *                   triangleDown, triangleLeft, triangleDown, bubble, line, none.
     * @return AmLegend
     */
    public AmLegend setMarkerType(String markerType) {
        this.markerType = markerType;
        return this;
    }

    public String getMarkerType() {
        return markerType;
    }

    /**
     * @param maxColumns Maximum number of columns in the legend. If Legend's position is set to "right" or
     *                   "left", maxColumns is automatically set to 1.
     * @return AmLegend
     */
    public AmLegend setMaxColumns(double maxColumns) {
        this.maxColumns = maxColumns;
        return this;
    }

    public Double getMaxColumns() {
        return maxColumns;
    }

    /**
     * @param periodValueText The text which will be displayed in the value portion of the legend when user is
     *                        not hovering above any data point. The tags should be made out of two parts - the
     *                        name of a field (value / open / close / high / low) and the value of the period you
     *                        want to be show - open / close / high / low / sum / average / count. For example:
     *                        [[value.sum]] means that sum of all data points of value field in the selected period
     *                        will be displayed.
     * @return AmLegend
     */
    public AmLegend setPeriodValueText(String periodValueText) {
        this.periodValueText = periodValueText;
        return this;
    }

    public String getPeriodValueText() {
        return periodValueText;
    }

    /**
     * @param position Position of a legend. Possible values are: "bottom", "top", "left", "right" and "absolute".
     *                 In case "absolute", you should set left and top properties too. (this setting is
     *                 ignored in Stock charts). In case legend is used with AmMap, position is set to "absolute"
     *                 automatically.
     * @return AmLegend
     */
    public AmLegend setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getPosition() {
        return position;
    }

    /**
     * @param reversedOrder Specifies whether legend entries should be placed in reversed order.
     * @return AmLegend
     */
    public AmLegend setReversedOrder(boolean reversedOrder) {
        this.reversedOrder = reversedOrder;
        return this;
    }

    public Boolean getReversedOrder() {
        return reversedOrder;
    }

    /**
     * @param right In case legend position is set to "absolute", you can set distance from right side
     *              of the chart, in pixels.
     * @return AmLegend
     */
    public AmLegend setRight(double right) {
        this.right = right;
        return this;
    }

    public Double getRight() {
        return right;
    }

    /**
     * @param rollOverColor Legend item text color on roll-over.
     * @return AmLegend
     */
    public AmLegend setRollOverColor(Color rollOverColor) {
        this.rollOverColor = rollOverColor;
        return this;
    }

    public Color getRollOverColor() {
        return rollOverColor;
    }

    /**
     * @param rollOverGraphAlpha When you roll-over the legend entry, all other graphs can reduce their opacity, so
     *                           that the graph you rolled-over would be distinguished. This style specifies the opacity
     *                           of the non-hovered graphs.
     * @return AmLegend
     */
    public AmLegend setRollOverGraphAlpha(double rollOverGraphAlpha) {
        this.rollOverGraphAlpha = rollOverGraphAlpha;
        return this;
    }

    public Double getRollOverGraphAlpha() {
        return rollOverGraphAlpha;
    }

    /**
     * @param showEntries You can use this property to turn all the legend entries off.
     * @return AmLegend
     */
    public AmLegend setShowEntries(boolean showEntries) {
        this.showEntries = showEntries;
        return this;
    }

    public Boolean getShowEntries() {
        return showEntries;
    }

    /**
     * @param spacing Horizontal space between legend items, in pixels.
     * @return AmLegend
     */
    public AmLegend setSpacing(double spacing) {
        this.spacing = spacing;
        return this;
    }

    public Double getSpacing() {
        return spacing;
    }

    /**
     * @param switchable Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
     *                   In case legend is used with AmMap, this is set to false automatically.
     * @return AmLegend
     */
    public AmLegend setSwitchable(boolean switchable) {
        this.switchable = switchable;
        return this;
    }

    public Boolean getSwitchable() {
        return switchable;
    }

    /**
     * @param switchColor Legend switch color.
     * @return AmLegend
     */
    public AmLegend setSwitchColor(Color switchColor) {
        this.switchColor = switchColor;
        return this;
    }

    public Color getSwitchColor() {
        return switchColor;
    }

    /**
     * @param switchType Legend switch type (in case the legend is switchable). Possible values are "x" and
     *                   "v".
     * @return AmLegend
     */
    public AmLegend setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }

    public String getSwitchType() {
        return switchType;
    }

    /**
     * @param tabIndex In case you set it to some number, the chart will set focus on legend entry when
     *                 user clicks tab key. When a focus is set, screen readers like NVDA Screen reader
     *                 will read label which is set using accessibleLabel property of AmLegend. If legend
     *                 has switchable set to true, pressing Enter (Return) key will show/hide the graph.
     *                 Note, not all browsers and readers support this.
     * @return AmLegend
     */
    public AmLegend setTabIndex(double tabIndex) {
        this.tabIndex = tabIndex;
        return this;
    }

    public Double getTabIndex() {
        return tabIndex;
    }

    /**
     * @param textClickEnabled If true, clicking on the text will show/hide balloon of the graph. Otherwise it will
     *                         show/hide graph/slice, if switchable is set to true.
     * @return AmLegend
     */
    public AmLegend setTextClickEnabled(boolean textClickEnabled) {
        this.textClickEnabled = textClickEnabled;
        return this;
    }

    public Boolean getTextClickEnabled() {
        return textClickEnabled;
    }

    /**
     * @param top In case legend position is set to "absolute", you can set distance from top of the
     *            chart, in pixels.
     * @return AmLegend
     */
    public AmLegend setTop(double top) {
        this.top = top;
        return this;
    }

    public Double getTop() {
        return top;
    }

    /**
     * @param useGraphSettings Legend markers can mirror graph’s settings, displaying a line and a real bullet as
     *                         in the graph itself. Set this property to true if you want to enable this feature.
     *                         Note, if you set graph colors in dataProvider, they will not be reflected in the
     *                         marker.
     * @return AmLegend
     */
    public AmLegend setUseGraphSettings(boolean useGraphSettings) {
        this.useGraphSettings = useGraphSettings;
        return this;
    }

    public Boolean getUseGraphSettings() {
        return useGraphSettings;
    }

    /**
     * @param useMarkerColorForLabels Labels will use marker color if you set this to true.
     * @return AmLegend
     */
    public AmLegend setUseMarkerColorForLabels(boolean useMarkerColorForLabels) {
        this.useMarkerColorForLabels = useMarkerColorForLabels;
        return this;
    }

    public Boolean getUseMarkerColorForLabels() {
        return useMarkerColorForLabels;
    }

    /**
     * @param useMarkerColorForValues Specifies if legend values should be use same color as corresponding markers.
     * @return AmLegend
     */
    public AmLegend setUseMarkerColorForValues(boolean useMarkerColorForValues) {
        this.useMarkerColorForValues = useMarkerColorForValues;
        return this;
    }

    public Boolean getUseMarkerColorForValues() {
        return useMarkerColorForValues;
    }

    /**
     * @param valueAlign Alignment of the value text. Possible values are "left" and "right".
     * @return AmLegend
     */
    public AmLegend setValueAlign(String valueAlign) {
        this.valueAlign = valueAlign;
        return this;
    }

    public String getValueAlign() {
        return valueAlign;
    }

    /**
     * @param valueText The text which will be displayed in the value portion of the legend. You can use
     *                  tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
     * @return AmLegend
     */
    public AmLegend setValueText(String valueText) {
        this.valueText = valueText;
        return this;
    }

    public String getValueText() {
        return valueText;
    }

    /**
     * @param valueWidth Width of the value text.
     * @return AmLegend
     */
    public AmLegend setValueWidth(double valueWidth) {
        this.valueWidth = valueWidth;
        return this;
    }

    public Double getValueWidth() {
        return valueWidth;
    }

    /**
     * @param verticalGap Vertical space between legend items also between legend border and first and last
     *                    legend row.
     * @return AmLegend
     */
    public AmLegend setVerticalGap(double verticalGap) {
        this.verticalGap = verticalGap;
        return this;
    }

    public Double getVerticalGap() {
        return verticalGap;
    }

    /**
     * @param width Width of a legend, when position is set to absolute.
     * @return AmLegend
     */
    public AmLegend setWidth(double width) {
        this.width = width;
        return this;
    }

    public Double getWidth() {
        return width;
    }

}