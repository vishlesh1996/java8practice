package StreamApi;

import java.util.Arrays;
import java.util.List;

public class Filterstream2 {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Vish","Vjk","erf","Vkfls");
		
		list.stream().filter(name -> name.startsWith("V")).forEach(name->System.out.println(name));
	}

}
