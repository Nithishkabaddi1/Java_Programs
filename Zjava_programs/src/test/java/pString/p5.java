package pString;

public class p5 {
	
	public static void main(String[] args) {
		
		String s="aaabbscdde";
	
		int count = 1;
		
		String res="";
		int n=s.length()-1;
		
		for(int i=0;i<s.length()-1;i++) {
			
			char c=s.charAt(i);
			
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
				
			}else {
				
				res=res+c+count;
				 count=1;
				
			}
		}
		res=res+s.charAt(n)+count;
		System.out.println(res);
		
	}

}
