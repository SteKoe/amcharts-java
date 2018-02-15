package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.util.List;

/**
 * Extension for AmChart and base class of AmPieChart and AmFunnelChart. It can not
 * be instantiated explicitly.
 */

public class AmSlicedChart extends AmChart {
    private String accessibleLabel;
    private Double alpha;
    private String alphaField;
    private Color baseColor;
    private Double brightnessStep;
    private List<Object> chartData;
    private String classNameField;
    private String colorField;
    private List<Color> colors;
    private String descriptionField;
    private List<Number> gradientRatio;
    private Double groupedAlpha;
    private Color groupedColor;
    private String groupedDescription;
    private Boolean groupedPulled;
    private String groupedTitle;
    private Double groupPercent;
    private Double hideLabelsPercent;
    private Double hoverAlpha;
    private Color labelColorField;
    private Boolean labelsEnabled;
    private Double labelTickAlpha;
    private Color labelTickColor;
    private Double marginBottom;
    private Double marginLeft;
    private Double marginRight;
    private Double marginTop;
    private Double maxLabelWidth;
    private Double outlineAlpha;
    private Color outlineColor;
    private Double outlineThickness;
    private String patternField;
    private String pulledField;
    private Double pullOutDuration;
    private String pullOutEffect;
    private Boolean pullOutOnlyOne;
    private Boolean sequencedAnimation;
    private Boolean showZeroSlices;
    private Double startAlpha;
    private Double startDuration;
    private String startEffect;
    private Double tabIndex;
    private String titleField;
    private String urlField;
    private String urlTarget;
    private String valueField;
    private String visibleInLegendField;

    /**
     * @param accessibleLabel Text which screen readers will read if user rolls-over the slice or sets focus using
     *                        tab key (this is possible only if tabIndex property of AmSlicedChart is set to some
     *                        number). Text is added as aria-label tag. Note - not all screen readers and browsers
     *                        support this.
     * @return AmSlicedChart
     */
    public AmSlicedChart setAccessibleLabel(String accessibleLabel) {
        this.accessibleLabel = accessibleLabel;
        return this;
    }

    public String getAccessibleLabel() {
        return accessibleLabel;
    }

    /**
     * @param alpha Opacity of all slices.
     * @return AmSlicedChart
     */
    public AmSlicedChart setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * @param alphaField Name of the field in chart's dataProvider which holds slice's alpha.
     * @return AmSlicedChart
     */
    public AmSlicedChart setAlphaField(String alphaField) {
        this.alphaField = alphaField;
        return this;
    }

    public String getAlphaField() {
        return alphaField;
    }

    /**
     * @param baseColor Color of the first slice. All the other will be colored with darker or brighter colors.
     *                  Use brightnessStep to set intensity of color change for each subsequent slice.
     * @return AmSlicedChart
     */
    public AmSlicedChart setBaseColor(Color baseColor) {
        this.baseColor = baseColor;
        return this;
    }

    public Color getBaseColor() {
        return baseColor;
    }

    /**
     * @param brightnessStep If you set baseColor to some color, the chart will not use colors array to color
     *                       each slice but rather this setting to color the first slice with gradually increasing
     *                       (or decreasing) brightness for each subsequent slice. This setting describes the
     *                       intensity of each step. Set to positive number to make the color brighter with each
     *                       slice. Set to negative to make the colors darker for subsequent slices.
     * @return AmSlicedChart
     */
    public AmSlicedChart setBrightnessStep(double brightnessStep) {
        this.brightnessStep = brightnessStep;
        return this;
    }

    public Double getBrightnessStep() {
        return brightnessStep;
    }

    /**
     * @param chartData Read-only. Array of Slice objects.
     * @return AmSlicedChart
     */
    public AmSlicedChart setChartData(List<Object> chartData) {
        this.chartData = chartData;
        return this;
    }

    public List<Object> getChartData() {
        return chartData;
    }

    /**
     * @param classNameField If this field is set and addClassNames is enabled, the slice element will have this
     *                       class name set.
     * @return AmSlicedChart
     */
    public AmSlicedChart setClassNameField(String classNameField) {
        this.classNameField = classNameField;
        return this;
    }

    public String getClassNameField() {
        return classNameField;
    }

    /**
     * @param colorField Name of the field in chart's dataProvider which holds slice's color.
     * @return AmSlicedChart
     */
    public AmSlicedChart setColorField(String colorField) {
        this.colorField = colorField;
        return this;
    }

