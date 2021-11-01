
import calculate.Calculator;
//Write a “main” method into main class. It has scanner that takes user
//input. Also write the logic that it ask user to “Enter first Number:”,
//“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
//enter + symbol result like “Addition of 5 and 10 is: 15” and respective
//for other symbol.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        char choice = 'y';
        int a, b;
        char symbol;
        while (choice == 'y') {
            System.out.println("Enter the first Number: ");
            a = scan.nextInt();

            System.out.println("Enter the second Number: ");
            b = scan.nextInt();

            System.out.println("Enter the symbol (+, -, *, /): ");
            symbol = scan.next().charAt(0);

            calc.calculateResult(a, b, symbol);

            System.out.println("Would you like to do  more calculation Please enter Y or N :");
            choice = scan.next().toLowerCase().charAt(0);

        }

    }
}
