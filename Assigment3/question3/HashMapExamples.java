package question3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

	public static void main(String[] args) {
		 HashMap<Integer, String> map1 = new HashMap<>();
	        map1.put(1, "Java");
	        map1.put(2, "Python");
	        map1.put(3, "C++");

	        System.out.println("map1: " + map1);

	      
	        HashMap<Integer, String> map2 = new HashMap<>(10);
	        map2.put(4, "Spring");
	        map2.put(5, "Hibernate");

	        System.out.println("\nmap2: " + map2);

	        
	        HashMap<Integer, String> map3 = new HashMap<>(8, 0.75f);
	        map3.put(6, "HTML");
	        map3.put(7, "CSS");

	        System.out.println("\nmap3: " + map3);

	        
	        map3.putIfAbsent(7, "JavaScript");
	        map3.putIfAbsent(8, "JavaScript");

	        System.out.println("After putIfAbsent(): " + map3);

	        
	        map1.putAll(map2);
	        System.out.println("\nAfter putAll() map1: " + map1);

	        
	        System.out.println("Value for key 2: " + map1.get(2));

	       
	        System.out.println("Contains key 3? " + map1.containsKey(3));

	      
	        System.out.println("Contains value 'Spring'? " + map1.containsValue("Spring"));

	       
	        System.out.println("Size of map1: " + map1.size());

	       
	        System.out.println("Is map1 empty? " + map1.isEmpty());

	        
	        map1.replace(1, "Advanced Java");
	        System.out.println("\nAfter replace(): " + map1);

	      
	        map1.remove(5);
	        System.out.println("After remove(): " + map1);

	      
	        System.out.println("\nKeys: " + map1.keySet());

	      
	        System.out.println("Values: " + map1.values());

	      
	        System.out.println("\nEntries:");
	        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }

	        
	        HashMap<Integer, String> map4 = new HashMap<>(map1);
	        System.out.println("\nmap4 (Copied Map): " + map4);

	       
	        System.out.println("map1 equals map4? " + map1.equals(map4));

	    
	        map4.clear();
	        System.out.println("After clear(), map4: " + map4);

	}

}
