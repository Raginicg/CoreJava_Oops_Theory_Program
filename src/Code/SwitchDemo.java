package Code;

public class SwitchDemo {

	public static void main(String[] args) {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
			// break; --->if i havent written the break statement then its print other case print statement also
		case 3:
			System.out.println(3);
		case 4:
			System.out.println("Default");
		}
/*
 * 	2
	3
	Default... because after print statement i haven't written the break statement 

 */
	}
}
