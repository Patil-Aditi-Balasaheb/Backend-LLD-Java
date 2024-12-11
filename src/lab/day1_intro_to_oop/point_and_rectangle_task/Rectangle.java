package lab.day1_intro_to_oop.point_and_rectangle_task;

public class Rectangle {
    Point topLeft = new Point();
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }

    Point getBottomRight() {
        Point bottomRight = new Point();

        bottomRight.x = topLeft.x + width;
        bottomRight.y = topLeft.y + height;

        return bottomRight;
    }
}
