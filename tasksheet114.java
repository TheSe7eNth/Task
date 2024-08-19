public class tasksheet114 {
    public static void main(String[] args) {
        int bogsnyaw = 10;
        String message;

        for (int i = 1; i <= bogsnyaw; i++) {
            message = (i % 2 == 0) ? i + " is an even number" : i + " is an odd number";
            System.out.println(message);
        }
    }
}
