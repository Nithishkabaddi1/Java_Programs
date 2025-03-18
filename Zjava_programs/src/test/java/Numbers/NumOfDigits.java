package Numbers;

import com.google.protobuf.StringValue;

public class NumOfDigits {

	public static void main(String[] args) {
		
		int n=6512,sum=0;
		while(n>0) {
			sum++;
			n/=10;
		}System.out.println(sum);
		
		int n1=52144;
		int s=String.valueOf(n1).length();
System.out.println(s);
	}

}
