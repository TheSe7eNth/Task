import java.util.Scanner;

public class tasksheet119 {
    
    // Method to add two numbers
    public static double add(double bogsnyaw, double bogsnyaw1) {
        return bogsnyaw + bogsnyaw1;
    }
    
    // Method to subtract two numbers
    public static double subtract(double bogsnyaw, double bogsnyaw1) {
        return bogsnyaw - bogsnyaw1;
    }
    
    // Method to multiply two numbers
    public static double multiply(double bogsnyaw, double bogsnyaw1) {
        return bogsnyaw * bogsnyaw1;
    }
    
    // Method to divide two numbers
    public static double divide(double bogsnyaw, double bogsnyaw1) {
        if (bogsnyaw1 == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN; // Return Not-a-Number to indicate invalid division
        }
        return bogsnyaw / bogsnyaw1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        double bogsnyaw = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double bogsnyaw1 = scanner.nextDouble();

        // Perform arithmetic operations using methods
        double bogsnyaw2 = add(bogsnyaw, bogsnyaw1);
        double bogsnyaw3 = subtract(bogsnyaw, bogsnyaw1);
        double bogsnyaw4 = multiply(bogsnyaw, bogsnyaw1);
        double bogsnyaw5 = divide(bogsnyaw, bogsnyaw1);

        // Print the results
        System.out.println("Sum: " + bogsnyaw2);
        System.out.println("Difference: " + bogsnyaw3);
        System.out.println("Product: " + bogsnyaw4);
        System.out.println("Quotient: " + bogsnyaw5);

        scanner.close();
    }
}
