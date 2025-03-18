package String3;

public class SeperateAlphaNumeric {

	public static void main(String[] args) {
		
		String s="nithi2554kabaddi1";
		String alpha="";
		String num="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alpha+=c;
			}else if(Character.isDigit(c)) {
				num+=c;
				
			}
		}System.out.println("alphabets :"+alpha);
		System.out.println("numeric :"+num);
	}
}
