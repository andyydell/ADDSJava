//Andy Dell'Orfano
//11/8/24
//AT07 HW

package AT07;
import java.util.Scanner;
public class Plane {
     private double x;
     private double y;
     private double r= 0;
     private double theta= 0;
    public Plane(double a, double b) {
        x = a;
        y = b;

        r = Math.sqrt(x*x+y*y);
        theta = Math.atan2(y,x);
    }
    public double getX(){
        return x;
    }
     public double getY(){
        return y;
    }
     public double getR(){
        return r;
    }
     public double getTheta(){
        return theta;
    }
    public double getThetaDegrees(){
        return Math.toDegrees(theta);
    }
    public void translateLinearValue(double deltaX, double deltaY){
        x = x+deltaX;
        y = y+deltaY;
        //recalculate r/theta
        r = Math.sqrt(x*x+y*y);
        theta = Math.atan2(y,x);
    }
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        Plane point = new Plane(3,4);
        System.out.println(point.getX()+ ", " + point.getY());
        System.out.println(point.getR() + ", " + point.getThetaDegrees());
        int n = 0;
        while (n <1){
            System.out.print("Enter e to enter new coordinates, t to translate coordinates, q to quit, or v to view the coordinates: ");
            String input = in.nextLine();
            input = input.toLowerCase();
            if(input.equals("e")) {
                System.out.print("Enter new coordinates (linear): ");
                double xCoord = in.nextDouble();
                double yCoord = in.nextDouble();
                point = new Plane(xCoord, yCoord);
            }else if (input.equals("t")) {
               System.out.print("How much woudl you like to translate by(Linear x, Linear y)");
                double xTran = in.nextDouble();
                double yTran = in.nextDouble();
               point.translateLinearValue(xTran, yTran);
            } else if(input.equals("v")){
              System.out.printf("The coordinates are as followed: Linear: ( %.2f, %.2f ) Angular: ( %.2f, %.2f ) %n", point.getX(), point.getY(), point.getR(), point.getThetaDegrees());
            } else if (input.equals("q")){
                n++;
            }
        }
    }
}
