import java.util.ArrayList;
import java.util.List;

public class Streams1 {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		for(int i=1;i<=100;i++)
			integers.add(i);
			
		integers.stream().forEach(System.out::println);
		integers.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		integers.stream().map(i->(i*i)).forEach(i->System.out.println(i));
	}
}
