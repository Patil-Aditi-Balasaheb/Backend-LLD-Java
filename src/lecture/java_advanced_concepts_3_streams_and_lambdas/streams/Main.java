package lecture.java_advanced_concepts_3_streams_and_lambdas.streams;

import java.util.List;
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
        List<String> names = List.of("Aditi", "Tuba", "Ayesha", "Aafreen", "Fiza");
        List<Integer> lengths = names.stream().map(s -> s.length()).toList();
        System.out.println("Length of strings: " + lengths);

        // 6. Given a list of strings, find the average length of all the strings
        double avgLength = names.stream().mapToInt(String::length).average().getAsDouble();
        System.out.println("Average Length of all strings: " + avgLength);
    }
}
