package Practice;

public class p16RemoveDupWordArray {
	
public static void main(String[] args) {
	String[] s= {"java","selenium","selenium","is","is","is","easy","easy"};
		String res="";
		
		for(String word:s) {
			if(res.indexOf(word)==-1) {
				res+=word+" ";
			}
		}
		System.out.println("after removing duplicates the string is: "+res);
	}

}
