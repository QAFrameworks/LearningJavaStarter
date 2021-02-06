package com.Learning.JAVAPackage;

import org.junit.Assert;

public class LearnJava_9_Assert {


    public LearnJava_9_Assert() {

    }
    boolean doesStr1ContainsStr2(String str1, String str2) {
        return str1.contains(str2);
    }

    public static void main( String args[]) {


        Assert.assertTrue(1==1);   //try assertFalse

        LearnJava_9_Assert learnJava_9_assert = new LearnJava_9_Assert();
        String stringX= "It is Automation Framework Learning";
        String stringY= "Automation";
        String stringZ= "It is JAVA";

        boolean bol =learnJava_9_assert.doesStr1ContainsStr2(stringX,stringY);   //Reusable Methods
        System.out.println(bol);
        Assert.assertTrue(bol);//Assertion passed
        Assert.assertTrue(learnJava_9_assert.doesStr1ContainsStr2(stringX,stringZ)); //Assertion Failed





    }
}
