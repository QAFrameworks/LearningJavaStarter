package com.Learning.JAVAPackage;

public class LearnJava_3 {


int x[] ={2,4,6,4,7};


    public static void main(String args[]) {
        LearnJava_3 learnJava = new LearnJava_3(); // invocation of Constructor here

        int arrayLength=learnJava.x.length;
        System.out.println(arrayLength);

        for(int i=0;i<arrayLength;i++) { // Looping
            int a=learnJava.x[i]+10;
            System.out.println("Way 1 : 10 added to array index "+i+". value is now:"+(learnJava.x[i]+10));   // concatenation of string and int
            System.out.println("Way 2 :10 added to array index "+i+". value is now:"+learnJava.x[i]+10);  // Answer it as an exercise.
            System.out.println("Way 3 : 10 added to array index "+i+". value is now:"+a);
        }

    }

}
