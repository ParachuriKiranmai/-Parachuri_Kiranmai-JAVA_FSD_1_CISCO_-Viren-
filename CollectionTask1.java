package program.jav.collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CollectionTask1 {

	public static void main(String[] args) {

		LinkedHashSet l1 = new LinkedHashSet<>();

		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();

		System.out.println("Enter the inputs for L1 object");

		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		float s3 = sc.nextFloat();
		float s4 = sc.nextFloat();
		char s5 = sc.next().charAt(0);
		char s6 = sc.next().charAt(0);
		boolean s7 = sc.hasNextBoolean();

		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		l1.add(s6);
		l1.add(s7);

		System.out.println("LinkedHashSet is : " + l1);
		
		System.out.println("Enter the inputs for L2 object");

		Scanner ss = new Scanner(System.in);
		int t1 = ss.nextInt();
		int t2 = ss.nextInt();
		int t3 = ss.nextInt();
		int t4 = ss.nextInt();
		int t5 = ss.nextInt();
		int t6 = ss.nextInt();
		int t7 = ss.nextInt();

		l2.add(t1);
		l2.add(t2);
		l2.add(t3);
		l2.add(t4);
		l2.add(t5);
		l2.add(t6);
		l2.add(t7);
		
		System.out.println("LinkedHashSet is : " + l2);
	}

}
