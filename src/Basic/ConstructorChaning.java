package Basic;

public class ConstructorChaning {
	
//  Calling of one constructor from the another constructor within the same class or another. Two ways--->this() or super() keyword
//	Constructor chaining within the same class using this() keyword
	private String color;

		public ConstructorChaning() {
			this("Rg");
			System.out.println("rg");
		}
		public ConstructorChaning(String color) {
			this.color=color;
			System.out.println("sss");
		}
		public static void main(String[] args) {
			ConstructorChaning c=new ConstructorChaning();  // op-->call both constructor
			ConstructorChaning c1=new ConstructorChaning("Red"); // op-->call parameterized constructor only
		}
}
