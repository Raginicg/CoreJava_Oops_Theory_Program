package Basic;

abstract class BikeD {
	abstract void Run();
}

public class HondaAbstract extends BikeD {
	
	public void Run() {
		System.out.println("Honda is running");
	}

	public static void main(String[] args) {
		HondaAbstract hb = new HondaAbstract();
		hb.Run();
	}
}
