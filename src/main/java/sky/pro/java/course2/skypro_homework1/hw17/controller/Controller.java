package sky.pro.java.course2.skypro_homework1.hw17.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.java.course2.skypro_homework1.hw17.Employee;
import sky.pro.java.course2.skypro_homework1.hw17.service.EmployeeService;

import java.util.ArrayList;

@RestController
@RequestMapping("/employee")
public class Controller {
    EmployeeService employeeService;

    public Controller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(String firstname, String lastname) {
        return employeeService.addEmployee(firstname, lastname);
    }

    @GetMapping("/remove")
    public Employee remove(String firstname, String lastname) {
        return employeeService.removeEmployee(firstname, lastname);
    }

    @GetMapping("/find")
    public Employee find(String firstname, String lastname) {
        return employeeService.findEmployee(firstname, lastname);
    }

    @GetMapping
    public ArrayList<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
