//return the cube of odd numbers from 1 -> 100

import java.util.ArrayList;
import java.util.List;

public class Streams2 {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		for(int i=1;i<=100;i++)
			integers.add(i);
		
		integers.stream()
				.filter(i->i%2!=0)
				.map(i->(i*i*i))
				.forEach(i->System.out.println(i));
			
	}

}
