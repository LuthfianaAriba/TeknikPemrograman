package employeeapp;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;
public class EmployeeApp {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        Department d1 = new Department("IT");
        EmploymentType t1 = new EmploymentType("Full Time");

        Employee e1 =  new Employee("Budi", d1, t1, 50000000);

        service.addEmployee(e1);

        System.out.println("=== DATA EMPLOYEE ===");
        for (Employee e : service.getAllEmployees()) {
            System.out.println(
                e.getId() + " - " +
                e.getName() + " - " +
                e.getDepartment().getName() + " - " +
                e.getType().getType() + " - " +
                String.format("%.0f",e.getSalary())
            );
        }
    }
}