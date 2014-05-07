package de.stekoe.amcharts.cust;

public class SerialGraph extends Graph {
    public SerialGraph(String htmlId) {
        super(htmlId);
    }

    @Override
    public String getType() {
        return "serial";
    }
}
