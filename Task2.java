package program.java.oops;

abstract class MncCompany {

	MncCompany() {
		System.out.println("MncCompany is created");
	}

	abstract void show();

	abstract void display();

	void run() {
		System.out.println("Normal method");
	}
}

abstract class infosys extends MncCompany {
	infosys() {
		System.out.println("Infosys is created");
	}

	public void show() {
		System.out.println(" Details of the company ");
	}

	abstract void display();
}

class helo extends infosys {
	public void show() {
		System.out.println("running safely...");
	}

	@Override
	public void display() {
		System.out.println("Inside the method");
	}
}

public class Task2 {

	public static void main(String[] args) {

		infosys i = new helo();
		i.run();
		i.show();
		i.display();

	}

}
