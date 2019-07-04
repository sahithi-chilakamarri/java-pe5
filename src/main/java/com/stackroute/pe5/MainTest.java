package com.stackroute.pe5;

import java.util.Collections;
import java.util.List;
//It is used to create the objects for the student class.
public class MainTest {
    StudentSorter studentsorter=new StudentSorter();
    public List<Student> sorter(List<Student> studentList) {
        if(studentList!=null)
        {
            Collections.sort(studentList,new StudentSorter());
        }

        else {
            studentList=null;
        }

        return studentList;
    }

}
