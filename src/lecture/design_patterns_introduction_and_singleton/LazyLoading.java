package lecture.design_patterns_introduction_and_singleton;

public class LazyLoading {
    private static LazyLoading obj = null;

    private LazyLoading() {
    }

    //    // Non thread safe lazy loading
    //    public static LazyLoading getInstance() {
    //        if (obj == null) {
    //            obj = new LazyLoading();
    //        }
    //        return obj;
    //    }

    // Thread safe lazy loading
    public static LazyLoading getInstance() {
        if (obj == null) {
            synchronized (LazyLoading.class) {
                // double check lock
                if (obj == null) {
                    obj = new LazyLoading();
                }
            }
        }
        // fast calls
        return obj;
    }
}
