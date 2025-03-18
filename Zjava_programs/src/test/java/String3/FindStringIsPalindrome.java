package String3;

public class FindStringIsPalindrome {

		public static void main(String[] args) {
			
			String s="madam";
			String res="";
			for(int i=s.length()-1;i>=0;i--) {
				res+=s.charAt(i);
			}
			if(s.equals(res)) {
				System.out.println("the string is pallindrome");
			}else {
				System.out.println("the string is not pallindrome");
			}
		}
}
