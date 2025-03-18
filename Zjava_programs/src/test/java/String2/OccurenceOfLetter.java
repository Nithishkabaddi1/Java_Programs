package String2;

public class OccurenceOfLetter {

	public static void main(String[] args) {
		
		String s="aaabbcdddeabbb";
		String res="";
		int count=1;
		int n = s.length()-1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}else {
				res=res+s.charAt(i)+count;
				count=1;
			}
		}
			res=res+s.charAt(n)+count;
			
			System.out.print(res);
			
		}
}//a3b2c1d3
