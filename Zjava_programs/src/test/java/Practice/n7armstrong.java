package Practice;

public class n7armstrong {
	
	public static void main(String[] args) {
		
		int n=153,t1=n,t2=n,count=0,sum=0;
		
		while(t1>0) {
			count++;
			t1/=10;
		}
		
		while(t2>0) {
			int pro=1;
			int rem=t2%10;
			for(int i=1;i<=count;i++) {
				pro*=rem;
			}sum+=pro;
			t2/=10;
		}
		if(sum==n) {
			System.out.println("armstrong");
		}else {
			System.out.println("not");
		}
	}

}
