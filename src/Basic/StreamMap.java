package Basic;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
 public static void main(String[] args) {
	System.out.println(Stream.of(3,5,22,7).collect(Collectors.summarizingInt(a->(int) a)));

	
}
}
