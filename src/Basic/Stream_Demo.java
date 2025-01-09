package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Demo {
	 
		public static void main(String[] args) {
//			Given a list of integers, find out all the even numbers exist in the 
//			list using Stream functions? list=[2,34,678,3]
			List<Integer> list = new ArrayList<>(Arrays.asList(2, 34, 678, 3,7,7,7,7,7,7));
			// Convert to stream
	 
//			List<Integer> evenList = list.stream().filter((a) -> {
//				if (a % 2 == 0) {
//					return true;
//				} else {
//					return false;
//				}
//			}).collect(Collectors.toList());
	 
			list.stream().filter(a -> a >= 2 && IntStream.range(2, a).noneMatch(num -> a % num == 0)).distinct()
					.forEach(b -> System.out.println(b));
	 
//			System.out.println(evenList);
	 
			List<Integer> cube = list.stream().map(num -> num * num * num).collect(Collectors.toList());
			System.out.println(cube);
	 
			System.out.println(Stream.of(4, 65, 67, 67, 8).collect(Collectors.summarizingInt(a -> (int) a)));
		}

}
