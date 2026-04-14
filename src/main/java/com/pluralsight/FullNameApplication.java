package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(){

        Scanner scanner = new Scanner(System.in);

        //Take the users first name as an input
        System.out.print("What is your first? ");
        String firstName = scanner.nextLine();

        //Take the users last name as an input
        System.out.print("What is your last? ");
        String lastName = scanner.nextLine();

        //Takes the Users middle initial
        System.out.print("What is your middle initial? ");
        String initial = scanner.nextLine();

        //Takes the users suffix
        System.out.print("Enter your preferred suffix: ");
        String suffix = scanner.nextLine();

        // Name combo possible outcomes
        if (initial.isEmpty() && suffix.isEmpty()){
           System.out.print(firstName + " " + lastName);
        }else if (suffix.isEmpty()){
            System.out.print(firstName+ " "+ initial+ " "+lastName);
        }else{
            System.out.print(firstName + " " + initial + ". " + lastName + ", " + suffix);
        }
    }
}
