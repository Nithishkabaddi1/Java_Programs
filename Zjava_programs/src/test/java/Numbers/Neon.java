package Numbers;

public class Neon {

	public static void main(String[] args) {
		
		int n=8,sq=n*n,sum=0;
		while(sq>0)
		{
			int rem=sq%10;
			sum+=rem;
			sq/=10;
		}if(sum==n) {
			System.out.println("neon");
		}else {
			System.out.println("not");
		}
	}
}
