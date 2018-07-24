package com.company;

public class Return1 {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 6;

        System.out.println("The largest number is:" + largestNumber(number1, number2)); // write your code here
    }

    public static int largestNumber(int n1, int n2) {
        if   (n1 > n2)
        {
            return n1;
        }
        else
        {
            return n2;
        }

    }
}
