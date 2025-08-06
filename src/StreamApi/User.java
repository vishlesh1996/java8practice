package StreamApi;

public class User {

	String name;
	int age;
	
	User(String name,int age){
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
