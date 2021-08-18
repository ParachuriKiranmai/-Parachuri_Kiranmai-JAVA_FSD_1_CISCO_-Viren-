package cisco.java.p1;
public class ClassM {

	private int a = 10;
	long b = 1000;
	protected float c = 20;
	public void methodPublic() {
		methodPrivate();
	}
	private void methodPrivate() {
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
		System.out.println("Value of c "+c);

	}
}
