// Define the Animal interface
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Implement the Gorilla class
class Gorilla implements Animal {

    // Method to feed the gorilla
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Feeding the gorilla.");
            return true;
        } else {
            System.out.println("It's not time to eat.");
            return false;
        }
    }

    // Method to groom the gorilla
    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }

    // Method to pet the gorilla
    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla cautiously.");
    }
}

// Main class to test the Gorilla class
public class tasksheet129 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        // Feeding the gorilla
        gorilla.feed(true);
        
        // Grooming the gorilla
        gorilla.groom();
        
        // Petting the gorilla
        gorilla.pet();
    }
}
