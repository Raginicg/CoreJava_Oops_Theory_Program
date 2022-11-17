package Exception;
/**@author ragigupt
 */

/*-----------------------Exception handling----------------------------
 * Exception handling is the mechanism to handle runtime error.
 * It maintain the normal flow of the program.
 * Abnormal condition which occurs during the execution of the program. 
 *
 * The java.lang.Throwable class is the root of java exception hierarchy.
 * ----------------------It can handle by using Try->Catch->Finally block using-----------------
 * try--> Statement need to monitor. put that statement that can either give the exception or not.
 * 
 * catch--> Catch the exception accordingly to handle it here.
 * 
 * finally-->Every time its executed. Cleanup done here, regarding of exception occurrence.
 */
class Exception1{
	String exname="exception";

}
public class ExceptionDemo {

public static void main(String[] args) {
	Exception1 e=null;
	try {
		System.out.println(e.exname);
	}
	catch( NullPointerException ne) {
		e=new Exception1();
		System.out.println(e.exname);
	}
	
}
}


