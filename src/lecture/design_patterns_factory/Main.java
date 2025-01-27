package lecture.design_patterns_factory;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new AndroidFlutter();
        flutter.setTheme("dark");
        UiFactory uiFactory = flutter.createUiFactory();
        Button button = uiFactory.createButton();
    }
}
