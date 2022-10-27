package sky.pro.java.course2.skypro_homework1.hw17.service;

import sky.pro.java.course2.skypro_homework1.hw17.Employee;

import java.util.ArrayList;

public interface EmployeeService {
    Employee addEmployee(String firstname, String lastname);
    Employee removeEmployee(String firstname, String lastname);
    Employee findEmployee(String firstname, String lastname);
    ArrayList<Employee> getEmployees();
}
