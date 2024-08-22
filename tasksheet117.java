import java.util.Scanner;

public class tasksheet117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int bogsnyaw1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int bogsnyaw2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int bogsnyaw3 = scanner.nextInt();

        // Check if all numbers are equal
        if (bogsnyaw1 == bogsnyaw2 && bogsnyaw2 == bogsnyaw3) {
            System.out.println("All numbers are equal.");
        } else {
            // Find the largest number
            int bogsnyaw = bogsnyaw1;

            if (bogsnyaw2 > bogsnyaw) {
                bogsnyaw = bogsnyaw2;
            }

            if (bogsnyaw3 > bogsnyaw) {
                bogsnyaw = bogsnyaw3;
            }

            System.out.println("The largest number is: " + bogsnyaw);
        }

        scanner.close();
    }
}
