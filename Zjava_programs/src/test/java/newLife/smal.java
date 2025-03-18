package newLife;

public class smal {
	
	public static void main(String[] args) {
		
		int n=4528,sml=9;
		while(n>0) {
			int rem=n%10;
			
			if(rem<sml) {
				sml=rem;
			}
			n/=10;
		}
		
		System.out.println(sml);
	}

}
