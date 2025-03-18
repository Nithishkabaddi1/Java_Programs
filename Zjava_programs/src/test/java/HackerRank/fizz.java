package HackerRank;
	import java.util.Scanner;
	public class fizz {
		/*
1. FizzBuzz
Problem Statement: Print numbers from 1 to N. For multiples of 3, print "Fizz" instead of the number, 
and for the multiples of 5, print "Buzz". For numbers that are multiples of
 both 3 and 5, print "FizzBuzz".
		 * 
		 */
	    public static void fizzBuzz(int n) {
	        for (int i = 1; i <= n; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("FizzBuzz");
	            } else if (i % 3 == 0) {
	                System.out.println("Fizz");
	            } else if (i % 5 == 0) {
	                System.out.println("Buzz");
	            } else {
	                System.out.println(i);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt(); // Read the limit
	        fizzBuzz(n); // Call the fizzBuzz method
	        scanner.close(); // Close the scanner
	    }
	}


