package pReverse;

public class p5 {

public static void main(String[] args) {
		
		String s="I Love my India";
		String res="";
		String s1=s.replaceAll(" ", "");
		
		for(int i=s1.length()-1;i>=0;i--) {
			res+=s1.charAt(i);
		}
		System.out.println(res);
		
		
}
}
