package program.jav.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		lhs.add("1");
		lhs.add("85");
		lhs.add("c");
		lhs.add("true");
		lhs.add("98.9");

		System.out.println("LinedHashSet is " + lhs);
		System.out.println("Size of LinkedHashSet is " + lhs.size());
		System.out.println("Does LinkedHashSet contains this 'c' element " + lhs.contains("c"));
		System.out.println("Is LinkedHashSet Empty " + lhs.isEmpty());
		System.out.println("Remove the element " + lhs.remove("a"));
		System.out.println("LinkedHashSet is " + lhs);

		lhs.clear();
		System.out.println("Get Class " + lhs.getClass());

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("India");
		ts.add("Australia");
		ts.add("Belgium");
		ts.add("SriLanka");
		ts.add("France");

		System.out.println("TreeSet is " + ts);
		System.out.println("Size of TreeSet is " + ts.size());
		System.out.println("Does TreeSet contains this 'India' element " + ts.contains("India"));
		System.out.println("Is TreeSet Empty " + ts.isEmpty());
		System.out.println("Remove the element " + ts.remove("France"));
		System.out.println("TreeSet is " + ts);

		ts.clear();
		System.out.println("Get Class " + ts.getClass());

		HashSet<String> hs = new HashSet<>();

		hs.add("Mango");
		hs.add("Apple");
		hs.add("Orange");
		hs.add("grapes");
		hs.add("Water Melon");

		System.out.println("HashSet is " + hs);
		System.out.println("Size of HashSet is " + hs.size());
		System.out.println("Does HashSet contains this 'Orange' element " + hs.contains("Orange"));
		System.out.println("Is HashSet Empty " + hs.isEmpty());
		System.out.println("Remove the element " + hs.remove("a"));
		System.out.println("HashSet is " + hs);

		hs.clear();
		System.out.println("Get Class " + hs.getClass());

	}
}
