package Java8;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "C++", "JavaScript");

		list.stream()
		    .filter(s -> s.startsWith("J"))
		    .forEach(System.out::println);
		
//		sorting the list
		List<Integer> list1 = Arrays.asList(1, 7, 21, 2);
		list1.stream().sorted().forEach(System.out::println);
	}
}
