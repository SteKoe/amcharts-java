package de.stekoe.amcharts;

public abstract class AxisBase extends Jsonifyable {
    private Boolean autoGridCount;
    private Double axisAlpha;
    private Color axisColor;
    private Double axisThickness;
    private Double axisX;
    private Double axisY;
    private String color;
    private Double dashLength;
    private Double fillAlpha;
    private Color fillColor;
    private Double fontSize;
    private Double gridAlpha;
    private Color gridColor;
    private Double gridCount;
    private Double gridThickness;
    // private Array[Guide] guides;
    private Boolean ignoreAxisWidth;
    private Boolean inside;
    private Double labelFrequency;
    private Double labelRotation;
    private Boolean labelsEnabled;
    private Double minHorizontalGap;
    private Double minorGridAlpha;
    private Boolean minorGridEnabled;
    private Double minVerticalGap;
    private Double offset;
    private Position position;
    private Boolean showFirstLabel;
    private Boolean showLastLabel;
    private Double tickLength;
    private String title;
    private Boolean titleBold;
    private String titleColor;
    private Double titleFontSize;

    public Boolean isAutoGridCount() {
        return autoGridCount;
    }
    public void setAutoGridCount(boolean autoGridCount) {
        this.autoGridCount = autoGridCount;
    }
    public Double getAxisAlpha() {
        return axisAlpha;
    }
    public void setAxisAlpha(Double axisAlpha) {
        this.axisAlpha = axisAlpha;
    }
    public Color getAxisColor() {
        return axisColor;
    }
    public void setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
    }
    public Double getAxisThickness() {
        return axisThickness;
    }
    public void setAxisThickness(Double axisThickness) {
        this.axisThickness = axisThickness;
    }
    public Double getAxisX() {
        return axisX;
    }
    public void setAxisX(Double axisX) {
        this.axisX = axisX;
    }
    public Double getAxisY() {
        return axisY;
    }
    public void setAxisY(Double axisY) {
        this.axisY = axisY;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Double getDashLength() {
        return dashLength;
    }
    public void setDashLength(double dashLength) {
        this.dashLength = dashLength;
    }
    public Double getFillAlpha() {
        return fillAlpha;
    }
    public void setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
    }
    public Color getFillColor() {
        return fillColor;
    }
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
    public Double getFontSize() {
        return fontSize;
    }
    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }
    public Double getGridAlpha() {
        return gridAlpha;
    }
    public void setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
    }
    public Color getGridColor() {
        return gridColor;
    }
    public void setGridColor(Color gridColor) {
        this.gridColor = gridColor;
    }
    public Double getGridCount() {
        return gridCount;
    }
    public void setGridCount(double gridCount) {
        this.gridCount = gridCount;
    }
    public Double getGridThickness() {
        return gridThickness;
    }
    public void setGridThickness(double gridThickness) {
        this.gridThickness = gridThickness;
    }
    public Boolean isIgnoreAxisWidth() {
        return ignoreAxisWidth;
    }
    public void setIgnoreAxisWidth(boolean ignoreAxisWidth) {
        this.ignoreAxisWidth = ignoreAxisWidth;
    }
    public Boolean isInside() {
        return inside;
    }
    public void setInside(boolean inside) {
        this.inside = inside;
    }
    public Double getLabelFrequency() {
        return labelFrequency;
    }
    public void setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
    }
    public Double getLabelRotation() {
        return labelRotation;
    }
    public void setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
    }
    public Boolean isLabelsEnabled() {
        return labelsEnabled;
    }
    public void setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
    }
    public Double getMinHorizontalGap() {
        return minHorizontalGap;
    }
    public void setMinHorizontalGap(double minHorizontalGap) {
        this.minHorizontalGap = minHorizontalGap;
    }
    public Double getMinorGridAlpha() {
        return minorGridAlpha;
    }
    public void setMinorGridAlpha(double minorGridAlpha) {
        this.minorGridAlpha = minorGridAlpha;
    }
    public Boolean isMinorGridEnabled() {
        return minorGridEnabled;
    }
    public void setMinorGridEnabled(boolean minorGridEnabled) {
        this.minorGridEnabled = minorGridEnabled;
    }
    public Double getMinVerticalGap() {
        return minVerticalGap;
    }
    public void setMinVerticalGap(double minVerticalGap) {
        this.minVerticalGap = minVerticalGap;
    }
    public Double getOffset() {
        return offset;
    }
    public void setOffset(double offset) {
        this.offset = offset;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public Boolean isShowFirstLabel() {
        return showFirstLabel;
    }
    public void setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
    }
    public Boolean isShowLastLabel() {
        return showLastLabel;
    }
    public void setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
    }
    public Double getTickLength() {
        return tickLength;
    }
    public void setTickLength(double tickLength) {
        this.tickLength = tickLength;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Boolean isTitleBold() {
        return titleBold;
    }
    public void setTitleBold(boolean titleBold) {
        this.titleBold = titleBold;
    }
    public String getTitleColor() {
        return titleColor;
    }
    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }
    public Double getTitleFontSize() {
        return titleFontSize;
    }
    public void setTitleFontSize(double titleFontSize) {
        this.titleFontSize = titleFontSize;
    }
}
