package Code;

public class UncheckedExc {
public static void main(String[] args) {
	int[] numbers= {1,2,3,4,5};
	try {
		System.out.println(numbers[5]);
//		System.out.println(numbers[3]);
	}
	catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("An exception occured "+ a.getMessage());
	}
}
}
