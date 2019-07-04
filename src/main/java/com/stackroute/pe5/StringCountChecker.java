package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
/*It is used to check the frequency of each word if it is greater than or equals to 2 it
is stored with boolean value true otherwise it return false in map*/
public class StringCountChecker
{
    public Map<String,Boolean> stringCountChecker(String[] inputString)
    {
        Map<String,Boolean> map=new HashMap<>();
        int count=0;
        if(inputString==null)
        {
            return null;
        }
        else if(inputString.length==0)
        {
            map.put("Size is",false);

        }

        //Count the number of occurrences of the word.
        else {
            for (int i = 0; i < inputString.length; i++)
            {
                for (int j = i + 1; j < inputString.length; j++) {

                    if (inputString[i].equals(inputString[j]))
                    {
                        count = count + 1;
                        inputString[j] = "";
                    }
                }
                //store to map returns true count it is greater than 2
                if (inputString[i]!="" && count>=2)
                {
                    //returns the word occured two or more than two times
                    map.put(inputString[i], true);
                }
                else if(inputString[i]!="")
                {
                    map.put(inputString[i],false);
                }
                count=1;
            }
        }
        return map;
    }
}
