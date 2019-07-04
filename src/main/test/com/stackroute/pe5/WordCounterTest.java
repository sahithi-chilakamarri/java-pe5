package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class WordCounterTest {
    public WordCounter wordCounter;
    @Before
    public void setUp()
    {
        wordCounter =new WordCounter();
    }
    @After
    public void tearDown()
    {
        wordCounter=null;
    }
    @Test
    public void givenStringShouldReturnNumberOfOccurrencesOfTheWord()
    {
        //arrange
        //act
        Map<String,Integer> result=wordCounter.numberOfCounts("Hello Hai Hello Hai ");
        //assert
        Map<String,Integer> map=new HashMap<>();
        map.put("Hello",2);
        map.put("Hai",2);
        assertEquals(map,result);

    }
    @Test
    public void givenEmptyStringShouldReturnSizeZero()
    {
        //arrange
        //act
        Map<String,Integer> result=wordCounter.numberOfCounts(" ");
        Map<String,Integer> map=new HashMap<>();
        map.put("size",0);
        assertEquals(map,result);
    }
    @Test
    public void givenNullShouldReturnError(){
        //arrange
        //act
        Map<String,Integer> result=wordCounter.numberOfCounts(null);
        assertNull(null,result);
    }

}