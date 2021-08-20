package program.jav.collection;

import java.util.TreeSet;

public class CollectionTask2 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Java");
		ts.add("C");
		ts.add("C++");
		ts.add("Python");
		ts.add("SpringBoot");
		ts.add("R");

		System.out.println("TreeSet is " + ts);
		System.out.println("Size of TreeSet is " + ts.remove("C"));
		System.out.println("Size of TreeSet is " + ts.remove("C++"));
		ts.add("HTML");
		ts.add("CSS");
		ts.add("React");
		System.out.println("Does TreeSet contains this 'Java' element " + ts.contains("Java"));
		System.out.println("Remove the element " + ts.removeAll(ts));
		System.out.println("TreeSet is " + ts);
	}

}
