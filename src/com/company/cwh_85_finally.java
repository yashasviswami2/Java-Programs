package com.company;

public class cwh_85_finally
{
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int c = a/b;

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("This is the end of this program.");
    }
}
