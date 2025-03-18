package Practice;

public class n4pallindrome {

	public static void main(String[] args) {
		
		int n=12121,t=n,sum=0;
		
		while(t>0) {
			int rem=t%10;
			sum=rem+(sum*10);
			t/=10;
		}
	
		
		if(sum==n) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not");
		}
	}
}
