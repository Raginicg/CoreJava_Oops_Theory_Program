package Code;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digits = sc.nextInt();
		int min = (int) Math.pow(10, digits - 1);
		int max = (int) Math.pow(10, digits) - 1;
		System.out.println("Min: " + min + ", Max: " + max);

	}

}
