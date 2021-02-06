package com.Learning.JAVAPackage;

import java.util.ArrayList;
import java.util.List;

public class LearnJava_4 {


    public static void main(String args[]) {
        List<String> list = new ArrayList();  //local variable to method, look at access

        int listSize = list.size();
        System.out.println(listSize);

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        int newSize = list.size();
        System.out.println(newSize);
        for (String x: list) {
            if(!x.startsWith("T"))  //Conditions try while do while.  not operator
            System.out.println(x);
        }

    }

}
