package employeesortexample;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class EmployeeSortExample {
    public static void main(String[] args) {
        // Create an ArrayList to store employee information
        ArrayList<Employee> employees = new ArrayList<>();

        // Add 20 employees to the ArrayList
        employees.add(new Employee("John", 50000.0));
        employees.add(new Employee("Alice", 60000.0));
        // Add more employees...

        // Sort employees by name in descending order using Comparator
        Collections.sort(employees, (Employee e1, Employee e2) -> e2.name.compareTo(e1.name) // Sort names in descending order
        );

        // Display the sorted employee information
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters can be added if needed

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
