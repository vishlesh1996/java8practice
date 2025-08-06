package StreamApi;

import java.util.Arrays;
import java.util.List;

public class Mapdemo {
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("vishlesh","appu","appu");
		
		list.stream().map(i-> i.toUpperCase()).forEach(i->System.out.println(i));
		
		list.stream().mapToInt(i->i.length()).forEach(i->System.out.println(i));
	}
	
}
