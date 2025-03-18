package String2;

import java.util.HashSet;

public class UniqueSubStringExtractor {

	public static void main(String[] args) {

		String s = "aabbbccds";

		HashSet<String> hset = new HashSet<String>();

		for (int i = 0; i < s.length()-1; i++) {
			String substring = s.substring(i, i + 2);
			hset.add(substring);
		}
		System.out.print("all unique substrings pg length 2 is : ");
		for (String uniqestring : hset) {
			System.out.print(uniqestring + " ");
		}
	}
}
