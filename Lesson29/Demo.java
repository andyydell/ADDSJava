package Lesson29;

public class Demo {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        System.out.println("Bike speed = " + b.getSpeed());

        b.pedal();
        System.out.println("Bike speed = " + b.getSpeed());

        GearedBycicle g = new GearedBycicle();
        g.pedal();
        g.shiftUp();
        g.pedal();
        g.shiftUp();
        g.pedal();
        g.display();
        g.pedal();
        g.display();
    }
}
