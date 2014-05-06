package de.stekoe.amcharts;

import java.util.List;
public class AmSlicedChart extends AmChart {
    private Double alpha;
    private String alphaField;
    private Color baseColor;
    private Double brightnessStep;
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
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
    public Double getAlpha() {
        return alpha;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's alpha.
     **/
    public void setAlphaField(String alphaField) {
        this.alphaField = alphaField;
    }
    public String getAlphaField() {
        return alphaField;
    }

    /**
     *      *Color of the first slice. All the other will be colored with darker or brighter colors.
     **/
    public void setBaseColor(Color baseColor) {
        this.baseColor = baseColor;
    }
    public Color getBaseColor() {
        return baseColor;
    }

    /**
     * Lightness increase of each subsequent slice. This is only useful if baseColor is
     * set. Use negative values for darker colors. Value range is from -255 to 255.
     **/
    public void setBrightnessStep(double brightnessStep) {
        this.brightnessStep = brightnessStep;
    }
    public Double getBrightnessStep() {
        return brightnessStep;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's color.
     **/
    public void setColorField(String colorField) {
        this.colorField = colorField;
    }
    public String getColorField() {
        return colorField;
    }

    /**
     * Specifies the colors of the slices, if the slice color is not set. If there are more
     * slices than colors in this array, the chart picks random color.
     **/
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }
    public List<Color> getColors() {
        return colors;
    }

    /**
     * Name of the field in chart's dataProvider which holds a string with description.
     **/
    public void setDescriptionField(String descriptionField) {
        this.descriptionField = descriptionField;
    }
    public String getDescriptionField() {
        return descriptionField;
    }

    /**
     * Example: [0,10]. Will make slices to be filled with color gradients.
     **/
    public void setGradientRatio(List<Number> gradientRatio) {
        this.gradientRatio = gradientRatio;
    }
    public List<Number> getGradientRatio() {
        return gradientRatio;
    }

    /**
     * Opacity of the group slice. Value range is 0 - 1.
     **/
    public void setGroupedAlpha(double groupedAlpha) {
        this.groupedAlpha = groupedAlpha;
    }
    public Double getGroupedAlpha() {
        return groupedAlpha;
    }

    /**
     * Color of the group slice. The default value is not set - this means the next available
     * color from "colors" array will be used.
     **/
    public void setGroupedColor(Color groupedColor) {
        this.groupedColor = groupedColor;
    }
    public Color getGroupedColor() {
        return groupedColor;
    }

    /**
     * Description of the group slice.
     **/
    public void setGroupedDescription(String groupedDescription) {
        this.groupedDescription = groupedDescription;
    }
    public String getGroupedDescription() {
        return groupedDescription;
    }

    /**
     * If this is set to true, the group slice will be pulled out when the chart loads.
     **/
    public void setGroupedPulled(boolean groupedPulled) {
        this.groupedPulled = groupedPulled;
    }
    public boolean isGroupedPulled() {
        return groupedPulled;
    }

    /**
     * Title of the group slice.
     **/
    public void setGroupedTitle(String groupedTitle) {
        this.groupedTitle = groupedTitle;
    }
    public String getGroupedTitle() {
        return groupedTitle;
    }

    /**
     * If there is more than one slice whose percentage of the pie is less than this number,
     * those slices will be grouped together into one slice. This is the "other" slice.
     * It will always be the last slice in a pie.
     **/
    public void setGroupPercent(double groupPercent) {
        this.groupPercent = groupPercent;
    }
    public Double getGroupPercent() {
        return groupPercent;
    }

    /**
     * Slices with percent less then hideLabelsPercent won't display labels This is useful
     * to avoid cluttering up the chart, if you have a lot of small slices. 0 means all
     * labels will be shown.
     **/
    public void setHideLabelsPercent(double hideLabelsPercent) {
        this.hideLabelsPercent = hideLabelsPercent;
    }
    public Double getHideLabelsPercent() {
        return hideLabelsPercent;
    }

    /**
     * Opacity of a hovered slice. Value range is 0 - 1.
     **/
    public void setHoverAlpha(double hoverAlpha) {
        this.hoverAlpha = hoverAlpha;
    }
    public Double getHoverAlpha() {
        return hoverAlpha;
    }

    /**
     * Specifies whether data labels are visible.
     **/
    public void setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
    }
    public boolean isLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * Label tick opacity. Value range is 0 - 1.
     **/
    public void setLabelTickAlpha(double labelTickAlpha) {
        this.labelTickAlpha = labelTickAlpha;
    }
    public Double getLabelTickAlpha() {
        return labelTickAlpha;
    }

    /**
     * Label tick color.
     **/
    public void setLabelTickColor(Color labelTickColor) {
        this.labelTickColor = labelTickColor;
    }
    public Color getLabelTickColor() {
        return labelTickColor;
    }

