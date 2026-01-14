package question4;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExamples {

	public static void main(String[] args) {
		 Hashtable<Integer, String> ht1 = new Hashtable<>();
	        ht1.put(1, "Java");
	        ht1.put(2, "Python");
	        ht1.put(3, "C++");

	        System.out.println("ht1: " + ht1);

	      
	        Hashtable<Integer, String> ht2 = new Hashtable<>(10);
	        ht2.put(4, "Spring");
	        ht2.put(5, "Hibernate");

	        System.out.println("\nht2: " + ht2);

	     
	        Hashtable<Integer, String> ht3 = new Hashtable<>(8, 0.75f);
	        ht3.put(6, "HTML");
	        ht3.put(7, "CSS");

	        System.out.println("\nht3: " + ht3);

	       
	        ht3.putIfAbsent(7, "JavaScript");
	        ht3.putIfAbsent(8, "JavaScript");
	        System.out.println("After putIfAbsent(): " + ht3);

	        
	        ht1.putAll(ht2);
	        System.out.println("\nAfter putAll(), ht1: " + ht1);

	        
	        System.out.println("Value for key 2: " + ht1.get(2));

	       
	        System.out.println("Contains key 3? " + ht1.containsKey(3));

	       
	        System.out.println("Contains value 'Spring'? " + ht1.containsValue("Spring"));

	       
	        System.out.println("Size of ht1: " + ht1.size());

	      
	        System.out.println("Is ht1 empty? " + ht1.isEmpty());

	   
	        ht1.replace(1, "Advanced Java");
	        System.out.println("\nAfter replace(): " + ht1);

	       
	        ht1.remove(5);
	        System.out.println("After remove(): " + ht1);

	    
	        System.out.println("\nKeys: " + ht1.keySet());

	        System.out.println("Values: " + ht1.values());

	        
	        System.out.println("\nEntries:");
	        for (Map.Entry<Integer, String> entry : ht1.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }

	       
	        Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);
	        System.out.println("\nht4 (Copied Hashtable): " + ht4);

	        
	        System.out.println("ht1 equals ht4? " + ht1.equals(ht4));

	      
	        ht4.clear();
	        System.out.println("After clear(), ht4: " + ht4);

	}

}
