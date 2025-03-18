package np;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0,c=1,n=5;
		
		for(int i=0;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}

	}

}