    public String getColorField() {
        return colorField;
    }

    /**
     * @param colors Specifies the colors of the slices, if the slice color is not set. If there are more
     *               slices than colors in this array, the chart picks random color.
     * @return AmSlicedChart
     */
    public AmSlicedChart setColors(List<Color> colors) {
        this.colors = colors;
        return this;
    }

    public List<Color> getColors() {
        return colors;
    }

    /**
     * @param descriptionField Name of the field in chart's dataProvider which holds a string with description.
     * @return AmSlicedChart
     */
    public AmSlicedChart setDescriptionField(String descriptionField) {
        this.descriptionField = descriptionField;
        return this;
    }

    public String getDescriptionField() {
        return descriptionField;
    }

    /**
     * @param gradientRatio Example: [-0.2, 0, -0.2]. Will make slices to be filled with color gradients. Negative
     *                      value means the color will be darker than the original, and positive number means
     *                      the color will be lighter.
     * @return AmSlicedChart
     */
    public AmSlicedChart setGradientRatio(List<Number> gradientRatio) {
        this.gradientRatio = gradientRatio;
        return this;
    }

    public List<Number> getGradientRatio() {
        return gradientRatio;
    }

    /**
     * @param groupedAlpha Opacity of the group slice. Value range is 0 - 1.
     * @return AmSlicedChart
     */
    public AmSlicedChart setGroupedAlpha(double groupedAlpha) {
        this.groupedAlpha = groupedAlpha;
        return this;
    }

    public Double getGroupedAlpha() {
        return groupedAlpha;
    }

    /**
     * @param groupedColor Color of the group slice. The default value is not set - this means the next available
     *                     color from "colors" array will be used.
     * @return AmSlicedChart
     */
    public AmSlicedChart setGroupedColor(Color groupedColor) {
        this.groupedColor = groupedColor;
        return this;
    }

    public Color getGroupedColor() {
        return groupedColor;
    }

    /**
     * @param groupedDescription Description of the group slice.
     * @return AmSlicedChart
     */
    public AmSlicedChart setGroupedDescription(String groupedDescription) {
        this.groupedDescription = groupedDescription;
        return this;
    }

    public String getGroupedDescription() {
        return groupedDescription;
    }

    /**
     * @param groupedPulled If this is set to true, the group slice will be pulled out when the chart loads.
     * @return AmSlicedChart
     */
    public AmSlicedChart setGroupedPulled(boolean groupedPulled) {
        this.groupedPulled = groupedPulled;
        return this;
    }

    public Boolean getGroupedPulled() {
        return groupedPulled;
    }

    /**
     * @param groupedTitle Title of the group slice.
     * @return AmSlicedChart
     */
    public AmSlicedChart setGroupedTitle(String groupedTitle) {
        this.groupedTitle = groupedTitle;
        return this;
    }

    public String getGroupedTitle() {
        return groupedTitle;
    }

    /**
     * @param groupPercent If there is more than one slice whose percentage of the pie is less than this number,
     *                     those slices will be grouped together into one slice. This is the "other" slice.
     *                     It will always be the last slice in a pie.
     * @return AmSlicedChart
     */
    public AmSlicedChart setGroupPercent(double groupPercent) {
        this.groupPercent = groupPercent;
        return this;
    }

    public Double getGroupPercent() {
        return groupPercent;
    }

    /**
     * @param hideLabelsPercent Slices with percent less then hideLabelsPercent won't display labels This is useful
     *                          to avoid cluttering up the chart, if you have a lot of small slices. 0 means all
     *                          labels will be shown.
     * @return AmSlicedChart
     */
    public AmSlicedChart setHideLabelsPercent(double hideLabelsPercent) {
        this.hideLabelsPercent = hideLabelsPercent;
        return this;
    }

    public Double getHideLabelsPercent() {
        return hideLabelsPercent;
    }

    /**
     * @param hoverAlpha Opacity of a hovered slice. Value range is 0 - 1.
     * @return AmSlicedChart
     */
    public AmSlicedChart setHoverAlpha(double hoverAlpha) {
        this.hoverAlpha = hoverAlpha;
        return this;
    }

    public Double getHoverAlpha() {
        return hoverAlpha;
    }

    /**
     * @param labelColorField A field in data which holds color value for the tick. Use it to set color of the
     *                        label for each slice individually.
     * @return AmSlicedChart
     */
    public AmSlicedChart setLabelColorField(Color labelColorField) {
        this.labelColorField = labelColorField;
        return this;
    }

