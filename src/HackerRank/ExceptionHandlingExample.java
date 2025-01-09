package HackerRank;

import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            String s=sc.next();
            String s2=sc.next();
            
            int i1 = Integer.parseInt(s);
            int i2=Integer.parseInt(s2);
            
            int result = i1 / i2;
            System.out.println(result);
        } 
        catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("java.util.InputMismatchException");
        } finally {
            sc.close();
        }
    }
}


