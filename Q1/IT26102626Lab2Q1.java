public class IT26102626Lab2Q1{
	public static void main(String[]args){
		
		//Declare the date type of the variables
		double length,width,perimeter;
		
		//As per the question
		perimeter = 100.0;
		
		//perimeter = 2(length + width)
		//width = 0.75*length as per the question
		//Therefore, perimeter = 2(length + 0.75*length)
		//perimeter = length(2+2*0.75)
		//perimeter = 3.5*length
		//length = perimeter/3.5
		
		length = perimeter/3.5;
		
		//width = length*0.75 as per the question 
		width = length*0.75;
		
		//Output the length and width of the rectangle
		System.out.println("Length is " + length);
		System.out.println("Width is " + width);
	}
	
}