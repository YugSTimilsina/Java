import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial: " + fact);
        }

        sc.close();
    }
}
