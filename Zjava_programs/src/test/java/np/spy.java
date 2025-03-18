package np;

public class spy {

	public static void main(String[] args) {
		
		int n=22,sum=0,pro=1,t=n;
		
		while(t>0) {
			int rem=t%10;
			sum+=rem;
			t/=10;
		}
		while(n>0) {
			int rem=n%10;
			pro*=rem;
			n/=10;
		}
		if(sum==pro) {
			System.out.println("spy");
		}else {
			System.out.println("not");
		}
	
	}
}
