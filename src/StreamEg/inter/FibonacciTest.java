package StreamEg.inter;

import java.util.stream.Stream;

public class FibonacciTest {
	
	public static void main(String[] args) {
		
		Stream<Long> generate = Stream.generate(new FibonacciSupplier());
		generate.limit(10).forEach(System.out::println);
	}

}
