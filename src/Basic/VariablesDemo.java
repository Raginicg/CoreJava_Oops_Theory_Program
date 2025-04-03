package Basic;

/*
 * Static Keyword- Static variable are created outside the method inside the class.
 * Static variable are the common for all the objects
 * Without usi ng class object we can called this variable, using classname.variable name
 *
 * Instance Variable- without using static keyword we can create instance variable
 * we can create instance variable inside the class but outside the method
 * If the value of variable is changing object to object then we can say its instance variable
 *
 * Local- If the variable is created inside the method, inside the constructor as well as parameters, inside the block called local variable
 * 
 * Final variable- If the variable is created using final keyword- we need to initialize final variable
 * If the variable is final that means we cant change the value of variable in future
 *
 */
public class VariablesDemo {

	static String collegeName="Patkar College";
	String studentName;
	
	final String userName="Ragini";  // Username cant be cahnged
	
	public static void main(String[] args) {
		VariablesDemo v1=new VariablesDemo();
		v1.studentName="Ragini";
		System.out.println(v1.studentName);
		System.out.println(VariablesDemo.collegeName);
	
		System.out.println("Final variable "+ v1.userName);
//		v1.finalVar=22; // this line giving error because final variable can not be changed
			
//		System.out.println("Local Variable "+ a);  // Not accessible because its local var
	}
	void add() {
		int a=20; // Local variable
	}

}
