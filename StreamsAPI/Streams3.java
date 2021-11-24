import java.util.stream.Stream;

public class Streams3 {

	public static void main(String[] args) {
		Stream.of("amanda","jenny","aaron","bach")
			  .sorted()
			  .findFirst()
			  .ifPresent(str->System.out.println(str));

	}

}
