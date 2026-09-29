public class IT26102626Lab2Q3{
	public static void main (String[]args){
		
		
	//Declare the data type of the variables
	double sideA,sideB,hypotenuse;
	sideA = 3.0;
	sideB = 4.0;
	
	//For a right angled, hypotenuse = square root(sideA*sideA + sideB*sideB)
	hypotenuse = Math.sqrt(sideA*sideA + sideB*sideB);
	
	//Output length of the hypotenuse of the right angled triangle
	System.out.println("Length of the hypotenuse: " + hypotenuse);
	}
}