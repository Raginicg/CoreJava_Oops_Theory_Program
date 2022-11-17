package Basic;

/**@author ragigupt
 */

public class Demoarray {

	public static void main(String[] args) {
		// Array- Array is a collection of similar type of data. 
		// The length of an array is established when the array is created. after creation of array, its sized are fixed
		// It stored in continuous memory location
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
