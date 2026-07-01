class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition (int): " + calc.add(10, 5));
        System.out.println("Addition (double): " + calc.add(12.5, 7.5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(4, 6));
        System.out.println("Division: " + calc.divide(20, 4));
    }
}
