package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// How we can sort array elements and ArrayList

public class Array_Arraylist_Sort {

public static void main(String[] args) {
	int arr[]=new int[3];
	arr[0]=3;
	arr[1]=13;
	arr[2]=1;
//	Available method in array 
	Arrays.sort(arr);
	
	for (int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	String str[]= {"Ragini", "Anand", "Aadya"};
	Arrays.sort(str);
	
	for (int i=0; i<str.length; i++) {
		System.out.println(str[i]);
	}
	
// ArrayList sort
	ArrayList ar=new ArrayList<>();
	ar.add("Gupta");
	ar.add("Singh");
	ar.add("Sahu");
	Collections.sort(ar);
	System.out.println("After sorting "+ ar);
	Collections.reverse(ar);
	System.out.println("After reversing "+ar);

}
}
