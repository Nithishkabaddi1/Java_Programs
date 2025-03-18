package String;

import java.util.HashMap;

public class FindUniqueWordInArray {

public static void main(String[] args) {
		
	String[] s = { "java", "python", "java", "python", "c++" ,"c#"};
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (String word : s) {
			if(hmap.containsKey(word)) {
				hmap.put(word, hmap.get(word)+1);
			}else {
				hmap.put(word, 1);
			}
		}
		
		System.out.print("the unique words are : "); 
		for(String key:hmap.keySet()) {
			
			if(hmap.get(key)==1) {
			System.out.print(key+" ");
		}
}
}
}
