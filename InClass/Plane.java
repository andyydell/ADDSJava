package InClass;
import java.util.Scanner;
public class Plane {
    int x;
    int y;
    public Plane() {
      getValue(0,0);  
    }

    public void getValue(int a, int b){
         x =a;
         y =b;
    }
    
    public void translate(int a, int b){
        int xChange=a;
        int yChange=b;
        x = x +xChange;
        y = y+yChange;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.print("Enter e to enter new coordinates, t to translate coordinates, or v to view the coordinates: ");
        String input = in.nextLine();
        char inputChar = input.charAt(input.length()-1);
        if (inputChar == 'e') {
            System.out.print("Enter new coordinates: ");
            
        }
    }
}
