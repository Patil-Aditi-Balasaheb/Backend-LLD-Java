package lecture_assignments.java_advanced_concepts_3_streams_and_lambdas.filter_fruits;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FruitFilter {
    public static List<String> filterFruitsStartingWithA(List<String> fruits) {
        return fruits.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> allFruits = Arrays.asList("Apple", "Banana", "Apricot", "Avocado", "Orange");
        List<String> fruitsStartingWithA = filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);

        allFruits = Arrays.asList("Grapes", "Almond", "DragonFruit");
        fruitsStartingWithA = filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);

        allFruits = Arrays.asList("Grapes", "DragonFruit");
        fruitsStartingWithA = filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);
    }
}