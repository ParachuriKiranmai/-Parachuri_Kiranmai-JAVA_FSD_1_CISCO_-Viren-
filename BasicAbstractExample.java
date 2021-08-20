package program.java.oops;

abstract class AbstractDemo {
	private String name = "Kiranmai";

	public AbstractDemo() {
		System.out.println("Inside the abstract class...");
	}

	public void myMethod() {
		System.out.println("Hello " + name);
	}

	abstract public void anotherMethod();
}

public class BasicAbstractExample extends AbstractDemo {

	public BasicAbstractExample() {
		super();
		System.out.println("Inside child class...");
	}

	public void anotherMethod() {
		System.out.println("Abstract Method");
	}

	public static void main(String[] args) {
		AbstractDemo obj = new BasicAbstractExample();
		obj.anotherMethod();
		obj.myMethod();

	}

}
