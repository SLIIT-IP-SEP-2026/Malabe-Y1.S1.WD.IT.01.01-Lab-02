public class IT26102592Lab2Q1 {

    public static void main(String[] args) {

        int perimeter = 100;
        double length;
        double width;

        // Width to length ratio 3/4 = 0.75
        double width_ratio = 0.75;

        // Calculate the length and width
        length = perimeter / (2 * (1 + width_ratio));
        width = width_ratio * length;

        // Output the results
        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}
