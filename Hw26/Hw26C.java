//Andy Dell'Orfano
//2/1/25

package Hw26;
import Hw26.Customer;
public class Hw26C {
    
   public static void main(String[] args) {
       Customer.lastSerialUsed = 100;
       Customer c1 = new Customer("Sal's Deli");
       c1.addSale(100);
       Customer c2 = c1;
       c2.addSale(50);
       System.out.println(c1.getSales());
       System.out.println(c2.getSales());
   }
//The code provides the same number for both because the total sales private variable does not differentiate
//between the two customers as c2 is not a new object, to change this, one would have to create an overloaded function
//that took an object of customer as the argument to create a copy and make that the new object
}
