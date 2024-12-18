package lecture_assignments.java_advanced_concepts_1_generics.generic_pair;

public class Pair<T, U> {
    // two private instance variables to store the pair values
    private T first;
    private U second;

    // constructor to initialize the Pair with two values
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // method to get the first value of the Pair
    public T getFirst() {
        return first;
    }

    // method to get the second value of the Pair
    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        // Create an instance of the 'Pair' class with Integer and String values
        Pair<Integer, String> intStringPair = new Pair<>(10, "Hello");
        System.out.println("Integer-String Pair: " + intStringPair.getFirst() + ", " + intStringPair.getSecond());

        // Pair with a String and a Double
        Pair<String, Double> stringDoublePair = new Pair<>("Pi", 3.14);
        System.out.println("String-Double Pair: " + stringDoublePair.getFirst() + ", " + stringDoublePair.getSecond());

        // Create an instance of the 'Pair' class with Boolean values
        Pair<Boolean, Boolean> booleanPair = new Pair<>(true, false);
        System.out.println("Boolean Pair: " + booleanPair.getFirst() + ", " + booleanPair.getSecond());

        // Pair with null values
        Pair<String, String> nullPair = new Pair<>(null, null);
        System.out.println("Pair with nulls: " + nullPair.getFirst() + ", " + nullPair.getSecond());

        // Pair with Integer boundary values
        Pair<Integer, Integer> boundaryPair = new Pair<>(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Integer Boundary Pair: " + boundaryPair.getFirst() + ", " + boundaryPair.getSecond());
    }
}
