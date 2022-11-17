package Basic;

// For giving comment---> /** space bar select @author

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
