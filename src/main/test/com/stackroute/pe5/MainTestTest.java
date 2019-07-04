package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest test;
    @Before
    public void setUp()
    {

        test=new MainTest();
    }
    @After
    public void tearDown()
    {
        test=null;
    }
    @Test
    public void givenStudetObjectsShouldReturnInOrder()
    {
        //arrange
        //act
        List<Student> list=new ArrayList<>();
        Student student1=new Student("16","premika","23");
        list.add(student1);
        Student student2=new Student("20","sahithi","20");
        list.add(student2);
        Student student3=new Student("18","Harika","20");
        list.add(student3);
        List<Student> result=test.sorter(list);
        List<Student> list1=new ArrayList<>();
        list1.add(student2);
        list1.add(student3);
        list1.add(student1);
        //assert
        assertEquals(list1,result);
    }
    @Test
    public void givenStudetObjectsShouldReturnNotEquals()
    {
        //arrange
        //act
        List<Student> list=new ArrayList<>();
        Student student1=new Student("16","premika","23");
        list.add(student1);
        Student student2=new Student("20","sahithi","20");
        list.add(student2);
        Student student3=new Student("18","Harika","20");
        list.add(student3);
        List<Student> result=test.sorter(list);
        List<Student> list1=new ArrayList<>();
        list1.add(student2);
        list1.add(student3);
        list1.add(student2);
        //assert
        assertNotEquals(list1,result);
    }
    @Test
    public void givenStudetObjectsWithSameNameShouldReturnNotEquals()
    {
        //arrange
        //act
        List<Student> list=new ArrayList<>();
        Student student1=new Student("16","premika","23");
        list.add(student1);
        Student student2=new Student("20","sahithi","20");
        list.add(student2);
        Student student3=new Student("18","sahithi","20");
        list.add(student3);
        List<Student> result=test.sorter(list);
        List<Student> list1=new ArrayList<>();
        list1.add(student2);
        list1.add(student3);
        list1.add(student1);
        //assert
        assertEquals(list1,result);
    }
    @Test
    public void givenNullShouldReturnNull()
    {
        //arrange
        //act
        List<Student> list=null;

        List<Student> result=test.sorter(list);
//assert
        assertNull(result);
    }

}