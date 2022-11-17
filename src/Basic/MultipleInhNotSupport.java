package Basic;
/**@author ragigupt
 */

class A{
	void msg(){
		System.out.println("Parent class A");
	}
}

class B{
	void msg () {
		System.out.println("Parent class B");
	}
}
// its giving compile time error because If you extends two classes at same time A,B
//public class MultipleInhNotSupport extends A , B{
//	public static void main(String[] args) {
//		MultipleInhNotSupport m=new MultipleInhNotSupport();
//		m.msg();
//	}
//
//}
