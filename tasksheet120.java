public class tasksheet120 {
    public static int cumulativeSum(int... bogsnyaw) {
        int bogsnyaw1 = 0;

        for (int bogsnyaw2 : bogsnyaw) {
            int bogsnyaw3 = 0;
            for (int bogsnyaw4 = 1; bogsnyaw4 <= bogsnyaw2; bogsnyaw4++) {
                bogsnyaw3 += bogsnyaw4;
            }
            bogsnyaw1 += bogsnyaw3;
            System.out.println("Cumulative sum up to " + bogsnyaw2 + ": " + bogsnyaw3);
        }

        return bogsnyaw1;
    }

    public static void main(String[] args) {
        int bogsnyaw1 = cumulativeSum(4, 5, 10);
        System.out.println("Total sum: " + bogsnyaw1);
    }    
}
