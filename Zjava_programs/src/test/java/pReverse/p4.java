package pReverse;

public class p4 {

public static void main(String[] args) {
		
		String s="I Love my India";
		String s1=s.replaceAll(" ", "");
		int n=s1.length()-1;
		String res="";
		
		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)==' ') {
//				res+=" ";
//			}else {
//				res+=s1.charAt(n);
//				n--;
			
			if(s.charAt(i)!=' ') {
				res+=s1.charAt(n);
			n--;
			}else {
			res+=" ";
			}         
			
		}System.out.println(res);
		
		
}
}
