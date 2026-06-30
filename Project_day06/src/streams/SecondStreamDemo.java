package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondStreamDemo {

	public static void main(String[] args) {
		
		List<String> basket = Arrays.asList("cherry","Mango","papaya","gauva","banana","apple","kiwi", "fig");
		
		//basket.forEach(System.out::println);
		
		//basket.stream().sorted().forEach(System.out::println);
		
		//basket.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		
		//basket.stream().filter(s -> s.contains("a")).forEach(System.out::println);
		
		//System.out.println(basket.stream().filter(s ->s.contains("a")).count());
		
		Stream.of("jim", "anna", "mat", "sam", "brad", "leo").sorted().forEach(System.out::println);
	}

}
