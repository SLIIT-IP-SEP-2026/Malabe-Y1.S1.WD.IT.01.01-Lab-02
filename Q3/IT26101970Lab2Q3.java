public class IT26101970Lab2Q3{
	
	public static void main(String[] args){
		
		// Given length of side A and side B
		double sideA = 3.0;
		double sideB = 4.0;
		
		// Calculate the length of hypotenuse
		// hypotenuse = square root (sideA^2 + sideB^2)
		double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
		
		// Output 
		System.out.println("Length of hypotenuse: " + hypotenuse);
	}
}