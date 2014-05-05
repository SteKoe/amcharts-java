package de.stekoe.amcharts;

public class SerialGraph extends Graph {
    public SerialGraph(String htmlId) {
        super(htmlId);
    }

    @Override
    public String getType() {
        return "serial";
    }
}
