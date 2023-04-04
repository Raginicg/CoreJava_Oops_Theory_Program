package Basic;
/**@author ragigupt
 */

/*
 * Immutable means unchanged or unmodifiable. String class is example of immutable class.
 * Since string is immutable changing any string will be stored as new entry and earlier value will be remain unmodified.
 * 
 * Since string is immutable it is safe to use for storing username and password.
 * Its a thread safe.
 */
public class StringImmutable {

	public static void main(String[] args) {
		String r=" Ragini ";
		r.concat(" Gupta "); // Here I have used string concat method for adding this word. But still its give the previous string.
		System.out.println(r);
		//-----------------------Both sysout line give different output because of
		r=r.concat(" Munnaprasad ");
		System.out.println(r);
		
		String a="aradhya";
		a="gupta";    
		System.out.println(a);  //---- value of string changes because earlier variable stored in string pool & reference is stored in stack..
		/*
		 * String pool--->string variable stored as 0001-->as aradhya and 0002-->gupta
		 * if a="gupta"-->
		 */
	}

}
