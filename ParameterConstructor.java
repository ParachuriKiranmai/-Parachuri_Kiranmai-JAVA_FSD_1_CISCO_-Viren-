package programs.java.methods;

public class ParameterConstructor {

	int id;
	String name;
	
	public ParameterConstructor() {
		System.out.println("Inside");
	}
	
	public ParameterConstructor(int i, String n) {
		id = i;
		name = n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		ParameterConstructor s1 = new ParameterConstructor(111, "Kiran");
		ParameterConstructor s2 = new ParameterConstructor(199, "Kiranmai");
	    s1.display();
	    s2.display();
	
	}

}
