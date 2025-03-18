package String;

import java.util.HashMap;

public class Find1stUniqueCharInString {
	
public static void main(String[] args) {
		

		String s="kabaddi";
		
		HashMap<Character,Integer> hmap=new HashMap <Character, Integer>();
		//for(int i=0;i<s.length();i++) 
		for(char c:s.toCharArray())
		{
			
		            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
		        }
		
		System.out.println(hmap);
		System.out.print("the first unique character is : "); 

		for (char c : s.toCharArray()) {
		    if (hmap.get(c) == 1) {
		        System.out.println(c);
		        break;
		    }
		}
		
		

	}

}
