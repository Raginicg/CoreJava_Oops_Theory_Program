package Basic;

public class ArrayDemo {
/**
 * 
 * @author ragigupt
 * Array is a collection of similar data type with continuous memory locations.
 * We can set only fixed number of element in java array.
 * Array in Java is index-based, the first element of the array is stored at the 0th index,
 * 2nd element is stored on 1st index and so on.
 * Java array inherits the Object class.
 * 
 */
	public static void main(String[] args) {
		int a[]=new int[3];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		
		// traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]); 
		
		// The length of an array can be found using the length property of the array.
		System.out.println("Length of array"+ a.length);
		
		int a1[]={33,3,4,5};//declaration, instantiation and initialization  
		for(int i=0;i<a1.length;i++)//length is the property of array  
			System.out.println(a1[i]);    
	}
}
