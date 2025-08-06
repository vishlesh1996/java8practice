package StreamApi;

import java.util.stream.Stream;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("vish",20,50000);
		Employee e2=new Employee ("bbbb",18,60000);
		Employee e3=new Employee("cvcvc",19,8000);
		Employee e4=new Employee("dddd",19,7000);
		
		Stream<Employee> stream= Stream.of(e1,e2,e3,e4);
		
		/*
		 * stream.filter(e-> e.salary>= 50000.00) .map(e->e.name+"-" +e.age)
		 * .forEach(e->System.out.println(e));
		 */
		
		stream.filter(e->e.salary>=50000).forEach(e->System.out.println(e.name+"-"+e.age));
	}

}
