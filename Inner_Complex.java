package program.java.inner.classes;

class Car {

	String carName;
	String carType;

	public Car(String carName, String carType) {
		super();
		this.carName = carName;
		this.carType = carType;
	}

	private String getCarName() {
		return this.carName;
	}

	// Inner class
	class Engine {
		String engineType;

		void setEngine() {

			// Acessing the carType property of car
			if (Car.this.carType.equals("4WD")) {

				// Invoking method getCarNmae() of car
				if (Car.this.getCarName().equals("Crsyler")) {
					this.engineType = "smaller";
				} else {
					this.engineType = "bigger";
				}
			} else {
				this.engineType = "bigger";
			}
		}

		String getEngineType() {
			return this.engineType;
		}
	}
}

public class Inner_Complex {

	public static void main(String[] args) {
		Car car1 = new Car("Mazda", "8WD");

		// create an object for inner class using outer
		Car.Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println("Engine type for BWD= " + engine.getEngineType());

		Car car2 = new Car("Crysler", "4WD");

		// create an object for inner class using outer
		Car.Engine c2engine = car2.new Engine();
		c2engine.setEngine();
		System.out.println("Engine type for BWD= " + c2engine.getEngineType());

	}

}
