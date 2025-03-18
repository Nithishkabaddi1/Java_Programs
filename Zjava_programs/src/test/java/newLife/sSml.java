package newLife;

public class sSml {
	
	public static void main(String[] args) {
		
		int n=4528,sml=9,ssml=9,n1=n;
		
		while(n1>0) {
			int rem=n1%10;
			
			if(rem<sml) {
				sml=rem;
			}
			n1/=10;
		}
		
		System.out.println("sml ="+sml);
		
		while(n>0) {
			int rem=n%10;
			
			if(rem>sml && rem<ssml) {
				ssml=rem;
			}
			n/=10;
		}
		
		System.out.println("ssml ="+ssml);
	}

}
