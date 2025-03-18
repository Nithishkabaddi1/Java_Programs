package pString;

public class t6 {
	
	public static void main(String[] args) {
		
		String s="gvw3l21";
		int sum =0;
		String alph="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				int count=Character.getNumericValue(c);
				sum+=count;
			}else {
				alph+=c;
			}
		}
		System.out.println(sum);
		System.out.println(alph);
	}

}
