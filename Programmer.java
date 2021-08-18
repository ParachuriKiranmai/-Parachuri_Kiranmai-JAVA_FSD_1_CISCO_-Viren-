package program.java.oops;

class Employee{
	float salary = 40009;
	int bonus = 5600;
	
	public void show() {
		System.out.println("Inside the parent class");
	}
	 public void display() {
		 System.out.println("we are inside the display method of the parent class");
	 }
}
public class Programmer extends Employee{

	int bonus = 10000;
	
	public void show() {
		System.out.println("Bonus of Employee is :"+super.bonus);
		System.out.println("Inside the Child class");
	}
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is: "+p.salary);
		System.out.println("Bonus of Programmer is: "+p.bonus);
		p.show();
		p.display();
	}
}
