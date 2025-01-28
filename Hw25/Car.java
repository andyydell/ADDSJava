//Andy Dell'Orfano
//Hw 25
package Hw25;
import java.util.Scanner;
public class Car {
    private double speed = 0;
    public void accelerate(){
        if (speed <120){
            speed = speed +1;
        }
    }
    public void brake(){
        speed = speed -.1;
    }
    public Car(double spd){
        if (spd <120){
            speed = spd;
        }
    }
    public double returnSpeed(){
        return speed;
    }
    public Car(){
        speed = 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Would you like to enter a starting speed?");
        if(in.hasNext("No")||in.hasNext("no")){
            in.next();
        }else {
            in.next();
            System.out.println("Enter a speed:");
            car = new Car(in.nextDouble());
        }
        while (true){
            System.out.println("Would you like to brake, accelerate, or quit? (Enter q, b, or a) ");
            if (in.hasNext("q")||in.hasNext("Q")){
                in.next();
                break;
            } else if (in.hasNext("a")||in.hasNext("A")){
                car.accelerate();
                System.out.println("The car is driving at " + car.returnSpeed() + " mph");
                in.next();
            } else if (in.hasNext("b")||in.hasNext("B")){
                car.brake();
                System.out.println("The car is driving at " + car.returnSpeed() + " mph");
                in.next();
            }
        }

        
    }
}
