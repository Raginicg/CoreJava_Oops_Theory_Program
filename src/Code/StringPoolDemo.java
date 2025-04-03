package Code;

public class StringPoolDemo {

	public static void main(String[] args) {
			String str1="Java";
			String str2="Java";
			System.out.println("Checking if both string input point same object in sp "+ (str1==str2));
			
			String str3=new String("Java");
			System.out.println("Checking again its point sp or not "+ (str1==str3));
	
//			intern() method: You can explicitly add a string to the 
//			string pool using the intern() method. If the string already exists in the pool, it returns the reference to that string; otherwise, it adds it to the pool.
			String str4=str3.intern();
			System.out.println("After Interning "+(str1==str4));
	}

}
