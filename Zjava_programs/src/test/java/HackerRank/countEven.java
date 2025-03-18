package HackerRank;


	import java.util.Scanner;

	public class countEven {

	    public static int countEven(int[] numbers) {
	        int count = 0; // Counter for even numbers
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                count++; // Increment if the number is even
	            }
	        }
	        return count; // Return the count of even numbers
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int n = scanner.nextInt(); // Read the number of elements
	        int[] numbers = new int[n]; // Initialize the array
	        
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt(); // Read each number into the array
	        }
	        
	        int result = countEven(numbers); // Call the countEven method
	        System.out.println(result); // Print the count of even numbers
	        
	        scanner.close(); // Close the scanner
	    }
	}
/*
 * Explanation
Import Statement: Same as in the previous example.

Class Definition: Same as in the previous example.

Method Definition:

public static int countEven(int[] numbers) {: Declares a method that returns an integer and counts even numbers in the array.
Initialize Count Variable:

int count = 0;: Initializes a counter for even numbers.
Loop Through the Array:

for (int num : numbers) {: Iterates through each number in the array.
if (num % 2 == 0) {: Checks if the number is even.
count++;: Increments the count if the number is even.
Return Count:

return count;: Returns the total count of even numbers.
Main Method: Same structure as before.

Scanner Initialization: Same as before.

Read Input: Same process to read the number of elements and populate the array.

Call Method and Print Result:

Calls countEven and prints the result.
Close Scanner: Same as before.
 */

