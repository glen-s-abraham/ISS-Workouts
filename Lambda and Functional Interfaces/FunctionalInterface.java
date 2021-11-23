interface Ridable{
	public String move();
}

interface Stoppable{
	public String stop();
}

class Vehicle implements Ridable,Stoppable{

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
