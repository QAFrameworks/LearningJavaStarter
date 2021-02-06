package com.Learning.JAVAPackage;

public class LearnJava_2 {


    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    String x= "Automation"; //Arthmetic Operators
    String y = "10";
    int z= 20;


    public static void main(String args[]) {
        LearnJava_2 learnJava = new LearnJava_2();
        System.out.println(learnJava.x);
        learnJava.setX("Framework");
        System.out.println(learnJava.getX());

        System.out.println(learnJava.x+learnJava.y);  //revised value
        System.out.println(learnJava.z+Integer.parseInt(learnJava.y)); // understand conversion. boxing
    }

}
