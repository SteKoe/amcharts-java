package de.stekoe.amcharts;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GraphValue implements Serializable {
    Map<String, Object> values = new HashMap<String, Object>();

    public void put(String key, String value) {
        values.put(key, value);
    }

    public void put(String key, int value) {
        values.put(key, value);
    }

    public Map<String, Object> getValues() {
        return values;
    }
}
