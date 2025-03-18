package String2;

public class Swapping1stAndLastWord {
	
	public static void main(String[] args) {
		 
		String s="java selenium automation testing";
		System.out.println("before swapping : "+s);
		String[] s1=s.split(" ");
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		System.out.println("after swapping :");
		for(String s2:s1){
			System.out.print(s2+" ");
		}
	}
}
/*before swapping : java selenium automation testing
after swapping :
testing selenium automation java */