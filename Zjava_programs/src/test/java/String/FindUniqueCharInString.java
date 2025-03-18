package String;

import java.util.HashMap;

public class FindUniqueCharInString {

	public static void main(String[] args) {
		

		String s="kabaddi";
		HashMap<Character,Integer> hmap=new HashMap <Character, Integer>();
		//for(int i=0;i<s.length();i++) 
		for(char c:s.toCharArray())
		{
			//char c=s.charAt(i);
			if(hmap.containsKey(c)) {
				
				hmap.put(c, hmap.get(c)+1);
			}else
			{
				hmap.put(c, 1);
			}
		}

		System.out.print("the unique characters are : "); 
		for(char key:hmap.keySet()) {
			
			if(hmap.get(key)==1) {
			System.out.print(key+" ");
		}
		}
		
		System.out.println();
		
		System.out.print("the first unique character is : "); 

		for (char c : s.toCharArray()) {
		    if (hmap.get(c) == 1) {
		        System.out.println(c);
		        break;
		    }
		}
	}
}