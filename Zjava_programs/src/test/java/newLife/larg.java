package newLife;

public class larg {
	
	public static void main(String[] args) {
		
		int n=538475,lar=0;
		
		while(n>0) {
			int rem=n%10;
			
			if(rem>lar) {
				lar=rem;
			}
			n/=10;
		}System.out.println(lar);
	}

}
