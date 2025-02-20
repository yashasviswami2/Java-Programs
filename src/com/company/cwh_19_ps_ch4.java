package com.company;

import java.util.Scanner;

public class cwh_19_ps_ch4 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Taking input for three subjects
                System.out.print("Enter marks for Subject 1: ");
                float subject1 = scanner.nextFloat();

                System.out.print("Enter marks for Subject 2: ");
                float subject2 = scanner.nextFloat();

                System.out.print("Enter marks for Subject 3: ");
                float subject3 = scanner.nextFloat();

                scanner.close();

                // Calculating total percentage
                float totalPercentage = (subject1 + subject2 + subject3) / 3;

                // Checking pass or fail condition
                if (totalPercentage >= 40 && subject1 >= 30 && subject2 >= 30 && subject3 >= 30) {
                    System.out.println("The student has passed.");
                } else {
                    System.out.println("The student has failed.");
                }
            }
        }
