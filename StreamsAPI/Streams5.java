import java.util.Arrays;

//Find the average of squres of an integer array
public class Streams5 {

	public static void main(String[] args) {
		int[] numbers = {2,4,6,8,10};
		Arrays.stream(numbers)
			.map(i->(i*i))
			.average()
			.ifPresent(System.out::print);
	}

}
