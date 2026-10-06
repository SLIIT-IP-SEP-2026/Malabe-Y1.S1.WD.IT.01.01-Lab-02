public class IT26102749Lab2Q2 {
	
    public static void main(String[] args) {

        double length = 10;
        double pi = 3.14;

        // Perimeter of square = 4 * length
        double perimeter = 4 * length;

        // Same rope is used for the circle
        // Circumference = 2 * pi * radius
        double radius = perimeter / (2 * pi);

        System.out.println("Radius of the circular fence = " + radius);
    }
}