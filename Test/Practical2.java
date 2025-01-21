//Andy Dell'Orfano

package Test;
import java.util.Scanner;
import java.util.ArrayList;
public class Practical2 {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        double total = 0;
        int count = 0;
        while (true){
            System.out.print("Enter quiz scores or 'q' to quit: ");
            if (in.hasNext("q")||in.hasNext("Q")){
                in.next();
                break;
            }else {
                double score = in.nextDouble();
                scores.add(score);
                total = total+score;
                count++;
            }
        }
        if (count >0){
            System.out.println("-------------");
            for (int i =0; i <count; i++){
                System.out.printf("%6.2f%n", scores.get(i));
            }
            double avg = total/count;
            System.out.println("-------------");
            System.out.printf("avg = %6.2f%n", avg);
        }
    }
}
