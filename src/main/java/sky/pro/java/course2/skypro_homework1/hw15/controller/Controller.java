package sky.pro.java.course2.skypro_homework1.hw15.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.java.course2.skypro_homework1.hw15.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam double num1, @RequestParam double num2) {
        return String.format("%s + %s = %s", num1, num2, calculatorService.sum(num1, num2)); // если ставит %.f, то будет много незначащих нулей после запятой
    }

    @GetMapping("/minus")
    public String showSubtraction(@RequestParam double num1, @RequestParam double num2) {
        return String.format("%s - %s = %s", num1, num2, calculatorService.subtract(num1, num2));
    }

    @GetMapping("/multiply")
    public String showMultiplication(@RequestParam double num1, @RequestParam double num2) {
        return String.format("%s * %s = %s", num1, num2, calculatorService.multiply(num1, num2));
    }

    @GetMapping("/divide")
    public String showDivision(@RequestParam double num1, @RequestParam double num2) {
        return String.format("%s / %s = %s", num1, num2, calculatorService.divide(num1, num2));
    }
}
