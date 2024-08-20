import java.util.Scanner;

public class tasksheet116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String bogsnyaw = scanner.nextLine();

        StringBuilder reversedString = new StringBuilder(bogsnyaw).reverse();

        if (bogsnyaw.equals(reversedString.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close();
    }
}
