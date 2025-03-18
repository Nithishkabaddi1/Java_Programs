package np;

public class ss {

public static void main(String[] args) {
		
		int n=15598,s=9,ss=9,t=n;
		
		while(t>0) {
			int rem=t%10;
			if(rem<s) {
				s=rem;
			}
			t/=10;
		}
		
		while(n>0) {
			int rem=n%10;
			if(rem<ss && rem>s) {
				ss=rem;
			}
			n/=10;
		}System.out.println(ss);
	}


}
