package Numbers;

public class XylemOrPhloem {

	public static void main(String[] args) {
		
		int n=11235,inn=0,out=0,t1=n;
		while(t1>0) {
			int rem=t1%10;
			if(t1<10 || t1==n)
			{
				out+=rem;
			}else
			{
				inn+=rem;
			}t1/=10;
		}
		
		if(inn==out) {
			System.out.println("xylem");
		}else {
			System.out.println("phloem");
		}
	}

}
