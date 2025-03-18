package String;

import java.util.HashMap;

public class FindDuplicateCharInArray {
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
		System.out.println("the duplicate characters are : "); 
		for(char key:hmap.keySet()) {
			
			if(hmap.get(key)>1) {
			System.out.println(key+" : "+hmap.get(key));
		}
		}}
}/*the duplicate characters are : 
a : 3
b : 2
*/
