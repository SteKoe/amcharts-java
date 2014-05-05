package de.stekoe.amcharts;

public class Color {

    public static final Color BLACK = create("000000");
    public static final Color WHITE = create("FFFFFF");

    private String colorHexVal;

    private Color() {};

    private Color(String colorHexVal) {
        this.colorHexVal = colorHexVal;
    }
    public static Color create(String colorHexVal) {
        return new Color(colorHexVal);
    }

    @Override
    public String toString() {
        return this.colorHexVal;
    }
}
