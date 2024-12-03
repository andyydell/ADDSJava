package InClass;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mostBiggest = Integer.MIN_VALUE;
        int[] values = new int[6];        
        int i = 0;
        while (i<values.length){
            System.out.print("Enter a quiz grade: ");
            int val = in.nextInt();
            values[i] = val;
            if(val > mostBiggest){
                mostBiggest = val;
            }
            i++;
        }
        System.out.println(values);
        System.out.println("The biggest value is " + mostBiggest);
    }
}
