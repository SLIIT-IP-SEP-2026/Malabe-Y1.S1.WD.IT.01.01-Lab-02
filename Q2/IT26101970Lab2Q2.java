public class IT26101970Lab2Q2{
	
	public static void main(String[] args){
		
		// Given side length of the square
		double sideLength = 10.0;
		
		// Calculate the perimeter of the square
		double perimeterOfSquare = 4 * sideLength;
		
		// Calculate the radius of the circular fence
		// 4 * length = 2 * PI * radius
		// radius = (4 * length) / (2 * PI)
		double radius = perimeterOfSquare / (2 * 3.14);
		
		// Output 
		System.out.println("Radius of the circular fence: " + radius);
		
		
	}
}