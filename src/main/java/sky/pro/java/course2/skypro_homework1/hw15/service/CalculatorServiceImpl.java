package sky.pro.java.course2.skypro_homework1.hw15.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String sum(double a, double b) {
        return Double.toString(a + b);
    }

    @Override
    public String subtract(double a, double b) {
        return Double.toString(a - b);
    }

    @Override
    public String multiply(double a, double b) {
        return Double.toString(a * b);
    }

    @Override
    public String divide(double a, double b) {
        if (b == 0) {
            if (a == 0) {
                return "Undefined";
            } else if (a < 0) {
                return "-Infinity";
            } else {
                return "Infinity";
            }
        }
        return Double.toString(a / b);
    }
}