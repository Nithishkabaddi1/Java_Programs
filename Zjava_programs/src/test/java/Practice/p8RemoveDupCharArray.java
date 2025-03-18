package Practice;

public class p8RemoveDupCharArray {
	
	
	public static void main(String[] args) {
		
		
		char[] s={'a','b','a','c','d','d'};
		String res="";
		
		for(char c:s) {
			if(res.indexOf(c)==-1) {
				res+=c;
			}
		}System.out.println("after removing duplicates in the string : "+res);

	}
}
