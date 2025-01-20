package lecture.design_patterns_introduction_and_singleton;

public class Main {
    public static void main(String[] args) {
        LazyLoading lazyLoading = LazyLoading.getInstance();
        System.out.println(lazyLoading);
        LazyLoading lazyLoading2 = LazyLoading.getInstance();
        System.out.println(lazyLoading2);

        EagerLoading eagerLoading = EagerLoading.getInstance();
        System.out.println(eagerLoading);
        EagerLoading eagerLoading2 = EagerLoading.getInstance();
        System.out.println(eagerLoading2);
    }
}
