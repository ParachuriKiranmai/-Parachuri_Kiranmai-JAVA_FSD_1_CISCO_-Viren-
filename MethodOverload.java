package programs.java.methods;

public class MethodOverload {

	public void area(int b,int h) {
		System.out.println("Area of Triangle :"+(0.5*b*h));
	}
	
	public void area(int r) {
		System.out.println("Area of Circle :"+(3.14*r*r));
	}
	
	public void area(float g,int c) {
		System.out.println("Printing the value "+g + c);
	}
	
	public void area(int h, float g, char c) {
		System.out.println("Printing the values"+h + g + c);
	}
	
	public static void main(String[] args) {
		MethodOverload ob = new MethodOverload();
		ob.area(10.0f,12);
		ob.area(5);

	}

}
