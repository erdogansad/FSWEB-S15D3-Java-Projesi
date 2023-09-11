package Employee;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "John", "Doe"));
        employees.add(new Employee(1, "John", "Doe"));

        employees.add(new Employee(2, "Jane", "Doe"));
        employees.add(new Employee(2, "Jane", "Doe"));
        employees.add(new Employee(2, "Jane", "Doe"));
        employees.add(new Employee(2, "Jane", "Doe"));

        employees.add(new Employee(3, "John", "Smith"));
        employees.add(new Employee(3, "John", "Smith"));
        employees.add(new Employee(4, "Jane", "Smith"));

        System.out.println(employees);

        LinkedList<Employee> duplicateList = new LinkedList<>();
        HashMap<Integer, Employee> uniqueMap = new HashMap<>();

        for (Employee employee : employees) {
            if (uniqueMap.containsKey(employee.getID())) {
                duplicateList.add(employee);
            } else {
                uniqueMap.put(employee.getID(), employee);
            }
        }

        System.out.println("Duplicate List");
        for (Employee employee : duplicateList) {
            System.out.println(employee);
        }
        System.out.println("-----------------");
        System.out.println("Unique List");
        for (Employee employee : uniqueMap.values()) {
            System.out.println(employee);
        }
    }
}
