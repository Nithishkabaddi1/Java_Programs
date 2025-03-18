package Practice;

import java.util.HashMap;

public class p2occCharArray {


	public static void main(String[] args) {
		
		char[] s={'a','b','a','c','d','d'};
		
		HashMap<Character, Integer>hmap=new HashMap<Character, Integer>();
		for(char c:s) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}else {
				hmap.put(c, 1);
			}
		}
		
		for(char key:hmap.keySet()) {
			System.out.println("the character "+"'"+key+"'" +" occurs " + hmap.get(key)+" times");
		}
	}
}
