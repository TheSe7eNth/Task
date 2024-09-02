import static java.lang.Math.*;

public class tasksheet12 {

    public static int add(int bogsnyaw1, int bogsnyaw2) {
        return addExact(bogsnyaw1, bogsnyaw2);
    }

    public static int subtract(int bogsnyaw1, int bogsnyaw2) {
        return subtractExact(bogsnyaw1, bogsnyaw2);
    }

    public static int multiply(int bogsnyaw1, int bogsnyaw2) {
        return multiplyExact(bogsnyaw1, bogsnyaw2);
    }

    public static int divide(int bogsnyaw1, int bogsnyaw2) {
        return floorDiv(bogsnyaw1, bogsnyaw2);
    }

    public static void main(String[] args) {
        int bogsnyaw1 = 15;
        int bogsnyaw2 = 5;

        System.out.println("Addition: " + add(bogsnyaw1, bogsnyaw2));
        System.out.println("Subtraction: " + subtract(bogsnyaw1, bogsnyaw2));
        System.out.println("Multiplication: " + multiply(bogsnyaw1, bogsnyaw2));
        System.out.println("Division: " + divide(bogsnyaw1, bogsnyaw2));
    }
}
