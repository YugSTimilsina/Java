import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Enter two numbers::");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = a + b;
        int diff = a - b;
        int revDiff = b - a;
        int product = a * b;

        System.out.println("Sum = " + sum);
        System.out.println("Difference (" + a + " - " + b + ") = " + diff);
        System.out.println("Difference (" + b + " - " + a + ") = " + revDiff);
        System.out.println("Product = " + product);

        if (b != 0) {
            float div = (float) a / b;
            System.out.println("Division (" + a + " / " + b + ") = " + div);
        } else {
            System.out.println("Cannot divide " + a + " by zero.");
        }

        if (a != 0) {
            float revDiv = (float) b / a;
            System.out.println("Division (" + b + " / " + a + ") = " + revDiv);
        } else {
            System.out.println("Cannot divide " + b + " by zero.");
        }

        scan.close();
    }
}
