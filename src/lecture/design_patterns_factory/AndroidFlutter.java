package lecture.design_patterns_factory;

public class AndroidFlutter extends Flutter {
    @Override
    public UiFactory createUiFactory() {
        return new AndroidUiFactory();
    }
}
