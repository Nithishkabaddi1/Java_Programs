package pString;

public class p3 {
	
	public static void main(String[] args) {
		
		String s="sd2sds2sd4",res="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				count+=Character.getNumericValue(c);
			}else {
				res+=c;
			}
			
		}System.out.println(count);
		System.out.println(res);
		
	}

}
