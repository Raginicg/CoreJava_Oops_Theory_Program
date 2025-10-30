package Code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountVowelList {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("apple", "banana", "grape");
		List<String> list2 = Arrays.asList("orange", "kiwi", "melon");

		// Merge the lists and count vowels
		long vowelCount = Stream.concat(list1.stream(), list2.stream()).flatMapToInt(String::chars)
				.mapToObj(c -> (char) c).filter(ch -> "aeiouAEIOU".indexOf(ch) != -1).count();

		System.out.println("Total number of vowels: " + vowelCount);

	}
}
