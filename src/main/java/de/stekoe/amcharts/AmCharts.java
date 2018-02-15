package de.stekoe.amcharts;

import java.io.Serializable;
import java.util.List;

/**
 * Namespace of the framework which holds the general settings, gets automatically injected
 * to document since the source has been included.
 */

public class AmCharts implements Serializable {
    private Boolean baseHref;
    private List<AmChart> charts;
    private List<String> dayNames;
    private List<String> monthNames;
    private Double processDelay;
    private List<String> shortDayNames;
    private List<String> shortMonthNames;
    private String theme;
    private Boolean useUTC;

    /**
     * @param baseHref Set it to true if you have base href set in your web page header. This will fix rendering
     *                 issues caused by this feature, like masks filters not working, causing graphs to
     *                 protrude from plot area.
     * @return AmCharts
     */
    public AmCharts setBaseHref(boolean baseHref) {
        this.baseHref = baseHref;
        return this;
    }

    public Boolean getBaseHref() {
        return baseHref;
    }

    /**
     * @param charts This array will hold references to all instances of the charts or maps created on
     *               the same page.
     * @return AmCharts
     */
    public AmCharts setCharts(List<AmChart> charts) {
        this.charts = charts;
        return this;
    }

    public List<AmChart> getCharts() {
        return charts;
    }

    /**
     * @param dayNames Array of day names, used when formatting dates (if categoryAxis.parseDates is set
     *                 to true)
     * @return AmCharts
     */
    public AmCharts setDayNames(List<String> dayNames) {
        this.dayNames = dayNames;
        return this;
    }

    public List<String> getDayNames() {
        return dayNames;
    }

    /**
     * @param monthNames Array of month names, used when formatting dates (if categoryAxis.parseDates is set
     *                   to true)
     * @return AmCharts
     */
    public AmCharts setMonthNames(List<String> monthNames) {
        this.monthNames = monthNames;
        return this;
    }

    public List<String> getMonthNames() {
        return monthNames;
    }

    /**
     * @param processDelay Delay in ms at which each chart on the page should be rendered. This is very handy
     *                     if you have a lot of charts on the page and do not want to overload the device CPU.
     * @return AmCharts
     */
    public AmCharts setProcessDelay(double processDelay) {
        this.processDelay = processDelay;
        return this;
    }

    public Double getProcessDelay() {
        return processDelay;
    }

    /**
     * @param shortDayNames Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates
     *                      is set to true)
     * @return AmCharts
     */
    public AmCharts setShortDayNames(List<String> shortDayNames) {
        this.shortDayNames = shortDayNames;
        return this;
    }

    public List<String> getShortDayNames() {
        return shortDayNames;
    }

    /**
     * @param shortMonthNames Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates
     *                        is set to true)
     * @return AmCharts
     */
    public AmCharts setShortMonthNames(List<String> shortMonthNames) {
        this.shortMonthNames = shortMonthNames;
        return this;
    }

    public List<String> getShortMonthNames() {
        return shortMonthNames;
    }

    /**
     * @param theme You can set theme for all the charts on your page by setting: AmCharts.theme = AmCharts.themes.light;
     *              // or some other theme. If you are creating charts using JavaScript API, not JSON,
     *              then this is quite a comfortable way, as you won't need to pass theme to each object
     *              you create. Note, you should set theme before write method is called. There is no
     *              way to change theme of already created chart, you have to create chart's instance
     *              once more if you want to change theme.
     * @return AmCharts
     */
    public AmCharts setTheme(String theme) {
        this.theme = theme;
        return this;
    }

    public String getTheme() {
        return theme;
    }

    /**
     * @param useUTC Set it to true if you want UTC time to be used instead of local time.
     * @return AmCharts
     */
    public AmCharts setUseUTC(boolean useUTC) {
        this.useUTC = useUTC;
        return this;
    }

    public Boolean getUseUTC() {
        return useUTC;
    }

}