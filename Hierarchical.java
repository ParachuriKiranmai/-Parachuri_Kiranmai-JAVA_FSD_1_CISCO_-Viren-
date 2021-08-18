package program.java.oops;

class Animal1 {
	void eat() {
		System.out.println("eating....");
	}
}

class Dog1 extends Animal {
	void bark() {
		System.out.println("barking....");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("meowing....");
	}
}

public class Hierarchical {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.meow();
	}

}
