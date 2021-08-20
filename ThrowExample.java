package program.java.exceptions;

import java.io.IOException;

public class ThrowExample {

	void m() throws IOException{
		throw new IOException("device error");
	}
	
	void n() throws IOException{
		m();
	}
	
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getClass());
		}
	}
	public static void main(String[] args) {
		
        ThrowExample obj = new ThrowExample();
        obj.p();
        System.out.println("Normal flow");
	}

}
