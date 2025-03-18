package Numbers;

public class Smallest {
	
public static void main(String[] args) {
		
		int n=1254,smal=9;
		while(n>0) {
			int rem=n%10;
			if(rem<smal) {
				smal=rem;
			}
			n/=10;
		}System.out.println(smal);
		
		int[] n1= {2,5,6,8};
		int small=9;
		for(int i=0;i<n1.length;i++) {
			if(n1[i]<small) {
				small=n1[i];
			}
			
		}System.out.println(small);
	}

}
