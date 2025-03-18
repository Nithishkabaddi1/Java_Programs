package Practice;

public class n16secSmal {

	public static void main(String[] args) {
		
		int n=76534567,t=n,s=9,ss=9;
		
		while(t>0) {
			int rem=t%10;
			if(rem<s) {
				s=rem;
			}t/=10;
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
