package com.company;

import java.util.Scanner;

public class cwh_82_nested_try_catch
{
    public static void main(String[] args)
    {
        int [] marks = new int[5];
          marks[0] = 7;
          marks[1] = 56;
          marks[1] = 6;
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
          try {
              System.out.println("Welcome to video number 82");
              try {
                  System.out.println(marks[9]);
              }
              catch (ArrayIndexOutOfBoundsException e){
                  System.out.println("Sorry this index does not exist!");
                  System.out.println("Exception in level 2.");
              }
          } catch (Exception e) {
              System.out.println("Exception in level 1");
          }
    }
}
