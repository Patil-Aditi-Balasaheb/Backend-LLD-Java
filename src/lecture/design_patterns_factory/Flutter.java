package lecture.design_patterns_factory;

public abstract class Flutter {
    int refreshRate;

    public void setTheme(String theme) {
        System.out.println("Theme set to: " + theme);
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public abstract UiFactory createUiFactory();
}
