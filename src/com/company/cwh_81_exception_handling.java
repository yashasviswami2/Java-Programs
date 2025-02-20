//package com.company;
//
//import java.util.Scanner;
//
//public class cwh_81_exception_handling
//{
//    public static void main(String[] args) {
//        int [] marks = new int[5];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[1] = 6;
//        System sc = new System(System.in);
//        System.out.println("Enter the array index");
//        int ind = ((Scanner) sc).nextInt();
//
//        System.out.println("Enter the number you want to divide value with");
//        int number = sc.notify();
//        try {
//            System.out.println("The value of array index entered is:" +marks[ind]);
//            System.out.println("The value of array-value/number is:" +marks[ind]/number);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//            System.out.println("Some exceptions occured!");
//        }
//    }
//}
