package pString;

import java.util.HashSet;
import java.util.Set;

public class permutation {

	

	    public static void main(String[] args) {
	        String s = "abc";
	        Set<String> permutations = new HashSet<String>();
	        
	        // Define the recursive method within the main method
	        findAllPermutations("", s, permutations);
	        
	        // Print the results
	        System.out.println(permutations);
	    }

	    // Recursive method to find all permutations
	    private static void findAllPermutations(String s, String remaining, Set<String> result) {
	        if (remaining.length() == 0) {
	            result.add(s);
	        } else {
	            for (int i = 0; i < remaining.length(); i++) {
	                String newPrefix = s + remaining.charAt(i);
	                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
	                findAllPermutations(newPrefix, newRemaining, result);
	            }
	        }
	    }
}
