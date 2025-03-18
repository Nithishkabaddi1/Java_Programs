package newLife;

public class neon3 {
	
	public static void main(String[] args) {
		
		int n=91,sq=n*n,res=0;
		
		while(sq>0)
		{
			int rem=sq%10;
			res+=rem;
			sq/=10;
		}
		if(n==res) {
			System.out.println("neon");
		}
		else {
			System.out.println("given num is not neon");
		}
	}

}
