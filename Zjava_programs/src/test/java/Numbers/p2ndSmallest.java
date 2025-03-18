package Numbers;

public class p2ndSmallest {

	public static void main(String[] args) {
		
		int n=1541,smal=9,t1=n,Secsmal=9;
		while(t1>0) {
			int rem=t1%10;
			if(rem<smal) {
				smal=rem;
			}
			t1/=10;
		}
		while(n>0) {
			int rem=n%10;
			if(rem>smal && rem<Secsmal) {
				Secsmal=rem;
			}
			n/=10;
		}
		
		System.out.println(Secsmal);
		
		int[] n1= {2,5,6,8,1};
		int small=9,Secsmall=9;
		for(int i=0;i<n1.length;i++) {
			if(n1[i]<small) {
				small=n1[i];
			}
		}
		
		for(int i=0;i<n1.length;i++) {
			if(n1[i]>small && n1[i]<Secsmall) {
				Secsmall=n1[i];
			}
		}
		System.out.println(Secsmall);
	}

	}

