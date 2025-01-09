package Basic;

public class InfiniteLoop {

	public static void main(String[] args)
	{	
//		for(int i=0; true; i++) {
//			System.out.println("Hello");
//		}
		String str = "Hello, World!";
		boolean containsWorld = str.indexOf("World") != -1; // true
		System.out.println(containsWorld);
		
	
	}

}
