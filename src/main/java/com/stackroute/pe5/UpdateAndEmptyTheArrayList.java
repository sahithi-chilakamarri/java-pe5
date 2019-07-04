package com.stackroute.pe5;


import java.util.ArrayList;
import java.util.List;

//Update the array list with the given element and empty the arraylist.
public class UpdateAndEmptyTheArrayList {
    public ArrayList<String> updateAndEmptyTheArrayList(ArrayList<String> fruits,String element)
    {
        //Replace the element 0f Arraylist using given element.
        ArrayList<String> result=new ArrayList();
        ArrayList<String> result1=new ArrayList();
        result1=fruits;
        if(fruits==null)
        {
            result.add("Null is not accepted");
        }
        if(fruits.isEmpty())
    {
      result.add("Empty List is not accepted.");
    }
        //updates the arraylist
        else {
            for (int i = 0; i < fruits.size(); i++) {
                if (i % 2 == 0) {
                    fruits.set(i, element);
                    result = fruits;
                }
            }
        }
        //clears the arraylist
        result1.clear();
        return result;
    }
}
