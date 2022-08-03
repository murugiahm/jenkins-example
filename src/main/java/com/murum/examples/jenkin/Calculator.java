package com.murum.examples.jenkin;

public class Calculator {

    public static void main(String[] args) {
        //Add two integers
        int res = add(2, 3);
        System.out.println("result is: " +  res);
    }

    public static int add(int i, int j){
        return i+j;
    }
}
