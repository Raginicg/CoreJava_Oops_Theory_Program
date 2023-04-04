package Code;

public class SwichDemo2 {
	public static void main(String[] args) {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
		case 3:
			System.out.println(2);
			break;
			// break; --->if i havent written the break statement then its print other case print statement also
		case 4:
			System.out.println(3);
			break;
		case 5:
			System.out.println("Default");
			break;
		}
	}
}
