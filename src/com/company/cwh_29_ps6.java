package com.company;

public class cwh_29_ps6
{
    public static void main(String[] args) {
        // Practice Problem 6
        int [] arr = { 1, 21 , 15 , 02 , 23, 13};
        int max = 0;
        for (int e: arr){
        if(e>max)
        {
        max = e;
        }
        }
        System.out.println("The value of the maximum element in this array is:  " +max);
        System.out.println(Integer.MAX_VALUE);
    }
}
