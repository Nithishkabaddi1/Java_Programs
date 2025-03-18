package String;

public class RemoveDuplicateWordInString {
	public static void main(String[] args) {
		
	String s="java java selenium is is is easy easy ";
	String[] split=s.split(" ");
	String res="";
	
	for(String c:split) {
		if(res.indexOf(c)==-1) {
			res+=c+" ";
		}
	}
	System.out.println(res);
}
}