package lecture.design_patterns_introduction_and_singleton;

public class EagerLoading {
    private static final EagerLoading INSTANCE = new EagerLoading();

    private EagerLoading() {
    }

    public static EagerLoading getInstance() {
        return INSTANCE;
    }
}
