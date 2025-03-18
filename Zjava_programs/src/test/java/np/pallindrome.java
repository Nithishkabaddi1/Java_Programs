package np;

public class pallindrome {

	public static void main(String[] args) {
		
		int n=112121,res=0,t=n;
		
		while(t>0) {
			int rem=t%10;
			res=res*10+rem;
			t/=10;
		}
		if(res==n) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not");
		}
	}
}
