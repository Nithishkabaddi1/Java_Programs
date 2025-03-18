package np;

public class sm {
public static void main(String[] args) {
		
		int n=15598,s=9;
		while(n>0) {
			int rem=n%10;
			if(rem<s) {
				s=rem;
			}
			n/=10;
		}System.out.println(s);
	}

}
