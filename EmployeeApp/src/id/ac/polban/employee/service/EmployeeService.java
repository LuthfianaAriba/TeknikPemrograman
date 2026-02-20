package id.ac.polban.employee.service;

import id.ac.polban.employee.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee findById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}