package pReverse;

public class p3 {

	public static void main(String[] args) {
		
		String s="I Love my India";
		String res="";
		String split[]=s.split(" ");
		
		for(int i=0;i<split.length;i++) {
			
			String word=split[i];
			if(word!=" ") {
				for(int j=word.length()-1;j>=0;j--) {
					res+=word.charAt(j);
				}
			}res+=" ";
		}System.out.println(res);
	}
}
