package N03;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class HwB {
    public static void main(String[] args) {
        String filePath = (args.length > 0) ? args[0] : "N03/data.bin";
        ArrayList<Employee> employees = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int lastSerialNumber = dis.readInt();
            System.out.println("Last Serial Number Used: " + lastSerialNumber);

            int employeeCount = dis.readInt(); // number of employees

            for (int i = 0; i < employeeCount; i++) {
                int id = dis.readInt();
                double salary = dis.readDouble();
                String firstName = dis.readUTF();
                String lastName = dis.readUTF();
                
                

                Employee emp = new Employee(firstName, lastName, id, salary);
                employees.add(emp);
            }

            System.out.println("\n--- Employee List ---");
            for (Employee emp : employees) {
                emp.displayInfo();
            }

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}