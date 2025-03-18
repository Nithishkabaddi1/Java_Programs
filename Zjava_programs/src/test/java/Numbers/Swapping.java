package Numbers;

public class Swapping {

	public static void main(String[] args) {
		
		int a=5,b=6;
		System.out.println("beforeswapping a="+a+" b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping a="+a+" b="+b);
	}
}
