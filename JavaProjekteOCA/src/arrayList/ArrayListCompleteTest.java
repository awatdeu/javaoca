package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCompleteTest {

//A2
    public static void testConstructors() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        System.out.println("List 1 (default constructor): " + list1);

        ArrayList<String> list2 = new ArrayList<>(20);
        System.out.println("List 2 size (with initial capacity): " + list2.size()); 
        
        List<String> initialData = Arrays.asList("Banana", "Cherry");
        ArrayList<String> list3 = new ArrayList<>(initialData);
        System.out.println("List 3 (from another collection): " + list3);
    }

    //A3
    public static void testBasicMethods() {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("After adding: " + fruits);

        String secondFruit = fruits.get(1);
        System.out.println("Fruit at index 1: " + secondFruit);

        System.out.println("Size of list: " + fruits.size());

        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        System.out.println("Is the list empty? " + fruits.isEmpty());

        fruits.clear();
        System.out.println("After clear: " + fruits);
        System.out.println("Is the list empty now? " + fruits.isEmpty());
    }

    //A4
    public static void testContains() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Sara");
        names.add("Awat");

        boolean hasSara = names.contains("Sara");
        System.out.println("Does the list contain 'Sara'? " + hasSara);

        boolean hasTomas = names.contains("Tomas");
        System.out.println("Does the list contain 'Tomas'? " + hasTomas);
    }

    //A5
    public static void testIndexMethods() {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("D");
        letters.add("A");
        System.out.println("Inital list: " + letters);

        letters.add(2, "C");
        System.out.println("After adding 'C' at index 2: " + letters);

        letters.remove(1);
        System.out.println("After removing element at index 1: " + letters);

        letters.set(0, "Z");
        System.out.println("After setting index 0 to 'Z': " + letters);

        System.out.println("indexOf 'A': " + letters.indexOf("A"));
        System.out.println("lastIndexOf 'A': " + letters.lastIndexOf("A"));
        
        List<String> sub = letters.subList(1, 3);
        System.out.println("Sublist from 1 to 3: " + sub);
    }
    
    //A6
    
  
    
    //A7
    
   
    
    public static void main(String[] args) {
        System.out.println("### A2: Testing Constructors ###");
        testConstructors();
        
        System.out.println("\n### A3: Testing Basic Methods ###");
        testBasicMethods();

        System.out.println("\n### A4: Testing 'contains' Method ###");
        testContains();

        System.out.println("\n### A5: Testing Index-based Methods ###");
        testIndexMethods();

     
    }
}



