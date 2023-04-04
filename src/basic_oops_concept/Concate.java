package basic_oops_concept;
/** @author ragigupt
 */
public class Concate {

	static int a=10;
	public static void main(String[] args) {
		System.out.println(10+ 20 + "Java");
		System.out.println("Java" + 10+20);
		
//		String s1="HELLO";
//		
//		s1.toLowerCase();
//		System.out.println(s1);
		
		Concate d1=new Concate();
		Concate d2=new Concate();
		d2.a=20;
		System.out.println(d1.a);
		int b=10;
		System.out.println("b");
	}

}
