package Basic;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepetingCharacter {
    public static void main(String[] args) {
    	  Stream.of('A', 'B', 'C', 'A', 'C')
          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
          .entrySet()
          .stream()
          .filter(entry -> entry.getValue() < 2) // filter if count is 2
          .forEach(entry -> System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue()));

}
}
