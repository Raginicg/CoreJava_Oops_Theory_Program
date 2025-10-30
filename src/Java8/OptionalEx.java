package Java8;

import java.util.Optional;

public class OptionalEx {
//	Using Optional class we reduced the Null Pointer exception, dont need to write the null check logic every time for each method.

	public static void main(String[] args) {
		String str="Java Programming";
//		String str=null; --->handle null 
		Optional<String> op=Optional.ofNullable(str);
/*
 * isPresent() checks for the presence of a value (true if present).
isEmpty() checks for the absence of a value (true if absent).
 */
		System.out.println(op.isPresent());
		System.out.println(op.isEmpty());
		System.out.println(op.get());
		System.out.println(op.orElse("No values for the object"));
		
		
	}

}
