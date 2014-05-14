package de.stekoe.amcharts.addition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.lang.reflect.Type;

import org.junit.Test;

import com.github.julman99.gsonfire.GsonFireBuilder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;


public class FunctionTest {
    @Test
    public void testName() throws Exception {
        GsonFireBuilder builder = new GsonFireBuilder().enableExposeMethodResult();
        Gson gson = builder.createGson();

        Function f = new Function();
        f.setFunction("function(){ return true; }");


        assertThat(gson.toJson(f), equalTo("{ function() { return true; } }"));
    }

    private Gson createGson() {
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        gsonBuilder.registerTypeAdapter(Function.class, new JsonSerializer<Function>() {
            public JsonElement serialize(Function src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive(src.getFunction());
            }
        });
        return gsonBuilder.create();
    }
}
