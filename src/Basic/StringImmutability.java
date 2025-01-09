package Basic;

public class StringImmutability {

	public static void main(String[] args) {
	
//		This line show the string immutability
		String s1=new String("Java");
		System.out.println("Before "+ s1.hashCode());
		
		s1=s1+ "Programming";
		System.out.println(" After "+ s1.hashCode());
	
	
		StringBuffer sb=new StringBuffer ("Ragini");
		System.out.println("using string buffer "+ sb.hashCode());
		sb=sb.append("Gupta");
		System.out.println("after "+ sb.hashCode());
	
}
}
