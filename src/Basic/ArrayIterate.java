package Basic;

public class ArrayIterate {
// Iterating means Traversing
	public static void main(String[] args) {
		
		// int[] a= new int[4];
		int [] a= {2,4,7,5};
		for(int i=0; i<a.length; i++) {
			System.out.println("Iterating array elemet" + a[i]);
		}
//		Using enhance for loop
		for (int num:a) {
			System.out.println(num);
		}
	}

}
