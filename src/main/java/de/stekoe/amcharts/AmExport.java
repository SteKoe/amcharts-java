package de.stekoe.amcharts;

public class AmExport {
    private String bottom;
    private Double buttonAlpha;
    private String buttonIcon;
    private Color buttonRollOverColor;
    private String buttonTitle;
    private Boolean exportJPG;
    private Boolean exportPDF;
    private Boolean exportPNG;
    private Boolean exportSVG;
    private Color imageBackgroundColor;
    private String imageFileName;
    private String left;
    private String right;
    private Color textRollOverColor;
    private String top;

    /**
     * Bottom position of export button. You might need to set top to undefined for this
     * to work.
     **/
    public void setBottom(String bottom) {
        this.bottom = bottom;
    }
    public String getBottom() {
        return bottom;
    }

    /**
     * Opacity of a button.
     **/
    public void setButtonAlpha(double buttonAlpha) {
        this.buttonAlpha = buttonAlpha;
    }
    public Double getButtonAlpha() {
        return buttonAlpha;
    }

    /**
     * Name of export button image.
     **/
    public void setButtonIcon(String buttonIcon) {
        this.buttonIcon = buttonIcon;
    }
    public String getButtonIcon() {
        return buttonIcon;
    }

    /**
     * Roll-over color of button background.
     **/
    public void setButtonRollOverColor(Color buttonRollOverColor) {
        this.buttonRollOverColor = buttonRollOverColor;
    }
    public Color getButtonRollOverColor() {
        return buttonRollOverColor;
    }

    /**
     * Text, displayed in a tool-tip.
     **/
    public void setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
    }
    public String getButtonTitle() {
        return buttonTitle;
    }

    /**
     * Specifies if export of JPG should be enabled.
     **/
    public void setExportJPG(boolean exportJPG) {
        this.exportJPG = exportJPG;
    }
    public boolean isExportJPG() {
        return exportJPG;
    }

    /**
     * Specifies if export of PDF should be enabled.
     **/
    public void setExportPDF(boolean exportPDF) {
        this.exportPDF = exportPDF;
    }
    public boolean isExportPDF() {
        return exportPDF;
    }

    /**
     * Specifies if export of PNG should be enabled.
     **/
    public void setExportPNG(boolean exportPNG) {
        this.exportPNG = exportPNG;
    }
    public boolean isExportPNG() {
        return exportPNG;
    }

    /**
     * Specifies if export of SVG should be enabled.
     **/
    public void setExportSVG(boolean exportSVG) {
        this.exportSVG = exportSVG;
    }
    public boolean isExportSVG() {
        return exportSVG;
    }

    /**
     * Background color of a saved image
     **/
    public void setImageBackgroundColor(Color imageBackgroundColor) {
        this.imageBackgroundColor = imageBackgroundColor;
    }
    public Color getImageBackgroundColor() {
        return imageBackgroundColor;
    }

    /**
     * File name of a saved image.
     **/
    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
    public String getImageFileName() {
        return imageFileName;
    }

    /**
     * Left position of export button. You might need to set right to undefined for this
     * to work.
     **/
    public void setLeft(String left) {
        this.left = left;
    }
    public String getLeft() {
        return left;
    }

    /**
     * Right position of export button. You might need to set left to undefined for this
     * to work.
     **/
    public void setRight(String right) {
        this.right = right;
    }
    public String getRight() {
        return right;
    }

    /**
     * Text roll-over color.
     **/
    public void setTextRollOverColor(Color textRollOverColor) {
        this.textRollOverColor = textRollOverColor;
    }
    public Color getTextRollOverColor() {
        return textRollOverColor;
    }

    /**
     * Top position of export button. You might need to set bottom to undefined for this
     * to work.
     **/
    public void setTop(String top) {
        this.top = top;
    }
    public String getTop() {
        return top;
    }

}