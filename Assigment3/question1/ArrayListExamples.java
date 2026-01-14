package question1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {
	public static void main(String[] args) {
		  
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("Constructor 1: Default ArrayList");

     
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");

        
        list1.add(1, "Spring");

        System.out.println("List1 after add operations: " + list1);

      
        ArrayList<String> list2 = new ArrayList<>(10);
        System.out.println(" Constructor 2: ArrayList with initial capacity");

        
        list2.addAll(list1);
        System.out.println("List2 after addAll(): " + list2);

        
        System.out.println("Element at index 2: " + list2.get(2));


        list2.set(2, "Hibernate");
        System.out.println("After set(): " + list2);

       
        System.out.println("Contains Java? " + list2.contains("Java"));

        
        System.out.println("Index of Spring: " + list2.indexOf("Spring"));

       
        System.out.println("Size of list2: " + list2.size());

      
        list2.remove(3);
        System.out.println("After remove(index): " + list2);

        
        list2.remove("Java");
        System.out.println("After remove(object): " + list2);

        
        System.out.println("Is list2 empty? " + list2.isEmpty());

        
        ArrayList<String> list3 = new ArrayList<>(list2);
        System.out.println("\nConstructor 3: ArrayList(Collection)");
        System.out.println("List3: " + list3);

       
        System.out.println("Iterating using Iterator:");
        Iterator<String> itr = list3.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

      
        Object[] arr = list3.toArray();
        System.out.println("\nConverted to Array:");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        
        list3.ensureCapacity(20);
        System.out.println("\nensureCapacity() called");

        
        list3.clear();
        System.out.println("After clear(), list3: " + list3);
	}

}
