package de.stekoe.amcharts;

import java.util.List;
public class AmCoordinateChart extends AmChart {
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
     * Specifies the colors of the graphs if the lineColor of a graph is not set. It there
     * are more graphs then colors in this array, the chart picks random color.
     **/
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }
    public List<Color> getColors() {
        return colors;
    }

    /**
     * The array of graphs belonging to this chart.
     **/
    public void setGraphs(List<AmGraph> graphs) {
        this.graphs = graphs;
    }
    public List<AmGraph> getGraphs() {
        return graphs;
    }

    /**
     * Specifies if grid should be drawn above the graphs or below. Will not work properly
     * with 3D charts.
     **/
    public void setGridAboveGraphs(boolean gridAboveGraphs) {
        this.gridAboveGraphs = gridAboveGraphs;
    }
    public boolean isGridAboveGraphs() {
        return gridAboveGraphs;
    }

    /**
     * Instead of adding guides to the axes, you can push all of them to this array. In
     * case guide has category or date defined, it will automatically will be assigned to
     * the category axis. Otherwise to first value axis, unless you specify a different
     * valueAxis for the guide.
     **/
    public void setGuides(List<Guide> guides) {
        this.guides = guides;
    }
    public List<Guide> getGuides() {
        return guides;
    }

    /**
     * Specifies whether the animation should be sequenced or all objects should appear
     * at once.
     **/
    public void setSequencedAnimation(boolean sequencedAnimation) {
        this.sequencedAnimation = sequencedAnimation;
    }
    public boolean isSequencedAnimation() {
        return sequencedAnimation;
    }

    /**
     * The initial opacity of the column/line. If you set startDuration to a value higher
     * than 0, the columns/lines will fade in from startAlpha. Value range is 0 - 1.
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
     * Target of url.
     **/
    public void setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
    }
    public String getUrlTarget() {
        return urlTarget;
    }

    /**
     * The array of value axes. Chart creates one value axis automatically, so if you need
     * only one value axis, you don't need to create it.
     **/
    public void setValueAxes(List<ValueAxis> valueAxes) {
        this.valueAxes = valueAxes;
    }
    public List<ValueAxis> getValueAxes() {
        return valueAxes;
    }

}