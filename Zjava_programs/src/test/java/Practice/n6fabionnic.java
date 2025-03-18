package Practice;

public class n6fabionnic {

	public static void main(String[] args) {
		
		int a=0,b=0,c=1,n=5;
		
		for(int i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
	}
}
