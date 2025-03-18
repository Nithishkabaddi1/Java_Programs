package HackerRank;


	import java.util.Scanner;

public class reverseArray1 {
	    public static void reverseArray(int[] numbers) {
	        for (int i = numbers.length - 1; i >= 0; i--) {
	            System.out.print(numbers[i] + " "); // Print in reverse order
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int n = scanner.nextInt(); // Read the number of elements
	        int[] numbers = new int[n]; // Initialize the array
	        
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt(); // Read each number into the array
	        }
	        
	        reverseArray(numbers); // Call the reverseArray method
	        scanner.close(); // Close the scanner
	    }
	}
/*
 * Explanation
Import Statement: Same as before.

Class Definition: Same as before.

Method Definition:

public static void reverseArray(int[] numbers) {: Declares a method that takes an array and doesn't return a value.
Loop to Print in Reverse:

for (int i = numbers.length - 1; i >= 0; i--) {: Iterates backwards through the array.
System.out.print(numbers[i] + " ");: Prints each number in reverse order, followed by a space.
Main Method: Same structure as before.

Scanner Initialization: Same as before.

Read Input: Same process to read the number of elements and populate the array.

Call Method:

Calls reverseArray to print the array in reverse.
Close Scanner: Same as before.
 * */
