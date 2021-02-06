package com.Learning.JAVAPackage;
import org.apache.commons.lang3.RandomStringUtils;
public class LearnJava_7_Method {


    public LearnJava_7_Method() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;

    public int getArea(int x) {  // look return type
        return x*x;
    }
    public int getArea(int x, int y) {    //Method OverLoading
        return x*y;
    }

    public String getRandomString() {
        String generatedString = RandomStringUtils.randomAlphabetic(10);
        return generatedString;
    }

    public boolean isNumberOdd(int x) {
        return (x%2)==1;
    }


    public void voidReturnTypeMethod(int a) {
        setX(a);
    }
    public static void main( String args[]) {
        LearnJava_7_Method learnJava_7_method = new LearnJava_7_Method();
        System.out.println("Area of Square is "+learnJava_7_method.getArea(4));
        System.out.println("Area of rectangle is "+learnJava_7_method.getArea(4,5));

        System.out.println("Random generated String is "+learnJava_7_method.getRandomString());

        System.out.println("is Number 7 Odd: "+learnJava_7_method.isNumberOdd(7));
        System.out.println("is Number 8 Odd: "+learnJava_7_method.isNumberOdd(8));


        learnJava_7_method.voidReturnTypeMethod(10);  // 10 is argument here
        System.out.println("what the value of x, lets check: "+learnJava_7_method.getX());



    }
}
