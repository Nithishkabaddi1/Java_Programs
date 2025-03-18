package HackerRank;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

public class firstuniue {
	
	/*Problem Statement: Given a string, find the first non-repeating character in it and 
	 * return its index. If it doesn't exist, return -1.

*/

	    public static int firstUniqChar(String s) {
	        Map<Character, Integer> charCount = new HashMap<Character, Integer>(); // To store character counts
	        
	        // Count occurrences of each character
	        for (char c : s.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }
	        
	        // Find the first unique character
	        for (int i = 0; i < s.length(); i++) {
	            if (charCount.get(s.charAt(i)) == 1) {
	                return i; // Return index of first unique character
	            }
	        }
	        return -1; // Return -1 if none found
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String str = scanner.nextLine(); // Read input string
	        int result = firstUniqChar(str); // Call the firstUniqChar method
	        System.out.println(result); // Print the index of the first unique character
	        scanner.close(); // Close the scanner
	    }
	}


