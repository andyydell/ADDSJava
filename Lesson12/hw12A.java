//Andy Dell'Orfano
//Hw12 A

package Lesson12;

import java.util.Scanner;

public class hw12A {
     public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String input = in.next();
      System.out.println("Hello, " + input);
      System.out.print("How old are you? ");
      int inputInt = in.nextInt();
      inputInt++;
      System.out.println("Next year, you will be " + input);
   }
//The error was that the varibale input was declared for two different objects
//The fix is to rename a variable
}
