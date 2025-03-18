package String2;

public class SubStringLengthGreaterthan3 {
	
	public static void main(String[] args) {
		String s="selenium";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				if(s.substring(i,j).length()>3) {
					System.out.print(s.substring(i, j)+" ");
				}
			}
		}
	}
}
//sele selen seleni seleniu selenium elen eleni eleniu elenium leni leniu lenium eniu enium nium 
