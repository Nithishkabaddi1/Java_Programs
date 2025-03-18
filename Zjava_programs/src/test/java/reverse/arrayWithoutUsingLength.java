package reverse;

public class arrayWithoutUsingLength {
	
	public static void main(String[] args) {
		int a[]= {2,5,6,8,11,4};//4 11 8 6 5 2 
	

		String rev="";
		for(int b:a)
		{
			rev=String.valueOf(b)+" "+rev;//converting integer b to string
		}
		System.out.println(rev);
	
	String[] c= {"apple","bananna","orange","grapes","mango"};//	mango grapes orange bananna apple 
	String res="";
		for(String s:c) {
		
			res=s+" "+res;
	}
		System.out.println(res);
	}
}
