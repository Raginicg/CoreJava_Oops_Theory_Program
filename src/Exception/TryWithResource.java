package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * Try with Resource-
 * Introduced in Java 7+
 * Automatically closes all the resources at the end of the program
 * like files, sockets, db
 * 
 * Finally block is not required to closed the resource
 * 
 * Old-try {}
 * New- try (// open resource) {}
 * why?
 * No need to manually close the resource br.close()
 * No need to write the finally block. finally {br.close}
 * 
 */
public class TryWithResource {
public static void main(String args[]) {
	try(BufferedReader br=new BufferedReader(new FileReader("test.txt"));
			PrintWriter writer=new PrintWriter("new.txt"))
			{
			String line=br.readLine();
			writer.println(line);
}
	catch(Exception e) {
	System.out.println(e.getMessage());
}
}
}