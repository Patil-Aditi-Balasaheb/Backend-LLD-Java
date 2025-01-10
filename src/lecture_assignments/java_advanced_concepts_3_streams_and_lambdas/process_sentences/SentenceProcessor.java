package lecture_assignments.java_advanced_concepts_3_streams_and_lambdas.process_sentences;

import java.util.Arrays;
import java.util.List;

public class SentenceProcessor {
    public static int processSentences(List<String> sentences) {
        double averageSentenceLength = sentences.stream()
                // filter out sentences that contain the word "Java"
                .filter(sentence -> sentence.contains("Java"))
                // map each sentence to its length
                .mapToInt(String::length)
                // calculate average length of the remaining sentences
                .average()
                .orElse(0); // if there are no sentences after filtering, return 0


        // round the average length down and return as an integer
        return (int) averageSentenceLength;
    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is a programming language.",
                "Python is also a good language.",
                "Java stream processing is powerful.",
                "C++ is not as popular as Java."
        );

        int averageLength = SentenceProcessor.processSentences(sentences);
        System.out.println(averageLength);

        sentences = Arrays.asList(
                "Python is a programming language.",
                "JS is used for web development.",
                "Ruby is known for its simplicity.",
                "java is good"
        );

        averageLength = SentenceProcessor.processSentences(sentences);
        System.out.println(averageLength);
    }
}