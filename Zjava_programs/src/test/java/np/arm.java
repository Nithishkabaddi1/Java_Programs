package np;

public class arm {

	public static void main(String[] args) {

	int n=1153,sum=0,count=0,t1=n,t2=n;
	
	while(t1>0)
	{
		count++;
		t1/=10;
	}
	
	while(t2>0) {
		int pro=1;
	
		int rem=t2%10;
		for(int i=0;i<count;i++) {
			pro*=rem;
			
		}
		sum+=pro;
		t2/=10;
	}if(sum==n) {
		System.out.println("arm");
	}else {
		System.out.println("not");
	}
	
	}
}
