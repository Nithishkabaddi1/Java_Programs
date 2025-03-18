package pReverse;

public class r2 {

	public static void main(String[] args) {
		
		String s="java selenium is easy";
		String split[]=s.split(" ");
		String res="";
		for(int i=split.length-1;i>=0;i--)
		{
			res+=split[i]+" ";
		}
		System.out.println(res);
	}
}
