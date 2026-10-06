public class IT26102447Lab2Q1 {

	public static void main(String[] args) {
		double perimeter = 100;
		// width = 3/4 * length
		// perimeter = 2*(length + width)
		// 100 = 2*(L + 0.75L) = 3.5L
		double length = perimeter / 3.5;
		double width = 0.75 * length;
		
		System.out.println("Length of fence: " + length);
		System.out.println("width of the fence: " + width);
	}
}	