package Code;

public class ObjectClassMethod {
	public static void main(String[] args) {
		 String str1 = "Hello";
	        String str2 = "Hello";
	        String str3 = new String("Hello");
	        System.out.println("To String method " + str1.toString()); 
//	        compare the object equality means only the value
	        System.out.println("Equal method " + str1.equals(str2)); 
	        System.out.println("HashCode method " + str1.hashCode());
	}
}
