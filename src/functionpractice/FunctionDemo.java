package functionpractice;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<String,Integer> f=(name) -> name.length();
		
		System.out.println(f.apply("Vishlesh"));
		System.out.println(f.apply("Vishh"));
		System.out.println(f.apply("Vishlsh"));
		System.out.println(f.apply("Vishsh"));
 	}

}
