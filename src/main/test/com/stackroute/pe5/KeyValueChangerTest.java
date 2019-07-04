package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class KeyValueChangerTest {
   public KeyValueChanger keyValueChanger;
    @Before
    public void setUp()
    {
        keyValueChanger =new KeyValueChanger();
    }
    @After
    public void tearDown()
    {
        keyValueChanger =null;
    }
    @Test
    public void givenMapShouldReturnUpdated()
    {
        //arrange
        //act
        Map<String,String> map1=new HashMap<>();
        map1.put("key1","java");
        map1.put("key2","c++");
        Map<String,String> result= keyValueChanger.changer(map1);
        Map<String,String> map2=new HashMap<>();
        map2.put("key1","");
        map2.put(" key2","java");
        //assert
        assertEquals(map2,result);
    }
    @Test
    public void givenMapShouldReturnMapUpdated()
    {
        //arrange
        //act
        Map<String,String> map1=new HashMap<>();
        map1.put("key1","java");
        map1.put("key2","c++");
        Map<String,String> result= keyValueChanger.changer(map1);
        Map<String,String> map2=new HashMap<>();
        map2.put("key1","");
        map2.put("key1","c++");
        //assert
        assertNotEquals(map2,result);
    }
    @Test
    public void givenNullShouldReturnNull()
    {
        //arrange
        //act
        Map<String,String> map1=null;

        Map<String,String> result= keyValueChanger.changer(map1);
//assert
        assertNull(result);
    }

}