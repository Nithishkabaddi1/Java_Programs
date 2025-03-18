package pReverse;

public class p1 {

	public static void main(String[] args) {
		
		String s="I Love my India";
		String res="";
	
		
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		System.out.println(res);
	}
}
