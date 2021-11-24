import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Streams7 {

	public static void main(String[] args) {
		IntSummaryStatistics summary = IntStream.of(7,19,10,22,3,4,5)
				.summaryStatistics();
		System.out.println(summary);
	}

}
