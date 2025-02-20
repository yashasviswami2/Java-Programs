package com.company;

import java.util.Random;
import java.util.Scanner;

public class cwh_41_rps
{
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scissors
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for paper , 2 for scissors");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw.");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput ==1 )
        System.out.println("You win!");
        else
        {
            System.out.println("Computer win");
        }
        System.out.println("Computer choice: "+computerInput);
        if (computerInput == 0){
            System.out.println("Computer's choice : rock");
        }
        else if (computerInput == 1){
            System.out.println("Computer's choice : paper");
        }
        else if (computerInput == 2){
            System.out.println("Computer's choice : scissors");
        }
    }
}
