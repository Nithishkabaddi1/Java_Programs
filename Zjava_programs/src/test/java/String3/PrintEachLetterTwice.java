package String3;

public class PrintEachLetterTwice {
	
	public static void main(String[] args) {
		
		String s="java";
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			System.out.print(s.charAt(i));
		}
	}
}
