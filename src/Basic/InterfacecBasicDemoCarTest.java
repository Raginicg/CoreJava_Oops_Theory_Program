package Basic;

// You can create different class or in same class also do the testing
public class InterfacecBasicDemoCarTest {
	public static void main(String[] args) {
		// Can't create object of interface class
		BmwCar b = new BmwCar();
		b.start();
		b.stop();
		b.refuel();
		// own method
		b.theftsafty();

	}
}
