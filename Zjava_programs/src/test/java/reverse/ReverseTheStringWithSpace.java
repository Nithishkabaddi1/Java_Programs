package reverse;

public class ReverseTheStringWithSpace {
	public static void main(String[] args) {
		
		String s="I Love my India";	//India my Love I 
		String[] split=s.split(" ");
		String res="";
		
		for(int i =split.length-1;i>=0;i--) {
			String s1=split[i];
			res+=s1+" ";
		}
		System.out.println(res);
	}
}
