package Practice;

import java.util.HashMap;

public class p4findDupCharArray {

	public static void main(String[] args) {
		
		char[] s={'a','b','a','c','d','d'};
		
		HashMap<Character, Integer>hmap=new HashMap<Character, Integer>();
		for(char c:s) {
			
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}else {
				hmap.put(c,1);
			}
			
		}System.out.println("the duplicate characters are");
			for(char ch:hmap.keySet()) {
				if(hmap.get(ch)>1) {
					System.out.println(ch+" : "+hmap.get(ch));
				}
			}

	}
}
