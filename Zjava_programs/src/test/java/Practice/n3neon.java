package Practice;

public class n3neon {

	public static void main(String[] args) {

		int n = 9, sq = n * n, sum = 0;
		
		while(sq>0) {
			int rem=sq%10;
			sum+=rem;
			sq/=10;
		}if(sum==n)
		{
			System.out.println("neon");
		}else {
			System.out.println("not");
		}
	}
}