    /**
     * Bottom margin of the chart.
     **/
    public void setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
    }
    public Double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Left margin of the chart.
     **/
    public void setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
    }
    public Double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Right margin of the chart.
     **/
    public void setMarginRight(double marginRight) {
        this.marginRight = marginRight;
    }
    public Double getMarginRight() {
        return marginRight;
    }

    /**
     * Top margin of the chart.
     **/
    public void setMarginTop(double marginTop) {
        this.marginTop = marginTop;
    }
    public Double getMarginTop() {
        return marginTop;
    }

    /**
     * Outline opacity. Value range is 0 - 1.
     **/
    public void setOutlineAlpha(double outlineAlpha) {
        this.outlineAlpha = outlineAlpha;
    }
    public Double getOutlineAlpha() {
        return outlineAlpha;
    }

    /**
     * Outline color.
     **/
    public void setOutlineColor(Color outlineColor) {
        this.outlineColor = outlineColor;
    }
    public Color getOutlineColor() {
        return outlineColor;
    }

    /**
     * Pie outline thickness.
     **/
    public void setOutlineThickness(double outlineThickness) {
        this.outlineThickness = outlineThickness;
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
    public void setPatternField(String patternField) {
        this.patternField = patternField;
    }
    public String getPatternField() {
        return patternField;
    }

    /**
     * Name of the field in chart's dataProvider which holds a boolean value telling the
     * chart whether this slice must be pulled or not.
     **/
    public void setPulledField(String pulledField) {
        this.pulledField = pulledField;
    }
    public String getPulledField() {
        return pulledField;
    }

    /**
     * Pull out duration, in seconds.
     **/
    public void setPullOutDuration(double pullOutDuration) {
        this.pullOutDuration = pullOutDuration;
    }
    public Double getPullOutDuration() {
        return pullOutDuration;
    }

    /**
     * Pull out effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     **/
    public void setPullOutEffect(String pullOutEffect) {
        this.pullOutEffect = pullOutEffect;
    }
    public String getPullOutEffect() {
        return pullOutEffect;
    }

    /**
     * If this is set to true, only one slice can be pulled out at a time. If the viewer
     * clicks on a slice, any other pulled-out slice will be pulled in.
     **/
    public void setPullOutOnlyOne(boolean pullOutOnlyOne) {
        this.pullOutOnlyOne = pullOutOnlyOne;
    }
    public boolean isPullOutOnlyOne() {
        return pullOutOnlyOne;
    }

    /**
     * Specifies whether the animation should be sequenced or all slices should appear at
     * once.
     **/
    public void setSequencedAnimation(boolean sequencedAnimation) {
        this.sequencedAnimation = sequencedAnimation;
    }
    public boolean isSequencedAnimation() {
        return sequencedAnimation;
    }

    /**
     * Initial opacity of all slices. Slices will fade in from startAlpha.
     **/
    public void setStartAlpha(double startAlpha) {
        this.startAlpha = startAlpha;
    }
    public Double getStartAlpha() {
        return startAlpha;
    }

    /**
     * Duration of the animation, in seconds.
     **/
    public void setStartDuration(double startDuration) {
        this.startDuration = startDuration;
    }
    public Double getStartDuration() {
        return startDuration;
    }

    /**
     * Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     **/
    public void setStartEffect(String startEffect) {
        this.startEffect = startEffect;
    }
    public String getStartEffect() {
        return startEffect;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's title.
     **/
    public void setTitleField(String titleField) {
        this.titleField = titleField;
    }
    public String getTitleField() {
        return titleField;
    }

    /**
     * Name of the field in chart's dataProvider which holds url which would be accessed
     * if the user clicks on a slice.
     **/
    public void setUrlField(String urlField) {
        this.urlField = urlField;
    }
    public String getUrlField() {
        return urlField;
    }

    /**
     * If url is specified for a slice, it will be opened when user clicks on it. urlTarget
     * specifies target of this url. Use _blank if you want url to be opened in a new window.
     **/
    public void setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
    }
    public String getUrlTarget() {
        return urlTarget;
    }

    /**
     * Name of the field in chart's dataProvider which holds slice's value.
     **/
    public void setValueField(String valueField) {
        this.valueField = valueField;
    }
    public String getValueField() {
        return valueField;
    }

    /**
     * Name of the field in chart's dataProvider which holds boolean variable defining whether
     * this data item should have an entry in the legend.
     **/
    public void setVisibleInLegendField(String visibleInLegendField) {
        this.visibleInLegendField = visibleInLegendField;
    }
    public String getVisibleInLegendField() {
        return visibleInLegendField;
    }

}