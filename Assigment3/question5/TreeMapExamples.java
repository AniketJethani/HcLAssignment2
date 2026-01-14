package question5;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExamples {

	public static void main(String[] args) {
		  
        TreeMap<Integer, String> tm1 = new TreeMap<>();
        tm1.put(3, "Java");
        tm1.put(1, "Python");
        tm1.put(2, "C++");

        System.out.println("tm1 (Natural Sorting): " + tm1);

       
        System.out.println("Value for key 2: " + tm1.get(2));

     
        System.out.println("Contains key 1? " + tm1.containsKey(1));

       
        System.out.println("Contains value 'Java'? " + tm1.containsValue("Java"));

      
        System.out.println("First Key: " + tm1.firstKey());
        System.out.println("Last Key: " + tm1.lastKey());

        
        System.out.println("Higher than 2: " + tm1.higherKey(2));
        System.out.println("Lower than 2: " + tm1.lowerKey(2));

        
        System.out.println("Ceiling of 2: " + tm1.ceilingKey(2));
        System.out.println("Floor of 2: " + tm1.floorKey(2));

        
        TreeMap<Integer, String> tm2 = new TreeMap<>(Comparator.reverseOrder());
        tm2.put(1, "HTML");
        tm2.put(2, "CSS");
        tm2.put(3, "JavaScript");

        System.out.println("\ntm2 (Reverse Order): " + tm2);

        
        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);
        System.out.println("\ntm3 (Copied from tm1): " + tm3);

        
        tm3.putAll(tm2);
        System.out.println("After putAll(): " + tm3);

       
        tm3.remove(1);
        System.out.println("After remove(): " + tm3);

       
        System.out.println("\nKeys: " + tm3.keySet());

       
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : tm3.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        
        SortedMap<Integer, String> sortedMap = tm3;
        TreeMap<Integer, String> tm4 = new TreeMap<>(sortedMap);
        System.out.println("\ntm4 (From SortedMap): " + tm4);

        
        tm4.clear();
        System.out.println("After clear(), tm4: " + tm4);

	}

}
