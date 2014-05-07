package de.stekoe.amcharts;

import java.io.Serializable;

import de.stekoe.amcharts.addition.Color;

public class AmExport implements Serializable {
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
    public String getBottom() {
        return bottom;
    }
    public AmExport setBottom(String bottom) {
        this.bottom = bottom;
        return this;
    }

    /**
     * Opacity of a button.
     **/
    public Double getButtonAlpha() {
        return buttonAlpha;
    }
    public AmExport setButtonAlpha(double buttonAlpha) {
        this.buttonAlpha = buttonAlpha;
        return this;
    }

    /**
     * Name of export button image.
     **/
    public String getButtonIcon() {
        return buttonIcon;
    }
    public AmExport setButtonIcon(String buttonIcon) {
        this.buttonIcon = buttonIcon;
        return this;
    }

    /**
     * Roll-over color of button background.
     **/
    public Color getButtonRollOverColor() {
        return buttonRollOverColor;
    }
    public AmExport setButtonRollOverColor(Color buttonRollOverColor) {
        this.buttonRollOverColor = buttonRollOverColor;
        return this;
    }

    /**
     * Text, displayed in a tool-tip.
     **/
    public String getButtonTitle() {
        return buttonTitle;
    }
    public AmExport setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
        return this;
    }

    /**
     * Specifies if export of JPG should be enabled.
     **/
    public Boolean getExportJPG() {
        return exportJPG;
    }
    public AmExport setExportJPG(boolean exportJPG) {
        this.exportJPG = exportJPG;
        return this;
    }

    /**
     * Specifies if export of PDF should be enabled.
     **/
    public Boolean getExportPDF() {
        return exportPDF;
    }
    public AmExport setExportPDF(boolean exportPDF) {
        this.exportPDF = exportPDF;
        return this;
    }

    /**
     * Specifies if export of PNG should be enabled.
     **/
    public Boolean getExportPNG() {
        return exportPNG;
    }
    public AmExport setExportPNG(boolean exportPNG) {
        this.exportPNG = exportPNG;
        return this;
    }

    /**
     * Specifies if export of SVG should be enabled.
     **/
    public Boolean getExportSVG() {
        return exportSVG;
    }
    public AmExport setExportSVG(boolean exportSVG) {
        this.exportSVG = exportSVG;
        return this;
    }

    /**
     * Background color of a saved image
     **/
    public Color getImageBackgroundColor() {
        return imageBackgroundColor;
    }
    public AmExport setImageBackgroundColor(Color imageBackgroundColor) {
        this.imageBackgroundColor = imageBackgroundColor;
        return this;
    }

    /**
     * File name of a saved image.
     **/
    public String getImageFileName() {
        return imageFileName;
    }
    public AmExport setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
        return this;
    }

    /**
     * Left position of export button. You might need to set right to undefined for this
     * to work.
     **/
    public String getLeft() {
        return left;
    }
    public AmExport setLeft(String left) {
        this.left = left;
        return this;
    }

    /**
     * Right position of export button. You might need to set left to undefined for this
     * to work.
     **/
    public String getRight() {
        return right;
    }
    public AmExport setRight(String right) {
        this.right = right;
        return this;
    }

    /**
     * Text roll-over color.
     **/
    public Color getTextRollOverColor() {
        return textRollOverColor;
    }
    public AmExport setTextRollOverColor(Color textRollOverColor) {
        this.textRollOverColor = textRollOverColor;
        return this;
    }

    /**
     * Top position of export button. You might need to set bottom to undefined for this
     * to work.
     **/
    public String getTop() {
        return top;
    }
    public AmExport setTop(String top) {
        this.top = top;
        return this;
    }


}