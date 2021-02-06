package com.Learning.JAVAPackage;

public class LearnJava_1 {
    public int getX() {  // getter setter
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x= 4; // variable


    public static void main(String args[]) {  // execution starts from here
        LearnJava_1 learnJava = new LearnJava_1();  // memory allocation at the time of creating object , learnJava is reference Variable
        System.out.println(learnJava.x); //sout
        learnJava.setX(5);                //invoke setter method
        System.out.println(learnJava.getX()); //invoke getter method and print it as well on console.
    }

}
