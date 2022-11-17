package Basic;
/**@author ragigupt
 */

/*
 * Immutable means unchanged or unmodifiable.String class is example of immutable class.
 */
public class StringImmutable {

	public static void main(String[] args) {
		String r="Ragini";
		r.concat(" Gupta"); // Here I have used string concat method for adding this word. But still its give the previuos string.
		System.out.println(r);
		//-----------------------Both sysout line give different output because of
		r=r.concat("Munnaprasad");
		System.out.println(r);
	}

}
