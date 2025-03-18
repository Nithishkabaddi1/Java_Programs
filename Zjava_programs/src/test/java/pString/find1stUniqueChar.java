package pString;

import java.util.HashMap;

public class find1stUniqueChar {
	

    public static void main(String[] args) {
        String s = "kaabbcdde";
        System.out.println("First unique character: " + findFirstUniqueCharacter(s));
    }

    public static char findFirstUniqueCharacter(String s) {
        // Create a HashMap to store the count of each character
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        
        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first character with a count of 1
        for (char c : s.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        
        // If no unique character is found, return a placeholder value
        return '-'; // This can be adjusted based on your requirements
    }

}
