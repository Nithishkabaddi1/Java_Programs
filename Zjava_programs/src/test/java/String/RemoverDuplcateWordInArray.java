package String;

public class RemoverDuplcateWordInArray {
	public static void main(String[] args) {

		String[] s = { "java", "python", "java", "python", "c++" };
		String res="";
		for(String c:s) {
			if(res.indexOf(c)==-1) {
				res+=c+" ";
			}
		}
		System.out.println(res);
}
}