package newLife;

public class pallindrome {
	
	public static void main(String[] args) {
	
		int n=242421,n1=n,res=0;
		
		while(n1>0) {
			int rem=n1%10;
			res=rem+res*10;
			n1/=10;
		}
		System.out.println(res);
		
		if(res==n) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not pallindrome");
		}
	}

}
