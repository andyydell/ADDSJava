package Lesson33;
import java.util.ArrayList;
import java.util.Scanner;
import Lesson33.Animal;
public class Hw33B{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>(); 
        Animal a1 = new Animal("Girrafe", 150);
        Animal a2 = new Animal("Bear", 300);
        Scanner in = new Scanner(System.in);
        System.out.println("The Girrafes weighs 150lbs. How much does the bear way?");
        double w = in.nextDouble();
        a2.setWeight(w);
        int c = a1.compareTo(a2);

        if (c == 1 ){
            System.out.println(a1.getName() + " is larger than " + a2.getName());
        } else if (c == -1){
            System.out.println(a2.getName() + " is larger than " + a1.getName());
        } else {
            System.out.println("The animals are the same size");
        }
        
    }
}
