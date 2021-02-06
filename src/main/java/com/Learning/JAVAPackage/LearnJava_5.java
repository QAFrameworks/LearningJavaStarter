package com.Learning.JAVAPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnJava_5 {


    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();  //local variable to method, look at access

        int listSize = map.size();
        System.out.println(listSize);

        map.put(1,"One");                       // try other methods of map
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(1,"Ten");

        int newSize = map.size();
        System.out.println(newSize);



        for (Map.Entry mapEntry: map.entrySet()) {                         // try other way to iterate
            System.out.println(mapEntry.getKey()+ ""+ mapEntry.getValue());
        }

    }

}
