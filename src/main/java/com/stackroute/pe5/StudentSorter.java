package com.stackroute.pe5;

import java.util.Comparator;
/*It sort the students according to the order
Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
For students having same name and age, sort them according to their ID.
 */
public class StudentSorter implements Comparator<Student> {
    public int compare(Student student1,Student student2)
    {
        //Find the difference between age,id and name
        int difference=0;
        int ageDifference=student1.getAge().compareTo(student2.getAge());
        int nameDifference=student1.getName().compareTo(student2.getAge());
        int idDifference=student1.getId().compareTo(student2.getAge());
//If age and name have no difference then we have to check ID Difference
        if(ageDifference==0)
        {
            if(nameDifference==0)
            {
                difference=idDifference;
            }
        }
        //If name has no difference then go to age difference
        else{
            difference=ageDifference;
        }
        return difference;
    }

}