    public Color getLabelColorField() {
        return labelColorField;
    }

    /**
     * @param labelsEnabled Specifies whether data labels are visible.
     * @return AmSlicedChart
     */
    public AmSlicedChart setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
        return this;
    }

    public Boolean getLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * @param labelTickAlpha Label tick opacity. Value range is 0 - 1.
     * @return AmSlicedChart
     */
    public AmSlicedChart setLabelTickAlpha(double labelTickAlpha) {
        this.labelTickAlpha = labelTickAlpha;
        return this;
    }

    public Double getLabelTickAlpha() {
        return labelTickAlpha;
    }

    /**
     * @param labelTickColor Label tick color.
     * @return AmSlicedChart
     */
    public AmSlicedChart setLabelTickColor(Color labelTickColor) {
        this.labelTickColor = labelTickColor;
        return this;
    }

    public Color getLabelTickColor() {
        return labelTickColor;
    }

    /**
     * @param marginBottom Bottom margin of the chart.
     * @return AmSlicedChart
     */
    public AmSlicedChart setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * @param marginLeft Left margin of the chart.
     * @return AmSlicedChart
     */
    public AmSlicedChart setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * @param marginRight Right margin of the chart.
     * @return AmSlicedChart
     */
    public AmSlicedChart setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * @param marginTop Top margin of the chart.
     * @return AmSlicedChart
     */
    public AmSlicedChart setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * @param maxLabelWidth If width of the label is bigger than maxLabelWidth, it will be wrapped.
     * @return AmSlicedChart
     */
    public AmSlicedChart setMaxLabelWidth(double maxLabelWidth) {
        this.maxLabelWidth = maxLabelWidth;
        return this;
    }

    public Double getMaxLabelWidth() {
        return maxLabelWidth;
    }

    /**
     * @param outlineAlpha Outline opacity. Value range is 0 - 1.
     * @return AmSlicedChart
     */
    public AmSlicedChart setOutlineAlpha(double outlineAlpha) {
        this.outlineAlpha = outlineAlpha;
        return this;
    }

    public Double getOutlineAlpha() {
        return outlineAlpha;
    }

    /**
     * @param outlineColor Outline color.
     * @return AmSlicedChart
     */
    public AmSlicedChart setOutlineColor(Color outlineColor) {
        this.outlineColor = outlineColor;
        return this;
    }

    public Color getOutlineColor() {
        return outlineColor;
    }

    /**
     * @param outlineThickness Pie outline thickness.
     * @return AmSlicedChart
     */
    public AmSlicedChart setOutlineThickness(double outlineThickness) {
        this.outlineThickness = outlineThickness;
        return this;
    }

    public Double getOutlineThickness() {
        return outlineThickness;
    }

    /**
     * @param patternField Field name in your data provider which holds pattern information. Value of pattern
     *                     should be object with url, width, height of an image, optionally it might have x,
     *                     y, randomX and randomY values. For example: {"url":"../amcharts/patterns/black/pattern1.png",
     *                     "width":4, "height":4}. Check amcharts/patterns folder for some patterns. You can
     *                     create your own patterns and use them. Note, x, y, randomX and randomY properties
     *                     won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns.
     * @return AmSlicedChart
     */
    public AmSlicedChart setPatternField(String patternField) {
        this.patternField = patternField;
        return this;
    }

    public String getPatternField() {
        return patternField;
    }

    /**
     * @param pulledField Name of the field in chart's dataProvider which holds a boolean value telling the
     *                    chart whether this slice must be pulled or not.
     * @return AmSlicedChart
     */
    public AmSlicedChart setPulledField(String pulledField) {
        this.pulledField = pulledField;
        return this;
    }

    public String getPulledField() {
        return pulledField;
    }

    /**
     * @param pullOutDuration Pull out duration, in seconds.
     * @return AmSlicedChart
     */
    public AmSlicedChart setPullOutDuration(double pullOutDuration) {
        this.pullOutDuration = pullOutDuration;
        return this;
    }

    public Double getPullOutDuration() {
        return pullOutDuration;
    }

    /**
     * @param pullOutEffect Pull out effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     * @return AmSlicedChart
     */
    public AmSlicedChart setPullOutEffect(String pullOutEffect) {
        this.pullOutEffect = pullOutEffect;
        return this;
    }

    public String getPullOutEffect() {
        return pullOutEffect;
    }

    /**
     * @param pullOutOnlyOne If this is set to true, only one slice can be pulled out at a time. If the viewer
     *                       clicks on a slice, any other pulled-out slice will be pulled in.
     * @return AmSlicedChart
     */
    public AmSlicedChart setPullOutOnlyOne(boolean pullOutOnlyOne) {
        this.pullOutOnlyOne = pullOutOnlyOne;
        return this;
    }

    public Boolean getPullOutOnlyOne() {
        return pullOutOnlyOne;
    }

    /**
     * @param sequencedAnimation Specifies whether the animation should be sequenced or all slices should appear at
     *                           once.
     * @return AmSlicedChart
     */
    public AmSlicedChart setSequencedAnimation(boolean sequencedAnimation) {
        this.sequencedAnimation = sequencedAnimation;
        return this;
    }

    public Boolean getSequencedAnimation() {
        return sequencedAnimation;
    }

    /**
     * @param showZeroSlices If you set this to true, the chart will display outlines (if visible) and labels
     *                       for slices even if their value is 0.
     * @return AmSlicedChart
     */
    public AmSlicedChart setShowZeroSlices(boolean showZeroSlices) {
        this.showZeroSlices = showZeroSlices;
        return this;
    }

    public Boolean getShowZeroSlices() {
        return showZeroSlices;
    }

    /**
     * @param startAlpha Initial opacity of all slices. Slices will fade in from startAlpha.
     * @return AmSlicedChart
     */
    public AmSlicedChart setStartAlpha(double startAlpha) {
        this.startAlpha = startAlpha;
        return this;
    }

    public Double getStartAlpha() {
        return startAlpha;
    }

    /**
     * @param startDuration Duration of the animation, in seconds.
     * @return AmSlicedChart
     */
    public AmSlicedChart setStartDuration(double startDuration) {
        this.startDuration = startDuration;
        return this;
    }

    public Double getStartDuration() {
        return startDuration;
    }

    /**
     * @param startEffect Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     * @return AmSlicedChart
     */
    public AmSlicedChart setStartEffect(String startEffect) {
        this.startEffect = startEffect;
        return this;
    }

    public String getStartEffect() {
        return startEffect;
    }

    /**
     * @param tabIndex In case you set it to some number, the chart will set focus on a slice (starting
     *                 from first) when user clicks tab key. When a focus is set, screen readers like NVDA
     *                 Screen reader will read label which is set using accessibleLabel property of AmSlicedChart.
     *                 Note, not all browsers and readers support this.
     * @return AmSlicedChart
     */
    public AmSlicedChart setTabIndex(double tabIndex) {
        this.tabIndex = tabIndex;
        return this;
    }

    public Double getTabIndex() {
        return tabIndex;
    }

    /**
     * @param titleField Name of the field in chart's dataProvider which holds slice's title.
     * @return AmSlicedChart
     */
    public AmSlicedChart setTitleField(String titleField) {
        this.titleField = titleField;
        return this;
    }

    public String getTitleField() {
        return titleField;
    }

    /**
     * @param urlField Name of the field in chart's dataProvider which holds url which would be accessed
     *                 if the user clicks on a slice.
     * @return AmSlicedChart
     */
    public AmSlicedChart setUrlField(String urlField) {
        this.urlField = urlField;
        return this;
    }

    public String getUrlField() {
        return urlField;
    }

    /**
     * @param urlTarget If url is specified for a slice, it will be opened when user clicks on it. urlTarget
     *                  specifies target of this url. Use _blank if you want url to be opened in a new window.
     * @return AmSlicedChart
     */
    public AmSlicedChart setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
        return this;
    }

    public String getUrlTarget() {
        return urlTarget;
    }

    /**
     * @param valueField Name of the field in chart's dataProvider which holds slice's value.
     * @return AmSlicedChart
     */
    public AmSlicedChart setValueField(String valueField) {
        this.valueField = valueField;
        return this;
    }

    public String getValueField() {
        return valueField;
    }

    /**
     * @param visibleInLegendField Use this field to selectively specify which slice is shown in legend. It should be
     *                             set to a boolean field in data (that holds either true or false). For example if
     *                             you set visibleInLegendField to "showInLegend", all slices that have showInLegend:
     *                             false in their data will not be shown in the legend.
     * @return AmSlicedChart
     */
    public AmSlicedChart setVisibleInLegendField(String visibleInLegendField) {
        this.visibleInLegendField = visibleInLegendField;
        return this;
    }

    public String getVisibleInLegendField() {
        return visibleInLegendField;
    }

}