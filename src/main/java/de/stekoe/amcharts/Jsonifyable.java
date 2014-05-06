package de.stekoe.amcharts;

import java.lang.reflect.Method;

import org.json.JSONObject;

public abstract class Jsonifyable {
    public JSONObject toJson() {
        JSONObject jsonObject = new JSONObject();

        try {
            Method[] methods = getClass().getMethods();
            for(Method method : methods) {
                String methodName = method.getName();
                if(methodName.startsWith("get") || methodName.startsWith("is")) {
                    Object retVal = method.invoke(this, null);
                    if(retVal != null && checkMethodIsInSubclass(method)) {
                        JsonValue json = createJsonFor(method, retVal);
                        jsonObject.put(json.getAttribute(), json.getValue());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    /**
     * As java.lang.Object defines getter like getClass() as well, we do not want to find fields and values
     * for any Class above this class.
     *
     * @param method The method to check
     * @return true if the method is owned by a class which inherits Jsonifier, false otherwise
     */
    private boolean checkMethodIsInSubclass(Method method) {
        return Jsonifyable.class.isAssignableFrom(method.getDeclaringClass());
    }

    private JsonValue createJsonFor(Method method, Object retVal) {
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
