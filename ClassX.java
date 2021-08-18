package cisco.java.p2;
class ClassX {

	private int i = 10;
	long j = 20899L;
	protected float m = 899.0f;
	public char n ='M';
	public void methodPublic() {
		methodPrivate();
	}
	private void methodPrivate() {
		System.out.println("Value of i "+i);
		System.out.println("Value of j "+j);
		System.out.println("Value of m "+m);
		System.out.println("Value of n "+n);
	}
}
