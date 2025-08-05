package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employeemain {

	public static void main(String[] args) {
		
		Employee e1=new Employee("vishlesh","hyd","DB");
		
		Employee e2=new Employee("Appu","pune","java");
		
		Employee e3=new Employee("Vish","Nagpur","DB");
		
		Employee e4=new Employee("vish","hyd","DB");
		
		List<Employee> predicates= Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1= (e)-> e.location.equals("hyd");
		Predicate<Employee> p2=(e)->e.dept.equals("DB");
		Predicate<Employee> p3=(e)->e.name.startsWith("v");
		
		Predicate<Employee> p= p1.and(p2).and(p3);
		

		for(Employee employee:predicates) {
			if(p.test(employee)) {
				System.out.println(employee.name);
			}
		}
		
	}
}
