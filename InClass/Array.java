package InClass;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] tests = new double[100];
        int i =0;
        while (i <=100){
            System.out.print("Enter a test score or 'q' to quit: ");
            if (in.hasNext("q")||in.hasNext("Q")){
                in.next();
                break;
            }

            if (i < tests.length){
                double value = in.nextDouble();
                tests[i] = value;
                i++;
            } else {
                break;
            }
        }
        System.out.println("-------------------");
        for(int x = 0; x<i; x++){
            System.out.printf("Test Score #%03d: %03.02d");
        }
        System.out.println("-------------------");
    }
}
