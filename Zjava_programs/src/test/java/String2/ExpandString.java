package String2;

public class ExpandString {
		
		public static void main(String[] args) {
			
			String s="a2b3c1d2";
			for(int i=0;i<s.length();i=i+2) {
				char c=s.charAt(i);
				int count=(s.charAt(i+1))-48;//char 0=48,1=49....
				for(int j=0;j<count;j++) {
					System.out.print(c);
				}
			}
		}

}//aabbbcdd
