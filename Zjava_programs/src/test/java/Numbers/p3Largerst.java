package Numbers;

public class p3Largerst {
	
public static void main(String[] args) {
		
		int n=12541,lar=0,t1=n,SecLar=0,ThirdLar=0,t2=n;
		while(t1>0) {
			int rem=t1%10;
			if(rem>lar) {
				lar=rem;
			}
			t1/=10;
		}
		
		while(t2>0) {
			int rem=t2%10;
			if(rem<lar && rem>SecLar) {
				SecLar=rem;
			}
			t2/=10;}
		
		while(n>0) {
			int rem=n%10;
			if(rem<SecLar && rem>ThirdLar) {
				ThirdLar=rem;
			}
			n/=10;
		}
		
		
		System.out.println(ThirdLar);
		
		int[] n1= {2,5,6,8,1};
		int larg=0,SecLarg=0,ThirdLarg=0;
		for(int i=0;i<n1.length;i++) {
			if(n1[i]>larg) {
				larg=n1[i];
			}
		}
		
		for(int i=0;i<n1.length;i++) {
			if(n1[i]<larg && n1[i]>SecLarg) {
				SecLarg=n1[i];
			}
		}
		
		for(int i=0;i<n1.length;i++) {
			if(n1[i]<SecLarg && n1[i]>ThirdLarg) {
				ThirdLarg=n1[i];
			}
		}
		System.out.println(ThirdLarg);
	}

}
