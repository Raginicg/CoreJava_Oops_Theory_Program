package Basic;
/**@author ragigupt
 */

/*
 * Immutable means unchanged or unmodifiable.String class is example of immutable class.
 */
public class StringImmutable {

	public static void main(String[] args) {
		String r="Ragini";
		r.concat(" Gupta"); 
		System.out.println(r);
		/**
		 * Here I have used string concat method for adding this word. 
		 * But still its give the previous string ---> Ragini because I havent changed the reference.
		 */
		
		//-----------------------Both sysout line give different output because of
		/*
		 * In this case I have given the different reference i.e r1 because of that
		 * new string object is created in the Heap
		 */
		//r = r.concat("Munnaprasad");
		String r1 = r.concat("Munnaprasad");
		System.out.println(r1);
		/**
		 * Reason ?
		 * Synchronized + Thread Safe
		 * Memory management---> No need to create multiple object for same value
		 * No one can modify value of string
		 * example- Username, password
		 */
	}

}
