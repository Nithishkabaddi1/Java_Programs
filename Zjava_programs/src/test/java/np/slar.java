package np;

public class slar {
public static void main(String[] args) {
		
		int n=15598,l=0,sl=0,t=n;
		
		while(t>0) {
			int rem=t%10;
			if(rem>l) {
				l=rem;
			}
			t/=10;
		}
		
		while(n>0) {
			int rem=n%10;
			if(rem>sl && rem<l) {
				sl=rem;
			}
			n/=10;
		}System.out.println(sl);
	}

}
