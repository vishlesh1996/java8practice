package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStream {
	
	public static void main(String[] args) {
		
		List<Integer> number= Arrays.asList(10,20,30,40,50);
		
		/*
		 * Stream<Integer> stream= number.stream();
		 * 
		 * Stream<Integer> filterStream= stream.filter(i->i>10);
		 * 
		 * filterStream.forEach(i -> System.out.println(i))
		 * 
		 */;
		
		 number.stream().filter(i->i>10).forEach(i->System.out.println(i));
	}

}
