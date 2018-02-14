package de.stekoe.amcharts.addition;

import com.github.julman99.gsonfire.GsonFireBuilder;
import com.google.gson.Gson;
import org.junit.Test;

import static com.jayway.jsonpath.matchers.JsonPathMatchers.hasJsonPath;
import static com.jayway.jsonpath.matchers.JsonPathMatchers.isJson;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ListenerTest {
    GsonFireBuilder builder = new GsonFireBuilder().enableExposeMethodResult();
    Gson gson = builder.createGson();

    @Test
    public void testName() throws Exception {
        Listener listener = new Listener();
        listener.setEvent("clickBand");
        listener.setMethod("handleClick");

        String json = gson.toJson(listener);
        assertThat(json, hasJsonPath("$.event", equalTo("clickBand")));
        assertThat(json, hasJsonPath("$.method", equalTo("handleClick")));
    }
}