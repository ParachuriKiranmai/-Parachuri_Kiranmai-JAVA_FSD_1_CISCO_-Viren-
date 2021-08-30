package program.java.inner.classes;

public class Member_Inner {

	private int data = 30;

	void display() {
		System.out.println("I am inside the outer class method");
	}

	class Inner {
		private int data = 20;

		void msg() {
			//Member_Inner.Inner.this.display();//calling methods outside the class
			System.out.println("data is " + data);
		}

		//calling duplicate method of outer class
		void display() {
			System.out.println("I am inside the outer class method");
		}//Inner class accessing the outside private variable
	}

	public static void main(String[] args) {

		Member_Inner obj = new Member_Inner(); //creating object of outer class

		Member_Inner.Inner in = obj.new Inner();//creating object of inner class

		in.msg();
		in.display();
	}

}
