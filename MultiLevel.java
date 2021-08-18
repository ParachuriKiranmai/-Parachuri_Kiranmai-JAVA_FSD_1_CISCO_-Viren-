package program.java.oops;

class Animal{
	
	public void eat() {
		System.out.println("eat in any doubtg....");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping...");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		BabyDog s = new BabyDog();
		s.bark();
		s.weep();
		s.eat();
	}

}
