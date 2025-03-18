package String3;

import java.util.Scanner;

public class CountNumberOfWordsInString {
	
	public static void main(String[] args) {
		
//		System.out.println("Enter the String");
//		Scanner sc = new Scanner(System.in);
//		String s=sc.nextLine();
//			int count=1;
//			for(int i=0;i<s.length();i++) {
//				if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
//					count++;
//				}
//			}
			
//			String [] words=s.split(" ");
//			int count =words.length;
		int count=1;
		String s="jav  sel  is    easy";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
			System.out.println("number words are : "+count);
	}
}




/*Enter the String
java is easy
number words are : 3
*/
