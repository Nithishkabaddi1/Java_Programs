package String2;

import java.util.HashMap;

public class SubStringExtractor {
	 public static void main(String[] args) {

	        String s = "aabbbccds";

	        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

	        // Extract substrings of length 2
	        for (int i = 0; i < s.length() - 1; i++) {
	            String substring = s.substring(i, i + 2);
	           hmap.put(substring, hmap.getOrDefault(substring, 0) + 1);
	           
	        }

	        // Print all substrings of length 2 and their counts
	        System.out.print("Substrings of length 2 : ");
	        for (String substring : hmap.keySet()) {
	        	int count = hmap.get(substring);
	            for (int i = 0; i < count; i++) {
	                System.out.print(substring + " ");
	        }
	    }
	        System.out.println();
	        System.out.print("Substrings of length 2 with unique : ");
	        for (String substring : hmap.keySet()) {
	        	 System.out.print(substring+" ");
	        }
	        }

}
