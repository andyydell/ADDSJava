//Andy Dell'Orfano
package Test;
import java.util.Arrays;
public class Practival1 {
    public static void swap(int a, int b, int[] c){
        if (a <0 || b <0){
            System.err.println("Error enter values zero or above to swap");
        }
        else if (a < c.length && b <c.length){
            int temp = c[a];
            c[a] = c[b];
            c[b] = temp; 
        } else {
            System.err.println("Index is out of range");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        swap(2, 7, numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
