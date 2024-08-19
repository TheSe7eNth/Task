public class tasksheet115 {
    public static void main(String[] args) {
        String a = "Wow";
        String b = "Wow";
        String c = "Wow!";
        String d = "Wow!";

        boolean b1 = a == b;          // a == b (true, because both refer to the same string in the string pool)
        boolean b2 = d.equals(b + "!"); // d.equals("Wow!") (true, "Wow!" == "Wow!")
        boolean b3 = !c.equals(a);     // c = "Wow!" and a = "Wow", so they are not equal, making !c.equals(a) true

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
