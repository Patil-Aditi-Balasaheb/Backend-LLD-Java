package lecture_assignments.java_advanced_concepts_3_streams_and_lambdas.sorting_using_streams_sort_animals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalSorter {
    public static List<String> sortAnimalsByLengthDescending(List<String> animals) {
        return animals.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("zebra", "lion", "tiger", "elephant", "giraffe");
        List<String> sortedAnimals = sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        animals = Arrays.asList("cat", "dog", "animal-x", "elephant", "mouse");
        sortedAnimals = sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        animals = Arrays.asList();
        sortedAnimals = sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        animals = Arrays.asList("a", "b", "d", "c", "a");
        sortedAnimals = sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);
    }
}