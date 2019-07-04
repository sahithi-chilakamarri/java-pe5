package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateAndEmptyTheArrayListTest {
    public UpdateAndEmptyTheArrayList updateAndEmptyTheArrayList;
    @Before
    public void setUp()
    {
        updateAndEmptyTheArrayList=new UpdateAndEmptyTheArrayList();
    }
    @After
    public void tearDown()
    {
        updateAndEmptyTheArrayList=null;
    }
    @Test
    public void givenArrayListShouldReturnUpdatedValues()
    {
        //arrange
       ArrayList<String>fruits=new ArrayList<>();
       fruits.add("Grape");
       fruits.add("Kiwi");
       fruits.add("Melon");
       fruits.add("Berry");
       ArrayList<String> newFruits=new ArrayList<>();
       newFruits.add("Apple");
        newFruits.add("Kiwi");
        newFruits.add("Apple");
        newFruits.add("Berry");
        //act
        ArrayList<String> result=updateAndEmptyTheArrayList.updateAndEmptyTheArrayList(fruits,"Apple");
        //assert
        assertEquals(newFruits,result);
    }
    @Test
    public void givenNullArrayListShouldReturnError()
    {
        //arrange
        //act
        ArrayList<String> result=updateAndEmptyTheArrayList.updateAndEmptyTheArrayList(null," ");
        //assert
        assertNotNull("Null is not accepted",result);
    }
    @Test
    public void givenEmptyListArrayListShouldReturnError()
    {
        ArrayList<String> fruits=new ArrayList<>();
        //arrange
        //act
        ArrayList<String> result=updateAndEmptyTheArrayList.updateAndEmptyTheArrayList(fruits," ");
        //assert
        assertNotNull("Empty List is not accepted",result);
    }
}