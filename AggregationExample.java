package program.java.oops;

class operation{
	int square(int n) {
		return n*n;
	}
}

public class AggregationExample {

	operation op;
	double pi = 3.14;
	double area(int radius) {
		op = new operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}
	public static void main(String[] args) {
		AggregationExample c = new AggregationExample();
		 double result = c.area(5);
		 System.out.println(result);

	}

}
