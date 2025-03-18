package pString;

public class p1 {

	public static void main(String[] args) {
		
		String s="12002005";
		String num="";
		String zeros="";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='0') {
				zeros+=c;
			}else {
				num+=c;
			}
		}
		System.out.println(num+zeros);
		System.out.println(zeros+num);
	}
}
