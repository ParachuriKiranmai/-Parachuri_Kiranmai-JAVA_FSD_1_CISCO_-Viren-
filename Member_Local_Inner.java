package program.java.inner.classes;

class Outer {

	private int age = 30;

	void dis() {
		System.out.println("Inside dis method");
	}

	void outerMethod() {
		System.out.println("Inside outerMethod");

		// Inner class is local to outermethod()
		class Inner {

			void innerMethod() {
				dis();
				System.out.println("Inside innermethod : " + age);
			}
		}

		Inner y = new Inner();// object creation of the local innerclass
		y.innerMethod();// calling inner class method
	}

	public void f() {
	}
}

public class Member_Local_Inner {

	public static void main(String[] args) {

		Outer x = new Outer();
		x.outerMethod();//calling outer class method
	}
}