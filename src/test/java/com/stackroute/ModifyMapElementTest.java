package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyMapElementTest {
    ModifyMapElement modifyMapElement;
    @Before
    public void setUp() throws Exception {
        modifyMapElement=new ModifyMapElement();
    }

    @After
    public void tearDown() throws Exception {
        modifyMapElement=null;
    }

    @Test
    public void rotateValue() {
        String expexted="{val2=java, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        String actual=modifyMapElement.rotateValue(map);
        assertEquals(expexted,actual);
    }

    @Test
    public void rotateValueSecond() {
        String expexted="{val2=mars, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String actual=modifyMapElement.rotateValue(map);
        assertEquals(expexted,actual);
    }

    @Test
    public void rotateValueNull() {

        String actual=modifyMapElement.rotateValue(null);
        assertNull(actual);
    }
}