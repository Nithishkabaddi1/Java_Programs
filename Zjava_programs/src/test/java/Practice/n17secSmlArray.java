package Practice;

public class n17secSmlArray {

	public static void main(String[] args) {

		int[] n = { 9, 3, 5, 2, 4 };
		int s = n[0], ss = n[0];

		for (int i = 0; i < n.length; i++) {
			if (n[i] < s) {
				s = n[i];
			}
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] > s && n[i] <ss) {
				ss = n[i];
			}

		}
		System.out.println(ss);
	}
}