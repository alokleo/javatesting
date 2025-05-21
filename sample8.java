 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 
 public class Sample8 {
 
     public static void main(String[] args) {
         // Example using List
         List<String> names = new ArrayList<>();
         names.add("Alice");
         names.add("Bob");
         names.add("Charlie");
 
         System.out.println("Names: " + names);
 
         // Example using Map
         Map<String, Integer> ages = new HashMap<>();
         ages.put("Alice", 30);
         ages.put("Bob", 25);
         ages.put("Charlie", 35);
 
         System.out.println("Ages: " + ages);
 
         // Example using a simple loop
         System.out.println("Iterating through names:");
         for (String name : names) {
             System.out.println(name);
         }
 
         // Example using a lambda expression (functional interface)
         names.forEach(name -> System.out.println("Hello, " + name + "!"));
     }
 }
 #Generate error conditions     // Example of handling potential errors
         try {
             // Simulate a potential error (e.g., accessing an invalid index)
             String name = names.get(5); // This will cause an IndexOutOfBoundsException
             System.out.println("Accessed name: " + name);
         } catch (IndexOutOfBoundsException e) {
             System.err.println("Error: Index out of bounds - " + e.getMessage());
         }
     #Generate code that introduces bugs    // Example of code with a potential bug (off-by-one error)
         for (int i = 0; i <= names.size(); i++) { // Bug: Should be i < names.size()
             try {
                 System.out.println("Name at index " + i + ": " + names.get(i));
             } catch (IndexOutOfBoundsException e) {
                 System.err.println("Bug encountered: " + e.getMessage());
             }
         }
     