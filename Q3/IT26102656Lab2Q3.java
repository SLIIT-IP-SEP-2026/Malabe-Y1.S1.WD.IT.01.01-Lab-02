//Finding the length of a hypotenuse using given lengths of two sides

public class IT26102656Lab2Q3{

	public static void main(String[]args){
		
		double length, sideA, sideB;
		
		//Given lengths of the other two sides
		sideA = 3;
		sideB = 4;
		
		//Calculating the length of the hypotenuse
		length = sideA*sideA + sideB*sideB ;
		double result = Math.sqrt(length);
		
		//Give the output
		System.out.println("Length of the hypotenuse : "+result);
	}
}