package lecture_assignments.java_advanced_concepts_3_streams_and_lambdas.distinct_numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNumbers {
    public static List<Integer> getDistinctNumbers(List<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 1, 7, 8, 9, 7);
        List<Integer> distinctNumbers = getDistinctNumbers(numbers);
        System.out.println("Distinct numbers: " + distinctNumbers);

        numbers = Arrays.asList(5, 5, 5, 6, 6, 6, 4, 4, 4);
        distinctNumbers = getDistinctNumbers(numbers);
        System.out.println("Distinct numbers: " + distinctNumbers);
    }
}