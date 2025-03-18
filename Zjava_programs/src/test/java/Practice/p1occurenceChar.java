package Practice;

import java.util.HashMap;

public class p1occurenceChar {

	public static void main(String[] args) {
		
		String s="kabaddi";
		
		HashMap<Character, Integer>hmap=new HashMap<Character, Integer>();
		for(char c:s.toCharArray()) {
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
