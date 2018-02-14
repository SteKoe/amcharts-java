package de.stekoe.amcharts;

import java.util.Date;

public class AmGanttChart extends AmSerialChart {
    private Double brightnessStep;
    private String columnWidthField;
    private String durationField;
    private String endDateField;
    private String endField;
    private AmGraph graph;
    private String period;
    private String segmentsField;
    private Date startDate;
    private String startDateField;
    private String startField;
    private ValueAxis valueAxis;

    /**
     * Lightness increase of each subsequent bar of one series. Value range is from -255
     * to 255.
     **/
    public AmGanttChart setBrightnessStep(double brightnessStep) {
        this.brightnessStep = brightnessStep;
        return this;
    }

    public Double getBrightnessStep() {
        return brightnessStep;
    }

    /**
     * Field of column width of a segments in your data provider.
     **/
    public AmGanttChart setColumnWidthField(String columnWidthField) {
        this.columnWidthField = columnWidthField;
        return this;
    }

    public String getColumnWidthField() {
        return columnWidthField;
    }

    /**
     * Instead of specifying end date or end value in your data, you can specify duration
     * of a segment.
     **/
    public AmGanttChart setDurationField(String durationField) {
        this.durationField = durationField;
        return this;
    }

    public String getDurationField() {
        return durationField;
    }

    /**
     * Field in your data provider which holds end date of a segment. Dates in your data
     * can be set by time stamp or Date object or string (chart.dataDateFormat should define
     * date format in latter case).
     **/
    public AmGanttChart setEndDateField(String endDateField) {
        this.endDateField = endDateField;
        return this;
    }

    public String getEndDateField() {
        return endDateField;
    }

    /**
     * Field in your data provider which holds end value of a segment. If your data is date-based,
     * you should use endDateField instead, unless you specified chart.startDate and chart.period
     * values. In this case you can use endField and set number of periods instead of providing
     * exact end date.
     **/
    public AmGanttChart setEndField(String endField) {
        this.endField = endField;
        return this;
    }

    public String getEndField() {
        return endField;
    }

    /**
     * Graph of a Gantt chart. Gant chart actually creates multiple graphs (separate for
     * each segment). Properties of this graph are passed to each of the created graphs
     * - this allows you to control the look of segments.
     **/
    public AmGanttChart setGraph(AmGraph graph) {
        this.graph = graph;
        return this;
    }

    public AmGraph getGraph() {
        return graph;
    }

    /**
     * Data period. Used only value axis is date-based.
     **/
    public AmGanttChart setPeriod(String period) {
        this.period = period;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    /**
     * Segments field in your data provider.
     **/
    public AmGanttChart setSegmentsField(String segmentsField) {
        this.segmentsField = segmentsField;
        return this;
    }

    public String getSegmentsField() {
        return segmentsField;
    }

    /**
     * Initial date of value axis. If you set this date (you can do it using time stamp,
     * Date object or date string), you can then set start/end/duration of segments using
     * number of periods instead of providing exact dates.
     **/
    public AmGanttChart setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    /**
     * Field in your data provider which holds start date of a segment. Dates in your data
     * can be set by time stamp or Date object or string (chart.dataDateFormat should define
     * date format in latter case).
     **/
    public AmGanttChart setStartDateField(String startDateField) {
        this.startDateField = startDateField;
        return this;
    }

    public String getStartDateField() {
        return startDateField;
    }

    /**
     * Field in your data provider which holds start value of a segment. If your data is
     * date-based, you should use startDateField instead, unless you specified chart.startDate
     * and chart.period values. In this case you can use startField and set number of periods
     * instead of providing exact start date.
     **/
    public AmGanttChart setStartField(String startField) {
        this.startField = startField;
        return this;
    }

    public String getStartField() {
        return startField;
    }

    /**
     * *Value axis of Gantt chart. Set it's type to "date" if your data is date or time based.
     **/
    public AmGanttChart setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    public ValueAxis getValueAxis() {
        return valueAxis;
    }

}