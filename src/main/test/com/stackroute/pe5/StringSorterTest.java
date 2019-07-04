package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class StringSorterTest {
public StringSorter stringSorter;
@Before
    public void setUp()
{

    stringSorter=new StringSorter();
}
@After
    public void tearDown(){

    stringSorter=null;
}
@Test
    public void givenSetOfStringsShouldReturnSortedList()
{
    //arrange
    //act
    Set<String> set=new HashSet<>();
    set.add("Grapes");
    set.add("Apple");
    set.add("Banana");
    List<String> result=stringSorter.sortTheStrings(set);
    List<String> list=new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Grapes");
            //assert
            assertEquals(list,result);
}
@Test
    public void givenNullShouldReturnReturnError()
{
    //arrange
    //act
 Set<String> set=null;
 List<String> result=stringSorter.sortTheStrings(set);
 //assert
 assertNotEquals("Null is not accepted",result);
}
@Test
   public void givenSetShouldReturnSortedSet()
   {
       //arrange
       //act
       Set<String> set=new HashSet<>();
       set.add("java");
       set.add("c++");
       set.add("python");
       Set<String> result=stringSorter.sortTheSet(set);
       Set<String> list=new HashSet<>();
       list.add("c++");
       list.add("java");
       list.add("python");
       //assert
       assertEquals(list,result);
   }

}