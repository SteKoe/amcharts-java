package de.stekoe.amcharts.helper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AmChartsWebsiteExtractor {
    private final Set<String> fields = new LinkedHashSet<String>();
    private final List<String> getter = new ArrayList<String>();
    private final List<String> setter = new ArrayList<String>();
    private final List<String> docs = new ArrayList<String>();
    private final Map<String, String> inheritances = new HashMap<String, String>();
    private final boolean forceWrite = true;

    private final List<Property> properties = new ArrayList<Property>();

    private static final String RESOURCES_CSV = "src/main/resources/csv/";
    private static final String RESOURCES_JAVA = "src/main/resources/java/";

    public static void main(String[] args) throws IOException {
        List<String> components = new ArrayList<String>();

        Document doc = Jsoup.connect("http://docs.amcharts.com/3/javascriptcharts/").get();
        Elements navListItems = doc.select(".nav.nav-list.left li");
        for (Element element : navListItems) {
            String attr = element.attr("class");
            if(!attr.equals("search-group") && !attr.equals("nav-header")) {
                components.add(element.text());
            }
        }

        for (String component : components) {
            new AmChartsWebsiteExtractor().run(component);
        }
        System.out.println("Fin!");
    }

    public void run(String component) throws IOException {
            System.out.print("Processing " + component + "... ");
            extractProperties(component);

            Status status = createJavaClassFile(component);
            if(status.SUCCESS.equals(status)) {
                System.out.println("done!");
            } else if(status.DO_NOT_OVERWRITE.equals(status)) {
                System.out.println("alread exists!");
            } else if(status.ERROR.equals(status)) {
                System.out.println("error!");
            } else {
                System.out.println("unknown!");
            }
    }

    private void extractProperties(String component) throws IOException {
        Document doc = Jsoup.connect("http://docs.amcharts.com/3/javascriptcharts/" + component ).get();
        Elements paragraphs = doc.select("div.inside p");
        for (Element paragraph : paragraphs) {
            String text = paragraph.text();
            if(text.toLowerCase().startsWith("inheritance:")) {
                String substring = extractSuperClass(text);
                inheritances.put(component, substring);
                break;
            }
        }

        Elements propertyTables = doc.select(".property-list");
        if(propertyTables.size() != 0) {
            Element propertyTable = propertyTables.first();
            Elements trs = propertyTable.getElementsByTag("tr");
            if(trs.size() > 1) {
                for(int i = 1; i < trs.size(); i++) {
                    Element tr = trs.get(i);
                    String cssClass = tr.attr("class");
                    if(!cssClass.contains("inherited")) {
                        Elements tds = tr.getElementsByTag("td");

                        Property property = new Property();
                        property.attribute = tds.get(0).text();
                        property.type = tds.get(1).text();
                        property.documentation = tds.get(3).text();
                        properties.add(property);
                    }
                }
            }
        }
    }

    String extractSuperClass(String text) {
        String substring = text.substring(text.indexOf("→") + 1);
        int nextArrow = substring.indexOf("→");
        if(nextArrow != -1) {
            substring = substring.substring(0, nextArrow);
        }
        return substring.trim();
    }

    private Status createJavaClassFile(String component) {
        try {
            File outputFile = new File(RESOURCES_JAVA + component + ".java");
            if(outputFile.exists() && !forceWrite ) {
                return Status.DO_NOT_OVERWRITE;
            }

            for(Property prop : properties) {
                String type = prop.type;
                if(type.trim().isEmpty()) {
                    continue;
                }
                if(type.equals("Number")) {
                    type = "Double";
                } else if(type.contains("Array")) {
                    type = type.replace("Array[", "List<");
                    type = type.replace("]",">");
                } else if(type.equals("Number/String")) {
                    type = "String";
                }

                StringBuilder sb = new StringBuilder();
                sb.append("    /**\n");
                sb.append("     * " + breakDocumentation(prop.documentation, 80) + "\n");
                sb.append("     **/\n");
                String javaDoc = sb.toString();
                String field = String.format("    private %s %s;", type, prop.attribute);
                String getMeth = createGetterFor(type, prop.attribute);
                String setMeth = createSetterFor(type, prop.attribute);

                if(!javaDoc.toLowerCase().contains("read-only")) {
                    docs.add(javaDoc);
                    fields.add(field);
                    setter.add(getMeth);
                    getter.add(setMeth);
                }

                writeClassFile(outputFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return Status.ERROR;
        }

        return Status.SUCCESS;
    }

    private String breakDocumentation(String documentation, int breakPoint) {
        int length = documentation.length();
        if(length <= breakPoint)
            return documentation;

        StringBuilder sb = new StringBuilder();
        int curPos = 0;
        for(int cut = breakPoint; cut < documentation.length(); cut++) {
            if(documentation.charAt(cut) == ' ') {
                if(curPos != 0) {
                    sb.append("     *");
                }
                sb.append(documentation.substring(curPos, cut) + "\n");
                curPos = cut;
                cut += breakPoint;
            }
        }
        sb.append("     *" + documentation.substring(curPos));
        return sb.toString();
    }

    private void writeClassFile(File outputFile) throws IOException {
        String className = FilenameUtils.getBaseName(outputFile.getAbsolutePath());

        String superClass = inheritances.get(className);
        String inheritance = "";
        if(superClass != null) {
            inheritance = " extends " + superClass;
        }

        FileUtils.write(outputFile, "package de.stekoe.amcharts;\n");
        FileUtils.write(outputFile, "\n", true);
        FileUtils.write(outputFile, "import java.util.List;", true);
        FileUtils.write(outputFile, "\n", true);
        FileUtils.write(outputFile, "public class " + className + inheritance + " {\n", true);
        for (String field : fields) {
            FileUtils.write(outputFile, field + "\n", true);
        }
        FileUtils.write(outputFile, "\n", true);

        for(int i = 0; i < getter.size(); i++) {
            FileUtils.write(outputFile, docs.get(i), true);
            FileUtils.write(outputFile, getter.get(i), true);
            FileUtils.write(outputFile, setter.get(i), true);
            FileUtils.write(outputFile, "\n", true);
        }

        FileUtils.write(outputFile, "}", true);
    }

    private String createSetterFor(String type, String field) {
        StringBuilder sb = new StringBuilder();

        String t = type;
        if(type.equals("Boolean")) {
            t = "boolean";
        } else if(type.equals("Double")) {
            t = "double";
        }

        sb.append("    public void set"+capitalize(field)+"("+t+" "+field+") {\n");
        sb.append("        this."+ field +" = "+field+";\n");
        sb.append("    }\n");
        return sb.toString();
    }

    private String createGetterFor(String type, String field) {
        StringBuilder sb = new StringBuilder();
        if(type.equals("Boolean")) {
            sb.append("    public boolean is"+capitalize(field) + "() {\n");
        } else {
            sb.append("    public "+ type + " get"+capitalize(field) + "() {\n");
        }

        sb.append("        return "+field+";\n");

        sb.append("    }\n");

        return sb.toString();
    }

    private String capitalize(String field) {
        String first = field.substring(0, 1);
        String rest = field.substring(1);
        return first.toUpperCase() + rest;
    }

    class Property {
        public String attribute;
        public String type;
        public String documentation;
    }
}
