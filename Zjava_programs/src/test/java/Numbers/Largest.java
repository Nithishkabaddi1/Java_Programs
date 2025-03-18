package Numbers;

public class Largest {

	public static void main(String[] args) {
		
		int n=12541,lar=0;
		while(n>0) {
			int rem=n%10;
			if(rem>lar) {
				lar=rem;
			}
			n/=10;
		}System.out.println(lar);
		
		int[] n1= {2,5,6,8,1};
		int larg=0;
		for(int i=0;i<n1.length;i++) {
			if(n1[i]>larg) {
				larg=n1[i];
			}
			
		}System.out.println(larg);
	}
}
