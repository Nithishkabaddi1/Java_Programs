package String;

import java.util.HashMap;

public class occurenceWordInArray {

	public static void main(String[] args) {

		String[] s = { "java", "python", "java", "python", "c++" };

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (String word : s) {
			if(hmap.containsKey(word)) {
				hmap.put(word, hmap.get(word)+1);
			}else {
				hmap.put(word, 1);
			}
		}
		
		//System.out.println(hmap);
		for(String key:hmap.keySet()) {
			System.out.println("The word '"+key+"' occurs "+hmap.get(key)+" times in the array");
		}
	}
}