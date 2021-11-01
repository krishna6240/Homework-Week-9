package calculate;
//Create four methods with manes “addition”, “subtraction”, “division”,
//and “multiplication”. All methods are instance method and it doesn’t
//return anything. But it has two parameters with name “int a” and “int
//b”. Also each method have System.out.println(). This prints the result.
//Also create all one more method with name “calculateResult” with
//three parameter with name int a, int b and char symbol. Write the logic
//in calculateResult method that when user enter first number and
//second number and symbol based on symbol it does calculate.

import java.util.Scanner;

public class Calculator {
    public void add(int a, int b) {
        int res = a + b;
        System.out.println("Addition of " + a + " and " + b + " is: " + res);
    }

    public void sub(int a, int b) {
        int res = a - b;
        System.out.println("Substraction of " + a + " and " + b + " is: " + res);
    }

    public void multiply(int a, int b) {
        int res = a * b;
        System.out.println("Multplication of " + a + " and " + b + " is: " + res);
    }

    public void div(int a, int b) {
        int res;
        if (b == 0) {
            res = 0;
        } else
            res = a / b;
        System.out.println("Division of " + a + " and " + b + " is: " + res);
    }

    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                add(a, b);
                break;
            case '-':
                sub(a, b);
                break;
            case '*':
                multiply(a, b);
                break;
            case '/':
                div(a, b);
                break;
            default:
                System.out.println("Invalid operation.");
                break;


        }
    }


}

