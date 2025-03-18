package Numbers;

import java.util.Scanner;

public class FindOddOrEvenNumber {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println(num +" is even");
		}else {
			System.out.println(num +" is odd");
		}
	}
}
