package de.stekoe.amcharts.helper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.json.JSONObject;

public class Jsonifyer {

    private final Class<? extends Object> clazz;
    private final Jsonifyable obj;
    private final JSONObject jsonObject = new JSONObject();

    public Jsonifyer(Jsonifyable obj) {
        this.obj = obj;
        this.clazz = obj.getClass();
    }

    public JSONObject toJson() {
        try {
            Method[] methods = clazz.getMethods();
            for(Method method : methods) {
                String methodName = method.getName();
                if(isGetter(methodName) && isDeclaredInJsonifyableType(method)) {
                    processMethod(method);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    /**
     * Checks wether the given method is declared in a class which is instance of
     * Jsonifyable. This makes sure, that getters from classes like java.lang.Object
     * are not processed. Otherwise every JSON response would contain "class":"xyz" as entry
     * since java.lang.Object declares a getter for "getClass()"
     *
     * @param method The method to check
     * @return true if the method is declare in one subclass of Jsonifyable, false otherwise
     */
    boolean isDeclaredInJsonifyableType(Method method) {
        return Jsonifyable.class.isAssignableFrom(method.getDeclaringClass());
    }

    private void processMethod(Method method) throws IllegalAccessException, InvocationTargetException {
        System.out.println("Processing method " + method.getName());

        Object retVal = method.invoke(obj, null);
        if(retVal != null) {
            JsonValue json = createJsonValueFor(method, retVal);
            String attribute = json.getAttribute();
            Object value = json.getValue();

            if(value instanceof Collection) {
                Collection c = (Collection) value;
                value = getJsonOfCollectionEntries(c);
            }

            jsonObject.put(attribute, value);
        }
    }

    private Collection getJsonOfCollectionEntries(Collection originalCollection) {
        if(originalCollection.size() > 0) {

            Collection jsonifiedCollection;
            jsonifiedCollection = new ArrayList<JSONObject>();

            Iterator iterator = originalCollection.iterator();
            while(iterator.hasNext()) {
                Object next = iterator.next();
                if(next instanceof Jsonifyable) {
                    jsonifiedCollection.add(((Jsonifyable) next).toJson());
                } else {
                    jsonifiedCollection.add(next);
                }
            }
            return jsonifiedCollection;
        }

        return originalCollection;
    }

    boolean isGetter(String methodName) {
        return methodName.startsWith("get") || methodName.startsWith("is");
    }

    private JsonValue createJsonValueFor(Method method, Object retVal) {
        String fieldName = extractFieldNameFor(method);

        JsonValue jsonValue = new JsonValue();
        jsonValue.setAttribute(fieldName);
        jsonValue.setValue(retVal);
        return jsonValue;
    }

    String extractFieldNameFor(Method method) {
        String methodName = method.getName();
        methodName = methodName.replaceFirst("(get|is|has)", "");
        methodName = firstCharToLower(methodName);
        return methodName;
    }

    private String firstCharToLower(String methodName) {
        String firstLetter = methodName.substring(0, 1);
        String restOfMethodName = methodName.substring(1);
        return firstLetter.toLowerCase().concat(restOfMethodName);
    }
}
