public class tasksheet128 {
    public static void main(String[] args) {
        // Create Circle instance
        Circle circle = new Circle("Red", 5);
        System.out.println("Circle:");
        System.out.println("Color: " + circle.color);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        // Create Rectangle instance
        Rectangle rectangle = new Rectangle("Blue", 4, 6);
        System.out.println("Rectangle:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
