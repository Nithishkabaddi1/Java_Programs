    package String2;

public class SeperateCharInString {

	public static void main(String[] args) {

		String s = "ahv1234@#&8ds*";
		String digits = "";
		String alphabet = "";
		String specialChar = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') 
			if(Character.isAlphabetic(c))
			{
				alphabet += c;
			} //else if (c >= '0' && c <= '9')
			else if (Character.isDigit(c))
			{
				digits += c;
			} else {
				specialChar += c;
			}
		}
		
		System.out.println("alphabets are : "+alphabet+" ,digits are : "+digits+" ,specialChar are : "+specialChar);
	}
}
