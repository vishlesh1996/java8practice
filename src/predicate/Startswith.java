package predicate;

import java.util.function.Predicate;

public class Startswith {
	
	public static void main(String[] args) {
		
		String[] names= {"Vishlesh","Appu","Vish","AAa","VV"};
		
		
		Predicate<String> p=name ->name.charAt(0)=='V';
		
		
		   for(String name :names) {
			   if(p.test(name)) {
				   System.out.println(name);
			   }
		   }
		}
	}


