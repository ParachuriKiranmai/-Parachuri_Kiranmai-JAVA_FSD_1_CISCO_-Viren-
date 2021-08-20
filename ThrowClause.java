package program.java.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class ThrowClause {

	static int add(int num1, int num2) throws IOException  {
		if (num1 > 900) {
			throw new ArithmeticException("Num 1 is greater than 900 and hence Exception is thrown");
		} else {
			throw new IOException("Num 1 is less than 900 and hence Exception is thrown");
		}
		
	}

	public static void main(String[] args) {

		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = scanner.nextInt();
		System.out.println("Enter num2");
		int num2 = scanner.nextInt();

		try {
			result = add(num1, num2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("result is : " + result);
	}

}
