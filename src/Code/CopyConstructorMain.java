package Code;

class CopyConstructor{
	String name; 
	int age;
	public CopyConstructor(CopyConstructor c) {
		this.name=c.name;
		this.age=c.age;
		
	}
	public CopyConstructor(String name, int age) {
		this.name=name;
		this.age=age;
	}
}
public class CopyConstructorMain {

	public static void main(String[] args) {
		CopyConstructor c=new CopyConstructor("Ragini", 25);
		CopyConstructor c1=new CopyConstructor(c); // creating copy
		System.out.println(c1.name);
	}
}

