package Basic;

// For giving comment---> /** space bar select @author
/*
 * 	A positive integer, if the current object is greater than the parameter object
	A negative integer, if the current object is less than the parameter object
	Zero, if the current object is equal to the parameter object
 */

/**
 * @author ragigupt
 */

public class CompareTo {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Python";
		String s3="JAVA";
		String s4=new String("Java");
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareToIgnoreCase(s3));
		System.out.println(s4.compareToIgnoreCase(s3));
		}

}
