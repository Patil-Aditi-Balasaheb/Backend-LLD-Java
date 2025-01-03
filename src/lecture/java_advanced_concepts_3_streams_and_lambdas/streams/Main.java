package lecture.java_advanced_concepts_3_streams_and_lambdas.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        for (Integer i : integerList) {
            System.out.println(i);
        }

        Stream<Integer> integerStream = integerList.stream();

        // 1. Print numbers
        // integerStream.forEach(System.out::println);
        System.out.print("Numbers: ");
        integerStream.forEach(a -> System.out.print(a + 1 + " "));

        // 2. Print square of all numbers
        System.out.print("\nSquare of all numbers: ");
        integerList.stream().forEach(a -> System.out.print(a * a + " "));

        // 3. Iterate over and print every even number
        System.out.print("\nEven numbers: ");
        integerList.stream().filter(a -> a % 2 == 0).forEach(a -> System.out.print(a + " "));

        // 4. Return a list of the square of each number
        List<Integer> squares = integerList.stream().map(a -> a * a).toList();
        System.out.println("\nSquare of numbers: " + squares);

        // 5. Return length of each string
        List<String> names = List.of("Aditi", "Tuba", "Ayesha", "Aafreen", "Fiza", "Aditi");
        List<Integer> lengths = names.stream().map(s -> s.length()).toList();
        System.out.println("Length of strings: " + lengths);

        // 6. Given a list of strings, find the average length of all the strings
        double avgLength = names.stream().mapToInt(String::length).average().getAsDouble();
        System.out.println("Average Length of all strings: " + avgLength);

        // 7. Check if any string starts with 'A'
        boolean anyMatch = names.stream().anyMatch(s -> s.startsWith("A"));
        System.out.println("Any string starts with A: " + anyMatch);

        // 8. Sum of squares of all numbers
        int sum = integerList.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("Sum of squares of all numbers: " + sum);

        // 9. Sort list of strings in descending order according to length
        // 9.a Using Integer.compare() for Custom Comparator
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "grape", "cherry");
        Comparator<String> comparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());
        strings.sort(comparator);
        System.out.println("Sorted strings: " + strings);

        // 9.b Using Subtraction for length comparison
        Comparator<String> comparator2 = (s1, s2) -> s2.length() - s1.length();
        strings.sort(comparator2);
        System.out.println("Sorted strings: " + strings);

        // 9.c Using Comparator.comparingInt() with .reversed()
        Comparator<String> comparator3 = Comparator.comparingInt(String::length).reversed();
        strings.sort(comparator3);
        System.out.println("Sorted strings: " + strings);

        // 10. return a list of all odd numbers using streams
        List<Integer> oddNumbers = integerList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers: " + oddNumbers);

        // 11. Given stream of integers confirm if all numbers in the stream are even using allMatch method
        boolean allEven = integerList.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All numbers are even: " + allEven);

        allEven = integerList.stream().filter(n -> n % 2 == 0).allMatch(n -> n % 2 == 0);
        System.out.println("All numbers are even: " + allEven);

        // 12. Counts the number of words with a length greater than 5
        long count = names.stream().filter(s -> s.length() > 5).count();
        System.out.println("Count of strings having length greater than 5: " + count);

        // 13. Concatenate a list of strings into a single string
        String result = names.stream().collect(Collectors.joining(", "));
        System.out.println("Concatenated names into single string: " + result);

        // 14. Create a map where keys are string lengths and values are string names.
        Map<Integer, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupedByLength);

        // 15. Create a set of all names
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
        System.out.println("Unique names: " + uniqueNames);

        // 16. Check if all strings have a length greater than 3.
        boolean allMatch = names.parallelStream().allMatch(s -> s.length() > 3);
        System.out.println("All strings have a length greater than 3: " + allMatch);
    }
}
