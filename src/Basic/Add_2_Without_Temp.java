package Basic;

public class Add_2_Without_Temp {

	public static void main(String[] args) {
		int num1 = 5;
        int num2 = 10;

        // Adding num1 and num2 without using a third variable
        num1 = num1 + num2; // num1 now becomes 15 (5 + 10)
        num2 = num1 - num2; // num2 now becomes 5 (15 - 10)
        num1 = num1 - num2; // num1 now becomes 10 (15 - 5)

        // Displaying the results
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1); // num1 is now 10
        System.out.println("num2 = " + num2); // num2 is now 5

        // Calculating the sum of original numbers
        int sum = num1 + num2; // Sum of 10 and 5
        System.out.println("Sum of num1 and num2 is: " + sum);
	}

}
