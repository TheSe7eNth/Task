public class tasksheet115 {
    public static void main(String[] args) {
        String a = "Wow";        // a and b refer to the same interned string
        String b = "Wow";        // a and b are the same object
        String c = new String("Wow"); // c is a new String object
        String d = b + "!";      // d is "Wow!"

        boolean b1 = a == b;          // true, because a and b are the same object
        boolean b2 = d.equals(b + "!"); // true, because d is "Wow!" and b + "!" is also "Wow!"
        boolean b3 = !c.equals(a);    // true, because c is not the same object as a

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
