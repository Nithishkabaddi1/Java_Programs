package Practice;

public class p21 {

public static void main(String[] args) {
		
		String s="I Love My India";//India My Love I
		String[] split=s.split(" ");
		String res="";

		for(int i=split.length-1;i>=0;i--) {
			String word=split[i];
			res+=word+" ";
			
		}System.out.println(res);
		
}
}
