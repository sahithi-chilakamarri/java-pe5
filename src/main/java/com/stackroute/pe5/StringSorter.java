package com.stackroute.pe5;
import java.util.*;
//It is used to sort the strings in the set and return in the Set and ArrayList

public class StringSorter {

    public ArrayList<String> sortTheStrings(Set<String> inputStrings)
    {
        ArrayList<String> strings=new ArrayList<>(inputStrings);

        if(inputStrings.equals(null))
        {
         strings.add("Null is not accepted");
        }
     else if(inputStrings.equals(" "))
     {
            strings.add("Empty String is not accepted");
        }
            else
            {
                Collections.sort(strings);
            }

     return strings;
    }
    public Set<String> sortTheSet(Set<String> inputStrings)
    {
    if(inputStrings==null)
    {
    return null;
    }
    TreeSet<String> strings=new TreeSet<>(inputStrings);

    return strings;
}
}

