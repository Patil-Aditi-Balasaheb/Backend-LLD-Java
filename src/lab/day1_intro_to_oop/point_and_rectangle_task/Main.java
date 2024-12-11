package lab.day1_intro_to_oop.point_and_rectangle_task;

/*
Create a class Point. It should have 2 data-members
x : int
y : int

Create a class Rectangle. It should have 3 data-members
topLeft:Point
height:int
width:int

It should have 3 methods
getArea: It should return area of rectangle as an integer
getPerimeter: It should return perimeter of rectangle as an integer
getBottomRight: It should return a Point to represent the bottom right of the Rectangle.
 */

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        System.out.println("Top Left: (" + rect.topLeft.x + ", " + rect.topLeft.y + ")");

        System.out.println("Area of Rectangle: " + rect.getArea() + " sq.unit");
        System.out.println("Perimeter of Rectangle: " + rect.getPerimeter() + " unit");

        System.out.println("Bottom Right: (" + rect.getBottomRight().x + ", " + rect.getBottomRight().y + ")");
    }
}
