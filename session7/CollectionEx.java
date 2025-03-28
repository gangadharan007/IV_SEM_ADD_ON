package session7;


import java.util.*;

public class CollectionEx {

	
	//Adding and Accessing Elements in a Collection
	
	public static void main(String[] args) {
		//List Example
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("Python");
		list.add("Node");
		
		System.out.println("List: "+list);
	
	
	
		Set<String> set = new HashSet<>();
		
		set.add("yamaha");
		set.add("RE");
		set.add("jawa");
		
		System.out.println("Set: "+set);
		
		//map example 
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Mugilan");
		map.put(2, "lord");
		map.put(3, "goku");
		
		System.out.println("map: "+map);
	}
	
	
}
