//Andy Dell'Orfano
//1/31/25
package Hw26;

class Item {
   private int value;
   public void setValue(int value) {
       this.value = value;
   }
   public int getValue() {
       return value;
   }
}

public class Hw26B {
   public static void main(String[] args) {
       Item myItem = new Item();
       System.out.print(myItem.getValue() + " | ");
       myItem.setValue(13);
       System.out.println(myItem.getValue());
   }
}
//The output of the program is 0 | 0. Above is the change to fix that to 0 | 13
    

