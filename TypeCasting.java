package cisco.java.programs;

public class TypeCasting {

	public static void main(String[] args) {
		
		int i = 100;
		long l = i;
		System.out.println("Long value "+l);
		int o = (int)l;
		System.out.println("int value "+o);
		char t = (char)i;
		System.out.println("char value "+t);
		double d = 19888868686897.7862222555;
		float f = (float)d;
		System.out.println("float value "+f);
		System.out.println("double value "+d);
		double d2 = 100.04;
		long l2 = (long)d2;
		int i2= (int)l2;
		System.out.println("int value "+i2);
		System.out.println("long value "+l2);
		System.out.println("double value "+d2);
		float f2 = l;
		System.out.println("float value "+f2);
		byte b;
		int i1 = 257;
		double dd = 323.142;
		System.out.println("double value "+dd);
        b = (byte) i1;
		System.out.println("double value "+b);
        b = (byte) dd;
		System.out.println("dd = " + dd + " b= "+b);
   }
}
