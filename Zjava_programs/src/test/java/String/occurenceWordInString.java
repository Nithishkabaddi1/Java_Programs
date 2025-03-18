package String;

import java.util.HashMap;

public class occurenceWordInString {
	
	public static void main(String[] args) {
		
		String s="java java selenium is is is easy easy ";
		String[] split=s.split(" ");
		
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		for(String word:split) {
			if(hmap.containsKey(word)) {
				hmap.put(word, hmap.get(word)+1);
			}else
			{
				hmap.put(word, 1);
			}
		}
		System.out.println(hmap);
		
		for(String key:hmap.keySet()) {
			System.out.println("The word '"+key+"' occurs "+hmap.get(key)+" times in the string");
		}
	}

}/*{java=2, selenium=1, is=3, easy=2}
The word 'java' occurs 2 times in the string
The word 'selenium' occurs 1 times in the string
The word 'is' occurs 3 times in the string
The word 'easy' occurs 2 times in the string
*/
