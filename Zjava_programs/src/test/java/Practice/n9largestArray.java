package Practice;

public class n9largestArray {
	public static void main(String[] args) {
		
		int[] n= {2,9,5,6,6,4};
		int lar=n[0];
		
		for(int i=0;i<n.length;i++) {
			if(n[i]>lar) {
				lar=n[i];
				}
		}System.out.println(lar);
	}

}
