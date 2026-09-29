  public class IT26101216Lab2Q3 {
	  
	public static void main(String[] args) {
		
		// Given length of the two legs of the right triangle
		
		double sideA = 3.0;
		double sideB = 4.0;
		
		// Calculate the length of the hypotenuse usingthe Pythagorean theorem
		// c = squareroot (sideA^2 + sideB^2)
		double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
		
		 //output the calculateed hypotenuse
		 System.out.println("Length of the hypotenuse: " + hypotenuse);
		 
 }
}