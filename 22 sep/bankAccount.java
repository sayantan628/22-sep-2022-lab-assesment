/*program: Write a  java program to create a BankAccount and display the people with balance less than 1000.
 @ author sayantan ghosh 
@ date 22 sep 2022
 */

import java.util.*;

public class bankAccount {
    // Main driver method
    public static void main(String args[]) {
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        int n; // Declaring Variables

        // Ask the user to enter the Array Size
        System.out.println("Enter account ");
        n = sc.nextInt();

        // Declare the array
        int arr[] = new int[n];
        System.out.println("Enter the bank balance ");
        for (int i = 0; i < n; i++) // Initialize the array
        {
            arr[i] = sc.nextInt();
        }

        // printing bank balance greater than 1000
        for (int i = 0; i < n; i++) {

            if (arr[i] >= 1000) {
                System.out.println(" balance greater than 1000 is  " + arr[i]);
            }

        }

    }
}