package String;

import java.util.HashMap;

public class FindUniqueCharInArray {
	public static void main(String[] args) {
		
	char[]s= {'a','b','c','a','b','d','a','e'};
	
	HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
	
	for(char c:s) {
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
	}}
}
