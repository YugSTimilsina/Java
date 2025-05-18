import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char op = sc.next().trim().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Result: " + (a + b));
                    break;
                case '-':
                    System.out.println("Result: "+ (a - b));
                    break;
                case '*':
                    System.out.println("Result: " + (a * b));
                    break;
                case '/':
                    if (b != 0 && a!=0){
                        System.out.println("Result: " +a+"/"+b+"=" + (a / b));
                        System.out.println("Result: " +b+"/"+a+"=" + (b / a));
                    }
                    else
                        System.out.println("Error: Cannot divide by zero.");
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            sc.close();
        }
    }
}
