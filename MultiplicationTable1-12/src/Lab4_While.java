/*
 *  Assignment Lab 4
 *  Description: This program prints out a multiplication table of number 1-12 up to 10 for user.
 *  Name: James Giatpaiboon
 *  ID: 917848716
 *  Class: CSC 211-03
 *  Semester: Fall 2019
 */

import java.util.Scanner;   // imported scanner for user

public class Lab4_While {
    public static void main (String[] args) {

        int number = -1;    // declared variable for number being entered

        Scanner input = new Scanner(System.in); // for user to input

        while (number < 1 || number > 12) { //makes sure the user inputs a number that is <1 and > 12
            System.out.println("Enter any number between 1-12: ");  // tells user to input number between 1-12
            number = input.nextInt();   //number that user inputs
            if (number < 1 || number > 12) {    // number must be greater than 1, less than 12
                System.out.println("Invalid number");   //prints statement if user inputs invalid number
            }
        }
        System.out.println("Now printing the Multiplications Table for the number: " + number); // prints out results

        for (int i = 1; i <= 10; i++) { // makes sure the inputted number is multiplied by numbers <=10
            System.out.println(number + "x" + (i + 0) + " = " + (number * (i + 0)));    // multiplies inputted number by 1-10
        }
    }
}