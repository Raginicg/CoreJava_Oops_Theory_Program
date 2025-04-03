package Code;

import java.util.ArrayList;

/*
 * For Loop-exact iteration we know
 * When you know the iteration then go for the for loop
 * 
 * 
 * 
 * For Each-
 * Dont know the iteration, how many time we need to iterate
 * At the time of the compilation its converted into ordinary
 * 
 */
public class ForLoop_ForEach {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			//System.out.println("For loop Used when Exact iteration know");
		}
		// How to add elements in arraylist/ how to iterate

		int arr[]=new int[5];
		int arr1[]= {2,3,4,3,5};
		arr[0]=1;  // If we cant give any value to the particular index then it take- 0
		arr[1]=3;
		arr[2]=5;
		arr[3]=3;
		arr[4]=4;
		for (int i=0; i< arr.length; i++) {
			System.out.println("Using For loop "+ arr[i]);
		}
//		Using for each ---> Right side from where the date is come---> left side which type of come 
//		Right side- kaha se , left side - kaun se types ka
		for(int values: arr) {
			System.out.println(values);
		}
		
//		How to iterate elements in ArrayList
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add("Ragini");
		System.out.println("Using For each");
		for(Object values: a1) {
			System.out.println(values);
		}
		
//	Using for loop--> recommended to not use
		System.out.println("Using For loop");
		for (int i=0; i<a1.size()-1; i++) {
				System.out.println(i);
		}
		
	}

}
