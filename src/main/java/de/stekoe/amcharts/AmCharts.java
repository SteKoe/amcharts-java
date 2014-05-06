package de.stekoe.amcharts;

import java.util.List;
public class AmCharts {
    private Boolean baseHref;
    private List<String> dayNames;
    private List<String> monthNames;
    private Double processDelay;
    private List<String> shortDayNames;
    private List<String> shortMonthNames;
    private String theme;
    private Boolean useUTC;

    /**
     * Set it to true if you have base href set for your page. This will fix rendering problems
     * in Firefox caused by base href.
     **/
    public void setBaseHref(boolean baseHref) {
        this.baseHref = baseHref;
    }
    public boolean isBaseHref() {
        return baseHref;
    }

    /**
     * Array of day names, used when formatting dates (if categoryAxis.parseDates is set
     * to true)
     **/
    public void setDayNames(List<String> dayNames) {
        this.dayNames = dayNames;
    }
    public List<String> getDayNames() {
        return dayNames;
    }

    /**
     * Array of month names, used when formatting dates (if categoryAxis.parseDates is set
     * to true)
     **/
    public void setMonthNames(List<String> monthNames) {
        this.monthNames = monthNames;
    }
    public List<String> getMonthNames() {
        return monthNames;
    }

    /**
     * Delay in ms at which each chart on the page should be rendered. This is very handy
     * if you have a lot of charts on the page and do not want to overload the device CPU.
     **/
    public void setProcessDelay(double processDelay) {
        this.processDelay = processDelay;
    }
    public Double getProcessDelay() {
        return processDelay;
    }

    /**
     * Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates
     * is set to true)
     **/
    public void setShortDayNames(List<String> shortDayNames) {
        this.shortDayNames = shortDayNames;
    }
    public List<String> getShortDayNames() {
        return shortDayNames;
    }

    /**
     * Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates
     * is set to true)
     **/
    public void setShortMonthNames(List<String> shortMonthNames) {
        this.shortMonthNames = shortMonthNames;
    }
    public List<String> getShortMonthNames() {
        return shortMonthNames;
    }

    /**
     * You can set theme for all the charts on your page by setting: AmCharts.theme = AmCharts.themes.light;
     * // or some other theme. If you are creating charts using JavaScript API, not JSON,
     * then this is quite a comfortable way, as you won't need to pass theme to each object
     * you create. Note, you should set theme before write method is called. There is no
     * way to change theme of already created chart, you have to create chart's instance
     * once more if you want to change theme.
     **/
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public String getTheme() {
        return theme;
    }

    /**
     * Set it to true if you want UTC time to be used instead of local time.
     **/
    public void setUseUTC(boolean useUTC) {
        this.useUTC = useUTC;
    }
    public boolean isUseUTC() {
        return useUTC;
    }

}