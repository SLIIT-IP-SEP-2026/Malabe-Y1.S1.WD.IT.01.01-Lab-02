public class IT26102626Lab2Q2{
	public static void main(String[]args){
		
		//Declare the data types of the variables
		double length,perimeter,radius;
		
		//As per the question
		length = 10.0; 
		
		//Perimeter of square = 4*length
		perimeter = 4*length;
		
		//circumference = 2*3.14*radius
		//radius = circumference/2*3.14
		//circumference = perimeter because the same rope has been used to create the circular fence as per the question
		//Therefore, radius = perimeter/2*3.14
		
		radius = perimeter/(2*3.14);
		
		//Output the radius of the circular fence
		System.out.println("Radius of the circular fence: " + radius);
	}
}