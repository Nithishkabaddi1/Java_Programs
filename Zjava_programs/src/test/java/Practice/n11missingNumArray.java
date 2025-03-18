package Practice;

public class n11missingNumArray {
	public static void main(String[] args) {
		
		int []n= {1,2,4,5,6};
		int sum=0,sum1=0;
		int lastdigit=n[n.length-1];
		
		for(int i=0;i<n.length;i++) {
			sum+=n[i];
		}for(int i=1;i<=lastdigit;i++) {
			sum1+=i;
		}System.out.println("missing num : "+(sum1-sum));
	}

}
