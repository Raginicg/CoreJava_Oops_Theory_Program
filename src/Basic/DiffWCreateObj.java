package Basic;

import java.lang.reflect.Constructor;

public class DiffWCreateObj {
/*
 * 1st- By using new keyword
 * By using Class.forName()
 * By using getDeclaredConstructor
 * By using factory method
 * By using factory class
 */
	public static void main(String[] args) throws Exception {
//
//		TestDemo t=new TestDemo();
//		t.show();
		
//		2nd way--->full qualified class name with package
//		Class c=Class.forName("Basic.TestDemo");
//		TestDemo t1= (TestDemo)c.newInstance();
//		t1.show();
	
//		-----------This is us
		Class c=Class.forName("Basic.TestDemo");
		Constructor[] cto=c.getDeclaredConstructors();
		cto[0].setAccessible(true);
		TestDemo t2=(TestDemo) cto[0].newInstance();
		t2.show();
		}
}
class TestDemo{
	private TestDemo() {
		System.out.println("TestDemo object created");
	}
	public void show() {
		System.out.println("Show method");
	}
}