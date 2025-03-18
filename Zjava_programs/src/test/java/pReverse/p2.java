package pReverse;

public class p2 {
	
	public static void main(String[] args) {
		
	String s="I Love my India";
	String res="";
	String [] split=s.split(" ");
	for(int i=split.length-1;i>=0;i--) {
		
		String word=split[i];
		res=res+word+" ";
		
	}System.out.println(res);

}}
