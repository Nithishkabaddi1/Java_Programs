package HackerRank;

	import java.util.Scanner;

	public class checkPrime {
	    public static boolean isPrime(int number) {
	        if (number <= 1) return false; // Numbers less than 2 are not prime
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) return false; // Divisible by another number
	        }
	        return true; // If no divisors found, it's prime
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int number = scanner.nextInt(); // Read a single number
	        boolean result = isPrime(number); // Call the isPrime method
	        System.out.println(result ? "Prime" : "Not Prime"); // Print the result
	        
	        scanner.close(); // Close the scanner
	    }
	}

	/*
	 * Explanation
Import Statement: Same as before.

Class Definition: Same as before.

Method Definition:

public static boolean isPrime(int number) {: Declares a method that checks if a number is prime and returns a boolean.
Check for Primality:

if (number <= 1) return false;: Checks if the number is less than or equal to 1. If so, it’s not prime.
for (int i = 2; i <= Math.sqrt(number); i++) {: Loops from 2 to the square root of the number (since if it has a factor, it must be less than or equal to its square root).
if (number % i == 0) return false;: Checks if the number is divisible by i. If it is, it’s not prime.
return true;: If no divisors are found, it returns true, indicating the number is prime.
Main Method: Same structure as before.

Scanner Initialization: Same as before.

Read Input:

Reads a single integer for primality testing.
Call Method and Print Result:

Calls isPrime and prints "Prime" or "Not Prime" based on the result.
Close Scanner: Same as before.
	 */

