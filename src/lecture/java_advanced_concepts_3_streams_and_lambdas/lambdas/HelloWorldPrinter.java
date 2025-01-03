package lecture.java_advanced_concepts_3_streams_and_lambdas.lambdas;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World in HelloWorld class");
    }
}
