package Basic;
/**@author ragigupt
 */

public class FinalVariable {
/*
 * The final variable is used to restrict the user for updating it.
 * If we initialize the final variable, we can not change the its value.
 */
	final int a=12;// Final variable
	void run() {
		// a=20;   --->This line gives error because final variable is can not change
	}
	public static void main(String[] args) {
		FinalVariable f=new FinalVariable();
		f.run();
	}

}

//Output-->Give compile time error.