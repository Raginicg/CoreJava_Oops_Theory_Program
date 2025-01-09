package Code;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceEle {

	public static void main(String[] args) {
		 int[] values = {2, 4, 1, 4, 3};
		 Map<Integer, Long> occurrences = Arrays.stream(values)
                 .boxed()
                 .collect(Collectors.groupingBy(value -> value, Collectors.counting()));

		  occurrences.forEach((key, count) -> 
          System.out.println("Element " + key + " occurs " + count + " times")
      );
	}

}
