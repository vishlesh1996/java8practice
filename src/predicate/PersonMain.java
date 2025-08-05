package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PersonMain {
	
	public static void  main(String[] args) {
		
	Person p1=new Person("vishlesh",19);
	
	Person p2 =new Person("Vish",25);
	
	Person p3=new Person("Appu",30);
	
	Person p4=new Person("VVv",15);
	
	List<Person> persons= Arrays.asList(p1,p2,p3,p4);
	
	Predicate<Person> predicate= p -> p.age>18;
	
	for(Person person:persons) {
		if(predicate.test(person)){
			System.out.println(person.name);
		}
	}
	
	
	}

}
