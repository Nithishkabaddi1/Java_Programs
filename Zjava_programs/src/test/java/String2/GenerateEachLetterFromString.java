package String2;

public class GenerateEachLetterFromString {
	
	public static void main(String[] args) {
		
		String s="India";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.print(s.substring(i, j)+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("total combination="+count);
	}

}
//I In Ind Indi India n nd ndi ndia d di dia i ia a 
//total combination=15
