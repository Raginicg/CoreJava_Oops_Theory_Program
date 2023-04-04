package basic_oops_concept;

public class StringBufferExp {

	/*
	 * String buffer object are mutuable where as in the String its inmutable. Inside present method are synchronized.
	 * String buffer used when data are change frequently then we used. Example-Notepad, Calculator
	 */
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity()); // by default-->16
		
		StringBuffer sb2=new StringBuffer("Ragini");
		System.out.println(sb2.capacity()); // if you passed string in parameter then it will add that string count-->16+6=22

		StringBuffer sb3=new StringBuffer();
		sb3.append("Ragini");
		sb3.append("Gupta");
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		System.out.println(sb3.reverse());  // Reverse method present only in string buffer
		
		StringBuffer sb4=new StringBuffer(400);
		System.out.println("Staring size "+ sb4.capacity());
		sb4.append("Java");
		
		sb4.trimToSize(); // this method used when you will define the size initially---> or space is not used then its delete the extra space or size
		System.out.println("After Trim size is "+sb4.capacity());
	}
}
