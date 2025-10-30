package Code;
import java.util.*;
import java.util.stream.Collectors;

public class UpperCaseList {
    public static void main(String[] args) {
    	//Convert List of Strings to Uppercase
        List<String> strings = Arrays.asList("hello", "World", "Java");
        strings.replaceAll(String::toUpperCase);
        System.out.println(strings);
        

        List<String> strings1 = Arrays.asList("hello", "World", "Java");

        List<String> upperCaseList = strings1.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println(upperCaseList);

    }
}
