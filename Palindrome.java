import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;

        if (num < 0) {
            System.out.println("Negative numbers are not considered palindromes.");
        } else {
            int rev = 0;
            while (num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }
            if (original == rev) {
                System.out.println(original + " is a Palindrome.");
            } else {
                System.out.println(original + " is Not a Palindrome.");
            }
        }

        sc.close();
    }
}
