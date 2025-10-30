package interview;

public class T_Interview {

	/**
	 * 1. Can we create an object without using the new keyword?
	 * ------------------------------------------------------------
	 * Create an object using new keyword----> 
	 * Create an Object using reflection----->
	 * Create an object using clone method
	 * Create an Object using classLoader 
	 */

	T_Interview t=new T_Interview();
	//T_Interview t2=(T_Interview) Class.forName("core.com.T_Interview").newInstance();
	
	public static void main(String[] args) {
		try {
			T_Interview t2 = null;
		    t2 = (T_Interview) Class.forName("core.com.T_Interview").newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
		    e.printStackTrace();
		}
	}
	
//	T_Interview t3=new T_Interview();
//	T_Interview obj3=(T_Interview) t3.clone();
	
//	Object o=T_Interview.class.getClassLoader().loadClass("core.com.T_Interview").newInstance();
}


