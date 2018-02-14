package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.util.List;

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
     * Text which screen readers will read if user rolls-over the slice or sets focus using
     * tab key (this is possible only if tabIndex property of AmSlicedChart is set to some
     * number). Text is added as aria-label tag. Note - not all screen readers and browsers
     * support this.
     **/
    public AmSlicedChart setAccessibleLabel(String accessibleLabel) {
        this.accessibleLabel = accessibleLabel;
        return this;
    }

    public String getAccessibleLabel() {
        return accessibleLabel;
    }

    /**
     * Opacity of all slices.
     **/
    public AmSlicedChart setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    public Double getAlpha() {
        return alpha;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's alpha.
     **/
    public AmSlicedChart setAlphaField(String alphaField) {
        this.alphaField = alphaField;
        return this;
    }

    public String getAlphaField() {
        return alphaField;
    }

    /**
     * Color of the first slice. All the other will be colored with darker or brighter colors.
     * Use brightnessStep to set intensity of color change for each subsequent slice.
     **/
    public AmSlicedChart setBaseColor(Color baseColor) {
        this.baseColor = baseColor;
        return this;
    }

    public Color getBaseColor() {
        return baseColor;
    }

    /**
     * If you set baseColor to some color, the chart will not use colors array to color
     * each slice but rather this setting to color the first slice with gradually increasing
     * (or decreasing) brightness for each subsequent slice. This setting describes the
     * intensity of each step. Set to positive number to make the color brighter with each
     * slice. Set to negative to make the colors darker for subsequent slices.
     **/
    public AmSlicedChart setBrightnessStep(double brightnessStep) {
        this.brightnessStep = brightnessStep;
        return this;
    }

    public Double getBrightnessStep() {
        return brightnessStep;
    }

    /**
     * Read-only. Array of Slice objects.
     **/
    public AmSlicedChart setChartData(List<Object> chartData) {
        this.chartData = chartData;
        return this;
    }

    public List<Object> getChartData() {
        return chartData;
    }

    /**
     * If this field is set and addClassNames is enabled, the slice element will have this
     * class name set.
     **/
    public AmSlicedChart setClassNameField(String classNameField) {
        this.classNameField = classNameField;
        return this;
    }

    public String getClassNameField() {
        return classNameField;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's color.
     **/
    public AmSlicedChart setColorField(String colorField) {
        this.colorField = colorField;
        return this;
    }

    public String getColorField() {
        return colorField;
    }

    /**
     * Specifies the colors of the slices, if the slice color is not set. If there are more
     * slices than colors in this array, the chart picks random color.
     **/
    public AmSlicedChart setColors(List<Color> colors) {
        this.colors = colors;
        return this;
    }

    public List<Color> getColors() {
        return colors;
    }

    /**
     * Name of the field in chart's dataProvider which holds a string with description.
     **/
    public AmSlicedChart setDescriptionField(String descriptionField) {
        this.descriptionField = descriptionField;
        return this;
    }

    public String getDescriptionField() {
        return descriptionField;
    }

    /**
     * Example: [-0.2, 0, -0.2]. Will make slices to be filled with color gradients. Negative
     * value means the color will be darker than the original, and positive number means
     * the color will be lighter.
     **/
    public AmSlicedChart setGradientRatio(List<Number> gradientRatio) {
        this.gradientRatio = gradientRatio;
        return this;
    }

    public List<Number> getGradientRatio() {
        return gradientRatio;
    }

    /**
     * Opacity of the group slice. Value range is 0 - 1.
     **/
    public AmSlicedChart setGroupedAlpha(double groupedAlpha) {
        this.groupedAlpha = groupedAlpha;
        return this;
    }

    public Double getGroupedAlpha() {
        return groupedAlpha;
    }

    /**
     * Color of the group slice. The default value is not set - this means the next available
     * color from "colors" array will be used.
     **/
    public AmSlicedChart setGroupedColor(Color groupedColor) {
        this.groupedColor = groupedColor;
        return this;
    }

    public Color getGroupedColor() {
        return groupedColor;
    }

    /**
     * Description of the group slice.
     **/
    public AmSlicedChart setGroupedDescription(String groupedDescription) {
        this.groupedDescription = groupedDescription;
        return this;
    }

    public String getGroupedDescription() {
        return groupedDescription;
    }

    /**
     * If this is set to true, the group slice will be pulled out when the chart loads.
     **/
    public AmSlicedChart setGroupedPulled(boolean groupedPulled) {
        this.groupedPulled = groupedPulled;
        return this;
    }

    public Boolean getGroupedPulled() {
        return groupedPulled;
    }

    /**
     * Title of the group slice.
     **/
    public AmSlicedChart setGroupedTitle(String groupedTitle) {
        this.groupedTitle = groupedTitle;
        return this;
    }

    public String getGroupedTitle() {
        return groupedTitle;
    }

    /**
     * If there is more than one slice whose percentage of the pie is less than this number,
     * those slices will be grouped together into one slice. This is the "other" slice.
     * It will always be the last slice in a pie.
     **/
    public AmSlicedChart setGroupPercent(double groupPercent) {
        this.groupPercent = groupPercent;
        return this;
    }

    public Double getGroupPercent() {
        return groupPercent;
    }

    /**
     * Slices with percent less then hideLabelsPercent won't display labels This is useful
     * to avoid cluttering up the chart, if you have a lot of small slices. 0 means all
     * labels will be shown.
     **/
    public AmSlicedChart setHideLabelsPercent(double hideLabelsPercent) {
        this.hideLabelsPercent = hideLabelsPercent;
        return this;
    }

    public Double getHideLabelsPercent() {
        return hideLabelsPercent;
    }

    /**
     * Opacity of a hovered slice. Value range is 0 - 1.
     **/
    public AmSlicedChart setHoverAlpha(double hoverAlpha) {
        this.hoverAlpha = hoverAlpha;
        return this;
    }

    public Double getHoverAlpha() {
        return hoverAlpha;
    }

    /**
     * A field in data which holds color value for the tick. Use it to set color of the
     * label for each slice individually.
     **/
    public AmSlicedChart setLabelColorField(Color labelColorField) {
        this.labelColorField = labelColorField;
        return this;
    }

    public Color getLabelColorField() {
        return labelColorField;
    }

    /**
     * Specifies whether data labels are visible.
     **/
    public AmSlicedChart setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
        return this;
    }

    public Boolean getLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * Label tick opacity. Value range is 0 - 1.
     **/
    public AmSlicedChart setLabelTickAlpha(double labelTickAlpha) {
        this.labelTickAlpha = labelTickAlpha;
        return this;
    }

    public Double getLabelTickAlpha() {
        return labelTickAlpha;
    }

    /**
     * Label tick color.
     **/
    public AmSlicedChart setLabelTickColor(Color labelTickColor) {
        this.labelTickColor = labelTickColor;
        return this;
    }

    public Color getLabelTickColor() {
        return labelTickColor;
    }

    /**
     * Bottom margin of the chart.
     **/
    public AmSlicedChart setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Left margin of the chart.
     **/
    public AmSlicedChart setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Right margin of the chart.
     **/
    public AmSlicedChart setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Top margin of the chart.
     **/
    public AmSlicedChart setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * If width of the label is bigger than maxLabelWidth, it will be wrapped.
     **/
    public AmSlicedChart setMaxLabelWidth(double maxLabelWidth) {
        this.maxLabelWidth = maxLabelWidth;
        return this;
    }

    public Double getMaxLabelWidth() {
        return maxLabelWidth;
    }

    /**
     * Outline opacity. Value range is 0 - 1.
     **/
    public AmSlicedChart setOutlineAlpha(double outlineAlpha) {
        this.outlineAlpha = outlineAlpha;
        return this;
    }

    public Double getOutlineAlpha() {
        return outlineAlpha;
    }

    /**
     * Outline color.
     **/
    public AmSlicedChart setOutlineColor(Color outlineColor) {
        this.outlineColor = outlineColor;
        return this;
    }

    public Color getOutlineColor() {
        return outlineColor;
    }

    /**
     * Pie outline thickness.
     **/
    public AmSlicedChart setOutlineThickness(double outlineThickness) {
        this.outlineThickness = outlineThickness;
        return this;
    }

    public Double getOutlineThickness() {
        return outlineThickness;
    }

    /**
     * Field name in your data provider which holds pattern information. Value of pattern
     * should be object with url, width, height of an image, optionally it might have x,
     * y, randomX and randomY values. For example: {"url":"../amcharts/patterns/black/pattern1.png",
     * "width":4, "height":4}. Check amcharts/patterns folder for some patterns. You can
     * create your own patterns and use them. Note, x, y, randomX and randomY properties
     * won't work with IE8 and older. 3D bar/Pie charts won't work properly with patterns.
     **/
    public AmSlicedChart setPatternField(String patternField) {
        this.patternField = patternField;
        return this;
    }

    public String getPatternField() {
        return patternField;
    }

    /**
     * Name of the field in chart's dataProvider which holds a boolean value telling the
     * chart whether this slice must be pulled or not.
     **/
    public AmSlicedChart setPulledField(String pulledField) {
        this.pulledField = pulledField;
        return this;
    }

    public String getPulledField() {
        return pulledField;
    }

    /**
     * Pull out duration, in seconds.
     **/
    public AmSlicedChart setPullOutDuration(double pullOutDuration) {
        this.pullOutDuration = pullOutDuration;
        return this;
    }

    public Double getPullOutDuration() {
        return pullOutDuration;
    }

    /**
     * Pull out effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     **/
    public AmSlicedChart setPullOutEffect(String pullOutEffect) {
        this.pullOutEffect = pullOutEffect;
        return this;
    }

    public String getPullOutEffect() {
        return pullOutEffect;
    }

    /**
     * If this is set to true, only one slice can be pulled out at a time. If the viewer
     * clicks on a slice, any other pulled-out slice will be pulled in.
     **/
    public AmSlicedChart setPullOutOnlyOne(boolean pullOutOnlyOne) {
        this.pullOutOnlyOne = pullOutOnlyOne;
        return this;
    }

    public Boolean getPullOutOnlyOne() {
        return pullOutOnlyOne;
    }

    /**
     * Specifies whether the animation should be sequenced or all slices should appear at
     * once.
     **/
    public AmSlicedChart setSequencedAnimation(boolean sequencedAnimation) {
        this.sequencedAnimation = sequencedAnimation;
        return this;
    }

    public Boolean getSequencedAnimation() {
        return sequencedAnimation;
    }

    /**
     * If you set this to true, the chart will display outlines (if visible) and labels
     * for slices even if their value is 0.
     **/
    public AmSlicedChart setShowZeroSlices(boolean showZeroSlices) {
        this.showZeroSlices = showZeroSlices;
        return this;
    }

    public Boolean getShowZeroSlices() {
        return showZeroSlices;
    }

    /**
     * Initial opacity of all slices. Slices will fade in from startAlpha.
     **/
    public AmSlicedChart setStartAlpha(double startAlpha) {
        this.startAlpha = startAlpha;
        return this;
    }

    public Double getStartAlpha() {
        return startAlpha;
    }

    /**
     * Duration of the animation, in seconds.
     **/
    public AmSlicedChart setStartDuration(double startDuration) {
        this.startDuration = startDuration;
        return this;
    }

    public Double getStartDuration() {
        return startDuration;
    }

    /**
     * Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     **/
    public AmSlicedChart setStartEffect(String startEffect) {
        this.startEffect = startEffect;
        return this;
    }

    public String getStartEffect() {
        return startEffect;
    }

    /**
     * In case you set it to some number, the chart will set focus on a slice (starting
     * from first) when user clicks tab key. When a focus is set, screen readers like NVDA
     * Screen reader will read label which is set using accessibleLabel property of AmSlicedChart.
     * Note, not all browsers and readers support this.
     **/
    public AmSlicedChart setTabIndex(double tabIndex) {
        this.tabIndex = tabIndex;
        return this;
    }

    public Double getTabIndex() {
        return tabIndex;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's title.
     **/
    public AmSlicedChart setTitleField(String titleField) {
        this.titleField = titleField;
        return this;
    }

    public String getTitleField() {
        return titleField;
    }

    /**
     * Name of the field in chart's dataProvider which holds url which would be accessed
     * if the user clicks on a slice.
     **/
    public AmSlicedChart setUrlField(String urlField) {
        this.urlField = urlField;
        return this;
    }

    public String getUrlField() {
        return urlField;
    }

    /**
     * If url is specified for a slice, it will be opened when user clicks on it. urlTarget
     * specifies target of this url. Use _blank if you want url to be opened in a new window.
     **/
    public AmSlicedChart setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
        return this;
    }

    public String getUrlTarget() {
        return urlTarget;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's value.
     **/
    public AmSlicedChart setValueField(String valueField) {
        this.valueField = valueField;
        return this;
    }

    public String getValueField() {
        return valueField;
    }

    /**
     * Use this field to selectively specify which slice is shown in legend. It should be
     * set to a boolean field in data (that holds either true or false). For example if
     * you set visibleInLegendField to "showInLegend", all slices that have showInLegend:
     * false in their data will not be shown in the legend.
     **/
    public AmSlicedChart setVisibleInLegendField(String visibleInLegendField) {
        this.visibleInLegendField = visibleInLegendField;
        return this;
    }

    public String getVisibleInLegendField() {
        return visibleInLegendField;
    }

}