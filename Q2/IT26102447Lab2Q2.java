public class IT26102447Lab2Q2 {

	public static void main(String[] args) {
			double side = 10;
			double PI = 3.14;
			
			double perimeterofsquare = 4 *side; // this is the rope length
			double radius = perimeterofsquare / (2 * PI);
			
			System.out.println("Rope length: " + perimeterofsquare);
			System.out.println("Radius of the circular fence: " + radius);
	}
}	