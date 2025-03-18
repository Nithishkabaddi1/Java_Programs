package pString;

public class p4 {
	public static void main(String[] args) {
		
		String s="as23$#@GF#2";
		String num="",alph="",spe="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alph+=c;
			}else if(Character.isDigit(c)) {
				num+=c;
			}else {
				spe+=c;
			}
		}System.out.println(num);
		System.out.println(alph);
		System.out.println(spe);
	}

}
