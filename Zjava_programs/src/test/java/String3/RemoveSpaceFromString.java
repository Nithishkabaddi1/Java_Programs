package String3;

public class RemoveSpaceFromString {
	
	public static void main(String[] args) {
		
		String s="java selenium";
		System.out.println("string with space :"+s);
//		s=s.replaceAll(" ", "");
//		System.out.println("string without space :"+s);
		
		for(int i=0;i<s.length();i++) {
//			char[]c=s.toCharArray();
//			if(c[i]!=' ') {
//				System.out.print(c[i]);
//			}
			if(s.charAt(i)!=' ') {
				System.out.print(s.charAt(i));
			}
		}

	}
}
