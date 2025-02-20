package com.company;

public class cwh_84_throws
{
        static int divide(int a, int b){
            int result = a/b;
            return result;}

            public static void main(String[] args){
                try {
                    int c = divide(3,7);
                    System.out.println(c);
                } catch (Exception e) {

                    System.out.println("Exception");
                }



        }
    }
