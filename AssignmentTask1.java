package program.java.oops;

class Vehicle {

	int speed = 15;
	long distance = 20;

	Vehicle() {
	}

	Vehicle(int s, long d) {
		speed = s;
		distance = d;
	}

	void run() {
		System.out.println("Run the Vehicle");
	}

	void stop() {
		System.out.println("Stop the Vehicle");
	}

	void display() {
		System.out.println("speed: " + speed);
		System.out.println("Distance: " + distance);
	}

	public void fuel(int b) {
		System.out.println("value of b is " + 6);
	}

	public void fuel(float a, String s) {
		System.out.println("Value of a is " + 4.8);
		System.out.println("Value of s is " + "Kiran");
	}

	public void fuel(char g, int c) {
		System.out.println("Value of g is " + 'c');
		System.out.println("Value of c is " + 6);
	}

}

class twoWheeler extends Vehicle {

	int speed = 150;
	long distance = 200;
	int no_of_tyres = 2;

	twoWheeler() {
		System.out.println("VehicleDetails for TwoWheeler");

	}

	@Override
	public void run() {
		System.out.println("Running vehicle 2...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Method 2...");
	}

	public void display() {
		System.out.println("speed : " + speed + " Distance " + distance + "Number of wheels " + no_of_tyres);
	}
}

class threeWheeler extends Vehicle {

	int speed = 1500;
	long distance = 2000;
	int no_of_tyres = 3;

	threeWheeler() {
		System.out.println("VehicleDetails for ThreeWheeler");

	}

	@Override
	public void run() {
		System.out.println("Running method 3...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Method 3...");
	}

	public void display() {
		System.out.println("speed : " + speed + " Distance " + distance + "Number of wheels " + no_of_tyres);
	}
}

class fourWheeler extends Vehicle {

	int speed = 1650;
	long distance = 2800;
	int no_of_tyres = 4;

	fourWheeler() {
		System.out.println("VehicleDetails for FourWheeler");

	}

	@Override
	public void run() {
		System.out.println("Running method 4...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Method 4...");
	}

	public void display() {
		System.out.println("speed : " + speed + " Distance " + distance + "Number of wheels " + no_of_tyres);
	}
}

class eightWheeler extends Vehicle {

	int speed = 1590;
	long distance = 8200;
	int no_of_tyres = 8;

	eightWheeler() {
		System.out.println("VehicleDetails for EightWheeler");

	}

	@Override
	public void run() {
		System.out.println("Running method 8...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Method 8...");
	}

	public void display() {
		System.out.println("speed : " + speed + " Distance " + distance + " Number of wheels " + no_of_tyres);
	}

}

public class AssignmentTask1 {
	public static void main(String[] args) {
		Vehicle v1;
		v1 = new twoWheeler();
		v1.run();
		v1.stop();
		v1.display();
		v1 = new threeWheeler();
		v1.run();
		v1.stop();
		v1.display();
		v1 = new fourWheeler();
		v1.run();
		v1.stop();
		v1.display();
		v1 = new eightWheeler();
		v1.run();
		v1.stop();
		v1.display();
	}
}
