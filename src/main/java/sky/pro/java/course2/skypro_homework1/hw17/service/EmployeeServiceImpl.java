package sky.pro.java.course2.skypro_homework1.hw17.service;

import org.springframework.stereotype.Service;
import sky.pro.java.course2.skypro_homework1.hw17.Employee;
import sky.pro.java.course2.skypro_homework1.hw17.EmployeeAlreadyAddedException;
import sky.pro.java.course2.skypro_homework1.hw17.EmployeeNotFoundException;

import java.util.ArrayList;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final ArrayList<Employee> EMPLOYEES = new ArrayList<>();

    @Override
    public Employee addEmployee(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname); // зачем тут исключение ArrayIsFull, если у нас ArrayList???
        if (!EMPLOYEES.contains(employee)) {
            EMPLOYEES.add(new Employee(firstname, lastname));
            return employee;
        } else {
            throw new EmployeeAlreadyAddedException();
        }
    }

    @Override
    public Employee removeEmployee(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        if (EMPLOYEES.contains(employee)) {
            EMPLOYEES.remove(employee);
            return employee;
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public Employee findEmployee(String firstname, String lastname){
        Employee employee = new Employee(firstname, lastname);
        if (EMPLOYEES.contains(employee)) {
            return employee;
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public ArrayList<Employee> getEmployees() {
        return EMPLOYEES;
    }
}
