package Practice;

public class n13secLarArray {

	public static void main(String[] args) {
		int[]n= {2,4,5,3,7,7,3,4};
		int l=n[0];
		int sl=n[0];
		
		for(int i=0;i<n.length;i++) {
			if(n[i]>l) {
				l=n[i];
			}
		}for(int i=0;i<n.length;i++) {
			if(n[i]>sl &&n[i]<l) {
				sl=n[i];
			}
		}
		System.out.println(sl);
	}
}
