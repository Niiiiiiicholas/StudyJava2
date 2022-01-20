package com.homeworck.lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, Integer> NameNum = new LinkedHashMap<>();

    public void getNameNum(String key) {
        for(Map.Entry<String, Integer> o : NameNum.entrySet()){
            if(key.equals(o.getKey())){
                System.out.println(o.getValue());
            }
        }
    }

    public void addNameNum(String key, Integer values) {
        NameNum.put(key, values);
    }
}
