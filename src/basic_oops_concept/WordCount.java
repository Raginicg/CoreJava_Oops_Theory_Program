package basic_oops_concept;
/**
 * 
 * @author ragigupt
 *
 */
public class WordCount {

	public static void main(String[] args) {
		String s="I am using Spring boot version 4.11.1";
		String word[]=s.split(" "); 
		//String word[]=s.split(""); // print all the words count-->Spelling count
		System.out.println("The number of word present in the string is "+ word.length);
		
	}

}
