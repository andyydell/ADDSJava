package HW24;
import java.util.Scanner;
class Counter {
   private int count = 0;

   public int getValue() {
       return count;
   }
  
   public void count() {
       count = count + 1;
   }

   public void reset() {
       count = 0;
   }
}

public class Hw24A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Counter cakeCount = new Counter();
        Counter piCount = new Counter();
        while (true){
            System.out.print("Enter c if you like cake best, p if you like pie best, or q to quit: ");
            if (in.hasNext("q")||in.hasNext("Q")){
                in.next();
                break;
            } else if (in.hasNext("c")||in.hasNext("C")){
                cakeCount.count();
                in.next();
            } else if (in.hasNext("p")||in.hasNext("P")){
                piCount.count();
                in.next();
            }
        }
        System.out.println("The total votes for cake are " + cakeCount.getValue() + " and the total votes for pie are " + piCount.getValue());

    }
}
