import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression4 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("charles");
		names.add("reeze");
		names.add("nano");
		System.out.println("With Consumer interface");
		
		names.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
			
		});
		
		System.out.println("Lambda expressions");
		
		names.forEach(name->System.out.println(name));
		
	}

}
