package assignments;

public class Calculate {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	void area(int x, float y) {
		System.out.println("The area of the rectangle is: " + x * y);
	}

	void area(float x) {
		double z = 3.14 * x * x;
		System.out.println("The area of the circle is: " + z);
	}

	public static void main(String[] args) {

		Calculate a = new Calculate();
		int sum1 = a.add(1, 2);
		System.out.println("sum of the two integer value :" + sum1);
		a.area(10, 10);
		a.area(98);

	}
}