package lecture.design_patterns_factory;

public class IosFlutter extends Flutter {
    @Override
    public UiFactory createUiFactory() {
        return new IosUiFactory();
    }
}
