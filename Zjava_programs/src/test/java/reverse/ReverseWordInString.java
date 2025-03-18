          package reverse;

public class ReverseWordInString {
	public static void main(String[] args) {
		
		String s="I Love my India";//I evoL ym aidnI 
		String[] split=s.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			String word=split[i];
			for(int j=word.length()-1;j>=0;j--) {
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
