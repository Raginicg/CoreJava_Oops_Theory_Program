package Basic;

class Biscuit{
	String name;
	String type;

public Biscuit(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

//	@Override
	public String toString() {
		return "Biscuit [name=" + name + ", type=" + type + "]";
	}
}
public class ToStringExp {
public static void main(String args[]) {
	Biscuit b=new Biscuit("Parle G", "Cream");
	System.out.println(b);
}
}