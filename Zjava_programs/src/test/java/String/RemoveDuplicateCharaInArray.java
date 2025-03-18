package String;

import java.util.HashMap;
	
	
public class RemoveDuplicateCharaInArray {
	
	public static void main(String[] args) {
		
	
	char[]s= {'a','b','c','a','b','d','a'};
	String res="";
	for(char c:s) {
		if(res.indexOf(c)==-1) {
			res+=c+" ";
		}
	}
	System.out.println(res);
	
	}

}
