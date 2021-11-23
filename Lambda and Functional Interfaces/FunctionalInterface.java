class Vehicle implements Movable,Stoppable{

	@Override
	public String move() {
		return "Vehicle moving";
	}

	@Override
	public String stop() {
		return "Vehicle Stopped";
	}
	
}

public class FunctionalInterface {

	public static void main(String[] args) {
		Vehicle car= new Vehicle();
		System.out.println(car.move());
		System.out.println(car.stop());

	}

}
