package predicate;

import java.util.function.Predicate;

public class Greternumber {
	
	public static void main(String[] args) {
		
		Predicate<Integer> numbers= i -> i>10;
		
		System.out.println(numbers.test(6));
		
		System.out.println(numbers.test(12));
	}

}
