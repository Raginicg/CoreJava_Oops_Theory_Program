package Basic;

public class Swap_Without_Temp {

	public static void main(String[] args) {

		int a=20;
		int b=4;
		a=a+b;
		b=a-b;
		a=a-b;
		 System.out.println("After swapping:" + "a="+ a+ ",b="+ b);
		
	}

}
