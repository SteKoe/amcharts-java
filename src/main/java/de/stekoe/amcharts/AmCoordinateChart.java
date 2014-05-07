package de.stekoe.amcharts;

import java.util.List;

import de.stekoe.amcharts.addition.Color;

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
     * Read-only. Array, holding processed chart's data.
     **/
    public List<Object> getChartData() {
        return chartData;
    }
    public AmCoordinateChart setChartData(List<Object> chartData) {
        this.chartData = chartData;
        return this;
    }

    /**
     * Specifies the colors of the graphs if the lineColor of a graph is not set. It there
     * are more graphs then colors in this array, the chart picks random color.
     **/
    public List<Color> getColors() {
        return colors;
    }
    public AmCoordinateChart setColors(List<Color> colors) {
        this.colors = colors;
        return this;
    }

    /**
     * The array of graphs belonging to this chart.
     **/
    public List<AmGraph> getGraphs() {
        return graphs;
    }
    public AmCoordinateChart setGraphs(List<AmGraph> graphs) {
        this.graphs = graphs;
        return this;
    }

    /**
     * Specifies if grid should be drawn above the graphs or below. Will not work properly
     * with 3D charts.
     **/
    public Boolean getGridAboveGraphs() {
        return gridAboveGraphs;
    }
    public AmCoordinateChart setGridAboveGraphs(boolean gridAboveGraphs) {
        this.gridAboveGraphs = gridAboveGraphs;
        return this;
    }

    /**
     * Instead of adding guides to the axes, you can push all of them to this array. In
     * case guide has category or date defined, it will automatically will be assigned to
     * the category axis. Otherwise to first value axis, unless you specify a different
     * valueAxis for the guide.
     **/
    public List<Guide> getGuides() {
        return guides;
    }
    public AmCoordinateChart setGuides(List<Guide> guides) {
        this.guides = guides;
        return this;
    }

    /**
     * Specifies whether the animation should be sequenced or all objects should appear
     * at once.
     **/
    public Boolean getSequencedAnimation() {
        return sequencedAnimation;
    }
    public AmCoordinateChart setSequencedAnimation(boolean sequencedAnimation) {
        this.sequencedAnimation = sequencedAnimation;
        return this;
    }

    /**
     * The initial opacity of the column/line. If you set startDuration to a value higher
     * than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1.
     **/
    public Double getStartAlpha() {
        return startAlpha;
    }
    public AmCoordinateChart setStartAlpha(double startAlpha) {
        this.startAlpha = startAlpha;
        return this;
    }

    /**
     * Duration of the animation, in seconds.
     **/
    public Double getStartDuration() {
        return startDuration;
    }
    public AmCoordinateChart setStartDuration(double startDuration) {
        this.startDuration = startDuration;
        return this;
    }

    /**
     * Animation effect. Possible values are: easeOutSine, easeInSine, elastic, bounce
     **/
    public String getStartEffect() {
        return startEffect;
    }
    public AmCoordinateChart setStartEffect(String startEffect) {
        this.startEffect = startEffect;
        return this;
    }

    /**
     * Target of url.
     **/
    public String getUrlTarget() {
        return urlTarget;
    }
    public AmCoordinateChart setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
        return this;
    }

    /**
     * The array of value axes. Chart creates one value axis automatically, so if you need
     * only one value axis, you don't need to create it.
     **/
    public List<ValueAxis> getValueAxes() {
        return valueAxes;
    }
    public AmCoordinateChart setValueAxes(List<ValueAxis> valueAxes) {
        this.valueAxes = valueAxes;
        return this;
    }

}