package Numbers;

public class pallindrome {
	
	public static void main(String[] args) {
		int n=121,t1=n,res=0;
		while(t1>0) {
			int rem=t1%10;
			res=res*10+rem;
			t1/=10;
		}
		if(n==res) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not");
		}
	}

}
