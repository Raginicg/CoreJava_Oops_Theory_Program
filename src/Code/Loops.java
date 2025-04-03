package Code;

public class Loops {
	/*
	 * Continue- Continue statement is used to skip the Current iteration of the
	 * loop. In this case, the loop skips printing the value 5 but continue with the
	 * next values.
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}
		// Output- 0,1,2,3,4,6,7,8,9
		/*
		 * ++i:
		 * 
		 * Increments i before printing. Skips every alternate number due to the
		 * pre-increment effect. i++:
		 * 
		 * Prints i first, then increments it. Skips every alternate number but starts
		 * with the current value of i. Summary of Outputs: With ++i: 1, 3, 5, 7, 9 With
		 * i++: 0, 2, 4, 6, 8
		 */

		System.out.print(" Using ++i ");
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println(++i);
			// Output- 1,3,5,7,9

		}

		System.out.print(" Using i++ ");
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i++);
			// Output- 0, 2, 4, 6, 8

		}
	}
}
