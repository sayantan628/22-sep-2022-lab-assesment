
/*  program: Write a Student and create an array of 10 students and display the students whose marks are more than 90%.
@ author sayantan ghosh 
@ date 22 sep 2022
 */
import java.util.*;

public class students {
    // Main driver method
    public static void main(String args[]) {
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        int n; // Declaring Variables

        // Ask the user to enter the Array Size
        System.out.println("Enter the total subjects ");
        n = sc.nextInt();

        // Declare the array
        int arr[] = new int[n];
        System.out.println("Enter the marks secured in each subject ");
        for (int i = 0; i < n; i++) // Initialize the array
        {
            arr[i] = sc.nextInt();
        }

        // Calculate the total ma2rks
        for (int i = 0; i < n; i++) {

            if (arr[i] >= 90) {
                System.out.println(" obtained is  " + arr[i]);
            }

        }

    }
}