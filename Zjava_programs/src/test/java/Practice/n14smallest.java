package Practice;

public class n14smallest {

	public static void main(String[] args) {
		
		int n=742951,s=9;
		while(n>0) {
			int rem=n%10;
			if(rem<s) {
				s=rem;
			}
				n/=10;
		}System.out.println(s);
	}
}
