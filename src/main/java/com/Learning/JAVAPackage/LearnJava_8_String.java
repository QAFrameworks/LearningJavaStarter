package com.Learning.JAVAPackage;

import java.sql.SQLOutput;

public class LearnJava_8_String {


    public LearnJava_8_String() {

    }


    public static void main( String args[]) {

        String str= "the name is automation framework";
        System.out.println(str.charAt(4));
        System.out.println(str.length());
        System.out.println(str.substring(3,9));
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("framework"));
        System.out.println(str.equals("the name is framework"));




    }
}
