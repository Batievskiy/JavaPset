// JavaRush lvl 12 lecture 5
// Beginners mistakes:

// import java.util.*; // <--- don't forget import

// package com.name.name.name.task.task; // <--- don't forger package

public class BeginnerProgrammerMistakes {
    public static void main(String[] args) { // <--- don't forget main line public

        // semicolon
        int number = 1; // <--- don't forget semicolon ;
        System.out.println(number); // <--- don't forget semicolon ;

        // quotes
        String string = "Java"; // <--- don't forget quotes ""
        System.out.println(string);

        // concatenation
        String name = "James";
        int age = 35;
        System.out.println("Name: " + name + "\nAge: " + age); // don't forget + for concatenate strings

        // curley braces
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.out.println("Windows detected!");
        } // <--- don't forget curley braces

        // round braces
        int n = 1;
        if (number < 5) { // <--- don't forget round braces
            System.out.println("Number: " + n); // <--- don't forget round braces
        } else {
            System.out.println("!");
        }
    }
}



