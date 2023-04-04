package Code;

class ParentC {
	void Sum(int a, int b) {
		System.out.println("Addition " + (a + b));
	}
}

class ChildC extends ParentC {
	void Sub(int a, int b) {
		System.out.println("Subtraction is " + (a - b));
	}

	public static void main(String args[]) {
		ChildC c = new ChildC();
		c.Sum(10, 20);
		c.Sub(20, 1);
	}
}
