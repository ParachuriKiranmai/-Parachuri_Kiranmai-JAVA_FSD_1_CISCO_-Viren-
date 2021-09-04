package program.java.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackAssignment {

	public static void main(String[] args) {
		
		Stack<Integer>  stack = new Stack<Integer>();
		System.out.println("Enter the stack");
		for(int i=0;i<5;i++) {
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			stack.push(number);
		}
		System.out.println("Remove Element");
		System.out.println("remove top element : " + stack.pop());
		System.out.println("Stack elements");
		System.out.println("Stack elements : " + stack);
		System.out.println("Remove the another top element : " + stack);
		System.out.println("Stack elements : " + stack);
		
		System.out.println("get the top of the elements : " + stack.peek());
		
		System.out.println("Enter the element to be searched");
		Scanner b = new Scanner(System.in);
		int sn = b.nextInt();
		System.out.println("The searched element is : " + stack.search(sn));

	}

}
