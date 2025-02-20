package com.company;

import java.util.Scanner;
import java.util.Random;
public class cwh_20_rockpapersci {
    public static void main(String[] args) {


        String[] choices = {"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Rock, Paper, or Scissors: ");
        String user = scanner.nextLine();
        String computer = choices[random.nextInt(3)];

        System.out.println("Computer chose: " + computer);

        if (user.equalsIgnoreCase(computer)) System.out.println("It's a tie!");
        else if (user.equalsIgnoreCase("Rock") && computer.equals("Scissors") ||
                user.equalsIgnoreCase("Paper") && computer.equals("Rock") ||
                user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))
            System.out.println("You win!");
        else
            System.out.println("Computer wins!");

        scanner.close();
    }
}
