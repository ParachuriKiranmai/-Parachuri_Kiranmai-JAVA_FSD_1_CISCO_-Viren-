package program.java.assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String myword = sc.nextLine();
		int count = 0;

		// Counts each character except space
		for (int i = 0; i < myword.length(); i++) {
			if (myword.charAt(i) != ' ')
				count++;
		}
		if (count < 50) {
			String reverse = new StringBuffer(myword).reverse().toString();
			if (reverse.equals(myword)) {
				System.out.println("yes");
			} else {
				System.out.println("No");
			}
		}
		else {
			System.out.println("String size is greater than 50");
		}
	}
}