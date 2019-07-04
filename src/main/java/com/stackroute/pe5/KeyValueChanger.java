package com.stackroute.pe5;

import java.util.Map;
import java.util.Set;
//It is used to change the values for the values of a key.
public class KeyValueChanger {

    public Map<String,String> changer(Map<String,String> result)
    {
        if(result==null){
            result=null;
        }
        else {
            String[] keys = new String[2];
            String[] values = new String[2];
            String[] string = new String[2];
            Set<String> key = result.keySet();
            String input = key.toString();

            input = input.substring(1, input.length() - 1);
            keys = input.split(",");
            //set the value2 of key to value1 and value1 to emptystring.
            for (int i = 0; i < 2; i++) {
                values[i] = result.get(keys[i]);

            }
//sets the value for both values.
            result.clear();
            result.put(keys[0], "");
            result.put(keys[1], values[0]);
        }
        return result;
    }
}
