package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormattedPayment {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        String us, india, china, france;
        us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        
        india=NumberFormat.getCurrencyInstance(new Locale ("en", "in")).format(payment);
        
        china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        
        france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
