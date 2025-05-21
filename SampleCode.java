import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleCode {

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
    