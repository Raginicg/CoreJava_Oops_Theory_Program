package Exception;
/*
 * *****JVM execute the code and check our code logic******
 * Throwable is the based class of the all the exception class.
 * Compile Time Exception-Compile time exceptions are those exceptions which are occurred at compiled time
 * 
 * RunTime- Runtime exception are those exceptions which are occurred at runtime / which are not understandable by compiler eg. 10/0 */

import java.io.File;

public class CompileTimeRuntimeEx {
	public static void main(String[] args) {
		File f=new File("abc");
//		Compiler told us might be exception occure at this line. eg. SQL, jdbc connectivity
//		f.createNewFile();   // in this line its showing compile time error because it showing error in entire line. not for one word
		
//	Runtime exception-10/2, ArrayIndexOutOfBoundsException
		
		int array[]= {1,2,34};
//		System.out.println(array[5]);
	
		String str=null;
		System.out.println(str);
	}
	
}
