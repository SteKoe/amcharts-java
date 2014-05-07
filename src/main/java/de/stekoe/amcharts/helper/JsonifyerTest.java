package de.stekoe.amcharts.helper;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class JsonifyerTest {

    private TestObject testObject;

    @Before
    public void setUp() {
        testObject = new TestObject();
    }

    @Test
    public void testString() throws Exception {
        testObject.setName("Jon Doe");
        assertThat(testObject.toJson().toString(), equalTo("{\"name\":\"Jon Doe\"}"));
    }

    @Test
    public void testBool() throws Exception {
        testObject.setStudent(true);
        assertThat(testObject.toJson().toString(), equalTo("{\"student\":true}"));
    }

    @Test
    public void testEmptyList() throws Exception {
        List<String> skills = new ArrayList<String>();
        testObject.setSkills(skills);
        assertThat(testObject.toJson().toString(), equalTo("{\"skills\":[]}"));
    }

    @Test
    public void testFilledList() throws Exception {
        List<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("Reflections");
        testObject.setSkills(skills);
        assertThat(testObject.toJson().toString(), equalTo("{\"skills\":[\"Java\",\"Reflections\"]}"));
    }

    @Test
    public void testName() throws Exception {
        AnotherObject anotherObject = new AnotherObject();
        anotherObject.setMatrikelNumber("1234");
        assertThat(anotherObject.toJson().toString(), equalTo("{\"matrikelNumber\":\"1234\"}"));

        List<AnotherObject> anotherObjects = new ArrayList<AnotherObject>();
        anotherObjects.add(anotherObject);

        testObject.setName("Hans");
        testObject.setAnotherObjects(anotherObjects);
        assertThat(testObject.toJson().toString(), equalTo("{\"anotherObjects\":[{\"matrikelNumber\":\"1234\"}],\"name\":\"Hans\"}"));
    }

    @Test
    public void testInstanceOf() throws Exception {
        Jsonifyer jsonifyer = new Jsonifyer(testObject);
        assertThat(jsonifyer.isDeclaredInJsonifyableType(Object.class.getMethod("getClass", null)), is(false));
        assertThat(jsonifyer.isDeclaredInJsonifyableType(TestObject.class.getMethod("getName", null)), is(true));
    }

    @Test
    public void testIsGetter() throws Exception {
        Jsonifyer jsonifyer = new Jsonifyer(testObject);
        assertThat(jsonifyer.isGetter("isAdmin"), is(true));
        assertThat(jsonifyer.isGetter("getLength"), is(true));
        assertThat(jsonifyer.isGetter("setLength"), is(false));
        assertThat(jsonifyer.isGetter("hasLength"), is(false));
    }

    private class TestObject implements Jsonifyable {
        private String name;
        private String birthDay;
        private Boolean student;
        private String a;
        private List<String> skills;
        private List<AnotherObject> anotherObjects;

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
        public List<AnotherObject> getAnotherObjects() {
            return anotherObjects;
        }
        public void setAnotherObjects(List<AnotherObject> anotherObjects) {
            this.anotherObjects = anotherObjects;
        }

        public JSONObject toJson() {
            return new Jsonifyer(this).toJson();
        }
    }

    class AnotherObject implements Jsonifyable {
        private String matrikelNumber;

        public String getMatrikelNumber() {
            return matrikelNumber;
        }
        public void setMatrikelNumber(String matrikelNumber) {
            this.matrikelNumber = matrikelNumber;
        }

        public JSONObject toJson() {
            return new Jsonifyer(this).toJson();
        }
    }
}
