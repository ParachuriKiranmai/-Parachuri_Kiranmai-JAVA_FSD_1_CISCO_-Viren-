package program.java.assignments;

abstract class Pen {

	abstract void write();

	abstract void refill();
}

class FountainPen extends Pen {

	@Override
	void write() {
		System.out.println("Wriring..");
	}

	@Override
	void refill() {
		System.out.println("Refil..");
	}

	void changeNib() {
		System.out.println("Changing the nib");
	}

}

class Monkey{
	void jump() {
		System.out.println("Jumping..");
	}
	void bite() {
		System.out.println("biting");
	}
}

interface BasicAnimal{
	void eat();
	void sleep();
}
class Human extends Monkey implements BasicAnimal{
	public void eat() {
		System.out.println("Eating....");
	}
	public void sleep() {
		System.out.println("Sleeping...");
	}
}
public class Oops {

	public static void main(String[] args) {

		FountainPen pen = new FountainPen();
		pen.changeNib();
		
		Human h = new Human();
		h.eat();
		h.sleep();
		h.bite();
		h.eat();
		h.jump();
		
	}

}
