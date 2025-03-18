package Practice;

public class n15smalArray {
	
	public static void main(String[] args) {
		
		int []n= {2,1,7,4,5,6};
		int s=n[0];
	
		for(int i=0;i<n.length;i++) {
			if(n[i]<s) {
				s=n[i];
			}
		}System.out.println(s);
	}

}
