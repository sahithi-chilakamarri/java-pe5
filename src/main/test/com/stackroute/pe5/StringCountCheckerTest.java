package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountCheckerTest {
    public StringCountChecker stringCountChecker;
    @Before
    public void setUp()
    {
        stringCountChecker=new StringCountChecker();
    }
    @After
    public void tearDown()
    {
        stringCountChecker=null;
    }
    @Test
    public void givenStringArrayShouldReturnFrequencyCountOfEachWordAndReturnTrueIfItIsGreaterThanTwo()
    {
        //arrange
        //act
        String[] array={"a","b","c","c","d","d","c"};
        Map<String,Boolean> result=stringCountChecker.stringCountChecker(array);
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",false);
        map.put("b",false);
        map.put("c",true);
        map.put("d",true);
        //assert
        assertEquals(map,result);
    }
@Test
    public void givenNullShouldReturnErrorMessage()
{
    //arrange
    //act
    String[] array=null;
    Map<String,Boolean> result=stringCountChecker.stringCountChecker(array);
    Map<String,Boolean> map=new HashMap<>();
    //assert
    assertNull("Null",result);

}
    @Test
    public void givenEmptyArrayShouldReturnErrorMessage()
    {
        //arrange
        //act
        String[] array={};
        Map<String,Boolean> result=stringCountChecker.stringCountChecker(array);
        Map<String,Boolean> map=new HashMap<>();
        map.put("Size is",false);
        //assert
        assertEquals(map,result);

    }
}