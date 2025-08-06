package StreamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String[] args) {
		
		Stream<Integer> num=Stream.of(10,20,30,40);
		
		ArrayList<String> name=new ArrayList<>();
		
		name.add("vishlesh");
		name.add("vish");
		
		Stream<String> sname= name.stream();
		
	}

}
