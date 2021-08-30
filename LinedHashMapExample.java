package program.jav.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinedHashMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1, new String("samsung"));
		linkedHashMap.put(2, new String("MI"));
		linkedHashMap.put(3, new String("Toshiba"));
		linkedHashMap.put(4, new String("HCL"));
		linkedHashMap.put(1, new String("Wipro"));
		
		System.out.println("Contents : " + linkedHashMap);
		System.out.println("\n values of mmap after iterating over it : ");
		for(Integer key : linkedHashMap.keySet()) {
			System.out.println(key + ":\t" + linkedHashMap.get(key));
		}
		
		System.out.println("The size " + linkedHashMap.size());
		System.out.println(" LinkedHashMap is empty : " + linkedHashMap.isEmpty());
		System.out.println("LinkedHashMap contains HCL as value : " + linkedHashMap.containsKey(2));
		System.out.println("Remove : " + linkedHashMap.remove(3));
		System.out.println(linkedHashMap);
		linkedHashMap.clear();
		System.out.println("After clearing : " + linkedHashMap);
	}

}
