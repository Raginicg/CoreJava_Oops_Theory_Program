package Basic;

public class ArrayListD {
	public static void main(String[] args) {
//		 No values assigned to any index, so each element defaults value its take as null for String as well as Integer
		 String[] a = new String[3]; 
		 Integer[] b=new Integer[2];
		 	b[1]=1;
	        a[1] = "Hello"; 
	        for (int i = 0; i < a.length; i++) {
	            System.out.println("Element at index " + i + ": " + a[i]);
	        }
	        for (int j=0; j <b.length; j++) {
	        	System.out.println(b[j]);
	        }
	}
}
