package Practice;

public class n10xylemOrPhloem {
	
	public static void main(String[] args) {
		
		int n=221214,t=n,in=0,out=0;
		while(t>0) {
			int rem=t%10;
			if(t==n || t<10) {
				
				in+=rem;
			}else {
				out+=rem;
			}t/=10;
		}
		if(in==out) {
			System.out.println("xylem");
		}else {
			System.out.println("phloem");
		}
	}

}
