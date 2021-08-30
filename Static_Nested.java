package program.java.inner.classes;

public class Static_Nested {

	static int u = 90;

	private static void outerMethod() {
		System.out.println("Inside outerMethod");
	}

	// a static inner class
	static class Inner {
		public static void main(String[] args) {

			System.out.println("Inside inner class method " + u);
			outerMethod();
		}

	}
}