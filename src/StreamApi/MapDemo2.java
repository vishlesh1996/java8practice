package StreamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	
	public static void main(String[] args) {
		
		List<String> name=Arrays.asList("Ashok","Raju","AaaRani","john","Akash");
		
		name.stream().filter(i-> i.startsWith("A")).
		map(i->i+"-" +i.length()).
		forEach(i->System.out.println(i));
		
	}

}
