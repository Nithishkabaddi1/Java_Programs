package newLife;

public class armStrong {
	
	public static void main(String[] args) {
		
		int n=153,sum=0,n1=n,n2=n,count=0;
		
		System.out.println(n);
		
		while(n1>0) {
			count++;
			n1/=10;
		}
	
		System.out.println(count);
		
		while(n2>0) {
			
			int rem=n2%10;
			int pro=1;
			
			for(int i=1;i<=count;i++) {
				pro*=rem;
			}
			sum+=pro;
			n2/=10;
			
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}}
