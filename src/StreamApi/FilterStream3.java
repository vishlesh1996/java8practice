package StreamApi;

import java.util.stream.Stream;

public class FilterStream3 {
	
	public static void main(String[] args) {
		
		User u1= new User("vishlesh",20);
		User u2=new  User("hjkkl",30);
		User u3=new User("sish",17);
		
		Stream<User> stream= Stream.of(u1,u2,u3);
		
		//stream.filter(i->i.age>=18).forEach(i->System.out.println(i));
		
		//stream.filter(i->i.age>=18 && i.name.startsWith("v")).forEach(i->System.out.println(i));
		
		
		stream.filter(i-> i.age>=20).filter(i->i.name.startsWith("v")).forEach(i->System.out.println(i)
				);
	}

}
