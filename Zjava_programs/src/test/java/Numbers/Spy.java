package Numbers;

public class Spy {
	public static void main(String[] args) {

		int n = 22, sum = 0, pro = 1, t1 = n;
		while (t1 > 0) {
			int rem = t1 % 10;
			sum += rem;
			t1 /= 10;
		}
		System.out.println(sum);
		while (n > 0) {
			int rem = n % 10;
			pro *= rem;
			n /= 10;
		}System.out.println(pro);
		if (sum == pro) {
			System.out.println("spy");
		} else {
			System.out.println("not");
		}

	}
}