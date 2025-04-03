package Code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

import Basic.CompareTo;

public class Code25 {

	public static void main(String[] args) {
		
		/*
		 * In this list of element find the first occurrence element
		 */
		List<Integer> list=Arrays.asList(10,23,22,45,44,5,56,53, 10,22);
		list.stream().findFirst().ifPresent(System.out::println);
//	How many elements present in list
		System.out.println("List elemets count are "+ list.stream().count());
		
//		Find the even number
		System.out.println("Even number");
		list.stream().filter(num -> num % 2==0).forEach(System.out::println);
//	 Find odd number
		System.out.println("Odd number" );
		list.stream().filter(num -> num % 2!=0).forEach(System.out::println); {
			
		}
//		Number start with 5
		System.out.println("Number stating with 5 ");
		list.stream().filter(num -> num.toString().startsWith("5")).forEach(System.out::println);
//		Find duplicate elements in the list
		System.out.println("Duplicate elememt in the list");
		Set<Integer> set=new HashSet<>();
		list.stream().filter(num -> !set.add(num)).forEach(System.out::println);
		
// Find maximum and minimum value elements present in list
		System.out.println("Maximum and Minimum value " );
		Optional<Integer> max=list.stream().max(Integer:: compareTo);
		Optional<Integer> min=list.stream().min(Integer:: compareTo);
		
		System.out.println(max.orElse(null));
		System.out.println(min.orElse(null));
//		Sort the value using stream- sort in ascending order 
		System.out.println("Sorted elements in the list in Ascending order");
		list.stream().sorted().forEach(System.out::println);

//		using list method
		list.sort(Integer::compareTo);
		list.forEach(System.out::println);
		
// Sort the elements in descending order
		System.out.println("Sorting the elements in descending order using Comparator");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		int [] numbers= {2,4,1,4,3};
		if(Arrays.stream(numbers).distinct().count()!=numbers.length) {
			System.out.println("It containes Duplicate value ");
		}
		else
		{
			System.out.println("It contain Unique value");
		}
//		Square a list of number
		System.out.println("Square a list of number and print the value who is graeter then 50");
		list.stream().map(num->num*num).filter(num-> num>50).forEach(System.out::println);
		
//		 Sort the array and convert into the stream
		Arrays.sort(numbers);
		Arrays.stream(numbers).forEach(System.out::println);
		
//	How to use map to convert words into Uppercase
	List<String> words=Arrays.asList("Ragini", "Gupta", "Beauty");
	System.out.println("Used map to convert words into Uppercase");
	words.stream().map(word->word.toUpperCase()).forEach(System.out::println);
	
//	Concatenating two stream
	Stream<Integer> s1=Stream.of(1,3,45,4);
	Stream<Integer> s2=Stream.of(2,5,0);
	System.out.println("Concatenating value ");
	Stream.concat(s1,s2).forEach(System.out::print);
	
// print a 10 random number
	Random r=new Random();
	System.out.println("10 Random numbers are ");
	Stream.generate(r::nextInt).limit(10).forEach(System.out::println);
// Print localdate and time
	LocalDate d=LocalDate.now();
	System.out.println("Local Date is "+ d);
	LocalDateTime time=LocalDateTime.now();
	System.out.println("Local Date and Time is "+ time);
	DateTimeFormatter dformat=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	System.out.println(dformat.format(time));
	
//	Determine the occurrence of elements
	int[] values= {2,4,1,4,3};
	int number=1;  //which number occurrence you want to find
	long result=Arrays.stream(values).filter(value-> value==number).count();
	System.out.println("Occurence of "+ number+ " are "+ result +"times");
	
}
}
