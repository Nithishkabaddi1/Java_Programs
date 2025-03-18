package String;

import java.util.HashMap;

public class FindUniqueWordInString {
public static void main(String[] args) {
		
		String s="java java selenium automation is is is easy easy ";
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
		
		System.out.print("the unique words are : "); 
		for(String key:hmap.keySet()) {
			
			if(hmap.get(key)==1) {
			System.out.print(key+" ");
		}
}
}}