package String3;

public class RearrangeZerosFromStart {
public static void main(String[] args) {
		
		String s="120024002";
		String zeros="";
		String res="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='0') {
				zeros+=c;
			}else {
				res+=c;
			}
		}res=zeros+res;
		System.out.println(res);
	}

}
