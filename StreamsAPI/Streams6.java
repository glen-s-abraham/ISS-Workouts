import java.util.stream.Stream;

public class Streams6 {

	public static void main(String[] args) {
		double total = Stream.of(3.5,3.5,2.8).reduce(0.0,(Double a,Double b)->a+b);
		System.out.println("Total "+total);
	}

}
