package Code;

public class VowelCounter {

	public static void main(String[] args) {
		System.out.println("Using Java 8 Features");
		String str = "Welcome";

		long count = str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();

		System.out.println("Number of vowels: " + count);
		
		System.out.println("Using Regular expression");
		
		int count1 = str.replaceAll("[^aeiouAEIOU]", "").length();
		System.out.println("Number of vowels: " + count1);

	}

}
