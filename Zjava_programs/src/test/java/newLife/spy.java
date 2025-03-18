package newLife;

public class spy {
	
	public static void main(String[] args) {
		
		int n=44,n1=n,sum=0,pro=1;
		
		while(n1>0)
		{
			int rem=n1%10;
			sum+=rem;
			n1/=10;
		}
		
		System.out.println(sum);
		
		while(n>0) {
			int rem=n%10;
			pro*=rem;
			n/=10;
		}
		
		System.out.println(pro);
		
		if(sum==pro) {
			System.out.println("spy number");
		}else {
			System.out.println("not spy");
		}
	}

}
