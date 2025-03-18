package String3;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		String s="java selenium testing";
		s=s.toLowerCase();
		int vowels=0;
		int consonents=0;
//		char[] c=s.toCharArray();
//		for(char ch:c) {
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
	//	if(ch>='a' && ch<='z') {
			
			if(Character.isAlphabetic(ch)) {
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			}else {
				consonents++;
			}
			
		}
		}System.out.println("vowels : "+vowels);
		System.out.println("consonents : "+consonents);
	}
}
