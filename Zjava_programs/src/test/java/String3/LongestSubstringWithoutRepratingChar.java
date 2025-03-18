package String3;

import java.util.HashSet;

public class LongestSubstringWithoutRepratingChar {

	public static void main(String[] args) {
		
		String s="abacdcb";
		
		int maxlength=0;
		int start=0;
		int end=0;
		int finalstart=0;
		int finalend=0;
		
		HashSet<Character> hset=new HashSet<Character>();
		
		while(end<s.length()) {
			char c=s.charAt(end);
			if(hset.contains(c)) {
				hset.remove(s.charAt(start));
				start++;
				
				}
		
			else {
				hset.add(c);
				if(end-start+1>=maxlength) {
					maxlength=end-start+1;
					finalstart=start;
					finalend=end;
			}end++;
		}}
		System.out.println("Maximum substring : "+s.substring(finalstart, finalend+1));
		System.out.println("maximum substring length : "+maxlength);
	

}
}