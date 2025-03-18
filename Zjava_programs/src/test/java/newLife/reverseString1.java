package newLife;

public class reverseString1 {
	
	public static void main(String[] args) {
		
		String s="nithish",rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev+=s.charAt(i);
		}
		System.out.println(rev);
	}

}
