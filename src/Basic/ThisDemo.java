package Basic;
/*
 * This keyword is used to refer current class instance members
 * Used to differentiate local and global variable
 */
public class ThisDemo {

//	debugging the code--->
	/**
	 * ANT ICON--->Debug as Java application--->One breakpoint came in left side of code editor.
	 * After that press fn+F6---> execute line by line code.
	 * you can view the variable in the right side of your
	 */
	
//	 Global or instance variable
	int sid;
	String name;
	ThisDemo(int sid, String sname){
		this.sid=sid;    // this id not a local--> its refer the current class means instance variable, you can see the var colour get changed
		name=sname;    // you can do this also
		System.out.print(sid);
	}
	
	public static void main(String[] args) {
		ThisDemo d=new ThisDemo(1, "Ragini");
	}
}
