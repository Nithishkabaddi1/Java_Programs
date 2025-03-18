
package String2;

import java.util.HashMap;

public class CharacterCounter {

	public static void main(String[] args) {
		
		String s="Malyalam";
		s=s.toLowerCase();
		HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
		
		for(char c : s.toCharArray())
		{
			
			if(hmap.containsKey(c)) {
				
				hmap.put(c, hmap.get(c)+1);
			}else
			{
				hmap.put(c, 1);
			}
		}
				for(char key:hmap.keySet()) {
			System.out.print(key+":"+hmap.get(key));
		}
		
	}
}
