package de.stekoe.amcharts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class JsonifyableTest {

    private TestJsonifyer jsonifyer;

    @Before
    public void setUp() {
        jsonifyer = new TestJsonifyer();
    }

    @Test
    public void getFieldNameForGetName() throws Exception {
        String fieldName = getFieldNameFromGetter("getName");
        assertThat(fieldName, equalTo("name"));
    }

    @Test
    public void getFieldNameForGetBirthDay() throws Exception {
        String fieldName = getFieldNameFromGetter("getBirthDay");
        assertThat(fieldName, equalTo("birthDay"));
    }

    @Test
    public void getFieldNameForIsStudent() throws Exception {
        String fieldName = getFieldNameFromGetter("isStudent");
        assertThat(fieldName, equalTo("student"));
    }

    @Test
    public void getFieldNameForGetA() throws Exception {
        String fieldName = getFieldNameFromGetter("getA");
        assertThat(fieldName, equalTo("a"));
    }

    @Test(expected=NoSuchMethodException.class)
    public void getFieldNameForNoGetter() throws Exception {
        String fieldName = getFieldNameFromGetter("g");
        assertThat(fieldName, equalTo("a"));
    }

    @Test
    public void testString() throws Exception {
        jsonifyer.setName("Jon Doe");
        assertThat(jsonifyer.toJson().toString(), equalTo("{\"name\":\"Jon Doe\"}"));
    }

    @Test
    public void testBool() throws Exception {
        jsonifyer.setStudent(true);
        assertThat(jsonifyer.toJson().toString(), equalTo("{\"student\":true}"));
    }

    @Test
    public void testEmptyList() throws Exception {
        List<String> skills = new ArrayList<String>();
        jsonifyer.setSkills(skills);
        assertThat(jsonifyer.toJson().toString(), equalTo("{\"skills\":[]}"));
    }

    @Test
    public void testFilledList() throws Exception {
        List<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("Reflections");
        jsonifyer.setSkills(skills);
        assertThat(jsonifyer.toJson().toString(), equalTo("{\"skills\":[\"Java\",\"Reflections\"]}"));
    }

    private String getFieldNameFromGetter(String methodName) throws NoSuchMethodException {
        return jsonifyer.extractFieldNameFor(jsonifyer.getClass().getMethod(methodName, null));
    }

    private class TestJsonifyer extends Jsonifyable {
        private String name;
        private String birthDay;
        private Boolean student;
        private String a;
        private List<String> skills;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getBirthDay() {
            return birthDay;
        }
        public void setBirthDay(String birthDay) {
            this.birthDay = birthDay;
        }
        public Boolean isStudent() {
            return student;
        }
        public void setStudent(boolean student) {
            this.student = student;
        }
        public String getA() {
            return a;
        }
        public void setA(String a) {
            this.a = a;
        }
        public List<String> getSkills() {
            return skills;
        }
        public void setSkills(List<String> skills) {
            this.skills = skills;
        }
    }
}
