package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatmapDemo {
	
	public static void main(String[] args) {
		
		List<String> devCourses= Arrays.asList("Java","Spring boot","mvc","JPA");
		
		List<String> uicourse=Arrays.asList("html","css","bs");
		
		List<List<String>> courses=Arrays.asList(devCourses,uicourse);
		
		//courses.stream().forEach(c->System.out.println(c));
		
		Stream<String> fms= courses.stream().flatMap(s->s.stream());
		fms.forEach(s->System.out.println(s));
		
		
	}

}
