package String3;

public class SeperateLowerUpperCase {
	
	public static void main(String[] args) {
		
		String s="abc A  BCsS";
		String lowercase="";
		String uppercase="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLowerCase(c)) {
				lowercase+=c;
			}else if(Character.isUpperCase(c)) {
				uppercase+=c;
			}
		}
		System.out.println("uppercase :"+uppercase);
		System.out.println("lowercase :"+lowercase);
	}

}
