package de.stekoe.amcharts;

import java.util.Date;

/**
 * Extension for AmSerialChart to gantt charts. Gantt charts usually display multiple
 * bars on one series where value axis displays date/time and is horizontal.
 */

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
     * @param brightnessStep Lightness increase of each subsequent bar of one series. Value range is from -255
     *                       to 255.
     * @return AmGanttChart
     */
    public AmGanttChart setBrightnessStep(double brightnessStep) {
        this.brightnessStep = brightnessStep;
        return this;
    }

    public Double getBrightnessStep() {
        return brightnessStep;
    }

    /**
     * @param columnWidthField Field of column width of a segments in your data provider.
     * @return AmGanttChart
     */
    public AmGanttChart setColumnWidthField(String columnWidthField) {
        this.columnWidthField = columnWidthField;
        return this;
    }

    public String getColumnWidthField() {
        return columnWidthField;
    }

    /**
     * @param durationField Instead of specifying end date or end value in your data, you can specify duration
     *                      of a segment.
     * @return AmGanttChart
     */
    public AmGanttChart setDurationField(String durationField) {
        this.durationField = durationField;
        return this;
    }

    public String getDurationField() {
        return durationField;
    }

    /**
     * @param endDateField Field in your data provider which holds end date of a segment. Dates in your data
     *                     can be set by time stamp or Date object or string (chart.dataDateFormat should define
     *                     date format in latter case).
     * @return AmGanttChart
     */
    public AmGanttChart setEndDateField(String endDateField) {
        this.endDateField = endDateField;
        return this;
    }

    public String getEndDateField() {
        return endDateField;
    }

    /**
     * @param endField Field in your data provider which holds end value of a segment. If your data is date-based,
     *                 you should use endDateField instead, unless you specified chart.startDate and chart.period
     *                 values. In this case you can use endField and set number of periods instead of providing
     *                 exact end date.
     * @return AmGanttChart
     */
    public AmGanttChart setEndField(String endField) {
        this.endField = endField;
        return this;
    }

    public String getEndField() {
        return endField;
    }

    /**
     * @param graph Graph of a Gantt chart. Gant chart actually creates multiple graphs (separate for
     *              each segment). Properties of this graph are passed to each of the created graphs
     *              - this allows you to control the look of segments.
     * @return AmGanttChart
     */
    public AmGanttChart setGraph(AmGraph graph) {
        this.graph = graph;
        return this;
    }

    public AmGraph getGraph() {
        return graph;
    }

    /**
     * @param period Data period. Used only value axis is date-based.
     * @return AmGanttChart
     */
    public AmGanttChart setPeriod(String period) {
        this.period = period;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    /**
     * @param segmentsField Segments field in your data provider.
     * @return AmGanttChart
     */
    public AmGanttChart setSegmentsField(String segmentsField) {
        this.segmentsField = segmentsField;
        return this;
    }

    public String getSegmentsField() {
        return segmentsField;
    }

    /**
     * @param startDate Initial date of value axis. If you set this date (you can do it using time stamp,
     *                  Date object or date string), you can then set start/end/duration of segments using
     *                  number of periods instead of providing exact dates.
     * @return AmGanttChart
     */
    public AmGanttChart setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDateField Field in your data provider which holds start date of a segment. Dates in your data
     *                       can be set by time stamp or Date object or string (chart.dataDateFormat should define
     *                       date format in latter case).
     * @return AmGanttChart
     */
    public AmGanttChart setStartDateField(String startDateField) {
        this.startDateField = startDateField;
        return this;
    }

    public String getStartDateField() {
        return startDateField;
    }

    /**
     * @param startField Field in your data provider which holds start value of a segment. If your data is
     *                   date-based, you should use startDateField instead, unless you specified chart.startDate
     *                   and chart.period values. In this case you can use startField and set number of periods
     *                   instead of providing exact start date.
     * @return AmGanttChart
     */
    public AmGanttChart setStartField(String startField) {
        this.startField = startField;
        return this;
    }

    public String getStartField() {
        return startField;
    }

    /**
     * @param valueAxis *Value axis of Gantt chart. Set it's type to "date" if your data is date or time based.
     * @return AmGanttChart
     */
    public AmGanttChart setValueAxis(ValueAxis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    public ValueAxis getValueAxis() {
        return valueAxis;
    }

}