package N03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static int lastIDUsed = 0;

    private int id;
    private double salary;
    private String firstName;
    private String lastName;

    // constructor.
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.id = 0;
        this.salary = 0;
    }

    public Employee(String firstName, String lastName, int id, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void displayInfo() {
        System.out.printf("  Name: %s, %s:%n", lastName, firstName);
        System.out.printf("  ID #   = %06d%n", id);
        System.out.printf("  Salary = $%,.2f%n", salary);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first;
        String last;
        double sal;
        ArrayList<Employee> employees = new ArrayList<>();
        while(true){
            System.out.println("Enter e to create a new employee or q to quit: ");
            if (in.hasNext("q")){
                in.nextLine();
                break;
                
            }else {
                in.nextLine();
                System.out.print("Enter employee first name: ");
                first = in.nextLine();
                System.out.println();
                System.out.print("Enter employee last name: ");
                last = in.nextLine();
                System.out.println();
                System.out.print("Enter employee salary: ");
                sal = in.nextDouble();
                System.out.println();
            }
            System.out.println();
            Employee.lastIDUsed++;
            Employee e = new Employee(last, first, Employee.lastIDUsed, sal);
            employees.add(e);
        }
        for (int i = 0; i <employees.size(); i++){
            System.out.println(employees.get(i).getFirstName());
        }
            String filepath = "data.bin";
        try (
            FileOutputStream fileOutputStream = new FileOutputStream(filepath);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
           // save the last ID used info.
           dataOutputStream.writeInt(Employee.lastIDUsed);
           for (Employee e : employees) {
               e.writeToStream(dataOutputStream);
           }

           // we're done. the streams should automatically be closed as we exit the try
           // with resources clause.
           System.out.println("Data saved to \"" + filepath + "\"");
        } catch (IOException e) {
           System.err.println("Error writing to output file.");
           System.err.println(e.getMessage());
        }

        
    }

    public void writeToStream(DataOutputStream outputStream) throws IOException {
        outputStream.writeInt(id);
        outputStream.writeDouble(salary);
        outputStream.writeUTF(firstName);
        outputStream.writeUTF(lastName);
    }
}
