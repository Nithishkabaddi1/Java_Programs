package Practice;

import java.util.HashMap;

public class p17FindUniqueIntgerArray {
	public static void main(String[] args) {
		
		int[] s= {2,5,5,9,8,7,2};
		
		HashMap<Integer, Integer>hmap=new HashMap<Integer, Integer>();
		for(int c:s) {
			
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}else {
				hmap.put(c,1);
			}
			
		}System.out.print("the unique integers are : ");
			for(int ch:hmap.keySet()) {
				if(hmap.get(ch)==1) {
					System.out.print(ch+" ");
				}
			}

	}


}
