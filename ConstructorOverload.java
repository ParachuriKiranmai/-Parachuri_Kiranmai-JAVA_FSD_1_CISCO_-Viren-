package programs.java.methods;

public class ConstructorOverload {

	long id;
	String name;
	int age=10;
	
	public ConstructorOverload(long i, String n) {
		
		id = i;
		name = n;
	}
	
	public ConstructorOverload(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println(id+" "+name+ " "+age);
	}

	public static void main(String[] args) {
		ConstructorOverload s1 = new ConstructorOverload(111, "Kiran");
		ConstructorOverload s2 = new ConstructorOverload(222, "Kiranmai", 25);
        s1.display();
        s2.display();
	}

}
