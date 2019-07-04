package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
//This is used to count the number of occurrences of word in a string and store in map.

public class WordCounter {

    //It is used to count the number of occurrences in the given string.

    public Map<String,Integer> numberOfCounts(String inputString)
    {
        int count=1;

        Map<String,Integer> map=new HashMap<>();

        if(inputString==" ")
        {
            map.put("size",0);
        }
        else if(inputString==null)
        {
            return null;
        }
        //Count the number of occurrences of the word.
        else {
            String[] string = inputString.split(" ");
            for (int i = 0; i < string.length; i++)
            {
                for (int j = i + 1; j < string.length; j++)
                {
                    if (string[i].equals(string[j]))
                    {
                        count = count + 1;
                        string[j] = "";
                    }
                }
                //store the output to map
                if (string[i] != "")
                {
                    map.put(string[i], count);
                }
                count=1;
            }
        }
return map;
    }
}
