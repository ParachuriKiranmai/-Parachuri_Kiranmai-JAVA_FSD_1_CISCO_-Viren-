package assignments;

public class Shapes {

	int length, breadth;
	float side;

	Shapes(int l, int b) {
		length = l;
		breadth = b;
	}

	public Shapes(int s) {
		side = s;
	}

	public Shapes(float m) {
		m = length;
	}

	public Shapes() {

	}

	void getArea1() {
		System.out.println("Area of Circle :" + (3.14 * side * side));
	}

	void getArea() {
		System.out.println("Area of rectangle : " + (length * breadth));
	}

	void getArea2() {
		System.out.println("Area of Square :" + (side * side));
	}

	public void area(double d1, double d2) {
		System.out.println("Area of Rhombus :" + (d1 * d2) / 2);
	}

	public void areaOfTriangle(float base, float height) {
		System.out.println("Area of Triangle :" + (base*height)/2);
	}

	public static void main(String[] args) {
		Shapes sm = new Shapes();
		Shapes s1 = new Shapes(10, 20);
		Shapes s2 = new Shapes(30);
		Shapes s3 = new Shapes(4);
		s1.getArea();
		s2.getArea1();
		s3.getArea2();
		sm.area(10,30);
        sm.areaOfTriangle(5, 12);
	}
}
