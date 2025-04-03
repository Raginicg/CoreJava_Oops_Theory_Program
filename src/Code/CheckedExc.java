package Code;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Exceptions that are checked at compile-time. 
 * The compiler ensures these exceptions are either handled using a 
 * try-catch block or declared in the method signature using throws
 */
public class CheckedExc {
public static void main(String[] args) {
	try {
		File file=new File("test.txt");
		FileReader fr=new FileReader(file);
	}
	catch(IOException e) {
		System.out.println("An IOException occured "+e.getMessage());
	}
}
}
