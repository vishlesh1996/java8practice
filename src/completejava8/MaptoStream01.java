package completejava8;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MaptoStream01 {

public static void main(String[] args) {
	
	String[] names= {"Ganesh","Vishlesh","Ganesh","Gayatri"};
	
	Predicate<String> p=name->name.charAt(0)=='G';
	
	for(String name:names) {
		
		if(p.test(name)) {
			System.out.println(name);
		}
	}
	
}
		
} 