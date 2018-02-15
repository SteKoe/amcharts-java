package de.stekoe.amcharts;

import de.stekoe.amcharts.addition.Color;

import java.util.List;

/**
 * *Base class of AmRectangularChart and AmRadarChart. It can not be instantiated explicitly.
 */

public class AmCoordinateChart extends AmChart {
    private List<Object> chartData;
    private List<Color> colors;
    private List<AmGraph> graphs;
    private Boolean gridAboveGraphs;
    private List<Guide> guides;
    private Boolean sequencedAnimation;
    private Double startAlpha;
    private Double startDuration;
    private String startEffect;
    private String urlTarget;
    private List<ValueAxis> valueAxes;

    /**
     * @param chartData Read-only. Array, holding processed chart's data.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setChartData(List<Object> chartData) {
        this.chartData = chartData;
        return this;
    }

    public List<Object> getChartData() {
        return chartData;
    }

    /**
     * @param colors Specifies the colors of the graphs if the lineColor of a graph is not set. If there
     *               are more graphs then colors in this array, the chart picks a random color.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setColors(List<Color> colors) {
        this.colors = colors;
        return this;
    }

    public List<Color> getColors() {
        return colors;
    }

    /**
     * @param graphs The array of graphs belonging to this chart.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setGraphs(List<AmGraph> graphs) {
        this.graphs = graphs;
        return this;
    }

    public List<AmGraph> getGraphs() {
        return graphs;
    }

    /**
     * @param gridAboveGraphs Specifies if grid should be drawn above the graphs or below. Will not work properly
     *                        with 3D charts.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setGridAboveGraphs(boolean gridAboveGraphs) {
        this.gridAboveGraphs = gridAboveGraphs;
        return this;
    }

    public Boolean getGridAboveGraphs() {
        return gridAboveGraphs;
    }

    /**
     * @param guides Instead of adding guides to the axes, you can push all of them to this array. In
     *               case guide has category or date defined, it will automatically will be assigned to
     *               the category axis. Otherwise to first value axis, unless you specify a different
     *               valueAxis for the guide.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setGuides(List<Guide> guides) {
        this.guides = guides;
        return this;
    }

    public List<Guide> getGuides() {
        return guides;
    }

    /**
     * @param sequencedAnimation Specifies whether the animation should be sequenced or all objects should appear
     *                           at once.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setSequencedAnimation(boolean sequencedAnimation) {
        this.sequencedAnimation = sequencedAnimation;
        return this;
    }

    public Boolean getSequencedAnimation() {
        return sequencedAnimation;
    }

    /**
     * @param startAlpha The initial opacity of the column/line. If you set startDuration to a value higher
     *                   than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setStartAlpha(double startAlpha) {
        this.startAlpha = startAlpha;
        return this;
    }

    public Double getStartAlpha() {
        return startAlpha;
    }

    /**
     * @param startDuration Duration of the animation, in seconds.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setStartDuration(double startDuration) {
        this.startDuration = startDuration;
        return this;
    }

    public Double getStartDuration() {
        return startDuration;
    }

    /**
     * @param startEffect Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setStartEffect(String startEffect) {
        this.startEffect = startEffect;
        return this;
    }

    public String getStartEffect() {
        return startEffect;
    }

    /**
     * @param urlTarget Target of url.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
        return this;
    }

    public String getUrlTarget() {
        return urlTarget;
    }

    /**
     * @param valueAxes The array of value axes. Chart creates one value axis automatically, so if you need
     *                  only one value axis, you don't need to create it.
     * @return AmCoordinateChart
     */
    public AmCoordinateChart setValueAxes(List<ValueAxis> valueAxes) {
        this.valueAxes = valueAxes;
        return this;
    }

    public List<ValueAxis> getValueAxes() {
        return valueAxes;
    }

}