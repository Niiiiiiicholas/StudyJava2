package com.homeworck.lesson5;

import java.util.*;

public class MailApp {
    public static void main(String[] args){
//        Phonebook phonebook = new Phonebook();
//        phonebook.addNameNum("Ivan", 1);
//        phonebook.addNameNum("Ivan", 2);
//        phonebook.addNameNum("Ivan", 3);
//        phonebook.addNameNum("Petr", 14);
//        phonebook.addNameNum("Nikolay", 1);
//        phonebook.addNameNum("Anna", 1);
//
//        phonebook.getNameNum("Ivan");

//        Map<String, Integer> list = new HashMap<>();
//        list.put("ivan",2);
//        list.put("ivan",3);
//        list.put("ivan",4);
//        list.put("anna",1);
//        for (Map.Entry<String , Integer> o : list.entrySet()){
//            System.out.println(o.getKey());
//        }



        List<String> list = new ArrayList<>();
        list.add("Николай");
        list.add("Иван");
        list.add("Василий");
        list.add("Петр");
        list.add("Николай");
        list.add("Анна");
        list.add("Евгений");
        list.add("Анна");
        list.add("Даниил");
        list.add("Александр");
        list.add("Евгений");
        list.add("Николай");

        System.out.println(getName(list));
//        Set<String> unique = new HashSet<>(list);
//        for (String u : unique){
//            int num = 0;
//            for (int i = 0; i < list.size(); i++){
//                if(u.equals(list.get(i))){
//                    num++;
//                }
//            }
//            System.out.println(u + " количество повторений = " + num);
//        }
    }
    public static Map<String, Integer> getName(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (String o : list){
            map.put(o, map.getOrDefault(o,0) +1);
        }
        return map;
    }
}
