package program.jav.collection;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Belgium");
		queue.add("India");
		queue.add("canada");
		queue.add("Srilanka");
		queue.add("Afghanistan");
		queue.remove("china");
		queue.remove("Germany");
		
		
		System.out.println(" Priority queue elements " + queue);
		
		queue.remove("India");
		queue.remove("Belgium");
		
		System.out.println(" Priority queue elements " + queue);
		
		queue.add("India");
		queue.add("Belgium");
		System.out.println(" Priority queue elements " + queue);
		System.out.println(" Head using peek " + queue.peek());
		
	}

}
