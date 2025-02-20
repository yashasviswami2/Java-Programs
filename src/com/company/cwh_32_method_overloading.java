package com.company;

public class cwh_32_method_overloading {

        static void change(int a ){
            a = 98;
        }
        static void tellJoke (){
            System.out.println("I invented a new word!\n"+"Plagiarism");
        }
    public static void main(String[] args){
            int [] marks = {52, 73, 77, 89, 94};
            int x =45;
            change(x);
        System.out.println("The value of x after running change is -" +x);
    }
}
