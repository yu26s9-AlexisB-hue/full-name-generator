package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(){

        Scanner scanner = new Scanner(System.in);

        //Take the users first name as an input
        System.out.print("What is your first? ");
        String firstName = scanner.nextLine();
        System.out.println(firstName);

        //Take the users last name as an input
        System.out.print("What is your last? ");
        String lastName = scanner.nextLine();
        System.out.println(lastName);

        //Takes the Users middle initial
        System.out.print("What is your middle initial? ");
        char initial = scanner.next().charAt(0);
        System.out.println(initial);
        scanner.nextLine();

        //Takes the users suffix
        System.out.print("Enter your preferred suffix: ");
        String suffix = scanner.nextLine();
        System.out.println(suffix);
    }
}
