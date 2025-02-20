package com.company;

public class cwh_34_recursion{
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int x =4 ;

        System.out.println("The value of factorial n is :"+ factorial(x));
    }
}