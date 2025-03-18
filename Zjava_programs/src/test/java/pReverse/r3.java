package pReverse;

public class r3 {

	public static void main(String[] args) {
		
		String s="I Love My India";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			if(c!=' ') {
				res+=c;
			}
		}
		System.out.println(res);
	}
}
