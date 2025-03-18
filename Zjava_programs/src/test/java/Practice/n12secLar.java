package Practice;

public class n12secLar {
	
	public static void main(String[] args) {
		
		int n=47989,sl=0,l=0,t=n;
		while(t>0) {
			int rem=t%10;
			if(rem>l) {
				l=rem;
			}
			t/=10;
		}while(n>0) {
			int rem=n%10;
			if(rem>sl && rem<l) {
				sl=rem;
			}
			n/=10;
		}System.out.println(sl);
	}

}
