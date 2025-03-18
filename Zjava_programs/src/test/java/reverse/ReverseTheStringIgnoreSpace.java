package reverse;

public class ReverseTheStringIgnoreSpace {

	public static void main(String[] args) {
		String s="I Love India";  //aidnIevoLI
		String res="";
		char[] c=s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--) {
			if(c[i]!=' ') {
				res+=c[i];
			//	res+=s.charAt(i);
			}
		}
		System.out.println(res);
	}
}
