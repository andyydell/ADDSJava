package Lesson29;

public class Executive extends Manager {
    private double stock = 0;

    public Executive(String name, double salary, double bonus, double stock) {
        super(name, salary, bonus); 
        this.stock = stock;
    }
    public void displayInfo() {
        System.out.println("Name = " + super.getName() + ", Salary = " + super.getSalary() +  ", Bonus = " + super.getBonus() + ", Shares = " + stock);
    }
}