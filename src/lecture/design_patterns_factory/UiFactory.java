package lecture.design_patterns_factory;

import java.awt.*;

public interface UiFactory {
    public Button createButton();

    public Menu createMenu();

    public Scrollbar createScrollbar();
}
