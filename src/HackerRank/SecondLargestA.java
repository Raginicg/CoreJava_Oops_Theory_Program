package HackerRank;

import java.util.Scanner;

public class SecondLargestA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array");
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		if(n<2) {
			System.out.println("Array need to have atleast 2 elements");
			return;
		}
		int first=Integer.MIN_VALUE;
		int second=Integer.MAX_VALUE;
		
		for (int i=0; i<n; i++) {
			if (arr[i]>first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]> second && arr[i]!= first) {
				second=arr[i];
			}
		}
		if(second==Integer.MIN_VALUE) {
			System.out.println("There is no second largest element");
		}
		else {
			System.out.println("The second largest element is: "+ second);
		}
		
	}

}
