package Basic;

public class StringOccurence {

	public static void main(String[] args) {
		String str="aabbacd";
		int [] n= new int[200];
		for (int i=0; i<str.length(); i++) {
			n[str.charAt(i)]++;
		}
		for (int i=0; i<200; i++) {
			if(n[i]>1) {
				System.out.println((char)i +":"+ n[i]);
			}
		}

	}

}
