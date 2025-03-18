package Practice;

import java.util.HashMap;

public class p12FindDupWordArray {


	public static void main(String[] args) {
		
		
		String[] s= {"java","selenium","selenium","is","is","is","easy","easy"};
		
		
		HashMap<String, Integer>hmap=new HashMap<String, Integer>();
		for(String c:s) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}else {
				hmap.put(c, 1);
			}
		}
		
		System.out.println("duplicate words are :");
		for(String key:hmap.keySet()) {
			if(hmap.get(key)>1) {
			System.out.println("the word "+"'"+key+"'" +" occurs " + hmap.get(key)+" times");
		}}
	}
}
