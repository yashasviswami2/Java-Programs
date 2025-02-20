package com.company;

public class cwh_24_break_and_continue
{
    public static void main(String[] args) {
//        for (int i = 0; i<5 ; i++){
//            System.out.println(i);
//            System.out.println("Java is Great!");
//            if (i==2){
//                System.out.println("Ending the loop!");
//                break;
//            }
//        }
//        int i = 0;
//        while (i<5){
//            System.out.println(i);
//            System.out.println("Java is great!");
//            if (i==2){
//                System.out.println("Ending the loop here.");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loop ends here!");

        for (int i = 0; i<50 ; i++){
            if (i==2){
                System.out.println("Ending the loop here.");
                continue;

            }
            System.out.println(i);
            System.out.println("Java is great.");
        }
    }
}
