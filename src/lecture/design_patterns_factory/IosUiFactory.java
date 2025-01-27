package lecture.design_patterns_factory;

import java.awt.*;

public class IosUiFactory implements UiFactory {

    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Scrollbar createScrollbar() {
        return null;
    }
}
