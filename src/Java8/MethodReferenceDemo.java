package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");
		list.forEach(System.out::println);  // Method reference to println

	}

}
