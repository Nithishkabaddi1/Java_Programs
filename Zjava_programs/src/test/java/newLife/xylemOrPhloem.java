package newLife;

public class xylemOrPhloem {
	
	public static void main(String[] args) {
		
		int n=11235,in=0,out=0,n1=n;
		
		while(n1>0) {
			int rem=n1%10;
			if(n1==n || n1<10) {
				
				out+=rem;
			}else {
				in+=rem;
			}
			
			n1/=10;
		}
			if(in==out) {
				System.out.println("xylem");
			}else {
				System.out.println("phloem");
			}
		
	}

}
