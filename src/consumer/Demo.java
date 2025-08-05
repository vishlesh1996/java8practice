package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
	public static void main(String[] args) {
		
		Consumer<String> c= (name) ->System.out.println(name +", Good Evening");
		
		c.accept("Vishlesh");
		c.accept("Appu");
		
		List<Integer> number= Arrays.asList(10,20,30,40);
		
		// Creating a Consumer that prints a string
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

        // Using the Consumer
        printUpperCase.accept("hello world");
	}
	
			

}
