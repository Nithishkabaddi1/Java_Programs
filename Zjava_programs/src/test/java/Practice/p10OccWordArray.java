package Practice;

import java.util.HashMap;

public class p10OccWordArray {

	public static void main(String[] args) {
		
		
		String[] s= {"java","selenium","selenium","is","is","is","easy"};
		
		
		HashMap<String, Integer>hmap=new HashMap<String, Integer>();
		for(String c:s) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}else {
				hmap.put(c, 1);
			}
		}
		
		for(String key:hmap.keySet()) {
			System.out.println("the word "+"'"+key+"'" +" occurs " + hmap.get(key)+" times");
		}
	}
}
