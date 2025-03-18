package Practice;

public class p7RemoveDupChar {
	public static void main(String[] args) {
		
	
	String s="javaselenium";
	String res="";
	
	for(char c:s.toCharArray()) {
		if(res.indexOf(c)==-1) {
			res+=c;
		}
	}System.out.println("after removing duplicates in the string : "+res);

}
}