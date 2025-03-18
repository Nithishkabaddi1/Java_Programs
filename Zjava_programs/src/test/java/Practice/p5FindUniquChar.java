package Practice;

import java.util.HashMap;

public class p5FindUniquChar {
	public static void main(String[] args) {
		
		String s="javaselenium";
		
		HashMap<Character, Integer>hmap=new HashMap<Character, Integer>();
		for(char c:s.toCharArray()) {
			
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}else {
				hmap.put(c,1);
			}
			
		}System.out.print("the unique characters are : ");
			for(char ch:hmap.keySet()) {
				if(hmap.get(ch)==1) {
					System.out.print(ch+" ");
				}
			}

	}

}
