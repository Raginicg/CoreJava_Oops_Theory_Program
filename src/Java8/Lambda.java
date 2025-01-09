package Java8;

import java.util.Arrays;
import java.util.List;

// Lambda expression allow us to write inline implementation for functional interface
// Making code concise and readable.
public class Lambda {
public static void main(String[] args) {
	List<String> fruits=Arrays.asList("mango", "apple");
	fruits.forEach(fruit-> System.out.println(fruit));
}
}
