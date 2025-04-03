package Java8;

public class Counter {

//	Static variable
	static int count=4;
	static void decreaseCounter() {
		if(count>0) {
			count --;
			System.out.println("Counter value after Decreased "+ count);
		}
		else {
			System.out.println("Counter is reached zero");
		}
	}
	public static void main(String[] args) {
		decreaseCounter();
		decreaseCounter();
		decreaseCounter();
		decreaseCounter();
		decreaseCounter();
//		decreaseCounter();
	}

}
