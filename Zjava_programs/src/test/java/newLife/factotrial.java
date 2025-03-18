package newLife;

public class factotrial {

	public static void main(String[] args) {
		
		int n=5,fact=1;
		for(int i=n;i>0;i--) {
			fact*=i;
		}
		System.out.println("factorial of "+n+"="+fact);
	}
}
