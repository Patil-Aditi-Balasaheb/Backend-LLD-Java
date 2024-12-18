package lecture_assignments.oop3_inheritance_and_polymorphism.method_overloading_and_overriding;

public class Main {
    public static void main(String[] args) {
        // Create a Point object (2D point)
        Point point2D = new Point();
        point2D.x = 100;
        point2D.y = 200;
        point2D.display();

        // Create a ThreedPoint object (3D point)
        ThreedPoint point3D = new ThreedPoint();
        point3D.x = 300;
        point3D.y = 400;
        point3D.display();
    }
}
