import java.util.stream.Stream;

public class Streams4 {

	public static void main(String[] args) {
		String[] names = {"minari","meme","mockito","aaron","eliah","escobar"};
		Stream.of(names)
			.filter(name->name.startsWith("m"))
			.sorted()
			.forEach(System.out::println);

	}

}
