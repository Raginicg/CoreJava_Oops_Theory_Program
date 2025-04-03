package HackerRank;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		String reversed=new StringBuilder(str).reverse().toString();
		
		if(str.equals(reversed)) {
			System.out.println("The string is a palindrom");
		}
		else {
			System.out.println("The string is not a palindrom");
		}
				
	}

}
