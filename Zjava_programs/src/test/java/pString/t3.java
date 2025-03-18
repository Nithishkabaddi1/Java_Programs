package pString;

public class t3 {

	public static void main(String[] args) {
		
		String s="08700970";
		String zero="";
		String num="";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0') {
				zero+=s.charAt(i);
			}else {
				num+=s.charAt(i);
			}
		}System.out.println(zero+num);
		System.out.println(num+zero);
	}
}
