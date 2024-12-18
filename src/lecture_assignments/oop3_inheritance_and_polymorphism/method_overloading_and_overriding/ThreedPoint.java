package lecture_assignments.oop3_inheritance_and_polymorphism.method_overloading_and_overriding;

public class ThreedPoint extends Point {
    private int z;

    public void display() {
        System.out.println("[" + this.x + ", " + this.y + ", " + this.z + "]");
    }
}
