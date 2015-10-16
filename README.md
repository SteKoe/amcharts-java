# amcharts-java [![Build Status](https://travis-ci.org/SteKoe/amcharts-java.svg?branch=3.15.1)](https://travis-ci.org/SteKoe/amcharts-java)

Java API for the awesome Charts Package amChartsv3 (http://www.amcharts.com).
The Version of this API corresponds to the Version of amCharts.

## How to serialise to JSON
To serialize the AmCharts to JSON, please use GSON from google/gson. The classes are ready to be consumed by GSON as done in the following code snippet.

```java
import de.stekoe.amcharts.addition.Color;
import de.stekoe.amcharts.addition.ColorSerialiser;

Gson gson = new Gson();
GsonBuilder gsonBuilder = new GsonBuilder();
gsonBuilder.registerTypeAdapter(Color.class, new ColorSerialiser());
gson = gsonBuilder.create();

AmChart chart = new AmRadarChart();
String json = gson.toJson(chart);
```

## Example JSON Output

The following code is based on an example from the website of amCharts:
<pre>
{
    "type": "serial",
    "theme": "none",
    "dataProvider": [{
        "country": "USA",
        "visits": 2025
    }],
    "valueAxes": [{
        "gridColor":"#FFFFFF",
		"gridAlpha": 0.2,
		"dashLength": 0
    }],
    "gridAboveGraphs": true,
    "startDuration": 1,
    "graphs": [{
        "balloonText": "[[category]]: <b>[[value]]</b>",
        "fillAlphas": 0.8,
        "lineAlpha": 0.2,
        "type": "column",
        "valueField": "visits"		
    }],
    "chartCursor": {
        "categoryBalloonEnabled": false,
        "cursorAlpha": 0,
        "zoomable": false
    },
    "categoryField": "country",
    "categoryAxis": {
        "gridPosition": "start",
        "gridAlpha": 0
    }
}
</pre>

The same definition using this Java-API

<pre>
AmSerialChart chart = new AmSerialChart();
chart.setType("serial");
chart.setTheme("none");


chart.setValueAxes();
chart.setGridAboveGraphs(true);
chart.setStartDuration(1);
chart.setGraphs(getGraphs());
chart.setChartCursor(getChartCursor());
chart.setCategoryField("choice");
chart.setCategoryAxis(getCategoryAxis());
</pre>
