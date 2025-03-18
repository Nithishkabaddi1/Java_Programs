package pString;

public class t2 {
	
	public static void main(String[] args) {
		
		String s="aaabbfdtt";
		
		String res="";
		
		int n=s.length()-1;
		int count=1;
		
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
