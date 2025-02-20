package com.company;

import java.util.Scanner;

public class cwh_15_ps {
    public static void main(String[] args) {

        String letter = "Dear <|name|>, thanks a lot";

        // Taking user input for name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        scanner.close();

        // Replacing the placeholder with the actual name
        String personalizedLetter = letter.replace("<|name|>", name);

        // Printing the personalized letter
        System.out.println("\n" + personalizedLetter);
    }
}
