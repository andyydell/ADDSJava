//Andy Dell'Orfano
//2/5/25
package Lesson29;

public class Hw29A extends GearedBycicle{
    public void brake(){
        int speed = getSpeed();
        int brakeAmnt = getGear()+1;
        int net = speed-brakeAmnt;
        setSpeed(net);
    }
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Hw29A g = new Hw29A();

        b.setSpeed(5);
        g.setSpeed(5);

        g.shiftUp();
        g.shiftUp();
        b.brake();
        g.brake();
        b.display();
        g.display();
    }
}