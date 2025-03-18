package pString;

import java.util.Scanner;

public class t7 {

	public static void main(String[] args) {
		
		//String s="java aa   is    selenium		easy";
		int n=1;
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				n++;
			}
		}System.out.println(n);
	}
}
