package String3;

public class FindAllPermutationOfString {

	public static void main(String[] args) {

		//String s="abc";
		permutation("abc", "");
	}
		public static void permutation(String s,String p) {
			
			if(s.length()==0) {
				System.out.println(p);
			}else {
				for(int i=0;i<s.length();i++) {
					String rem=s.substring(0, i)+s.substring(i+1);
					permutation(rem, p+s.charAt(i));
				}
			}
		}
}
