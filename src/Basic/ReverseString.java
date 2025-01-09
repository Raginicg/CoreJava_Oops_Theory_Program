package Basic;

public class ReverseString {

	public static void main(String[] args) {
//		We can do using two ways 1st is using loop and 2nd is using StingBuilder
		StringBuilder sb= new StringBuilder("Aadya");
		String rev=sb.reverse().toString();
		System.out.println(rev);
//		
		String str="Aadya";
		String rev1="";
		for(int i=str.length()-1; i>=0; i--) {
			rev1+=str.charAt(i);
		}
		
		System.out.println(rev1);
	
	}

}
