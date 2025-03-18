package Practice;

public class p19R {

	public static void main(String[] args) {
		
		String s="I Love My India";//aidnIyMevoLI
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
