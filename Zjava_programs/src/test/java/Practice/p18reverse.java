package Practice;

public class p18reverse {

	public static void main(String[] args) {
		
		String s="I Love My India";//aidnI yM evoL I
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			
			res+=s.charAt(i);
		}
		System.out.println(res);
	}
}
