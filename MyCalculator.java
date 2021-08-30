package program.java.assignments;

import java.util.Scanner;

class sol {

	long power(int n, int p) throws Exception {

		if (n < 0 || p < 0)
			throw new Exception("n or p should not be negative");
		if (n == 0 && p == 0)
			throw new Exception("n and p should not be zero");
		else
			return (long) (Math.pow(n, p));
	}
}

public class MyCalculator {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int arg1 = sc.nextInt();
		System.out.println("Enter p value");
		int arg2 = sc.nextInt();
		sol s = new sol();
		System.out.println("The power is : " + s.power(arg1, arg2));
	}

}
