package String;

import java.util.HashMap;

public class occurenceCharInString {
	public static void main(String[] args) {
		
		String s="kabaddinithi";
		HashMap<Character,Integer> hmap=new HashMap <Character, Integer>();
		for(int i=0;i<s.length();i++) 
		//for(char c:s.toCharArray())
		{
			char c=s.charAt(i);
			if(hmap.containsKey(c)) {
				
				hmap.put(c, hmap.get(c)+1);
			}else
			{
				hmap.put(c, 1);
			}
		}
		System.out.println(hmap);
		
		for(char key:hmap.keySet()) {
			System.out.println("the character '"+key+"' occcurs "+hmap.get(key)+" times in the string");
		}
		for(char key:hmap.keySet()) {
			System.out.print(key+":"+hmap.get(key));
		}
	}
	
}/*{a=2, b=1, d=2, i=1, k=1}
the character 'a' occcurs 2 times in the string
the character 'b' occcurs 1 times in the string
the character 'd' occcurs 2 times in the string
the character 'i' occcurs 1 times in the string
the character 'k' occcurs 1 times in the string
*/

