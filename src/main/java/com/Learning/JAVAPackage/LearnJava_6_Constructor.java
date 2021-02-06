package com.Learning.JAVAPackage;

public class LearnJava_6_Constructor {


    int x;
    String b;

    public LearnJava_6_Constructor() {
        x=4;
        b="Automation";
    }
    public LearnJava_6_Constructor(int param1, String param2) {   //Constructor OverLoading
        x=param1;
        b=param2;
    }

    public static void main( String args[]) {
        LearnJava_6_Constructor learnJava_6_constructor = new LearnJava_6_Constructor();
        System.out.println(learnJava_6_constructor.x+learnJava_6_constructor.b);

        LearnJava_6_Constructor learnJava_6_constructor2 = new LearnJava_6_Constructor(5,"Framework");
        System.out.println(learnJava_6_constructor2.x+learnJava_6_constructor2.b);
    }
}
