package lecture.design_patterns_factory;

import java.awt.*;

public class AndroidUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new Button();
    }

    @Override
    public Menu createMenu() {
        return new Menu();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new Scrollbar();
    }
}
