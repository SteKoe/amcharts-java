package de.stekoe.amcharts;

import java.util.List;

import de.stekoe.amcharts.addition.Color;

public class AmSlicedChart extends AmChart {
    private Double alpha;
    private String alphaField;
    private Color baseColor;
    private Double brightnessStep;
    private List<Object> chartData;
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
    private Boolean labelsEnabled;
    private Double labelTickAlpha;
    private Color labelTickColor;
    private Double marginBottom;
    private Double marginLeft;
    private Double marginRight;
    private Double marginTop;
    private Double outlineAlpha;
    private Color outlineColor;
    private Double outlineThickness;
    private String patternField;
    private String pulledField;
    private Double pullOutDuration;
    private String pullOutEffect;
    private Boolean pullOutOnlyOne;
    private Boolean sequencedAnimation;
    private Double startAlpha;
    private Double startDuration;
    private String startEffect;
    private String titleField;
    private String urlField;
    private String urlTarget;
    private String valueField;
    private String visibleInLegendField;

    /**
     * Opacity of all slices.
     **/
    public Double getAlpha() {
        return alpha;
    }
    public AmSlicedChart setAlpha(double alpha) {
        this.alpha = alpha;
        return this;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's alpha.
     **/
    public String getAlphaField() {
        return alphaField;
    }
    public AmSlicedChart setAlphaField(String alphaField) {
        this.alphaField = alphaField;
        return this;
    }

    /**
     *      *Color of the first slice. All the other will be colored with darker or brighter colors.
     **/
    public Color getBaseColor() {
        return baseColor;
    }
    public AmSlicedChart setBaseColor(Color baseColor) {
        this.baseColor = baseColor;
        return this;
    }

    /**
     * Lightness increase of each subsequent slice. This is only useful if baseColor is
     * set. Use negative values for darker colors. Value range is from -255 to 255.
     **/
    public Double getBrightnessStep() {
        return brightnessStep;
    }
    public AmSlicedChart setBrightnessStep(double brightnessStep) {
        this.brightnessStep = brightnessStep;
        return this;
    }

    /**
     * Read-only. Array of Slice objects.
     **/
    public List<Object> getChartData() {
        return chartData;
    }
    public AmSlicedChart setChartData(List<Object> chartData) {
        this.chartData = chartData;
        return this;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's color.
     **/
    public String getColorField() {
        return colorField;
    }
    public AmSlicedChart setColorField(String colorField) {
        this.colorField = colorField;
        return this;
    }

    /**
     * Specifies the colors of the slices, if the slice color is not set. If there are more
     * slices than colors in this array, the chart picks random color.
     **/
    public List<Color> getColors() {
        return colors;
    }
    public AmSlicedChart setColors(List<Color> colors) {
        this.colors = colors;
        return this;
    }

    /**
     * Name of the field in chart's dataProvider which holds a string with description.
     **/
    public String getDescriptionField() {
        return descriptionField;
    }
    public AmSlicedChart setDescriptionField(String descriptionField) {
        this.descriptionField = descriptionField;
        return this;
    }

    /**
     * Example: [0,10]. Will make slices to be filled with color gradients.
     **/
    public List<Number> getGradientRatio() {
        return gradientRatio;
    }
    public AmSlicedChart setGradientRatio(List<Number> gradientRatio) {
        this.gradientRatio = gradientRatio;
        return this;
    }

    /**
     * Opacity of the group slice. Value range is 0 - 1.
     **/
    public Double getGroupedAlpha() {
        return groupedAlpha;
    }
    public AmSlicedChart setGroupedAlpha(double groupedAlpha) {
        this.groupedAlpha = groupedAlpha;
        return this;
    }

    /**
     * Color of the group slice. The default value is not set - this means the next available
     * color from "colors" array will be used.
     **/
    public Color getGroupedColor() {
        return groupedColor;
    }
    public AmSlicedChart setGroupedColor(Color groupedColor) {
        this.groupedColor = groupedColor;
        return this;
    }

    /**
     * Description of the group slice.
     **/
    public String getGroupedDescription() {
        return groupedDescription;
    }
    public AmSlicedChart setGroupedDescription(String groupedDescription) {
        this.groupedDescription = groupedDescription;
        return this;
    }

    /**
     * If this is set to true, the group slice will be pulled out when the chart loads.
     **/
    public Boolean getGroupedPulled() {
        return groupedPulled;
    }
    public AmSlicedChart setGroupedPulled(boolean groupedPulled) {
        this.groupedPulled = groupedPulled;
        return this;
    }

    /**
     * Title of the group slice.
     **/
    public String getGroupedTitle() {
        return groupedTitle;
    }
    public AmSlicedChart setGroupedTitle(String groupedTitle) {
        this.groupedTitle = groupedTitle;
        return this;
    }

    /**
     * If there is more than one slice whose percentage of the pie is less than this number,
     * those slices will be grouped together into one slice. This is the "other" slice.
     * It will always be the last slice in a pie.
     **/
    public Double getGroupPercent() {
        return groupPercent;
    }
    public AmSlicedChart setGroupPercent(double groupPercent) {
        this.groupPercent = groupPercent;
        return this;
    }

    /**
     * Slices with percent less then hideLabelsPercent won't display labels This is useful
     * to avoid cluttering up the chart, if you have a lot of small slices. 0 means all
     * labels will be shown.
     **/
    public Double getHideLabelsPercent() {
        return hideLabelsPercent;
    }
    public AmSlicedChart setHideLabelsPercent(double hideLabelsPercent) {
        this.hideLabelsPercent = hideLabelsPercent;
        return this;
    }

    /**
     * Opacity of a hovered slice. Value range is 0 - 1.
     **/
    public Double getHoverAlpha() {
        return hoverAlpha;
    }
    public AmSlicedChart setHoverAlpha(double hoverAlpha) {
        this.hoverAlpha = hoverAlpha;
        return this;
    }

    /**
     * Specifies whether data labels are visible.
     **/
    public Boolean getLabelsEnabled() {
        return labelsEnabled;
    }
    public AmSlicedChart setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
        return this;
    }

    /**
     * Label tick opacity. Value range is 0 - 1.
     **/
    public Double getLabelTickAlpha() {
        return labelTickAlpha;
    }
    public AmSlicedChart setLabelTickAlpha(double labelTickAlpha) {
        this.labelTickAlpha = labelTickAlpha;
        return this;
    }

    /**
     * Label tick color.
     **/
    public Color getLabelTickColor() {
        return labelTickColor;
    }
    public AmSlicedChart setLabelTickColor(Color labelTickColor) {
        this.labelTickColor = labelTickColor;
        return this;
    }

    /**
     * Bottom margin of the chart.
     **/
    public Double getMarginBottom() {
        return marginBottom;
    }
    public AmSlicedChart setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    /**
     * Left margin of the chart.
     **/
    public Double getMarginLeft() {
        return marginLeft;
    }
    public AmSlicedChart setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    /**
     * Right margin of the chart.
     **/
    public Double getMarginRight() {
        return marginRight;
    }
    public AmSlicedChart setMarginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    /**
     * Top margin of the chart.
     **/
    public Double getMarginTop() {
        return marginTop;
    }
    public AmSlicedChart setMarginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    /**
     * Outline opacity. Value range is 0 - 1.
     **/
    public Double getOutlineAlpha() {
        return outlineAlpha;
    }
    public AmSlicedChart setOutlineAlpha(double outlineAlpha) {
        this.outlineAlpha = outlineAlpha;
        return this;
    }

    /**
     * Outline color.
     **/
    public Color getOutlineColor() {
        return outlineColor;
    }
    public AmSlicedChart setOutlineColor(Color outlineColor) {
        this.outlineColor = outlineColor;
        return this;
    }

    /**
     * Pie outline thickness.
     **/
    public Double getOutlineThickness() {
        return outlineThickness;
    }
    public AmSlicedChart setOutlineThickness(double outlineThickness) {
        this.outlineThickness = outlineThickness;
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
    public AmSlicedChart setPatternField(String patternField) {
        this.patternField = patternField;
        return this;
    }

    /**
     * Name of the field in chart's dataProvider which holds a boolean value telling the
     * chart whether this slice must be pulled or not.
     **/
    public String getPulledField() {
        return pulledField;
    }
    public AmSlicedChart setPulledField(String pulledField) {
        this.pulledField = pulledField;
        return this;
    }

    /**
     * Pull out duration, in seconds.
     **/
    public Double getPullOutDuration() {
        return pullOutDuration;
    }
    public AmSlicedChart setPullOutDuration(double pullOutDuration) {
        this.pullOutDuration = pullOutDuration;
        return this;
    }

    /**
     * Pull out effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     **/
    public String getPullOutEffect() {
        return pullOutEffect;
    }
    public AmSlicedChart setPullOutEffect(String pullOutEffect) {
        this.pullOutEffect = pullOutEffect;
        return this;
    }

    /**
     * If this is set to true, only one slice can be pulled out at a time. If the viewer
     * clicks on a slice, any other pulled-out slice will be pulled in.
     **/
    public Boolean getPullOutOnlyOne() {
        return pullOutOnlyOne;
    }
    public AmSlicedChart setPullOutOnlyOne(boolean pullOutOnlyOne) {
        this.pullOutOnlyOne = pullOutOnlyOne;
        return this;
    }

    /**
     * Specifies whether the animation should be sequenced or all slices should appear at
     * once.
     **/
    public Boolean getSequencedAnimation() {
        return sequencedAnimation;
    }
    public AmSlicedChart setSequencedAnimation(boolean sequencedAnimation) {
        this.sequencedAnimation = sequencedAnimation;
        return this;
    }

    /**
     * Initial opacity of all slices. Slices will fade in from startAlpha.
     **/
    public Double getStartAlpha() {
        return startAlpha;
    }
    public AmSlicedChart setStartAlpha(double startAlpha) {
        this.startAlpha = startAlpha;
        return this;
    }

    /**
     * Duration of the animation, in seconds.
     **/
    public Double getStartDuration() {
        return startDuration;
    }
    public AmSlicedChart setStartDuration(double startDuration) {
        this.startDuration = startDuration;
        return this;
    }

    /**
     * Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     **/
    public String getStartEffect() {
        return startEffect;
    }
    public AmSlicedChart setStartEffect(String startEffect) {
        this.startEffect = startEffect;
        return this;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's title.
     **/
    public String getTitleField() {
        return titleField;
    }
    public AmSlicedChart setTitleField(String titleField) {
        this.titleField = titleField;
        return this;
    }

    /**
     * Name of the field in chart's dataProvider which holds url which would be accessed
     * if the user clicks on a slice.
     **/
    public String getUrlField() {
        return urlField;
    }
    public AmSlicedChart setUrlField(String urlField) {
        this.urlField = urlField;
        return this;
    }

    /**
     * If url is specified for a slice, it will be opened when user clicks on it. urlTarget
     * specifies target of this url. Use _blank if you want url to be opened in a new window.
     **/
    public String getUrlTarget() {
        return urlTarget;
    }
    public AmSlicedChart setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
        return this;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's value.
     **/
    public String getValueField() {
        return valueField;
    }
    public AmSlicedChart setValueField(String valueField) {
        this.valueField = valueField;
        return this;
    }

    /**
     * Name of the field in chart's dataProvider which holds boolean variable defining whether
     * this data item should have an entry in the legend.
     **/
    public String getVisibleInLegendField() {
        return visibleInLegendField;
    }
    public AmSlicedChart setVisibleInLegendField(String visibleInLegendField) {
        this.visibleInLegendField = visibleInLegendField;
        return this;
    }

}