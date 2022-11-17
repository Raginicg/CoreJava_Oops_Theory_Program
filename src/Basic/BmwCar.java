package Basic;

public class BmwCar implements InterfacecBasicDemoCar { // Used implements because its a interface
	
	@Override // optional
	public void start() {
		System.out.println(" BMW Start......");
	}
	public void stop() {
		System.out.println(" BMW Stop.......");
	}
	public void refuel() {
		System.out.println(" BMW Refuel.....");
	}
	
	// In my class my own method also be present, here you can create your own method also
	// Non-overridden method----------->My own method
	public void theftsafty(){
		System.out.println(" BMW Theft safty..... ");
	}
}