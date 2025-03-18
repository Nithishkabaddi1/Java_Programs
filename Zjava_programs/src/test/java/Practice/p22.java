package Practice;

public class p22 {

	public static void main(String[] args) {

		String s = "I Love My India";//a idnI ym evoLI
		String s1=s.replace(" " ,"");
		int n=s1.length()-1;

		for (int i = 0; i <s.length(); i++) {
			
			char c=s.charAt(i);
			if(c==' ') {
				System.out.print(" ");
			}else {
				System.out.print(s1.charAt(n));
				n--;
			}
		}

	}
}