package de.stekoe.amcharts.extractor;

import de.stekoe.amcharts.helper.AmChartsWebsiteExtractor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AmChartsWebsiteExtractorRunner {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://docs.amcharts.com/3/javascriptcharts/")
                .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                .get();

        List<String> components = retrieveComponents(doc);

        for (String component : components) {
            new AmChartsWebsiteExtractor().run(component);
        }

        System.out.println("Fin!");
    }

    static List<String> retrieveComponents(Document doc) {
        List<String> components = new ArrayList<String>();
        Elements navListItems = doc.select(".nav.nav-list.left li");
        for (Element element : navListItems) {
            String attr = element.attr("class");
            if (!attr.equals("search-group") && !attr.equals("nav-header")) {
                components.add(element.text());
            }
        }
        return components;
    }
}
