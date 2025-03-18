package newLife;

public class fibbonic {

	public static void main(String[] args) {
		
		int n=10,a=0,b=0,c=1;

		for(int i=n;i>0;i--) {
		a=b;
		b=c;
		c=a+b;
		
		System.out.println(a);
		}
	}
}
