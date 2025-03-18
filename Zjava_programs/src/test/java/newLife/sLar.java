package newLife;

public class sLar {

	public static void main(String[] args) {
		
		int n=21654,lar=0,slar=0,n1=n;
		
		while(n1>0)
		{
			int rem=n1%10;
			
			if(rem>lar) {
				lar=rem;
			}
			n1/=10;
		}
		
		while(n>0) {
			int rem=n%10;
		
			if(rem>slar && rem<lar) {
				slar=rem;
			}
			n/=10;
		}
		
		System.out.println("lar ="+lar);

		System.out.println("slar ="+slar);
	}
}
