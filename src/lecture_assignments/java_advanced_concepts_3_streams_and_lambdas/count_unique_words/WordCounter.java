package lecture_assignments.java_advanced_concepts_3_streams_and_lambdas.count_unique_words;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WordCounter {
    public static long countWords(List<String> sentences) {
        // way 1
        long countQfUniqueWords = sentences.stream()
                .filter(sentence -> !sentence.contains("Java"))
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .distinct()
                .count();

        // way 2
        long countOfUniqueWords2 = sentences.stream()
                // filter out sentences that do not contain the word "Java"
                .filter(sentence -> !sentence.contains("Java"))

                // map each sentence to a list of unique words
                .map(sentence -> Arrays.stream(sentence.split(" "))
                        .map(word -> word.replaceAll("[^a-zA-Z]", ""))   // remove punctuation
                        .collect(Collectors.toSet()))    // collect to a set to remove duplicates

                // flatten the list of unique words
                .flatMap(Set::stream)

                // collect all unique words in a set
                .collect(Collectors.toSet())

                // count the total number of remaining words
                .size();

        return countQfUniqueWords;
    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Python is a programming language.",
                "JavaScript is used for web development.",
                "Ruby is known for its simplicity.",
                "Java is an object oriented programming language."
        );

        long wordCount = WordCounter.countWords(sentences);
        System.out.println(wordCount);
    }
}