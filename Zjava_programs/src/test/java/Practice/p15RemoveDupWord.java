package Practice;

public class p15RemoveDupWord {

	public static void main(String[] args) {
		
		String s="java java is is easy";
		String split[]=s.split(" ");
		String res="";
		
		for(String word:split) {
			if(res.indexOf(word)==-1) {
				res+=word+" ";
			}
		}
		System.out.println("after removing duplicates : "+res);
	}
}
