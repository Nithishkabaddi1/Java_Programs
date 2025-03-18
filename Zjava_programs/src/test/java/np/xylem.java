package np;

public class xylem {

	public static void main(String[] args) {
		
		int n=14114,in=0,out=0,t=n;
		
		while(t>0)
		{
			int rem=t%10;
			if(t<10 || t==n) {
				out+=rem;
			}else {
				in+=rem;
			}
			t/=10;
		}if(in==out) {
			System.out.println("xylem");
		}
		else {
			System.out.println("phlom");
		}
	}
}
