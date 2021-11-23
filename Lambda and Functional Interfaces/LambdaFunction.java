class Car{
	public Movable movable = ()->"Car is moving";
	public Stoppable stoppable = ()->"Car Stopped";
}

public class LambdaFunction {

	public static void main(String[] args) {
		Car bmw= new Car();
		System.out.println(bmw.movable.move());
		System.out.println(bmw.stoppable.stop());

	}

}
