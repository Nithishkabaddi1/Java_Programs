package String;

import java.util.HashMap;

public class FindDuplicateWordInString {
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
		System.out.println("the duplicate words are : "); 
		for(String key:hmap.keySet()) {
			
			if(hmap.get(key)>1) {
			System.out.println(key+" : "+hmap.get(key));
		}
	}
}/*the duplicate words are : 
java : 2
is : 3
easy : 2
*/
}
