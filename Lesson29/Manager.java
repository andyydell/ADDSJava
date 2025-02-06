package Lesson29;

public class Manager extends Employee{
    private double bonus = 0;
    public Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    double compensation = getSalary() + bonus;
    public double getAnnualIncome(){
        return compensation;
    }
}
