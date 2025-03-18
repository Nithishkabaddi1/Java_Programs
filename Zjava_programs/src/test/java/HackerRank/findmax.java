package HackerRank;

	
	import java.util.Scanner;

public class findmax {
	    public static int findMax(int[] numbers) {
	        int max = numbers[0]; // Start with the first element
	        for (int num : numbers) {
	            if (num > max) {
	                max = num; // Update max if current number is greater
	            }
	        }
	        return max; // Return the maximum value
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int n = scanner.nextInt(); // Read the number of elements
	        int[] numbers = new int[n]; // Initialize the array
	        
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt(); // Read each number into the array
	        }
	        
	        int result = findMax(numbers); // Call the findMax method
	        System.out.println(result); // Print the maximum value
	        
	        scanner.close(); // Close the scanner
	    }
	}
/*
 * Explanation
Import Statement:

import java.util.Scanner;: Imports the Scanner class to read input from the console.
Class Definition:

public class Solution {: Defines the main class Solution.
Method Definition:

public static int findMax(int[] numbers) {: Declares a static method findMax that returns an integer and takes an array of integers as a parameter.
Initialize Max Variable:

int max = numbers[0];: Initializes max with the first element of the array.
Loop Through the Array:

for (int num : numbers) {: For each number in the array:
if (num > max) {: Checks if the current number is greater than max.
max = num;: Updates max if the current number is greater.
Return Maximum Value:

return max;: Returns the found maximum value.
Main Method:

public static void main(String[] args) {: Entry point of the program.
Scanner Initialization:

Scanner scanner = new Scanner(System.in);: Creates a scanner object to read input.
Read Input:

int n = scanner.nextInt();: Reads the number of elements.
int[] numbers = new int[n];: Initializes an array of size n.
for (int i = 0; i < n; i++) { numbers[i] = scanner.nextInt(); }: Reads numbers into the array.
Call Method and Print Result:

int result = findMax(numbers);: Calls the findMax method.
System.out.println(result);: Prints the maximum value.
Close Scanner:

scanner.close();: Closes the scanner to free up resources.
 */

