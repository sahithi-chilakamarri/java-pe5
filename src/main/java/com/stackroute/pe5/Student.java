package com.stackroute.pe5;
//This student class implements the setter and getter methods for members of the student.
public class Student {
    public String getId() {
        return id;
    }
//setter and getter method of members
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    private String id;
    private String name;
    private String age;
    public Student(String id, String name, String age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    //override the toString method
    public String toString()
    {
        return id+" "+name+" "+age;
    }


}
