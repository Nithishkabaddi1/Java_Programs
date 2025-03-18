package String3;

import java.util.Arrays;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1="Race";
		String s2="Care";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("not anagram");
		}else  {
			char[] s1array=s1.toCharArray();
			char[] s2array=s2.toCharArray();
			
			Arrays.sort(s1array);
			Arrays.sort(s2array);
			
			if(Arrays.equals(s1array, s2array))
			{
				System.out.println("anagram");
			}else {
				
					System.out.println("not anagram");
			}
		}
	}
}
