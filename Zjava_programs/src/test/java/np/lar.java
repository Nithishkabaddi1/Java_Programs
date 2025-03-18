package np;

public class lar {

	public static void main(String[] args) {
		
		int n=15598,l=0;
		while(n>0) {
			int rem=n%10;
			if(rem>l) {
				l=rem;
			}
			n/=10;
		}System.out.println(l);
	}
}
