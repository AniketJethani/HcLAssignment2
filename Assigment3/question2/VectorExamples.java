package question2;

import java.util.Vector;

public class VectorExamples {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
        v1.add("Java");
        v1.add("Python");
        v1.addElement("C++");

        System.out.println("v1: " + v1);

        
        Vector<String> v2 = new Vector<>(5);
        v2.add("Spring");
        v2.add("Hibernate");

        System.out.println("\nv2 (Initial Capacity 5): " + v2);
        System.out.println("v2 Capacity: " + v2.capacity());

      
        Vector<String> v3 = new Vector<>(3, 2);
        v3.add("HTML");
        v3.add("CSS");
        v3.add("JavaScript");
        v3.add("React");

        System.out.println("\nv3 (Capacity Increment 2): " + v3);
        System.out.println("v3 Capacity: " + v3.capacity());

        
        v1.addAll(v2);
        System.out.println("\nAfter addAll(): " + v1);

      
        System.out.println("Element at index 1: " + v1.get(1));

     
        System.out.println("Element at index 2: " + v1.elementAt(2));

      
        v1.set(1, "NodeJS");
        System.out.println("\nAfter set(): " + v1);

        
        v1.setElementAt("Angular", 2);
        System.out.println("After setElementAt(): " + v1);

        
        System.out.println("\nContains Java? " + v1.contains("Java"));

       
        System.out.println("Size of v1: " + v1.size());

       
        System.out.println("First Element: " + v1.firstElement());

    
        System.out.println("Last Element: " + v1.lastElement());

        
        v1.remove(3);
        System.out.println("\nAfter remove(index): " + v1);

        
        v1.removeElement("Java");
        System.out.println("After removeElement(): " + v1);

        
        v2.clear();
        System.out.println("\nAfter clear(), v2: " + v2);

	}

}
