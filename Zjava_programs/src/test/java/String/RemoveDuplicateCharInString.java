package String;

public class RemoveDuplicateCharInString {
public static void main(String[] args) {
	
		String s="kabaddi";
		String res="";
		for(char c:s.toCharArray()) {
			if(res.indexOf(c)==-1) {
				res+=c+" ";
			}
		}
		System.out.println(res);
}
}
