package String2;

public class SumOfDigitsInString {
	
	public static void main(String[] args) {
		
		String s="abcgs2343k";
		int sum=0;
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(c>='0'&&c<='9') {
//				sum+=c-48;
//			}
//		}
//		System.out.println(sum);
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
		System.out.println(sum);
		
	}

}
