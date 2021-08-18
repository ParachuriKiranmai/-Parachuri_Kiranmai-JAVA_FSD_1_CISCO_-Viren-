package programs.java.methods;

public class ConstructorExample {
	
	int id;
	String name;
	
	public ConstructorExample() {
		
		id = 10;
		name = "hello";
		System.out.println("I am inside the default constructor");
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		
		ConstructorExample s1;
		s1 = new ConstructorExample();
		
		ConstructorExample s2 = new ConstructorExample();
		s1.display();
		s2.display();

	}

}
