package com.javacourse;

// Imports
import java.util.Scanner;

// Main Class
public class Main {

    public static void main(String[] args) {

        int x; // Declaration
        x = 444; // Assignment
        // or
        int yearOfBirth = 1998; // Initialization

        System.out.println("x is " + x);
        System.out.println("TJ was born in " + yearOfBirth);

        // Data Types - In order from least amount of memory to most amount of memory

        boolean isTJChillin = true; // True (1) or False (0)
        byte byteValue = 127; // -128 to 127
        short shortNumber = 32767; // -32,768 to 32,767
        int integer = 2147483647; // -2147483648 to 2147483647
        long longAssNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807
        float floatValue = 3.402E+38f; // 1.175494351 E-38 to 3.402823466 E+38
        double doubleValue = 1.797E+308; // 2.2250738585072014 E-308 to 1.7976931348623158 E+308
        char character = 'T'; // Single Character or ASCII Value
        String name = "TJ";


        // Print largest value
        System.out.println("Largest Byte Value: " + byteValue);
        System.out.println("Largest Short Value: " + shortNumber);
        System.out.println("Largest Int Value: " + integer);
        System.out.println("Largest Long Value: " + longAssNumber);
        System.out.println("Largest Float Value: " + floatValue);
        System.out.println("Largest Double Value: " + doubleValue);
        System.out.println("'T' Char: " + character);


        System.out.println("So is " + name + " chilling?");
        if (isTJChillin) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        //ASCII Values
        Scanner scanner = new Scanner(System.in); // Scanner scans for input
        boolean areYouDone = false; // Loop Conditional
        while (!areYouDone) {               // while areYouDone is false 
            System.out.println("Find the ASCII value of?"); // Print Prompt
            String input = scanner.nextLine();      // Scan for next input
            byte byteInput = (byte) input.charAt(0);    // Convert first char into ASCII value
            System.out.println("This is ASCII value for the character: " + byteInput); // Print ASCII value
            System.out.println("Are you done? (y/n)");  // Print "Are you done?"
            String done = scanner.nextLine();   // Scan next line for input
            if (done.toUpperCase().charAt(0) == 'Y') { // if input start with a 'Y' areYouDone to True
                areYouDone = true;     
            }
        }

        
    }
}