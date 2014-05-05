package de.stekoe.amcharts;

public abstract class AxisBase {
    private boolean autoGridCount = true;
    private double axisAlpha = 1;
    private Color axisColor = Color.BLACK;
    private double axisThickness = 1;
    private double axisX;
    private double axisY;
    private String color;
    private double dashLength = 0;
    private double fillAlpha = 0;
    private Color fillColor = Color.WHITE;
    private double fontSize;
    private double gridAlpha = 0.15;
    private Color gridColor = Color.BLACK;
    private double gridCount = 5;
    private double gridThickness = 1;
    // private Array[Guide] guides = [];
    private boolean ignoreAxisWidth = false;
    private boolean inside = false;
    private double labelFrequency = 1;
    private double labelRotation = 0;
    private boolean labelsEnabled = true;
    private double minHorizontalGap = 75;
    private double minorGridAlpha = 0.07;
    private boolean minorGridEnabled = false;
    private double minVerticalGap = 35;
    private double offset = 0;
    private Position position = Position.bottom;
    private boolean showFirstLabel = true;
    private boolean showLastLabel = true;
    private double tickLength = 5;
    private String title;
    private boolean titleBold = true;
    private String titleColor;
    private double titleFontSize;

    public boolean isAutoGridCount() {
        return autoGridCount;
    }
    public void setAutoGridCount(boolean autoGridCount) {
        this.autoGridCount = autoGridCount;
    }
    public double getAxisAlpha() {
        return axisAlpha;
    }
    public void setAxisAlpha(double axisAlpha) {
        this.axisAlpha = axisAlpha;
    }
    public Color getAxisColor() {
        return axisColor;
    }
    public void setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
    }
    public double getAxisThickness() {
        return axisThickness;
    }
    public void setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
    }
    public double getAxisX() {
        return axisX;
    }
    public void setAxisX(double axisX) {
        this.axisX = axisX;
    }
    public double getAxisY() {
        return axisY;
    }
    public void setAxisY(double axisY) {
        this.axisY = axisY;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getDashLength() {
        return dashLength;
    }
    public void setDashLength(double dashLength) {
        this.dashLength = dashLength;
    }
    public double getFillAlpha() {
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
    public double getFontSize() {
        return fontSize;
    }
    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }
    public double getGridAlpha() {
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
    public double getGridCount() {
        return gridCount;
    }
    public void setGridCount(double gridCount) {
        this.gridCount = gridCount;
    }
    public double getGridThickness() {
        return gridThickness;
    }
    public void setGridThickness(double gridThickness) {
        this.gridThickness = gridThickness;
    }
    public boolean isIgnoreAxisWidth() {
        return ignoreAxisWidth;
    }
    public void setIgnoreAxisWidth(boolean ignoreAxisWidth) {
        this.ignoreAxisWidth = ignoreAxisWidth;
    }
    public boolean isInside() {
        return inside;
    }
    public void setInside(boolean inside) {
        this.inside = inside;
    }
    public double getLabelFrequency() {
        return labelFrequency;
    }
    public void setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
    }
    public double getLabelRotation() {
        return labelRotation;
    }
    public void setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
    }
    public boolean isLabelsEnabled() {
        return labelsEnabled;
    }
    public void setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
    }
    public double getMinHorizontalGap() {
        return minHorizontalGap;
    }
    public void setMinHorizontalGap(double minHorizontalGap) {
        this.minHorizontalGap = minHorizontalGap;
    }
    public double getMinorGridAlpha() {
        return minorGridAlpha;
    }
    public void setMinorGridAlpha(double minorGridAlpha) {
        this.minorGridAlpha = minorGridAlpha;
    }
    public boolean isMinorGridEnabled() {
        return minorGridEnabled;
    }
    public void setMinorGridEnabled(boolean minorGridEnabled) {
        this.minorGridEnabled = minorGridEnabled;
    }
    public double getMinVerticalGap() {
        return minVerticalGap;
    }
    public void setMinVerticalGap(double minVerticalGap) {
        this.minVerticalGap = minVerticalGap;
    }
    public double getOffset() {
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
    public boolean isShowFirstLabel() {
        return showFirstLabel;
    }
    public void setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
    }
    public boolean isShowLastLabel() {
        return showLastLabel;
    }
    public void setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
    }
    public double getTickLength() {
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
    public boolean isTitleBold() {
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
    public double getTitleFontSize() {
        return titleFontSize;
    }
    public void setTitleFontSize(double titleFontSize) {
        this.titleFontSize = titleFontSize;
    }
}
