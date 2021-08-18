package cisco.java.p1;
 public class ClassN {
	 
	private long d = 90;
	public int e = 200;
	double f = 299.8888;
	public void methodPublic() {
		methodPrivate();
	}
	private void methodPrivate() {
		System.out.println("Value of d "+d);
		System.out.println("Value of e "+e);
		System.out.println("Value of f "+f);

	}
}
